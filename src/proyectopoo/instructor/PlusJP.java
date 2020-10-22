package proyectopoo.instructor;
import javax.swing.*;
import support.BD;
import proyectopoo.alumno.CursoJP;
import support.Error;
import support.TextPrompt;
import java.sql.*;
import proyectopoo.Main;
import support.Conversion;
import support.Validacion;


public class PlusJP extends JPanel {

    // Constructor del panel HomeJP
    public PlusJP(Object[] datos) {
        this.datos = datos;
        almacenarDatos(datos);
        initComponents();
        aplicarTextPrompt();
    }

    // Componentes iniciales del panel
    // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreInstructorJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionJTA = new javax.swing.JTextArea();
        mesIniJCB = new javax.swing.JComboBox<>();
        diaIniJCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diaFinJCB = new javax.swing.JComboBox<>();
        mesFinJCB = new javax.swing.JComboBox<>();
        añoFinJCB = new javax.swing.JComboBox<>();
        añoIniJCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        instrumentoJCB = new javax.swing.JComboBox<>();
        duracionJTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        precioJTF = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        paisJCB = new javax.swing.JComboBox<>();
        estadoJCB = new javax.swing.JComboBox<>();
        municipioJCB = new javax.swing.JComboBox<>();
        direccionJTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        domingoJCB = new javax.swing.JCheckBox();
        lunesJCB = new javax.swing.JCheckBox();
        martesJCB = new javax.swing.JCheckBox();
        miercolesJCB = new javax.swing.JCheckBox();
        juevesJCB = new javax.swing.JCheckBox();
        viernesJCB = new javax.swing.JCheckBox();
        sabadoJCB = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        minutoEnJCB = new javax.swing.JComboBox<>();
        horaEnJCB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        horaSaJCB = new javax.swing.JComboBox<>();
        minutoSaJCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 29, 36));
        setMinimumSize(new java.awt.Dimension(891, 483));
        setPreferredSize(new java.awt.Dimension(891, 483));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 78, 106));
        jPanel1.setPreferredSize(new java.awt.Dimension(891, 78));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Crear nuevo curso");
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 49));
        jPanel1.add(jLabel2, new java.awt.GridBagConstraints());

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));
        jPanel3.setPreferredSize(new java.awt.Dimension(891, 413));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción del curso:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        nombreInstructorJTF.setText(nombre + " " + apellido);
        nombreInstructorJTF.setEnabled(false);
        jPanel3.add(nombreInstructorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio (MXN):");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        descripcionJTA.setColumns(10);
        descripcionJTA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descripcionJTA.setRows(9);
        descripcionJTA.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setViewportView(descripcionJTA);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 330, 150));

        mesIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesIniJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(mesIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 100, -1));

        diaIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(diaIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instrumento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de inicio del curso:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        diaFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(diaFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 50, -1));

        mesFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesFinJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(mesFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 100, -1));

        añoFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel3.add(añoFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 70, -1));

        añoIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jPanel3.add(añoIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 70, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del curso:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));
        jPanel3.add(nombreJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del instructor:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        Connection conn = BD.getConnection();
        if(conn != null) {
            String[] instrumentos = BD.getInstrumentos(conn);
            instrumentoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(instrumentos));
        }
        BD.closeConnection(conn);
        jPanel3.add(instrumentoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, -1));
        jPanel3.add(duracionJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 120, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Duración (horas):");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));
        jPanel3.add(precioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 110, -1));

        jTextField5.setText("$");
        jTextField5.setEnabled(false);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        paisJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País", "México" }));
        jPanel3.add(paisJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, -1));

        estadoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo León" }));
        jPanel3.add(estadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 120, -1));

        municipioJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio", "Abasolo", "Agualeguas", "Allende", "Anáhuac", "Apodaca", "Aramberri", "Bustamante", "Cadereyta Jiménez", "Cerralvo", "China", "Ciénega de Flores", "Doctor Arroyo", "Doctor Coss", "Doctor González", "El Carmen", "Galeana", "García", "General Bravo", "General Escobedo", "General Terán", "General Treviño", "General Zaragoza", "General Zuazua", "Guadalupe", "Hidalgo", "Higueras", "Hualahuises", "Iturbide", "Juárez", "Lampazos de Naranjo", "Linares", "Los Aldamas", "Los Herreras", "Los Ramones", "Marín", "Melchor Ocampo", "Mier y Noriega", "Mina", "Montemorelos", "Monterrey", "Parás", "Pesquería", "Rayones", "Sabinas Hidalgo", "Salinas Victoria", "San Nicolás de los Garza", "San Pedro Garza García", "Santa Catarina", "Santiago", "Vallecillo", "Villaldama" }));
        jPanel3.add(municipioJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 120, -1));
        jPanel3.add(direccionJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 380, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Días:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ubicación:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hora de salida");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        domingoJCB.setForeground(new java.awt.Color(255, 255, 255));
        domingoJCB.setText("Domingo");
        domingoJCB.setOpaque(false);
        jPanel3.add(domingoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));

        lunesJCB.setForeground(new java.awt.Color(255, 255, 255));
        lunesJCB.setText("Lunes");
        lunesJCB.setOpaque(false);
        jPanel3.add(lunesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        martesJCB.setForeground(new java.awt.Color(255, 255, 255));
        martesJCB.setText("Martes");
        martesJCB.setOpaque(false);
        jPanel3.add(martesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, -1, -1));

        miercolesJCB.setForeground(new java.awt.Color(255, 255, 255));
        miercolesJCB.setText("Miércoles");
        miercolesJCB.setOpaque(false);
        jPanel3.add(miercolesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        juevesJCB.setForeground(new java.awt.Color(255, 255, 255));
        juevesJCB.setText("Jueves");
        juevesJCB.setOpaque(false);
        jPanel3.add(juevesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        viernesJCB.setForeground(new java.awt.Color(255, 255, 255));
        viernesJCB.setText("Viernes");
        viernesJCB.setOpaque(false);
        jPanel3.add(viernesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        sabadoJCB.setForeground(new java.awt.Color(255, 255, 255));
        sabadoJCB.setText("Sábado");
        sabadoJCB.setOpaque(false);
        jPanel3.add(sabadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha de fin del curso:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        minutoEnJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel3.add(minutoEnJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 50, -1));

        horaEnJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel3.add(horaEnJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Hora de entrada");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        horaSaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel3.add(horaSaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        minutoSaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel3.add(minutoSaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 50, -1));

        jButton1.setText("Crear curso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 290, 50));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    // Botón de crear curso
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = BD.getConnection();
        if(conn != null) {
            boolean datosCorrectos = true;
            datosCorrectos &= Validacion.nombreCurso(nombreJTF);
            datosCorrectos &= Validacion.descripcionCurso(descripcionJTA);
            datosCorrectos &= Validacion.nacimiento(diaFinJCB, mesFinJCB, añoFinJCB);
            datosCorrectos &= Validacion.nacimiento(diaIniJCB, mesIniJCB, añoIniJCB);
            if(datosCorrectos)
                datosCorrectos &= Validacion.fechaCurso(Conversion.fecha(diaIniJCB, mesIniJCB, añoIniJCB),
                    Conversion.fecha(diaFinJCB, mesFinJCB, añoFinJCB));
            datosCorrectos &= Validacion.duracion(duracionJTF);
            datosCorrectos &= Validacion.precio(precioJTF);
            datosCorrectos &= Validacion.hora(horaEnJCB, minutoEnJCB, horaSaJCB, minutoSaJCB);
            datosCorrectos &= Validacion.dias(lunesJCB, martesJCB, miercolesJCB, juevesJCB, 
                    viernesJCB, sabadoJCB, domingoJCB);
            datosCorrectos &= Validacion.direccion(paisJCB, estadoJCB, municipioJCB);
            datosCorrectos &= Validacion.direccion(direccionJTF);
            datosCorrectos &= Validacion.instrumento(instrumentoJCB);
            if(datosCorrectos) {
                registrarDatos(conn);
            }
        }
        BD.closeConnection(conn);
        Main.Instructor.actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Registrar curso en la base de datos.
    public void registrarDatos(Connection conn) {
        String condicion = "INSERT INTO curso (Instructor_idInstructor, Instrumento_idInstrumento, "
                + "inicioCurso, finCurso, precioCurso, duracionCurso, diasCurso, hEntradaCurso, "
                + "hSalidaCurso, nombreCurso, descripcionCurso, paisCurso, estadoCurso, "
                + "municipioCurso, direccionCurso) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String instrumento = (String) instrumentoJCB.getSelectedItem();
        int idInst = Integer.parseInt(instrumento.substring(0, 2));
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, id);
            ps.setInt(2, idInst);
            ps.setDate(3, Conversion.fecha(diaIniJCB, mesIniJCB, añoIniJCB));
            ps.setDate(4, Conversion.fecha(diaFinJCB, mesFinJCB, añoFinJCB));
            ps.setDouble(5, Double.parseDouble(precioJTF.getText()));
            ps.setInt(6, Integer.parseInt(duracionJTF.getText()));
            ps.setInt(7, Conversion.diasCurso(lunesJCB, martesJCB, miercolesJCB, juevesJCB, 
                    viernesJCB, sabadoJCB, domingoJCB));
            ps.setTime(8, Conversion.hora(horaEnJCB, minutoEnJCB));
            ps.setTime(9, Conversion.hora(horaSaJCB, minutoSaJCB));
            ps.setString(10, nombreJTF.getText());
            ps.setString(11, descripcionJTA.getText());
            ps.setInt(12, paisJCB.getSelectedIndex());
            ps.setInt(13, estadoJCB.getSelectedIndex());
            ps.setInt(14, municipioJCB.getSelectedIndex());
            ps.setString(15, direccionJTF.getText());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "El curso se ha creado con éxito.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
            //reiniciarCampos();
            ps.close();    
        } catch(SQLException ex) {
            Error.error000(); 
        }        
    }
    
        
    
    
    
    
    
    
    
    // Reinicia los campos
    public void reiniciarCampos() {
        nombreJTF.setText("");
        descripcionJTA.setText("");
        instrumentoJCB.setSelectedIndex(0);
        añoIniJCB.setSelectedIndex(0);
        mesIniJCB.setSelectedIndex(0);
        diaIniJCB.setSelectedIndex(0);
        añoFinJCB.setSelectedIndex(0);
        mesFinJCB.setSelectedIndex(0);
        diaFinJCB.setSelectedIndex(0);
        duracionJTF.setText("");
        precioJTF.setText("");
        horaEnJCB.setSelectedIndex(0);
        minutoEnJCB.setSelectedIndex(0);
        horaSaJCB.setSelectedIndex(0);
        minutoSaJCB.setSelectedIndex(0);
        lunesJCB.setSelected(false);
        martesJCB.setSelected(false);
        miercolesJCB.setSelected(false);
        juevesJCB.setSelected(false);
        viernesJCB.setSelected(false);
        sabadoJCB.setSelected(false);
        domingoJCB.setSelected(false);
        paisJCB.setSelectedIndex(0);
        estadoJCB.setSelectedIndex(0);
        municipioJCB.setSelectedIndex(0);
        direccionJTF.setText("");
    }
    
    
    
    
    
    
    
    
    
    private void aplicarTextPrompt() {
        TextPrompt textPrompt = new TextPrompt("Máximo 45 caracteres.", nombreJTF);
        TextPrompt textPrompt1 = new TextPrompt("Breve descripción, hasta 500 caracteres.", descripcionJTA);
        TextPrompt textPrompt2 = new TextPrompt("00", duracionJTF);
        TextPrompt textPrompt3 = new TextPrompt("0000.00", precioJTF);
        TextPrompt textPrompt4 = new TextPrompt("Calle, numero int, ext, colonia, etc.", direccionJTF);       
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
    private javax.swing.JComboBox<String> añoFinJCB;
    private javax.swing.JComboBox<String> añoIniJCB;
    private javax.swing.JTextArea descripcionJTA;
    private javax.swing.JComboBox<String> diaFinJCB;
    private javax.swing.JComboBox<String> diaIniJCB;
    private javax.swing.JTextField direccionJTF;
    private javax.swing.JCheckBox domingoJCB;
    private javax.swing.JTextField duracionJTF;
    private javax.swing.JComboBox<String> estadoJCB;
    private javax.swing.JComboBox<String> horaEnJCB;
    private javax.swing.JComboBox<String> horaSaJCB;
    private javax.swing.JComboBox<String> instrumentoJCB;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JCheckBox juevesJCB;
    private javax.swing.JCheckBox lunesJCB;
    private javax.swing.JCheckBox martesJCB;
    private javax.swing.JComboBox<String> mesFinJCB;
    private javax.swing.JComboBox<String> mesIniJCB;
    private javax.swing.JCheckBox miercolesJCB;
    private javax.swing.JComboBox<String> minutoEnJCB;
    private javax.swing.JComboBox<String> minutoSaJCB;
    private javax.swing.JComboBox<String> municipioJCB;
    private javax.swing.JTextField nombreInstructorJTF;
    private javax.swing.JTextField nombreJTF;
    private javax.swing.JComboBox<String> paisJCB;
    private javax.swing.JTextField precioJTF;
    private javax.swing.JCheckBox sabadoJCB;
    private javax.swing.JCheckBox viernesJCB;
    // End of variables declaration//GEN-END:variables
    // Variables del alumno
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
    private Object[] datos;
}
