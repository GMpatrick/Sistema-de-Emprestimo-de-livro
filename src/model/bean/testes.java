/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import ConexaoBanco.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-000
 */
public class testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Connection con = ConectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("select * from tb_usuario");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                testes cli = new testes();
                System.out.println(rs.getString("TB_USUARIO_id"));
                System.out.println(rs.getString("TB_USUARIO_NOME"));
               
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(testes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado");
            
        }finally{
            ConectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
}
