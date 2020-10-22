package proyectopoo;
import support.BD;
import support.Error;
import support.TextPrompt;
import javax.swing.*;
import java.awt.Toolkit;
import java.sql.*;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Calendar;
import support.Conversion;
import support.Validacion;

    // Clase RegistroJF
/*  
    La función de la clase RegistroJF es crear la pantalla
    de registro, verificar los datos que se ingresan
    e ingresarlos a la base de datos.
*/


public class RegistroJF extends JFrame {

   // Constructor de RegistroJF.
    public RegistroJF() {
        initComponents();
        String iconURL = "src/images/icon32x32.png";
        Toolkit tdefault = Toolkit.getDefaultToolkit();
        setIconImage(tdefault.getImage(iconURL));
        aplicarTextPrompt();
    }
   
   // Componentes iniciales del frame
   // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        Registro = new javax.swing.JPanel();
        nombreJTF = new javax.swing.JTextField();
        apellidoJTF = new javax.swing.JTextField();
        diaJCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesJCB = new javax.swing.JComboBox<>();
        añoJCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        generoJCB = new javax.swing.JComboBox<>();
        correoJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contraseña1JPF = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        contraseña2JPF = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        usuarioJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telefonoJTF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        alumnoJRB = new javax.swing.JRadioButton();
        instructorJRB = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        estadoJCB = new javax.swing.JComboBox<>();
        municipioJCB = new javax.swing.JComboBox<>();
        paisJCB = new javax.swing.JComboBox<>();

        setTitle("Registro");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registro.setBackground(new java.awt.Color(29, 29, 36));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Registro.add(nombreJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, -1));
        Registro.add(apellidoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, -1));

        diaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Registro.add(diaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("* Nombre completo:");
        Registro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* Fecha de nacimiento:");
        Registro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        mesJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Registro.add(mesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        añoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        Registro.add(añoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("* Género:");
        Registro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        generoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconocido", "Masculino", "Femenino", "No especificado" }));
        Registro.add(generoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 120, -1));
        Registro.add(correoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("* Correo electrónico:");
        Registro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("* Contraseña:");
        Registro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        Registro.add(contraseña1JPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("* Confirmar contraseña:");
        Registro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));
        Registro.add(contraseña2JPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("* Nombre de usuario:");
        Registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));
        Registro.add(usuarioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Municipio:");
        Registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        Registro.add(telefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Registro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jButton3.setText("Registrarme");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Registro.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("* Quiero ser un:");
        Registro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        buttonGroup2.add(alumnoJRB);
        alumnoJRB.setForeground(new java.awt.Color(255, 255, 255));
        alumnoJRB.setSelected(true);
        alumnoJRB.setText("Alumno");
        alumnoJRB.setOpaque(false);
        Registro.add(alumnoJRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        buttonGroup2.add(instructorJRB);
        instructorJRB.setForeground(new java.awt.Color(255, 255, 255));
        instructorJRB.setText("Instructor");
        instructorJRB.setOpaque(false);
        Registro.add(instructorJRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Los campos con * son obligatorios.");
        Registro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número de telefono (celular):");
        Registro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("País:");
        Registro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Estado:");
        Registro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        estadoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo León" }));
        Registro.add(estadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 120, -1));

        municipioJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio", "Abasolo", "Agualeguas", "Allende", "Anáhuac", "Apodaca", "Aramberri", "Bustamante", "Cadereyta Jiménez", "Cerralvo", "China", "Ciénega de Flores", "Doctor Arroyo", "Doctor Coss", "Doctor González", "El Carmen", "Galeana", "García", "General Bravo", "General Escobedo", "General Terán", "General Treviño", "General Zaragoza", "General Zuazua", "Guadalupe", "Hidalgo", "Higueras", "Hualahuises", "Iturbide", "Juárez", "Lampazos de Naranjo", "Linares", "Los Aldamas", "Los Herreras", "Los Ramones", "Marín", "Melchor Ocampo", "Mier y Noriega", "Mina", "Montemorelos", "Monterrey", "Parás", "Pesquería", "Rayones", "Sabinas Hidalgo", "Salinas Victoria", "San Nicolás de los Garza", "San Pedro Garza García", "Santa Catarina", "Santiago", "Vallecillo", "Villaldama" }));
        Registro.add(municipioJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 120, -1));

        paisJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País", "México" }));
        paisJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisJCBActionPerformed(evt);
            }
        });
        Registro.add(paisJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));

        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    // Accionar el botón "Registrarme".
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            boolean datosCorrectos = true;
            datosCorrectos &= Validacion.nombre(nombreJTF, apellidoJTF);
            datosCorrectos &= Validacion.nacimiento(diaJCB, mesJCB, añoJCB);
            datosCorrectos &= Validacion.correo(correoJTF);
            datosCorrectos &= Validacion.usuario(usuarioJTF);
            datosCorrectos &= Validacion.mismaContraseña(contraseña1JPF, contraseña2JPF);
            datosCorrectos &= Validacion.tamañoContraseña(contraseña1JPF);
            datosCorrectos &= Validacion.telefono(telefonoJTF);
            datosCorrectos &= Validacion.direccion(paisJCB, estadoJCB, municipioJCB);
            if(datosCorrectos) {
            datosCorrectos &= Validacion.correoEnBD(conn, correoJTF);
            datosCorrectos &= Validacion.usuarioEnBD(conn, usuarioJTF);
            }
            if(datosCorrectos) {
               registrarBD(conn);
            }    
        } 
        BD.closeConnection(conn);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Accionar el botón "Regresar".
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        Main.Registro = null;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void paisJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisJCBActionPerformed
       
    // Realiza el registro de los datos.
    private void registrarBD(Connection conn) {
        String tabla = Conversion.tabla(alumnoJRB);
        String nuevoRegistro;
        if(tabla.equalsIgnoreCase("alumno")) {
            nuevoRegistro = "INSERT INTO ALUMNO" + 
               " (nombreAlumno, apellidoAlumno, generoAlumno, "
               + "nacimientoAlumno, correoAlumno, usuarioAlumno, "
               + "contraseñaAlumno, celularAlumno, paisAlumno, "
               + "estadoAlumno, municipioAlumno)"
               + " values (?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?)";   
        }else {
            nuevoRegistro = "INSERT INTO INSTRUCTOR" + 
               " (nombreInstructor, apellidoInstructor, generoInstructor, "
               + "nacimientoInstructor, correoInstructor, usuarioInstructor, "
               + "contraseñaInstructor, celularInstructor, paisInstructor, "
               + "estadoInstructor, municipioInstructor)"
               + " values (?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?)";
        }
        PreparedStatement ps;
        try {
            // Inicio del PreparedStatement registrar
            ps = conn.prepareStatement(nuevoRegistro);
            ps.setString(1, nombreJTF.getText());
            ps.setString(2, apellidoJTF.getText());
            ps.setInt(3, Conversion.genero(generoJCB));
            ps.setDate(4, Conversion.fecha(diaJCB, mesJCB, añoJCB));
            ps.setString(5, correoJTF.getText());
            ps.setString(6, usuarioJTF.getText());
            ps.setString(7, Conversion.contraseña(contraseña1JPF));
            ps.setLong(8, Conversion.telefono(telefonoJTF));
            ps.setInt(9, paisJCB.getSelectedIndex());
            ps.setInt(10, estadoJCB.getSelectedIndex());
            ps.setInt(11, municipioJCB.getSelectedIndex());
            ps.executeUpdate();
            ps.close();
            // Fin del PreparedStatement registro
            JOptionPane.showMessageDialog(null, "Registro exitoso.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        } catch(SQLException e) {
            Error.error000();
        }
    }     

    // Aplica el texto opaco en los campos de texto.
    private void aplicarTextPrompt() {
        TextPrompt textPrompt = new TextPrompt("Nombre(s)", nombreJTF);
        TextPrompt textPrompt1 = new TextPrompt("Apellido(s)", apellidoJTF);
        TextPrompt textPrompt2 = new TextPrompt("alguien@ejemplo.com", correoJTF);
        TextPrompt textPrompt3 = new TextPrompt("(Máximo 20 caracteres)", usuarioJTF);
        TextPrompt textPrompt4 = new TextPrompt("**********", contraseña1JPF);
        TextPrompt textPrompt5 = new TextPrompt("**********", contraseña2JPF);
        TextPrompt textPrompt6 = new TextPrompt("1234567890", telefonoJTF);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JRadioButton alumnoJRB;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.JComboBox<String> añoJCB;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField contraseña1JPF;
    private javax.swing.JPasswordField contraseña2JPF;
    private javax.swing.JTextField correoJTF;
    private javax.swing.JComboBox<String> diaJCB;
    private javax.swing.JComboBox<String> estadoJCB;
    private javax.swing.JComboBox<String> generoJCB;
    private javax.swing.JRadioButton instructorJRB;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mesJCB;
    private javax.swing.JComboBox<String> municipioJCB;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JComboBox<String> paisJCB;
    private javax.swing.JTextField telefonoJTF;
    private javax.swing.JTextField usuarioJTF;
    // End of variables declaration//GEN-END:variables
    
}