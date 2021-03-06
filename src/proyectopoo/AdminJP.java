/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import support.Error;
import support.BD;
import java.sql.*;
import javax.swing.JOptionPane;
import support.TextPrompt;


public class AdminJP extends javax.swing.JPanel {

    /**
     * Creates new form AdminJP
     */
    public AdminJP() {
        initComponents();
        aplicarTextPrompt();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usernameJTF = new javax.swing.JTextField();
        urlJTF = new javax.swing.JTextField();
        passwordJPF = new javax.swing.JPasswordField();
        passwordJB = new javax.swing.JButton();
        urlJB = new javax.swing.JButton();
        usernameJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));
        setPreferredSize(new java.awt.Dimension(960, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(jTextField1.getFont());
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 280, 30));

        jPasswordField1.setFont(jPasswordField1.getFont());
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Regresar");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cambiar PASSWORD de la base de datos:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        jButton1.setText("Acceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administrador:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(nombreInstrumento));
        jComboBox1.setEnabled(false);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 130, -1));

        jButton2.setText("Dar de alta");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        jButton3.setText("Dar de baja");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dar de baja instrumento:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(nombreInstrumento));
        jComboBox3.setEnabled(false);
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 130, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dar de alta instrumento:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cambiar URL de la base de datos:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cambiar USERNAME de la base de datos:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        usernameJTF.setEnabled(false);
        add(usernameJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 190, -1));

        urlJTF.setEnabled(false);
        add(urlJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 190, -1));

        passwordJPF.setEnabled(false);
        add(passwordJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 190, -1));

        passwordJB.setText("Cambiar");
        passwordJB.setEnabled(false);
        passwordJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJBActionPerformed(evt);
            }
        });
        add(passwordJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, -1));

        urlJB.setText("Cambiar");
        urlJB.setEnabled(false);
        urlJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlJBActionPerformed(evt);
            }
        });
        add(urlJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        usernameJB.setText("Cambiar");
        usernameJB.setEnabled(false);
        usernameJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJBActionPerformed(evt);
            }
        });
        add(usernameJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background0.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    // Botón de acceder
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = jTextField1.getText();
        String contraseña = new String(jPasswordField1.getPassword());
        if(usuario.equals(BD.USERNAME) && contraseña.equals(BD.PASSWORD)) {
            jComboBox1.setEnabled(true);
            jComboBox3.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            urlJTF.setEnabled(true);
            usernameJTF.setEnabled(true);
            passwordJPF.setEnabled(true);
            urlJB.setEnabled(true);
            usernameJB.setEnabled(true);
            passwordJB.setEnabled(true);
        }
        else
            Error.error012();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        this.setVisible(false);
        Main.Inicio.setVisible(false);
        Main.Inicio = new InicioJF();
    }//GEN-LAST:event_jLabel2MousePressed

    // Botón dar de alta
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            int seleccionado = jComboBox3.getSelectedIndex();
            String nombre = jComboBox3.getItemAt(seleccionado);
            if(!BD.existeInstrumento(conn, seleccionado)) {
                darAlta(conn, seleccionado, nombre);
            }
            else
                Error.error026();
        }
        BD.closeConnection(conn);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Botón dar de baja
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            int seleccionado = jComboBox1.getSelectedIndex();
            if(BD.existeInstrumento(conn, seleccionado)) {
                darBaja(conn, seleccionado);
            }
            else
                Error.error025();
        }
        BD.closeConnection(conn);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Cambiar URL de la BD
    private void urlJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlJBActionPerformed
        String newUrl = urlJTF.getText();
        BD.cambiarUrl(newUrl);
        JOptionPane.showMessageDialog(null, "La URL se ha modificado con éxito.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_urlJBActionPerformed

    // Cambiar USERNAME de la BD
    private void usernameJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJBActionPerformed
        String newUsername = usernameJTF.getText();
        BD.cambiarUsername(newUsername);
        JOptionPane.showMessageDialog(null, "El USERNAME se ha modificado con éxito.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_usernameJBActionPerformed

    // Cambiar PASSWORD de la BD
    private void passwordJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJBActionPerformed
        String newPassword = String.valueOf(passwordJPF.getPassword());
        BD.cambiarPassword(newPassword);
        JOptionPane.showMessageDialog(null, "La PASSWORD se ha modificado con éxito.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_passwordJBActionPerformed

    
    
    
    public void darAlta(Connection conn, int ID, String NAME) {        
        String condicion = "INSERT INTO Instrumento (idInstrumento, nombreInstrumento) "
                + "VALUES (?, ?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, ID);
            ps.setString(2, NAME);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Instrumento dado de alta correctamente.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            Error.error000();
        }        
    }    
    
    public void darBaja(Connection conn, int ID) {
        String condicion = "DELETE FROM Instrumento WHERE idInstrumento = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, ID);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Instrumento dado de baja correctamente.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            Error.error000();
        }
    }
    
    // Aplica el texto opaco en los campos de texto.
    private void aplicarTextPrompt() {
        TextPrompt textPrompt = new TextPrompt("jdbc:mysql://localhost:3306/mydb", urlJTF);
        TextPrompt textPrompt1 = new TextPrompt("root", usernameJTF);
        TextPrompt textPrompt2 = new TextPrompt("*********", passwordJPF);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton passwordJB;
    private javax.swing.JPasswordField passwordJPF;
    private javax.swing.JButton urlJB;
    private javax.swing.JTextField urlJTF;
    private javax.swing.JButton usernameJB;
    private javax.swing.JTextField usernameJTF;
    // End of variables declaration//GEN-END:variables
    String[] nombreInstrumento = new String[] {"00 Acordión", "01 Guitarra acústica", "02 Gaita", "03 Balalaica", "04 Banjo",
        "05 Cabasa", "06 Campanas Tubulares", "07 Clave", "08 Conga", "09 Platillos", "10 Tambór", "11 Batería", "12 Guitarra eléctrica", 
        "13 Flauta", "14 Trompa", "15 Armónica", "16 Arpa", "17 Teclado", "18 Keytar", "19 Maracas", "20 Canto", "21 Flauta de pan", "22 Piano", 
        "23 Saxofón", "24 Sitar", "25 Pandereta", "26 Triángulo", "27 Trompeta", "28 Ukulele", "29 Violín", "30 Xilófono"};
}


