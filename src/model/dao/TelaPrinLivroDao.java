/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import ConexaoBanco.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.TelaPrinLivro;

/**
 *
 * @author PC-000
 */
public class TelaPrinLivroDao {
    
    public void create(TelaPrinLivro lv ){
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("insert into TB_LIVRO (NOME_LIVRO, NOME_AUTOR, EDITORA,DATA_PULICACAO,NUMERO_DE_PAGINAS) values (?,?,?,?,?)");
            stmt.setString(1, lv.getNome_livro());
            stmt.setString(2, lv.getNome_autor());
            stmt.setString(3, lv.getEditora());
            stmt.setString(4, lv.getData_publicacao());
            stmt.setInt(5, lv.getNumero_paginas());
            
            stmt.executeUpdate();
            ConectionFactory.closeConnection(con);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar"+ ex);
            ConectionFactory.closeConnection(con);        
        }finally{
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso");
            ConectionFactory.closeConnection(con, stmt);
        }    
    }
    
    public List<TelaPrinLivro>read(){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List <TelaPrinLivro> Livros = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("Select * from TB_LIVRO");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                TelaPrinLivro cli = new TelaPrinLivro();
                cli.setId(rs.getInt("ID"));
                cli.setNome_livro(rs.getString("NOME_LIVRO"));
                cli.setNome_autor(rs.getString("NOME_AUTOR"));
                cli.setEditora(rs.getString("EDITORA"));
                cli.setData_publicacao(rs.getString("DATA_PULICACAO"));
                cli.setNumero_paginas(rs.getInt("NUMERO_DE_PAGINAS"));
                Livros.add(cli);  
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrinLivroDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado");
            
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return Livros;
    }
    
    public List<TelaPrinLivro> readForDes(String nome){
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        List <TelaPrinLivro> livros = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("Select * from tb_livro where nome_livro LIKE ? ");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                TelaPrinLivro cli = new TelaPrinLivro();
                cli.setId(rs.getInt("ID"));
                cli.setNome_livro(rs.getString("NOME_LIVRO"));
                cli.setNome_autor(rs.getString("NOME_AUTOR"));
                cli.setEditora(rs.getString("EDITORA"));
                cli.setData_publicacao(rs.getString("DATA_PULICACAO"));
                cli.setNumero_paginas(rs.getInt("NUMERO_DE_PAGINAS"));
                livros.add(cli);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrinLivroDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado");
            
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
        
        return livros;
    }
    
    public void update(TelaPrinLivro c){
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("update tb_livro set NOME_LIVRO = ?, NOME_AUTOR = ? , EDITORA = ?, DATA_PULICACAO = ?, NUMERO_DE_PAGINAS = ? where ID = ? ");
            
            stmt.setString(1, c.getNome_livro());
            stmt.setString(2, c.getNome_autor());
            stmt.setString(3, c.getEditora());
            stmt.setString(4, c.getData_publicacao());
            stmt.setInt(5, c.getNumero_paginas());
            stmt.setInt(6, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ ex);
            
        }finally{
            ConectionFactory.closeConnection(con, stmt);
        
        }
    }
    
    public void delete(TelaPrinLivro c){
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("delete from tb_livro where id = ? ");

            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Deletar"+ ex);
            
        }finally{
            ConectionFactory.closeConnection(con, stmt);
        
        }
    }
}
