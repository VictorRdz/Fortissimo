package proyectopoo.alumno;
import proyectopoo.Main;
import javax.swing.*;
import support.BD;
import support.Error;
import support.Conversion;
import java.sql.*;
import support.Validacion;


public class UserJP extends JPanel {

    // Constructor del panel HomeJP
    public UserJP(Object[] datos) {
        this.datos = datos;
        almacenarDatos(datos);
        initComponents();
    }

    // Componentes iniciales del panel
    // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosJP = new javax.swing.JPanel();
        telefonoJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        generoJCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        diaJCB = new javax.swing.JComboBox<>();
        mesJCB = new javax.swing.JComboBox<>();
        añoJCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        contraseñaJPF = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        apellidoJTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        paisJCB = new javax.swing.JComboBox<>();
        estadoJCB = new javax.swing.JComboBox<>();
        municipioJCB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ContraseñaJP = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        newPass1JPF = new javax.swing.JPasswordField();
        actualPassJPF = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        newPass2JPF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        modificarDatosJB = new javax.swing.JButton();
        cambiarContraseñaJB = new javax.swing.JButton();
        guardarDatosJB = new javax.swing.JButton();

        setBackground(new java.awt.Color(24, 24, 24));
        setPreferredSize(new java.awt.Dimension(891, 483));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContraseñaJP.setVisible(false);
        DatosJP.setBackground(new java.awt.Color(24, 24, 24));
        DatosJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        if(telefono == 0)
        telefonoJTF.setText("");
        else
        telefonoJTF.setText(Long.toString(telefono));
        telefonoJTF.setEnabled(false);
        DatosJP.add(telefonoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Municipio:");
        DatosJP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        generoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconocido", "Masculino", "Femenino", "No especificado" }));
        generoJCB.setSelectedIndex(genero);
        generoJCB.setEnabled(false);
        DatosJP.add(generoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Género:");
        DatosJP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        diaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaJCB.setSelectedIndex(Conversion.dia(fecha));
        diaJCB.setEnabled(false);
        DatosJP.add(diaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 40, -1));

        mesJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesJCB.setSelectedIndex(Conversion.mes(fecha) + 1);
        mesJCB.setToolTipText("");
        mesJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesJCB.setEnabled(false);
        DatosJP.add(mesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 90, -1));

        añoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        añoJCB.setSelectedIndex(Conversion.año(fecha) - 1929);
        añoJCB.setEnabled(false);
        DatosJP.add(añoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 60, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de nacimiento:");
        DatosJP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        contraseñaJPF.setText(contraseña);
        contraseñaJPF.setEnabled(false);
        DatosJP.add(contraseñaJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 190, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");
        DatosJP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        DatosJP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        apellidoJTF.setText(apellido);
        apellidoJTF.setEnabled(false);
        DatosJP.add(apellidoJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 190, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        DatosJP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número de telefono:");
        DatosJP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        nombreJTF.setText(nombre);
        nombreJTF.setEnabled(false);
        DatosJP.add(nombreJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, -1));

        paisJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País", "México" }));
        paisJCB.setSelectedIndex(pais);
        paisJCB.setEnabled(false);
        paisJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisJCBActionPerformed(evt);
            }
        });
        DatosJP.add(paisJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, -1));

        estadoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo León" }));
        estadoJCB.setSelectedIndex(estado);
        estadoJCB.setEnabled(false);
        DatosJP.add(estadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, -1));

        municipioJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio", "Abasolo", "Agualeguas", "Allende", "Anáhuac", "Apodaca", "Aramberri", "Bustamante", "Cadereyta Jiménez", "Cerralvo", "China", "Ciénega de Flores", "Doctor Arroyo", "Doctor Coss", "Doctor González", "El Carmen", "Galeana", "García", "General Bravo", "General Escobedo", "General Terán", "General Treviño", "General Zaragoza", "General Zuazua", "Guadalupe", "Hidalgo", "Higueras", "Hualahuises", "Iturbide", "Juárez", "Lampazos de Naranjo", "Linares", "Los Aldamas", "Los Herreras", "Los Ramones", "Marín", "Melchor Ocampo", "Mier y Noriega", "Mina", "Montemorelos", "Monterrey", "Parás", "Pesquería", "Rayones", "Sabinas Hidalgo", "Salinas Victoria", "San Nicolás de los Garza", "San Pedro Garza García", "Santa Catarina", "Santiago", "Vallecillo", "Villaldama" }));
        municipioJCB.setSelectedIndex(municipio);
        municipioJCB.setEnabled(false);
        DatosJP.add(municipioJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("País:");
        DatosJP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estado:");
        DatosJP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        add(DatosJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 480, 320));

        ContraseñaJP.setBackground(new java.awt.Color(24, 24, 24));
        ContraseñaJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese la nueva contraseña:");
        ContraseñaJP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));
        ContraseñaJP.add(newPass1JPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, -1));

        actualPassJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualPassJPFActionPerformed(evt);
            }
        });
        ContraseñaJP.add(actualPassJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ingrese la contraseña actual:");
        ContraseñaJP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Vuelva a escribir la contraseña:");
        ContraseñaJP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        ContraseñaJP.add(newPass2JPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 140, -1));

        add(ContraseñaJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 480, 320));
        ContraseñaJP.setVisible(false);

        // Código agregado
        String pictureURL;
        if(genero == 2)
        pictureURL = "/images/userF128.png";
        else
        pictureURL = "/images/userM128.png";
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(pictureURL)));
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(128, 128));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(correo);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 210, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(usuario);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, 30));

        modificarDatosJB.setText("Modificar datos");
        modificarDatosJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDatosJBActionPerformed(evt);
            }
        });
        add(modificarDatosJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 130, 40));

        cambiarContraseñaJB.setText("Cambiar contraseña");
        cambiarContraseñaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarContraseñaJBActionPerformed(evt);
            }
        });
        add(cambiarContraseñaJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 130, 40));

        guardarDatosJB.setText("Guardar datos");
        guardarDatosJB.setEnabled(false);
        guardarDatosJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosJBActionPerformed(evt);
            }
        });
        add(guardarDatosJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void modificarDatosJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDatosJBActionPerformed
        modificarCamposBotones(true);
    }//GEN-LAST:event_modificarDatosJBActionPerformed

    private void guardarDatosJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosJBActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            boolean datosCorrectos = true;
            if(ContraseñaJP.isVisible()) {   // Solo se modificará la contraseña.
                String estaContraseña = Conversion.contraseña(actualPassJPF);
                String miContraseña = contraseña;
                boolean mismaContraseña = miContraseña.equals(estaContraseña);
                datosCorrectos &= mismaContraseña;
                if(!datosCorrectos)
                    Error.error013();
                else {
                    datosCorrectos &= Validacion.mismaContraseña(newPass1JPF, newPass2JPF);
                    datosCorrectos &= Validacion.tamañoContraseña(newPass1JPF);
                    if(datosCorrectos) {
                        contraseña = Conversion.contraseña(newPass1JPF);
                        actualizarDatos(conn);
                        ContraseñaJP.setVisible(false);
                        DatosJP.setVisible(true);
                    }
                }
            }
            else {  // Solo se modificaran todos los otros datos.
                datosCorrectos &= Validacion.nombre(nombreJTF, apellidoJTF);
                datosCorrectos &= Validacion.telefono(telefonoJTF);
                datosCorrectos &= Validacion.nacimiento(diaJCB, mesJCB, añoJCB);
                datosCorrectos &= Validacion.direccion(paisJCB, estadoJCB, municipioJCB);
                if(datosCorrectos) {
                actualizarDatos(conn);
                }
            }
        BD.closeConnection(conn);    
        Main.Alumno.actualizar();
        }   
    }//GEN-LAST:event_guardarDatosJBActionPerformed

    private void cambiarContraseñaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarContraseñaJBActionPerformed
        DatosJP.setVisible(false);
        ContraseñaJP.setVisible(true);
        modificarCamposBotones(true);
    }//GEN-LAST:event_cambiarContraseñaJBActionPerformed

    private void actualPassJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualPassJPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualPassJPFActionPerformed

    private void paisJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisJCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisJCBActionPerformed

    // Modifica el parametro 'enable' de los botones y los campos
    private void modificarCamposBotones(boolean def) {   
        // Ocultar botones
        cambiarContraseñaJB.setEnabled(!def);
        modificarDatosJB.setEnabled(!def);
        // Mostrar campos
        guardarDatosJB.setEnabled(def);
        nombreJTF.setEnabled(def);
        apellidoJTF.setEnabled(def);
        generoJCB.setEnabled(def);
        diaJCB.setEnabled(def);
        mesJCB.setEnabled(def);
        añoJCB.setEnabled(def);
        telefonoJTF.setEnabled(def);
        paisJCB.setEnabled(def);
        estadoJCB.setEnabled(def);
        municipioJCB.setEnabled(def);
    }
    
    // Actualización de datos en la BD
    private void actualizarDatos(Connection conn) {
        String actualizarRegistro = "UPDATE alumno SET nombreAlumno = ?, apellidoAlumno = ?, "
                + "generoAlumno = ?, nacimientoAlumno = ?, celularAlumno = ?, contraseñaAlumno = ?, "
                + "paisAlumno = ?, estadoAlumno = ?, municipioAlumno = ? "
                + "WHERE idAlumno = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(actualizarRegistro);
            ps.setString(1, nombreJTF.getText());
            ps.setString(2, apellidoJTF.getText());
            ps.setInt(3, Conversion.genero(generoJCB));
            ps.setDate(4, Conversion.fecha(diaJCB, mesJCB, añoJCB));
            ps.setLong(5, Conversion.telefono(telefonoJTF));
            ps.setString(6, contraseña);
            ps.setInt(7, paisJCB.getSelectedIndex());
            ps.setInt(8, estadoJCB.getSelectedIndex());
            ps.setInt(9, municipioJCB.getSelectedIndex());
            ps.setInt(10, id);
            ps.executeUpdate();
            ps.close();
            // Fin del PreparedStatement actualizar
            JOptionPane.showMessageDialog(null, "Los datos se han actualizado con éxito.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
            modificarCamposBotones(false);
        } catch(SQLException e) {
            Error.error000();
        }  
    }
    
    
    
    private void almacenarDatos(Object[] datos) {
        id = (int) datos[0];
        nombre = (String) datos[1];
        apellido = (String) datos[2];
        genero = (int) datos[3];
        fecha = (java.sql.Date) datos[4];
        correo = (String) datos[5];
        usuario = (String) datos[6];
        contraseña = (String) datos[7];
        telefono = (long) datos[8];
        pais = (int) datos[9];
        estado = (int) datos[10];
        municipio = (int) datos[11];
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContraseñaJP;
    private javax.swing.JPanel DatosJP;
    private javax.swing.JPasswordField actualPassJPF;
    private javax.swing.JTextField apellidoJTF;
    private javax.swing.JComboBox<String> añoJCB;
    private javax.swing.JButton cambiarContraseñaJB;
    private javax.swing.JPasswordField contraseñaJPF;
    private javax.swing.JComboBox<String> diaJCB;
    private javax.swing.JComboBox<String> estadoJCB;
    private javax.swing.JComboBox<String> generoJCB;
    private javax.swing.JButton guardarDatosJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mesJCB;
    private javax.swing.JButton modificarDatosJB;
    private javax.swing.JComboBox<String> municipioJCB;
    private javax.swing.JPasswordField newPass1JPF;
    private javax.swing.JPasswordField newPass2JPF;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JComboBox<String> paisJCB;
    private javax.swing.JTextField telefonoJTF;
    // End of variables declaration//GEN-END:variables
    private int id;
    private String nombre;
    private String apellido;
    private int genero;
    private java.sql.Date fecha;
    private String correo;
    private String usuario;
    private String contraseña;
    private long telefono;
    private int pais;
    private int estado;
    private int municipio;
    Object[] datos;
}
