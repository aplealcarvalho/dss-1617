package Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dividedespesa.DivideDespesaFacade;
import javax.swing.JOptionPane;

/**
 *
 * @author Gomes
 */
public class Registo extends javax.swing.JDialog {
    
    private static DivideDespesaFacade facade;
    private String usernameSenhorio, usernameAdmin, nomeSenhorio, passSenhorio,
                   passAdmin, descApartamento;
    
    /**
     * Creates new form Registo
     */
    public Registo(java.awt.Frame JanelaInicial, boolean modal,
                   DivideDespesaFacade facade) {
        super(JanelaInicial, modal);
        initComponents();
        facade = new DivideDespesaFacade();
        this.facade = facade;
        usernameAdmin = "";
        usernameSenhorio = "";
        nomeSenhorio = "";
        passSenhorio = "";
        passAdmin = "";
        descApartamento = "";
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeSenhorioField = new javax.swing.JTextField();
        usernameSenhorioField = new javax.swing.JTextField();
        passwordSenhorioField = new javax.swing.JPasswordField();
        continuarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameAdminField = new javax.swing.JTextField();
        passwordAdminField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        descApartamentoField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("RegistoI"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Password");

        nomeSenhorioField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nomeSenhorioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeSenhorioFieldActionPerformed(evt);
            }
        });

        usernameSenhorioField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameSenhorioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSenhorioFieldActionPerformed(evt);
            }
        });

        passwordSenhorioField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordSenhorioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSenhorioFieldActionPerformed(evt);
            }
        });

        continuarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        continuarButton.setText("Continuar");
        continuarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel4.setText("Senhorio ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Administrador ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(" Username");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" Password");

        usernameAdminField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameAdminField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameAdminFieldActionPerformed(evt);
            }
        });

        passwordAdminField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordAdminField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordAdminFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Apartamento ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Morada");

        descApartamentoField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descApartamentoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descApartamentoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(descApartamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 169, Short.MAX_VALUE)
                                        .addComponent(continuarButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(passwordAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(usernameSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel1))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(nomeSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(passwordSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(usernameAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordSenhorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usernameAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(passwordAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(descApartamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuarButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int opcao = JOptionPane.showConfirmDialog(this,"Deseja Cancelar Registo?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(opcao == 0){
           this.dispose();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void continuarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarButtonActionPerformed
        usernameAdmin = usernameAdminField.getText();
        usernameSenhorio = usernameSenhorioField.getText();
        nomeSenhorio = nomeSenhorioField.getText();
        passSenhorio = String.valueOf(passwordSenhorioField.getPassword());
        passAdmin = String.valueOf(passwordAdminField.getPassword());
        descApartamento = descApartamentoField.getText();
        boolean campos, senhorio, admin;

        if (facade.fieldSize(usernameSenhorio, usernameAdmin, nomeSenhorio, 
                             passSenhorio, passAdmin, descApartamento)) {
            campos = false;
            String msgCampos = "Todos os campos têm que estar preenchidos!";
            JOptionPane.showMessageDialog(this, msgCampos);
        } else {
            campos = true;
        }
        
        if (!facade.validaSenhorio(nomeSenhorio, usernameSenhorio, passSenhorio)) {
            senhorio = false;
            String msgSenhorio = "Os dados de login do Senhorio não podem ter carateres especiais!";
            JOptionPane.showMessageDialog(this, msgSenhorio);   
        } else {
            senhorio = true;
        }
        
        if (!facade.validaAdministrador(usernameAdmin, passAdmin)) {
            admin = false;
            String msgAdmin = "Os dados de login do Administrador não podem ter carateres especiais!";
            JOptionPane.showMessageDialog(this, msgAdmin);
        } else {
            admin = true;
        }
            
        if (campos && senhorio && admin) {
            RegistoII dialog = new RegistoII(new javax.swing.JFrame(), true, facade);
            dialog.setVisible(true);
        }

    }//GEN-LAST:event_continuarButtonActionPerformed

    private void usernameAdminFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameAdminFieldActionPerformed

    }//GEN-LAST:event_usernameAdminFieldActionPerformed

    private void nomeSenhorioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeSenhorioFieldActionPerformed

    }//GEN-LAST:event_nomeSenhorioFieldActionPerformed

    private void passwordSenhorioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSenhorioFieldActionPerformed

    }//GEN-LAST:event_passwordSenhorioFieldActionPerformed

    private void usernameSenhorioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSenhorioFieldActionPerformed

    }//GEN-LAST:event_usernameSenhorioFieldActionPerformed

    private void descApartamentoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descApartamentoFieldActionPerformed

    }//GEN-LAST:event_descApartamentoFieldActionPerformed

    private void passwordAdminFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordAdminFieldActionPerformed

    }//GEN-LAST:event_passwordAdminFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registo dialog = new Registo(new javax.swing.JFrame(), true, facade);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarButton;
    private javax.swing.JTextField descApartamentoField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeSenhorioField;
    private javax.swing.JPasswordField passwordAdminField;
    private javax.swing.JPasswordField passwordSenhorioField;
    private javax.swing.JTextField usernameAdminField;
    private javax.swing.JTextField usernameSenhorioField;
    // End of variables declaration//GEN-END:variables
}
