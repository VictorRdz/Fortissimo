package support;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*  SE PUEDE ACCEDER A ESTA CLASE PARA REALIZAR LAS OPERACIONES
    CON LA BASE DE DATOS, COMO CONSULTAR DATOS, ETC.
*/

public class BD {
    
    // Constantes de conexión (Modificar en caso de ser necesario).
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";   
    private static String URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";  
    public static String USERNAME = "root";   
    public static String PASSWORD = "pass";

    
    private static Connection conn;
    
    // Método para realizar la conexión.    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_NAME);
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                Error.error000();
            }
        } catch (ClassNotFoundException ex) {
            Error.error010();
        }
        return conn;
    }
    
    // Método para cerrar la conexión.
    public static void closeConnection(Connection conn) {
        if(conn != null) {
        try {
                conn.close();
            } catch (SQLException ex) {
                Error.error016();
            }
        }
    }
    
    
    
    
    // Método para obtener datos de un alumno o instructor
    // Conexión NO NULA
    // CONS = ALUMNO | INSTRUCTOR
    public static Object[] getDatosPersona(Connection conn, int ID, int CONS) {
        Object[] datos = null;
        String Persona;
        switch (CONS) {
            case 5:
                Persona = "Alumno";
                break;
            case 6:
                Persona = "Instructor";
                break;
            default:
                Error.error014();
                return datos;
        }
        String condicion = "SELECT * FROM " + Persona + " WHERE id" + Persona + "=?";
        PreparedStatement ps;
        ResultSet rs;
        try {
           ps = conn.prepareStatement(condicion);
           ps.setInt(1, ID);
           rs = ps.executeQuery();
           rs.next();
           id = rs.getInt("id" + Persona);
           nombre = rs.getString("nombre" + Persona);
           apellido = rs.getString("apellido" + Persona);
           genero = rs.getInt("genero" + Persona);
           nacimiento = rs.getDate("nacimiento" + Persona);
           correo = rs.getString("correo" + Persona);
           usuario = rs.getString("usuario" + Persona);
           contraseña = rs.getString("contraseña" + Persona);
           celular = rs.getLong("celular" + Persona);
           pais = rs.getInt("pais" + Persona);
           estado = rs.getInt("estado" + Persona);
           municipio = rs.getInt("municipio" + Persona);
           datos = new Object[] {id, nombre, apellido, genero, nacimiento, correo,
                usuario, contraseña, celular, pais, estado, municipio};
           rs.close();
           ps.close(); 
        } catch(SQLException ex) {
           Error.error000();
       }
        return datos;
   }
   
    
    // Obtiene si ya está inscrito en el curso
    public static boolean isInscrito(Connection conn, int idAlumno, int idCurso) {
        boolean inscrito = false;
        String condicion = "SELECT * FROM Cita WHERE Alumno_idAlumno = ? and Curso_idCurso = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idCurso);
            rs = ps.executeQuery();
            if(rs.next())
                inscrito = true;
            ps.close();
            rs.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return inscrito;
    }
    
    
    
    
    
    // Obtiene la informacion de display del CursoJP
    public static Object[] getInfoCurso(Connection conn, int val, int CONS) {
        String condicion = null;
        switch(CONS) {
            case 7:
                condicion = "SELECT Curso.idCurso, Curso.nombreCurso, Curso.descripcionCurso, " +
                "Curso.precioCurso, Curso.duracionCurso, Curso.diasCurso, " +
                "Instrumento.nombreInstrumento, Instructor.nombreInstructor, " +
                "Instructor.apellidoInstructor FROM Curso " +
                "INNER JOIN Instrumento ON (Curso.Instrumento_idInstrumento = Instrumento.idInstrumento) " +
                "INNER JOIN Instructor ON (Curso.Instructor_idInstructor = Instructor.idInstructor) " +
                "ORDER BY idCurso DESC LIMIT ?, 1";
                break;
            case 0:
                condicion = "SELECT Curso.idCurso, Curso.nombreCurso, Curso.descripcionCurso, " +
                "Curso.precioCurso, Curso.duracionCurso, Curso.diasCurso, " +
                "Instrumento.nombreInstrumento, Instructor.nombreInstructor, " +
                "Instructor.apellidoInstructor FROM Curso " +
                "INNER JOIN Instrumento ON (Curso.Instrumento_idInstrumento = Instrumento.idInstrumento) " +
                "INNER JOIN Instructor ON (Curso.Instructor_idInstructor = Instructor.idInstructor) "
                        + "WHERE Curso.idCurso = ?";
                break;
            default:
                return null;   
        }
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, val);
            rs = ps.executeQuery();
            if(rs.next()) {
                idCurso = rs.getInt("idCurso");
                nombreCurso = rs.getString("nombreCurso");
                descripcionCurso = rs.getString("descripcionCurso");
                precioCurso = rs.getDouble("precioCurso");
                duracionCurso = rs.getInt("duracionCurso");
                diasCurso = rs.getInt("diasCurso");
                nombreInstrumento = rs.getString("nombreInstrumento");
                nombre = rs.getString("nombreInstructor");
                apellido = rs.getString("apellidoInstructor");
                datos = new Object[] {idCurso, nombreCurso, descripcionCurso, precioCurso, duracionCurso, 
                    diasCurso, nombreInstrumento, nombre, apellido};
            }
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return datos;
    }
    
    
    // Obtiene los cursos en los que está inscrito el alumno
    public static int[] getCursos(Connection conn, int idAlumno) {
        String condicion = "SELECT Curso_idCurso FROM Cita WHERE Alumno_idAlumno = ? ORDER BY idCita DESC";
        int[] datos = new int[100];
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, idAlumno);
            rs = ps.executeQuery();
            for(int i = 0; rs.next(); i++) {
                datos[i] = rs.getInt("Curso_idCurso");
            }
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return datos;
    }
    
    
     // Obtiene los cursos que imparte el instructor
    public static int[] getCursosInst(Connection conn, int idInstructor) {
        String condicion = "SELECT idCurso FROM Curso WHERE Instructor_idInstructor = ? ORDER BY idCurso DESC";
        int[] datos = new int[100];
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, idInstructor);
            rs = ps.executeQuery();
            for(int i = 0; rs.next(); i++) {
                datos[i] = rs.getInt("idCurso");
            }
            rs.close();
            ps.close();
            
        } catch(SQLException ex) {
            Error.error000();
        }
        return datos;
    }
    
    
    
    
    
    public static Object[] datosCurso(Connection conn, int val) {
        String condicion = "SELECT * FROM curso WHERE idCurso = ?";
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, val);
            rs = ps.executeQuery();
            if(rs.next()) {
                idCurso = rs.getInt("idCurso");
                idInstructor = rs.getInt("Instructor_idInstructor");
                idInstrumento = rs.getInt("Instrumento_idInstrumento");
                inicioCurso = rs.getDate("inicioCurso");
                finCurso = rs.getDate("finCurso");
                precioCurso = rs.getDouble("precioCurso");
                duracionCurso = rs.getInt("duracionCurso");
                diasCurso = rs.getInt("diasCurso");
                hEntradaCurso = rs.getTime("hEntradaCurso");
                hSalidaCurso = rs.getTime("hSalidaCurso");
                nombreCurso = rs.getString("nombreCurso");
                descripcionCurso = rs.getString("descripcionCurso");
                pais = rs.getInt("paisCurso");
                estado = rs.getInt("estadoCurso");
                municipio = rs.getInt("municipioCurso");
                direccionCurso = rs.getString("direccionCurso");
                datos = new Object[] {idCurso, idInstructor, idInstrumento, inicioCurso, finCurso, precioCurso, duracionCurso,
                    diasCurso, hEntradaCurso, hSalidaCurso, nombreCurso, descripcionCurso, pais, estado, municipio, direccionCurso};
            }
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000(); 
        }
        return datos;
    }
    
    
    
    
    
    // MODIFICAR-----------------
    // Método para obtener datos del curso especifico. (DESC)
    // Conexión NO NULA
    // val = fila de la tabla (inicia en 0).
    public static Object[] getDatosCurso(Connection conn, int val) {
        String condicion = "SELECT * FROM curso ORDER BY idCurso DESC LIMIT ?, 1";
        Object[] datos = null;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, val);
            rs = ps.executeQuery();
            if(rs.next()) {
                idCurso = rs.getInt("idCurso");
                idInstructor = rs.getInt("Instructor_idInstructor");
                idInstrumento = rs.getInt("Instrumento_idInstrumento");
                inicioCurso = rs.getDate("inicioCurso");
                finCurso = rs.getDate("finCurso");
                precioCurso = rs.getDouble("precioCurso");
                duracionCurso = rs.getInt("duracionCurso");
                diasCurso = rs.getInt("diasCurso");
                hEntradaCurso = rs.getTime("hEntradaCurso");
                hSalidaCurso = rs.getTime("hSalidaCurso");
                nombreCurso = rs.getString("nombreCurso");
                descripcionCurso = rs.getString("descripcionCurso");
                pais = rs.getInt("paisCurso");
                estado = rs.getInt("estadoCurso");
                municipio = rs.getInt("municipioCurso");
                direccionCurso = rs.getString("direccionCurso");
                datos = new Object[] {idCurso, idInstructor, idInstrumento, inicioCurso, finCurso, precioCurso, duracionCurso,
                    diasCurso, hEntradaCurso, hSalidaCurso, nombreCurso, descripcionCurso, pais, estado, municipio, direccionCurso};
            }
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000(); 
        }
        return datos;
    }
    
    
    // Método para obtener el nombre de todos los instrumentos
    // Conexión NO NULA
    // ID = idInstrumento
    public static String[] getInstrumentos(Connection conn) {
        String[] instrumentos = null;
        String condicion = "SELECT nombreInstrumento FROM instrumento ORDER BY idInstrumento ASC";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            rs = ps.executeQuery();
                // Obtiene la cantidad de instrumentos
            int longitud;
            for(longitud = 0; rs.next(); longitud++) {
            }
            rs.beforeFirst();
            instrumentos = new String[longitud];
            for(int i = 0; rs.next(); i++) {
                instrumentos[i] = rs.getString("nombreInstrumento");
            }
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return instrumentos;
    }
    
    // Verifica si el instrumento existe en la base de datos.
    public static boolean existeInstrumento(Connection conn, int ID) {
        boolean existe = false;
        String condicion = "SELECT * FROM Instrumento WHERE idInstrumento = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            if(rs.next()) {
                existe = true;
            }
            ps.close();
            rs.close();
        } catch(SQLException ex) {
            Error.error000();
        }        
        return existe;
    }
    
    
    
    
    
    
    // Método para obtener datos del instrumento
    // Conexión NO NULA
    // ID = idInstrumento
    public static Object[] getDatosInstrumento(Connection conn, int ID) {
        Object[] datos = null;
        String condicion = "SELECT * FROM instrumento WHERE idInstrumento = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            rs.next();
            idInstrumento = rs.getInt("idInstrumento");
            nombreInstrumento = rs.getString("nombreInstrumento");
            datos = new Object[] {idInstrumento, nombreInstrumento};
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return datos;
    }
    
    // Método para obtener datos de la cita
    // Conexión NO NULA
    // CONS = ID_CITA | ID_ALUMNO | ID_CURSO
    public static Object[] getDatosCita(Connection conn, int ID, int CONS) {
        Object[] datos = null;
        String condicion;
        switch(CONS) {
            case 0:
                condicion = "SELECT * FROM cita WHERE idCurso = ?";
                break;
            case 3:
                condicion = "SELECT * FROM cita WHERE idCita = ?";
                break;
            case 4:
                condicion = "SELECT * FROM cita WHERE idAlumno = ?";
                break;
            default:
                Error.error014();
                return datos;
        }
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            rs.next();
            idCita = rs.getInt("idCita");
            id = rs.getInt("idAlumno");
            idCurso = rs.getInt("idCurso");
            datos = new Object[] {idCita, id, idCurso};
            rs.close();
            ps.close();
        } catch(SQLException ex) {
            Error.error000();
        }
        return datos;
    }
    
    
    public static void crearCita(Connection conn, int alID, int cuID) {
        String condicion = "INSERT INTO Cita (Alumno_idAlumno, Curso_idCurso) values (?, ?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, alID);
            ps.setInt(2, cuID);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Inscripción exitosa.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            Error.error028();
        }
    }
        
    
    
    public static boolean yaInscrito(Connection conn, int idAl, int idCurso) {
        boolean inscrito = false;
        String condicion = "SELECT * FROM Cita WHERE Alumno_idAlumno = ? and Curso_idCurso = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(condicion);
            ps.setInt(1, idAl);
            ps.setInt(2, idCurso);
            rs = ps.executeQuery();
            if(rs.next()) {
                inscrito = true;
            }
            ps.close();
            rs.close();
        } catch(SQLException ex) {
            Error.error000();
        }        
        return inscrito;
    }
    
    public static void obtenerAlumnos(Connection conn, DefaultTableModel tabla, int idCurso) {
        String sql = "SELECT Alumno.idAlumno, Alumno.nombreAlumno, Alumno.apellidoAlumno, Alumno.usuarioAlumno, " +
            "Alumno.correoAlumno FROM Cita INNER JOIN Alumno ON (Cita.Alumno_idAlumno = Alumno.idAlumno) " +
            "WHERE Curso_idCurso = ? ORDER BY idCita DESC";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idCurso);
            rs = ps.executeQuery();
            while(rs.next()) {
                int a = rs.getInt("idAlumno");
                String b = rs.getString("nombreAlumno");
                String c = rs.getString("usuarioAlumno");
                String d = rs.getString("correoAlumno");
                tabla.addRow(new Object[]{a, b, c, d});
            }
            ps.close();
            rs.close();
        } catch(SQLException ex) {
            Error.error000();
        }
    }
    
    public static void eliminarCurso(Connection conn, int idCurso) {
        String sql = "DELETE FROM Curso WHERE idCurso = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idCurso);
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "El curso se ha eliminado correctamente.",
                "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException ex) {
            Error.error000();
        }
    }
    
    
    
    
    
    /*
    public static int[] obtenerIdAlumnos(Connection conn, int idCurso) {
        int[] ids = null;
        String sql = "SELECT Alumno_idAlumno FROM Cita WHERE Curso_idCurso = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idCurso);
            rs = ps.executeQuery();
            int longitud;
            for(longitud = 0; rs.next(); longitud++) {
            }
            rs.beforeFirst();
            ids = new int[longitud];
            for(int i = 0; rs.next(); i++) {
                ids[i] = rs.getInt("Alumno_idAlumno");
            }
        } catch(SQLException ex) {
            Error.error000();
        }
        return ids;
    } */
    
    
    
    /*
    public static void obtenerAlumnos(Connection conn, DefaultTableModel tabla, int[] idAlumno) {
        String sql = "SELECT idAlumno, nombreAlumno, apellidoAlumno, correoAlumno FROM Alumno WHERE idAlumno = ? OR "
                + "idAlumno = ? OR idAlumno = ? OR idAlumno = ? OR idAlumno = ? OR";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            rs = ps.executeQuery();
            if(rs.next) {
                
            }
        } catch(SQLException ex) {
            Error.error000();
        }
    } */
    
    
    
    
    
    
    // Método para cambiar URL
    public static void cambiarUrl(String newUrl) {
        URL = newUrl.concat("?useSSL=false");
    }
    
    // Método para cambiar USERNAME
    public static void cambiarUsername(String newUsername) {
        USERNAME = newUsername;
    }
    
    // Método para cambiar PASSWORD
    public static void cambiarPassword(String newPassword) {
        PASSWORD = newPassword;
    }
    
    
    
    
    
   
    // Variables de Alumno e Instructor
    private static int id;  // PK
    private static String nombre;
    private static String apellido;
    private static int genero;
    private static java.sql.Date nacimiento;
    private static String correo;
    private static String usuario;
    private static String contraseña;
    private static long celular;
    private static int pais;
    private static int estado;
    private static int municipio;
    
    // Variables de Curso
    private static int idCurso;
    private static int idInstructor;    // FK
    private static int idInstrumento;   // FK
    private static java.sql.Date inicioCurso;
    private static java.sql.Date finCurso;
    private static double precioCurso;
    private static int duracionCurso;
    private static int diasCurso;
    private static java.sql.Time hEntradaCurso;
    private static java.sql.Time hSalidaCurso;
    private static String nombreCurso;
    private static String descripcionCurso;
    private static String direccionCurso;
    
    // Otras variables
    private static String nombreInstrumento;
    private static int idCita;
    
    // Constantes útiles
    public static final int ID_CURSO = 0;
    public static final int ID_INSTRUCTOR = 1;
    public static final int ID_INSTRUMENTO = 2;
    public static final int ID_CITA = 3;
    public static final int ID_ALUMNO = 4;
    public static final int ALUMNO = 5;
    public static final int INSTRUCTOR = 6;
    public static final int NO_CONDITION = 7;
    
    

    
}