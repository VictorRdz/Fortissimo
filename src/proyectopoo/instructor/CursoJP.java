package proyectopoo.instructor;
import javax.swing.*;
import support.BD;
import support.Error;
import java.sql.*;
import proyectopoo.Main;
import support.Conversion;
import java.awt.Color;


public class CursoJP extends JPanel {

    
    
    
    // Constructor
    public CursoJP(int val, int CONS) {
        getDatos(val, CONS);
        initComponents();
    }
    

    
    
    
    
    
    
    
    // Componentes iniciales del frame
   // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(810, 80));
        setPreferredSize(new java.awt.Dimension(810, 95));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        if(valid)
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(createUrl())));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 70));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Duración:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(String.valueOf(duracionCurso) + " horas.");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 90, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instrumento:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Impartido por:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del Curso:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(descripcionCurso);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 270, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        if(valid) {
            String[] nmbr = nombreInstrumento.split(" ");
            jLabel9.setText(nmbr[1]);
        }
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(nombreInstructor + " " + apellidoInstructor);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 260, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$" + String.valueOf(precioCurso));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 100, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripción del curso:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(nombreCurso);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Días:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 60, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(Conversion.diasALetras(diasCurso));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        setBackground(colorFondo.brighter());
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        setBackground(colorFondo);
    }//GEN-LAST:event_formMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Main.Instructor.Info.cursoPresionado(this.idCurso);
    }//GEN-LAST:event_formMousePressed
    
    
    
    
    

    // Obtiene los datos de la id 'selected'.
    public void getDatos(int val, int CONS) {
        Connection conn = BD.getConnection();
        if(conn != null) {
            Object[] datos = BD.getInfoCurso(conn, val, CONS);
            if(datos != null) {
                idCurso = (int) datos[0];
                nombreCurso = (String) datos[1];
                descripcionCurso = (String) datos[2];
                precioCurso = (double) datos[3];
                duracionCurso = (int) datos[4];
                diasCurso = (int) datos[5];
                nombreInstrumento = (String) datos[6];
                nombreInstructor = (String) datos[7];
                apellidoInstructor = (String) datos[8];
            }
            else
                valid = false;
            }
        BD.closeConnection(conn);
    }
       
    
    
    // Crea la URL de la imagen del instrumento.
    private String createUrl() {
        int idInst = Integer.parseInt(nombreInstrumento.substring(0, 2));
        String URL = "/icons/";
        URL = URL.concat(String.valueOf(idInst));
        URL = URL.concat(".png");
        return URL;
    }
    
    
    
    // Devuelve la ID del curso.
    public int getId() {
        return idCurso;
    }
    
    // Devuelve true si el curso existe.
    public boolean existe() {
        return valid;
    }
    
    public void setColorFondo(int R, int G, int B) {
        colorFondo = new Color(R, G, B);
        setBackground(colorFondo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
    
    // Variable para exist()
    private boolean valid = true;
    
    // Variables del panel
    private int idCurso;
    private double precioCurso;
    private int duracionCurso;
    private int diasCurso;
    private String nombreCurso;
    private String descripcionCurso;
    private String nombreInstrumento;
    private String nombreInstructor;
    private String apellidoInstructor;

    private Color colorFondo = new Color(86, 6, 6);
    private final static int PLUS = 0;
    private final static int INFO = 0;
}
