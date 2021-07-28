/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLDataException;
import javax.swing.JOptionPane;
import model.bean.LoginCadastro;
import model.dao.LoginCadastroDao;

/**
 *
 * @author PC-000
 */
public class TelaDeLoginCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeLoginCadastro
     */
    public TelaDeLoginCadastro() {
        initComponents();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        textTelefone = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textSobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonInscreverse = new javax.swing.JButton();
        textDataNascimento = new javax.swing.JFormattedTextField();
        textEmail = new javax.swing.JTextField();
        textNumeroDeTelefone = new javax.swing.JFormattedTextField();
        textNomePerfil = new javax.swing.JTextField();
        textSenha1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textSenha2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTelefone.setBackground(new java.awt.Color(15, 113, 183));
        textTelefone.setToolTipText("");
        textTelefone.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seja bem Vindo");

        textNome.setBackground(new java.awt.Color(15, 113, 183));
        textNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Nascimento");

        textSobrenome.setBackground(new java.awt.Color(15, 113, 183));
        textSobrenome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        textSobrenome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSobrenomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sobrenome");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome de perfil");

        buttonInscreverse.setBackground(new java.awt.Color(15, 113, 183));
        buttonInscreverse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInscreverse.setForeground(new java.awt.Color(255, 255, 255));
        buttonInscreverse.setText("INSCREVER-SE");
        buttonInscreverse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        buttonInscreverse.setContentAreaFilled(false);
        buttonInscreverse.setFocusPainted(false);
        buttonInscreverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInscreverseActionPerformed(evt);
            }
        });

        textDataNascimento.setBackground(new java.awt.Color(15, 113, 183));
        textDataNascimento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            textDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });

        textEmail.setBackground(new java.awt.Color(15, 113, 183));
        textEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textEmail.setForeground(new java.awt.Color(255, 255, 255));
        textEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        textNumeroDeTelefone.setBackground(new java.awt.Color(15, 113, 183));
        textNumeroDeTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textNumeroDeTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            textNumeroDeTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textNumeroDeTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textNumeroDeTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroDeTelefoneActionPerformed(evt);
            }
        });

        textNomePerfil.setBackground(new java.awt.Color(15, 113, 183));
        textNomePerfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textNomePerfil.setForeground(new java.awt.Color(255, 255, 255));
        textNomePerfil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textNomePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomePerfilActionPerformed(evt);
            }
        });

        textSenha1.setBackground(new java.awt.Color(15, 113, 183));
        textSenha1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textSenha1.setForeground(new java.awt.Color(255, 255, 255));
        textSenha1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenha1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Senha");

        textSenha2.setBackground(new java.awt.Color(15, 113, 183));
        textSenha2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textSenha2.setForeground(new java.awt.Color(255, 255, 255));
        textSenha2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        textSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenha2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Comfirmar Senha");

        javax.swing.GroupLayout textTelefoneLayout = new javax.swing.GroupLayout(textTelefone);
        textTelefone.setLayout(textTelefoneLayout);
        textTelefoneLayout.setHorizontalGroup(
            textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textTelefoneLayout.createSequentialGroup()
                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(textTelefoneLayout.createSequentialGroup()
                                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNumeroDeTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(textTelefoneLayout.createSequentialGroup()
                                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(buttonInscreverse, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        textTelefoneLayout.setVerticalGroup(
            textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textTelefoneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNumeroDeTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNomePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(textTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(textTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(buttonInscreverse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("<html> <br>LER SEMPRE<br> <br>          Abre mais que mentes <br> <html>");

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TelaCadastroLendo.png"))); // NOI18N
        jLabel12.setText(" ");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TelaLogin....png"))); // NOI18N
        jLabel13.setText(" ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(89, 89, 89)
                .addComponent(jLabel11)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel10MouseClicked

    private void textNumeroDeTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroDeTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroDeTelefoneActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonInscreverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInscreverseActionPerformed
        // TODO add your handling code here:
        LoginCadastro lc = new LoginCadastro();
        LoginCadastroDao cadastroDao = new LoginCadastroDao();
        lc.setNome(textNome.getText());
        lc.setSobrenome(textSobrenome.getText());
        String dia = textDataNascimento.getText().substring(0,2);
        String mes = textDataNascimento.getText().substring(3,5);
        String ano = textDataNascimento.getText().substring(6);
        lc.setDataNascimento(ano+"-"+mes+"-"+"-"+dia);
        String ddd = textNumeroDeTelefone.getText().substring(1,3); // pega o ddd (47) 9 8222-2525
        String nove = textNumeroDeTelefone.getText().substring(5,6); // pega o nove 47 (9) 8222-2525
        String primeiros = textNumeroDeTelefone.getText().substring(7,11); // pega os 4 primeiros numeros 47 9 (8222)-2525 
        String ultimos = textNumeroDeTelefone.getText().substring(12); // pega os 4 ultimos numeros pega os 4 primeiros numeros 47 9 8222-(2525)
        lc.setNumeroCelular(ddd+nove+primeiros+ultimos);
        lc.setNomePerfil(textNomePerfil.getText());
        lc.setEmail(textEmail.getText());
        if (!textSenha2.getText().equals(textSenha1.getText())) {
            JOptionPane.showMessageDialog(null, "As senhas não concidem");
            
        } else { 
            lc.setSenha(textSenha2.getText());
        }
        cadastroDao.create(lc);
    }//GEN-LAST:event_buttonInscreverseActionPerformed

    private void textSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSobrenomeActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textNomePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomePerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomePerfilActionPerformed

    private void textSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenha1ActionPerformed

    private void textSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenha2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLoginCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLoginCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLoginCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLoginCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLoginCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInscreverse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JFormattedTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNomePerfil;
    private javax.swing.JFormattedTextField textNumeroDeTelefone;
    private javax.swing.JTextField textSenha1;
    private javax.swing.JTextField textSenha2;
    private javax.swing.JTextField textSobrenome;
    private javax.swing.JPanel textTelefone;
    // End of variables declaration//GEN-END:variables
}