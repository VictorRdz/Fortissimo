package proyectopoo.alumno;
import java.awt.Toolkit;
import javax.swing.*;
import proyectopoo.InicioJF;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import support.BD;
import proyectopoo.Main;
import support.Error;



public class AlumnoJF extends JFrame {


    public AlumnoJF(int id) {
        getDatos(id);
        initComponents();
        crearPaneles();
        ajustarPaneles();
        ocultarPaneles();
        Home.setVisible(true);
        String iconURL = "src/images/icon32x32.png";
        Toolkit tdefault = Toolkit.getDefaultToolkit();
        setIconImage(tdefault.getImage(iconURL));
        setVisible(true);
        
    }
    
    

   // Componentes iniciales del frame
   // ***MODIFICAR UNICAMENTE MEDIANTE EL GUI BUILDER DE NETBEANS***
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        BarraLateralJP = new javax.swing.JPanel();
        plusJP = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        infoJP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ffJP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitJP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        homeJP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userJP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        refreshJP = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BarraSuperiorJP = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setTitle("Fortissimo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        BarraLateralJP.setBackground(new java.awt.Color(255, 255, 255));
        BarraLateralJP.setPreferredSize(new java.awt.Dimension(69, 540));
        BarraLateralJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plusJP.setBackground(new java.awt.Color(33, 33, 42));
        plusJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusJP.setPreferredSize(new java.awt.Dimension(69, 80));
        plusJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusJPMousePressed(evt);
            }
        });
        plusJP.setLayout(new java.awt.GridBagLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-2-24.png"))); // NOI18N
        plusJP.add(jLabel6, new java.awt.GridBagConstraints());

        BarraLateralJP.add(plusJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 379, -1, -1));

        infoJP.setBackground(new java.awt.Color(33, 33, 42));
        infoJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoJP.setPreferredSize(new java.awt.Dimension(69, 81));
        infoJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                infoJPMousePressed(evt);
            }
        });
        infoJP.setLayout(new java.awt.GridBagLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info-3-24.png"))); // NOI18N
        infoJP.add(jLabel5, new java.awt.GridBagConstraints());

        BarraLateralJP.add(infoJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 298, -1, -1));

        ffJP.setBackground(new java.awt.Color(153, 51, 0));
        ffJP.setPreferredSize(new java.awt.Dimension(69, 57));
        ffJP.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-24.png"))); // NOI18N
        ffJP.add(jLabel1, new java.awt.GridBagConstraints());

        BarraLateralJP.add(ffJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        exitJP.setBackground(new java.awt.Color(33, 33, 42));
        exitJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitJP.setPreferredSize(new java.awt.Dimension(69, 81));
        exitJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitJPMousePressed(evt);
            }
        });
        exitJP.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-24.png"))); // NOI18N
        exitJP.add(jLabel2, new java.awt.GridBagConstraints());

        BarraLateralJP.add(exitJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 459, -1, -1));

        homeJP.setBackground(new java.awt.Color(33, 33, 42));
        homeJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeJP.setPreferredSize(new java.awt.Dimension(69, 81));
        homeJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeJPMousePressed(evt);
            }
        });
        homeJP.setLayout(new java.awt.GridBagLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house-24.png"))); // NOI18N
        homeJP.add(jLabel3, new java.awt.GridBagConstraints());

        BarraLateralJP.add(homeJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 137, -1, -1));

        userJP.setBackground(new java.awt.Color(33, 33, 42));
        userJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userJP.setPreferredSize(new java.awt.Dimension(69, 80));
        userJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userJPMousePressed(evt);
            }
        });
        userJP.setLayout(new java.awt.GridBagLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-24.png"))); // NOI18N
        userJP.add(jLabel4, new java.awt.GridBagConstraints());

        BarraLateralJP.add(userJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, -1, -1));

        refreshJP.setBackground(new java.awt.Color(33, 33, 42));
        refreshJP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshJP.setPreferredSize(new java.awt.Dimension(69, 80));
        refreshJP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshJPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshJPMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshJPMousePressed(evt);
            }
        });
        refreshJP.setLayout(new java.awt.GridBagLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh-24.png"))); // NOI18N
        refreshJP.add(jLabel8, new java.awt.GridBagConstraints());

        BarraLateralJP.add(refreshJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, -1, -1));

        getContentPane().add(BarraLateralJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarraSuperiorJP.setBackground(new java.awt.Color(37, 37, 48));
        BarraSuperiorJP.setPreferredSize(new java.awt.Dimension(891, 57));
        BarraSuperiorJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 37, 48));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(usuario);

        // Código agregado
        String userPicture;
        if(genero == 2)
        userPicture = "/images/userF24.png";
        else
        userPicture = "/images/userM24.png";
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(userPicture)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        BarraSuperiorJP.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 200, 40));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo electrónico:");
        BarraSuperiorJP.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre: ");
        BarraSuperiorJP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText(correo);
        BarraSuperiorJP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText(nombre + " " + apellido);
        BarraSuperiorJP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(BarraSuperiorJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        setSize(new java.awt.Dimension(976, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitJPMouseEntered
        exitJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_exitJPMouseEntered

    private void exitJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitJPMouseExited
        exitJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_exitJPMouseExited

    private void homeJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeJPMouseEntered
        homeJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_homeJPMouseEntered

    private void homeJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeJPMouseExited
        homeJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_homeJPMouseExited

    private void userJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJPMouseEntered
        userJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_userJPMouseEntered

    private void userJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJPMouseExited
        userJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_userJPMouseExited

    private void infoJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPMouseEntered
        infoJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_infoJPMouseEntered

    private void infoJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPMouseExited
        infoJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_infoJPMouseExited

    private void plusJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusJPMouseEntered
        plusJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_plusJPMouseEntered

    private void plusJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusJPMouseExited
        plusJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_plusJPMouseExited

    private void exitJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitJPMousePressed
        String[] opciones = { "Salir", "Cerrar sesión", "Cancelar" };
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Salir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[0]);
        switch(opcion) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Main.Inicio = new InicioJF();
                Main.Alumno.setVisible(false);
        }
    }//GEN-LAST:event_exitJPMousePressed

    private void refreshJPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshJPMouseEntered
        refreshJP.setBackground(new java.awt.Color(33, 33, 42).brighter());
    }//GEN-LAST:event_refreshJPMouseEntered

    private void refreshJPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshJPMouseExited
        refreshJP.setBackground(new java.awt.Color(33, 33, 42));
    }//GEN-LAST:event_refreshJPMouseExited

    // Botón Home
    private void homeJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeJPMousePressed
        ocultarPaneles();
        Home.setVisible(true);
    }//GEN-LAST:event_homeJPMousePressed
    
    // Botón User
    private void userJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJPMousePressed
        ocultarPaneles();
        User.setVisible(true);
    }//GEN-LAST:event_userJPMousePressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        String userPicture;
        if(genero == 2)
            userPicture = "/images/userF24configure.png";
        else
            userPicture = "/images/userM24configure.png";
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(userPicture)));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        String userPicture;
        if(genero == 2)
            userPicture = "/images/userF24.png";
        else
            userPicture = "/images/userM24.png";
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(userPicture)));
    }//GEN-LAST:event_jPanel1MouseExited
    
    // Botón Refresh
    private void refreshJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshJPMousePressed
        actualizar();
    }//GEN-LAST:event_refreshJPMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        ocultarPaneles();
        User.setVisible(true);
    }//GEN-LAST:event_jPanel1MousePressed

    private void infoJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPMousePressed
        ocultarPaneles();
        Info.setVisible(true);
    }//GEN-LAST:event_infoJPMousePressed

    private void plusJPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusJPMousePressed
        ocultarPaneles();
        Plus.setVisible(true);
    }//GEN-LAST:event_plusJPMousePressed
    
   
    // Refrescar pantalla
    public void actualizar() {
        int visible = 1;
        if(Info.isVisible()) {
            visible = 2;
        }
        else if(Plus.isVisible()) {
            visible = 3;
        }
        else if(User.isVisible()) {
            visible = 4;
        }
        this.setVisible(false);
        Main.Alumno = new AlumnoJF(id);
        switch(visible) {
            case 2:
                Main.Alumno.Home.setVisible(false);
                Main.Alumno.Info.setVisible(true);
                break;
            case 3:
                Main.Alumno.Home.setVisible(false);
                Main.Alumno.Plus.setVisible(true);
                break;
            case 4:
                Main.Alumno.Home.setVisible(false);
                Main.Alumno.User.setVisible(true);
                break;
            default:
        }
    }
    
    
    
    
    // Ajustar páneles a la pantalla
    private void ajustarPaneles() {
        add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        this.pack();
    }
    
    // Crear páneles
    private void crearPaneles() {
        Home = new HomeJP(asignarDatos());
        Info = new InfoJP(asignarDatos(), 0);
        Plus = new PlusJP(asignarDatos(), 0);
        User = new UserJP(asignarDatos());
    }
    
    
    // Ocultar páneles
    private void ocultarPaneles() {
        Home.setVisible(false);
        Info.setVisible(false);
        Plus.setVisible(false);
        User.setVisible(false);
    }
    

    // Obtener los datos del alumno
    private void getDatos(int ID) {
        Connection conn = BD.getConnection();
        if(conn != null) {
            almacenarDatos(BD.getDatosPersona(conn, ID, BD.ALUMNO));
        } 
        BD.closeConnection(conn);
    }
    
    
    public Object[] asignarDatos() {
        Object[] datos = new Object[] {id, nombre, apellido, genero, fecha, correo, usuario, contraseña, telefono,
        pais, estado, municipio};
        return datos;
    }
    
    private void almacenarDatos(Object[] datos) {
        if(datos != null) {
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
        else
            Error.error017();
    }



    public int getIdAlumno() {
        return id;
    }
    
    public void actualizarPlus(int numCurso) {
        ocultarPaneles();
        Plus = new PlusJP(asignarDatos(), numCurso);
        add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        this.pack();
    }
    
    public void actualizarInfo(int numCurso) {
        ocultarPaneles();
        Info = new InfoJP(asignarDatos(), numCurso);
        add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 57, -1, -1));
        this.pack();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateralJP;
    private javax.swing.JPanel BarraSuperiorJP;
    private javax.swing.JPanel exitJP;
    private javax.swing.JPanel ffJP;
    private javax.swing.JPanel homeJP;
    private javax.swing.JPanel infoJP;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel plusJP;
    private javax.swing.JPanel refreshJP;
    private javax.swing.JPanel userJP;
    // End of variables declaration//GEN-END:variables
    
    // Variables extra:
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
    
    // Páneles
    public HomeJP Home;
    //public InfoJP Info;
    public PlusJP Plus;
    public UserJP User;
    public InfoJP Info;
    
    
    
}
