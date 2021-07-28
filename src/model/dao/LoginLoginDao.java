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
import javax.swing.JOptionPane;
import model.bean.LoginLogin;



/**
 *
 * @author PC-000
 */
public class LoginLoginDao {
    Connection conn;
    
    public ResultSet autenticacaoUsuario(LoginLogin objusuario){
        Connection con = ConectionFactory.getConnection();
        
        try{
            String sql = "Select TB_USUARIO_EMAIL, TB_USUARIO_SENHA from  TB_USUARIO where TB_USUARIO_EMAIL = ? and  TB_USUARIO_SENHA = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, objusuario.getEmail());
            pstm.setString(2, objusuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "LoginDao"+erro);
            return null;
        }

    }    
 
}
