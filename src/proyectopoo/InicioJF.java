package proyectopoo;
import support.BD;
import proyectopoo.alumno.*;
import proyectopoo.instructor.*;
import support.Error;
import support.TextPrompt;
import javax.swing.*;
import java.awt.Toolkit;
import java.sql.*;
import support.Conversion;

    
/*  Clase InicioJF:
    Es la clase donde comienza el programa, desde aquí
    se llaman a las otras clases.
    La función main está aquí.  */


public class InicioJF extends JFrame {
    
    
    // Constructor de la clase InicioJF
    public InicioJF() {
        initComponents();
        String iconURL = "src/images/icon32x32.png";
        Toolkit tdefault = Toolkit.getDefaultToolkit();
        setIconImage(tdefault.getImage(iconURL));
        setVisible(true);
        aplicarTextPrompt();
    }
    

   // Componentes iniciales del frame
   // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelUsuario = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        InicioSesionJP = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fortissimo");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUsuario.setOpaque(false);
        PanelUsuario.setPreferredSize(new java.awt.Dimension(960, 540));
        PanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo300x150.png"))); // NOI18N
        PanelUsuario.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        InicioSesionJP.setOpaque(false);
        InicioSesionJP.setPreferredSize(new java.awt.Dimension(300, 200));
        InicioSesionJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(jTextField1.getFont());
        InicioSesionJP.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 30));

        jPasswordField1.setFont(jPasswordField1.getFont());
        InicioSesionJP.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 30));

        jButton1.setText("Iniciar Sesión");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        InicioSesionJP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Alumno");
        jRadioButton1.setOpaque(false);
        InicioSesionJP.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Instructor");
        jRadioButton2.setOpaque(false);
        InicioSesionJP.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿No tienes una cuenta? Regístrate aquí");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(300, 14));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        InicioSesionJP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, -1));

        PanelUsuario.add(InicioSesionJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 310, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/locked.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        PanelUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, -1, -1));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Credits");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 14));
        PanelUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 70, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        PanelUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Admin only");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(300, 14));
        PanelUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 70, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background0.png"))); // NOI18N
        PanelUsuario.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(PanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    
  

    // Botón de "Iniciar Sesión" activado (MODIFICAR)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            if(validarInicioSesion(conn)) {
                this.setVisible(false);
                if(tabla.equalsIgnoreCase("Alumno")) {
                    Main.Alumno = new AlumnoJF(id);
                    Main.Inicio.setVisible(false);
                }
                else    {
                    Main.Instructor = new InstructorJF(id);
                    Main.Inicio.setVisible(false);
                }    
            }
            else {
                Error.error012();
            }
        BD.closeConnection(conn);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Label de registro
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        Main.Registro = new RegistroJF();
        Main.Registro.setVisible(true);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        PanelUsuario.setVisible(false);
        Admin = new AdminJP();
        add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pack();
    }//GEN-LAST:event_jLabel2MousePressed
    
    
    // Info
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        JOptionPane.showMessageDialog(null,
                "Fortissimo's author contact: victor.rdz.63@gmail.com \n" +
                "Icons made by Freepik (https://www.freepik.com/) from www.flaticon.com \n" +
                "Icons made by Smashicons (https://smashicons.com/) from www.flaticon.com \n" +
                "White icons from (https://www.iconsDB.com)","Info", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel4MousePressed
    
    
    // Valida que el usuario/e-mail, contraseña y opción sean correctos. 
        // La conexión a la base de datos NO debe ser nula.
    private boolean validarInicioSesion(Connection conn) {
        boolean found = false;
        contraseña = Conversion.contraseña(jPasswordField1);
        usuario = jTextField1.getText();    
        tabla = Conversion.tabla(jRadioButton1);
        
        // Realizar statement en la base de datos
        String validarInicioSesion = "SELECT * FROM " + tabla
            + " WHERE (usuario" + tabla + "=? OR correo" + 
            tabla + "=?) AND contraseña" + tabla + "=?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            // Inicio del PreparedStatement validar
            ps = conn.prepareStatement(validarInicioSesion);
            ps.setString(1, usuario);
            ps.setString(2, usuario);
            ps.setString(3, contraseña);
            rs = ps.executeQuery();
            found = rs.next();
            if(found)
                id = rs.getInt("id" + tabla);
            rs.close();
            ps.close();
            // Fin del PreparedStatement validar
        } catch (SQLException ex) {
            Error.error000();
        }
        if(found) {
            // El usuario si se encontró y su contraseña es correcta.
            found = true;
        }
        return found;
    }
      
    // Aplica el texto opaco en los campos de texto.
        // Llamar en el constructor.
    private void aplicarTextPrompt() {
        TextPrompt textPrompt = new TextPrompt("Nombre de usuario o correo electrónico", jTextField1);
        TextPrompt textPrompt1 = new TextPrompt("Contraseña", jPasswordField1);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InicioSesionJP;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
    // Más variables
    private String contraseña;
    private String usuario;
    private String tabla;
    private int id;    
    private AdminJP Admin;
}