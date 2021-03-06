package proyectopoo.alumno;
import javax.swing.*;
import support.*;
import java.util.ArrayList;
import proyectopoo.Main;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import support.Error;


public class PlusJP extends JPanel {

    // Constructor del panel HomeJP
    public PlusJP(Object[] datos, int numCurso) {
        this.numCurso = numCurso;
        almacenarDatos(datos);
        obtenerCursos();
        initComponents(); 
        InformacionCurso.setVisible(false);
        if(numCurso == 0)
            anteriorJB.setEnabled(false);
    }
    

    // Componentes iniciales del panel
    // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InformacionCurso = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreInstructorJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionJTA = new javax.swing.JTextArea();
        mesIniJCB = new javax.swing.JComboBox<>();
        diaIniJCB = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diaFinJCB = new javax.swing.JComboBox<>();
        mesFinJCB = new javax.swing.JComboBox<>();
        añoFinJCB = new javax.swing.JComboBox<>();
        añoIniJCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nombreJTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        instrumentoJCB = new javax.swing.JComboBox<>();
        duracionJTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        precioJTF = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        paisJCB = new javax.swing.JComboBox<>();
        estadoJCB = new javax.swing.JComboBox<>();
        municipioJCB = new javax.swing.JComboBox<>();
        direccionJTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        domingoJCB = new javax.swing.JCheckBox();
        lunesJCB = new javax.swing.JCheckBox();
        martesJCB = new javax.swing.JCheckBox();
        miercolesJCB = new javax.swing.JCheckBox();
        juevesJCB = new javax.swing.JCheckBox();
        viernesJCB = new javax.swing.JCheckBox();
        sabadoJCB = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        minutoEnJCB = new javax.swing.JComboBox<>();
        horaEnJCB = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        horaSaJCB = new javax.swing.JComboBox<>();
        minutoSaJCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CursosDisponibles = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        anteriorJB = new javax.swing.JButton();
        siguienteJB = new javax.swing.JButton();

        setBackground(new java.awt.Color(24, 24, 24));
        setMinimumSize(new java.awt.Dimension(891, 483));
        setPreferredSize(new java.awt.Dimension(891, 483));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InformacionCurso.setBackground(new java.awt.Color(24, 24, 24));
        InformacionCurso.setPreferredSize(new java.awt.Dimension(891, 483));
        InformacionCurso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(49, 78, 106));
        jPanel1.setPreferredSize(new java.awt.Dimension(891, 78));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre del curso");
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 49));
        jPanel1.add(jLabel2, new java.awt.GridBagConstraints());

        InformacionCurso.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción del curso:");
        InformacionCurso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        nombreInstructorJTF.setEnabled(false);
        InformacionCurso.add(nombreInstructorJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 160, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio (MXN):");
        InformacionCurso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        descripcionJTA.setColumns(10);
        descripcionJTA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        descripcionJTA.setRows(9);
        descripcionJTA.setEnabled(false);
        descripcionJTA.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setViewportView(descripcionJTA);

        InformacionCurso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 150));

        mesIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesIniJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesIniJCB.setEnabled(false);
        InformacionCurso.add(mesIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 100, -1));

        diaIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaIniJCB.setEnabled(false);
        InformacionCurso.add(diaIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 50, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Instrumento:");
        InformacionCurso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de inicio del curso:");
        InformacionCurso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        diaFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaFinJCB.setEnabled(false);
        InformacionCurso.add(diaFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, -1));

        mesFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        mesFinJCB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mesFinJCB.setEnabled(false);
        InformacionCurso.add(mesFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 100, -1));

        añoFinJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        añoFinJCB.setEnabled(false);
        InformacionCurso.add(añoFinJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 70, -1));

        añoIniJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "año", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        añoIniJCB.setEnabled(false);
        InformacionCurso.add(añoIniJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 70, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre del curso:");
        InformacionCurso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        nombreJTF.setEnabled(false);
        InformacionCurso.add(nombreJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 330, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre del instructor:");
        InformacionCurso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Connection conn = BD.getConnection();
        if(conn != null) {
            String[] instrumentos = BD.getInstrumentos(conn);
            instrumentoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(instrumentos));
            instrumentoJCB.setEnabled(false);
        }
        BD.closeConnection(conn);
        InformacionCurso.add(instrumentoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 130, -1));

        duracionJTF.setEnabled(false);
        InformacionCurso.add(duracionJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 120, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duración (horas):");
        InformacionCurso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        precioJTF.setEnabled(false);
        InformacionCurso.add(precioJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 110, -1));

        jTextField5.setText("$");
        jTextField5.setEnabled(false);
        InformacionCurso.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dirección:");
        InformacionCurso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        paisJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País", "México" }));
        paisJCB.setEnabled(false);
        InformacionCurso.add(paisJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 120, -1));

        estadoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo León" }));
        estadoJCB.setEnabled(false);
        InformacionCurso.add(estadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, -1));

        municipioJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio", "Abasolo", "Agualeguas", "Allende", "Anáhuac", "Apodaca", "Aramberri", "Bustamante", "Cadereyta Jiménez", "Cerralvo", "China", "Ciénega de Flores", "Doctor Arroyo", "Doctor Coss", "Doctor González", "El Carmen", "Galeana", "García", "General Bravo", "General Escobedo", "General Terán", "General Treviño", "General Zaragoza", "General Zuazua", "Guadalupe", "Hidalgo", "Higueras", "Hualahuises", "Iturbide", "Juárez", "Lampazos de Naranjo", "Linares", "Los Aldamas", "Los Herreras", "Los Ramones", "Marín", "Melchor Ocampo", "Mier y Noriega", "Mina", "Montemorelos", "Monterrey", "Parás", "Pesquería", "Rayones", "Sabinas Hidalgo", "Salinas Victoria", "San Nicolás de los Garza", "San Pedro Garza García", "Santa Catarina", "Santiago", "Vallecillo", "Villaldama" }));
        municipioJCB.setEnabled(false);
        InformacionCurso.add(municipioJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 120, -1));

        direccionJTF.setEnabled(false);
        InformacionCurso.add(direccionJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 380, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Días:");
        InformacionCurso.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ubicación:");
        InformacionCurso.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Hora de salida");
        InformacionCurso.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        domingoJCB.setForeground(new java.awt.Color(255, 255, 255));
        domingoJCB.setText("Domingo");
        domingoJCB.setEnabled(false);
        domingoJCB.setOpaque(false);
        InformacionCurso.add(domingoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        lunesJCB.setForeground(new java.awt.Color(255, 255, 255));
        lunesJCB.setText("Lunes");
        lunesJCB.setEnabled(false);
        lunesJCB.setOpaque(false);
        InformacionCurso.add(lunesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        martesJCB.setForeground(new java.awt.Color(255, 255, 255));
        martesJCB.setText("Martes");
        martesJCB.setEnabled(false);
        martesJCB.setOpaque(false);
        InformacionCurso.add(martesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        miercolesJCB.setForeground(new java.awt.Color(255, 255, 255));
        miercolesJCB.setText("Miércoles");
        miercolesJCB.setEnabled(false);
        miercolesJCB.setOpaque(false);
        InformacionCurso.add(miercolesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        juevesJCB.setForeground(new java.awt.Color(255, 255, 255));
        juevesJCB.setText("Jueves");
        juevesJCB.setEnabled(false);
        juevesJCB.setOpaque(false);
        InformacionCurso.add(juevesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        viernesJCB.setForeground(new java.awt.Color(255, 255, 255));
        viernesJCB.setText("Viernes");
        viernesJCB.setEnabled(false);
        viernesJCB.setOpaque(false);
        InformacionCurso.add(viernesJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        sabadoJCB.setForeground(new java.awt.Color(255, 255, 255));
        sabadoJCB.setText("Sábado");
        sabadoJCB.setEnabled(false);
        sabadoJCB.setOpaque(false);
        InformacionCurso.add(sabadoJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fecha de fin del curso:");
        InformacionCurso.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        minutoEnJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutoEnJCB.setEnabled(false);
        InformacionCurso.add(minutoEnJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 50, -1));

        horaEnJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        horaEnJCB.setEnabled(false);
        InformacionCurso.add(horaEnJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hora de entrada");
        InformacionCurso.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        horaSaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        horaSaJCB.setEnabled(false);
        InformacionCurso.add(horaSaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        minutoSaJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minutoSaJCB.setEnabled(false);
        InformacionCurso.add(minutoSaJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 50, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        InformacionCurso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, 50));

        jButton2.setText("Inscribirse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        InformacionCurso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 220, 50));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        InformacionCurso.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 20, 20));

        add(InformacionCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CursosDisponibles.setBackground(new java.awt.Color(24, 24, 24));
        CursosDisponibles.setPreferredSize(new java.awt.Dimension(891, 483));
        CursosDisponibles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setOpaque(false);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(810, 350));

        jPanel6.setBackground(new java.awt.Color(24, 24, 24));
        jPanel6.setPreferredSize(new java.awt.Dimension(810, 500));

        for(int i = 0; i < 5; i++) {
            if(curso[i] != null) {
                jPanel6.add(curso[i]);
            }
            else
            siguienteJB.setEnabled(false);
        }

        jScrollPane3.setViewportView(jPanel6);

        CursosDisponibles.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 810, 320));

        jPanel7.setBackground(new java.awt.Color(49, 78, 106));
        jPanel7.setPreferredSize(new java.awt.Dimension(891, 78));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cursos Disponibles");
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 49));
        jPanel7.add(jLabel4, new java.awt.GridBagConstraints());

        CursosDisponibles.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cursos Disponibles");
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 49));
        CursosDisponibles.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        anteriorJB.setText("<-");
        anteriorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorJBActionPerformed(evt);
            }
        });
        CursosDisponibles.add(anteriorJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        siguienteJB.setText("->");
        siguienteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteJBActionPerformed(evt);
            }
        });
        CursosDisponibles.add(siguienteJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, -1, -1));

        add(CursosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void anteriorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorJBActionPerformed
        numCurso -= 5;
        this.setVisible(false);
        Main.Alumno.actualizarPlus(numCurso);
    }//GEN-LAST:event_anteriorJBActionPerformed

    private void siguienteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteJBActionPerformed
        numCurso += 5;
        this.setVisible(false);
        Main.Alumno.actualizarPlus(numCurso);
    }//GEN-LAST:event_siguienteJBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InformacionCurso.setVisible(false);
        CursosDisponibles.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Nombre: " + datosInstructor[1] + " " + datosInstructor[2] + "\n" +
            "Genero: " + Conversion.generoAString((int) datosInstructor[3]) + "\n" +
            "Usuario: " + datosInstructor[6] + "\n" +
            "Correo: " + datosInstructor[5] + "\n",
            "Información del instructor", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Botón inscribirse
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Mensaje de confirmación
        String[] opciones = { "Aceptar", "Cancelar" };
        int opcion = JOptionPane.showOptionDialog(null, "¿Está seguro que quiere inscribirse?", 
                "Información", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]);
        if(opcion == 0) {
            Connection conn = BD.getConnection();
            if(conn != null) {
                if(BD.isInscrito(conn, id, idCurso))
                    Error.error030();
                else                
                BD.crearCita(conn, id, idCurso);
            }
            BD.closeConnection(conn);
            Main.Alumno.actualizar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Obtiene un array de 5 cursos.
    private void obtenerCursos() {
        for(int i = numCurso, a = 0; i < numCurso + 5; i++) {
            CursoJP temp = new CursoJP(i, BD.NO_CONDITION);
            if(temp.existe()) {
                curso[a] = temp;
                curso[a].setColorFondo(51, 0, 0);
            }
            else 
                break;
            temp = null;
            a++;
        }       
    }
   
    
    // Se llama al presionar un curso.
    public void cursoPresionado(int ID) {
        CursosDisponibles.setVisible(false);
        getDatos(ID);
        InformacionCurso.setVisible(true);
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
    
    
    

     
     public void getDatos(int ID) {
        Connection conn = BD.getConnection();
        if(conn != null) {
            Object[] datosCurso = BD.datosCurso(conn, ID);
            idCurso = (int) datosCurso[0];
            int idInst = (int) datosCurso[1];
            datosInstructor = BD.getDatosPersona(conn, idInst, BD.INSTRUCTOR);
            nombreInstructorJTF.setText((String) datosInstructor[1] + " " + (String) datosInstructor[2]);
            
            // Métodos obsoletos**** -verificar
            Date inicio = (Date) datosCurso[3];
            Date fin = (Date) datosCurso[4];
            diaIniJCB.setSelectedIndex(inicio.getDate() + 1);
            mesIniJCB.setSelectedIndex(inicio.getMonth() + 1);
            añoIniJCB.setSelectedIndex(inicio.getYear() - 116);
            diaFinJCB.setSelectedIndex(fin.getDate() + 1);
            mesFinJCB.setSelectedIndex(fin.getMonth() + 1);
            añoFinJCB.setSelectedIndex(fin.getYear() - 116);
            
            
            precioJTF.setText(String.valueOf((double) datosCurso[5]));
            duracionJTF.setText(String.valueOf((int) datosCurso[6]));
            
            lunesJCB.setSelected(Conversion.diasAComboBox(1, (int) datosCurso[7]));
            martesJCB.setSelected(Conversion.diasAComboBox(2, (int) datosCurso[7]));
            miercolesJCB.setSelected(Conversion.diasAComboBox(3, (int) datosCurso[7]));
            juevesJCB.setSelected(Conversion.diasAComboBox(4, (int) datosCurso[7]));
            viernesJCB.setSelected(Conversion.diasAComboBox(5, (int) datosCurso[7]));
            sabadoJCB.setSelected(Conversion.diasAComboBox(6, (int) datosCurso[7]));
            domingoJCB.setSelected(Conversion.diasAComboBox(7, (int) datosCurso[7]));
            
            // Métodos obsoletos**** -verificar
            Time entrada = (Time) datosCurso[8];
            Time salida = (Time) datosCurso[9];
            minutoSaJCB.setSelectedIndex(entrada.getMinutes());
            horaEnJCB.setSelectedIndex(entrada.getHours());
            minutoSaJCB.setSelectedIndex(salida.getMinutes());
            horaSaJCB.setSelectedIndex(salida.getHours());
            
            nombreJTF.setText((String) datosCurso[10]);
            jLabel2.setText((String) datosCurso[10]);
            descripcionJTA.setText((String) datosCurso[11]);
            paisJCB.setSelectedIndex((int) datosCurso[12]);
            estadoJCB.setSelectedIndex((int) datosCurso[13]);
            municipioJCB.setSelectedIndex((int) datosCurso[14]);
            direccionJTF.setText((String) datosCurso[15]);            
        }
        BD.closeConnection(conn);
        
    }
    
    
    
     
     
     
     
     

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel CursosDisponibles;
    public javax.swing.JPanel InformacionCurso;
    private javax.swing.JButton anteriorJB;
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JButton siguienteJB;
    private javax.swing.JCheckBox viernesJCB;
    // End of variables declaration//GEN-END:variables
    // Variables extra:
    private int idCurso;
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
    private int numCurso;   
    public CursoJP[] curso = new CursoJP[5];
    private Object[] datosInstructor;
}
