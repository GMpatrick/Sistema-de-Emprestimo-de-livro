/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import ConexaoBanco.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.LoginCadastro;

/**
 *
 * @author PC-000
 */
public class LoginCadastroDao {
    public void create(LoginCadastro lc){
        
        Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("insert into TB_USUARIO (TB_USUARIO_NOME, TB_USUARIO_SOBRENOME, TB_USUARIO_DATA_NASCIMENTO,TB_USUARIO_NUMERO_CELULAR,TB_USUARIO_NOME_PERFIL, TB_USUARIO_EMAIL, TB_USUARIO_SENHA) values (?,?,?,?,?,?,?)");
            stmt.setString(1, lc.getNome());
            stmt.setString(2, lc.getSobrenome());
            stmt.setString(3, lc.getDataNascimento());
            stmt.setString(4, lc.getNumeroCelular());
            stmt.setString(5, lc.getNomePerfil());
            stmt.setString(6, lc.getEmail());
            stmt.setString(7, lc.getSenha());
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
}
