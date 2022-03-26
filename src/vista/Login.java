package vista;

import java.awt.Color;

/**
 *
 * @author Dario
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Usuario1 = new javax.swing.JLabel();
        Textpass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(158, 195, 168));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/user1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/edificio1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        Login.setText("Login");
        jPanel2.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, 50));

        Usuario.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        Usuario.setText("Usuario");
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        TextUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TextUsuario.setText("Ingrese su Nombre de Usuario");
        TextUsuario.setBorder(null);
        TextUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextUsuarioMousePressed(evt);
            }
        });
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, -1));

        Usuario1.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        Usuario1.setText("Password");
        jPanel2.add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        Textpass.setForeground(new java.awt.Color(204, 204, 204));
        Textpass.setText("******");
        Textpass.setBorder(null);
        Textpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextpassMousePressed(evt);
            }
        });
        jPanel2.add(Textpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 280, 40));

        jPanel3.setBackground(new java.awt.Color(66, 175, 180));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 260, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 370, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUsuarioMousePressed
        if (TextUsuario.getText().equals("Ingrese su Nombre de Usuario")) {
            TextUsuario.setText("");
            TextUsuario.setForeground(Color.BLACK);
        }
        if (String.valueOf(Textpass.getPassword()).isEmpty()) {
            Textpass.setText("******");
            Textpass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextUsuarioMousePressed

    private void TextpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextpassMousePressed
        if (String.valueOf(Textpass.getPassword()).equals("******")) {
            Textpass.setText("");
            Textpass.setForeground(Color.BLACK);
        }
        if (TextUsuario.getText().isEmpty()) {
            TextUsuario.setText("Ingrese su Nombre de Usuario");
            TextUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_TextpassMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JPasswordField Textpass;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
