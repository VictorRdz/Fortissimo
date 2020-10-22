package support;
import java.sql.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.util.Calendar;


public class Validacion {

    // Valida el nombre y apellido usando Regular Expressions 
    public static boolean nombre(JTextField nombreField, JTextField apellidoField) {
        boolean valid = true;
        String regx = "^[\\p{L}\\s\\.’\\-,]+$"; // Patron de verificación
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher m1 = pattern.matcher(nombreField.getText());
        Matcher m2 = pattern.matcher(apellidoField.getText());
        if(!(m1.find() && m2.find())) {
            valid = false;
            Error.error001();
        }
        return valid;
    }
   
    // Valida la fecha de nacimiento
    public static boolean nacimiento(JComboBox diaBox, JComboBox mesBox, JComboBox añoBox) {
        boolean valid = true;
        String dia = (String)diaBox.getSelectedItem();
        String mes = (String)mesBox.getSelectedItem();
        String año = (String)añoBox.getSelectedItem();
        if(año.equals("año") || mes.equals("mes") || dia.equals("día")) {
            valid = false;
            Error.error002();
        }
        return valid;
    }
    
    // Valida el correo electrónico usando Regular Expressions
    public static boolean correo(JTextField correoField) {
        boolean valid = true;
        // Patrón simple de verificación de e-mails.
        Pattern p3 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
        Matcher m3 = p3.matcher(correoField.getText());
        if(!m3.find()) {
            valid = false;
            Error.error003();
        }
        return valid;
    }
   
    // Valida el nombre de usuario usando Regular Expressions
    public static boolean usuario(JTextField usuarioField) {
      boolean valid = true;
      Pattern p2 = Pattern.compile("^[a-zA-Z0-9._-]{5,20}$", Pattern.CASE_INSENSITIVE);
      Matcher m4 = p2.matcher(usuarioField.getText());
      if(!m4.find()) {
         valid = false;
         Error.error004();
      }   
      return valid;
   } 
   
    // Valida que ambas contraseñas sean iguales
    public static boolean mismaContraseña(JPasswordField passField1, JPasswordField passField2) {
        boolean valid = true;
        if (!Arrays.equals(passField1.getPassword(), passField2.getPassword())) {
            valid = false;
            Error.error005();
        }      
        return valid;
   }
   
    // Valida la longitud de la contraseña (min = 6 | max = 20)
    public static boolean tamañoContraseña(JPasswordField passField) {
        boolean valid = true;
        String pass = new String(passField.getPassword());
        if((pass.length() < 6) || (pass.length() > 20)) {
            valid = false;
            Error.error006();
        }      
        return valid;
   }
   
    // Valida el numero telefonico
    public static boolean telefono(JTextField telField) {
        boolean valid = true;  
        String tel = telField.getText();
        if(!(tel.equals("") || tel.matches("^[0-9]{7,20}$"))) {
               valid = false;
               Error.error007();
            }
        return valid;
    }
   
    // Valida la dirección
    public static boolean direccion(JComboBox paisJCB, JComboBox estadoJCB, JComboBox municipioJCB) {
        boolean valid = true;
        if( (paisJCB.getSelectedIndex() == 0) || (estadoJCB.getSelectedIndex() == 0) || (municipioJCB.getSelectedIndex() == 0)  ) {
            valid = false;
            Error.error015();
        }
        return valid;
    }
    
    
    // Valida el nombre del curso 
    public static boolean nombreCurso(JTextField nombreField) {
        boolean valid = true;
        String nombreCurso = nombreField.getText();
        if(nombreCurso.length() > 45 || nombreCurso.length() < 10) {
            valid = false;
            Error.error001();
        }
        return valid;
    }


    // Valida la descripción del curso 
    public static boolean descripcionCurso(JTextArea descripcionArea) {
        boolean valid = true;
        String descripcion = descripcionArea.getText();
        if((descripcion.length() > 500) || (descripcion.length() <= 30)) {
            valid = false;
            Error.error018();
        }
        return valid;
    }
    
    
    // Valida la duracion del curso
    public static boolean duracion(JTextField duracionJTF) {
        boolean valid = true;  
        String duracion = duracionJTF.getText();
        String regx = "^[1-9][0-9]*$"; // Patron de verificación
        Pattern pattern = Pattern.compile(regx);
        Matcher m1 = pattern.matcher(duracion);
        if(!m1.find() || duracion.length() > 4) {
               valid = false;
               Error.error020();
            }
        return valid;
    }
    
    
    // Valida el precio del curso
    public static boolean precio(JTextField precioJTF) {
        boolean valid = true;  
        String precio = precioJTF.getText();
        String regx = "^[0-9]+(\\.[0-9]*)?$"; // Patron de verificación
        Pattern pattern = Pattern.compile(regx);
        Matcher m1 = pattern.matcher(precio);
        if(!(m1.find() && precio.length() < 9)) {
               valid = false;
               Error.error019();
            }
        return valid;
    }
    
    
    // Valida la direccion escrita
    public static boolean direccion(JTextField direccionJTF) {
        boolean valid = true;
        String direccion = direccionJTF.getText();
        if(direccion.length() > 50 || direccion.length() < 10) {
            valid = false;
            Error.error023();
        }
        return valid;
    }
    
    
    // Validar días seleccionados
    public static boolean dias(JCheckBox lun, JCheckBox mar, JCheckBox mie, JCheckBox jue,
                JCheckBox vie, JCheckBox sab, JCheckBox dom) {
        boolean valid = true;
        if(!(lun.isSelected() || mar.isSelected() || mie.isSelected() || jue.isSelected() ||
                vie.isSelected() || sab.isSelected() || dom.isSelected())) {
            valid = false;
            Error.error021();
        }
        return valid;
    }
    
    // Validar hora de entrada
    public static boolean hora(JComboBox horaInJCB, JComboBox minInJCB,
                JComboBox horaSalJCB, JComboBox minSalJCB) {
        boolean valid = true;
        if(horaInJCB.getSelectedIndex() > horaSalJCB.getSelectedIndex() - 1) {
            valid = false;
            Error.error024();
        }
        return valid;
    }
    
    // Valida el instrumento del curso
    public static boolean instrumento(JComboBox instrumentoJCB) {
        boolean valid = true;
        int val = instrumentoJCB.getSelectedIndex();
        if(val == -1) {
            valid = false;
            Error.error027();
        }
        return valid;
    }
    
    
    
    
    // Validar que la fecha del curso sea mayor que una semana.
    public static boolean fechaCurso(java.sql.Date fechaI, java.sql.Date fechaF) {
        boolean valid = true;
        // Convertir a Date
        java.util.Date fechaInicio = java.sql.Date.valueOf(fechaI.toString());
        java.util.Date fechaFin = java.sql.Date.valueOf(fechaF.toString());
        // Aumentar fechaInicio 7 dias
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaInicio);
        cal.add(Calendar.DATE, 7);
        fechaInicio = cal.getTime();
        // Comparar fechas
        if(fechaInicio.after(fechaFin)){
            valid = false;
            Error.error022();
        }
        return valid;
    }
    
    
    
    
    
    
    
    
    // Verifica que el correo no este repetido en la BD
    public static boolean correoEnBD(Connection conn, JTextField correoField) {
        boolean valid = true;
        String varBD = "correoAlumno";
        String tabBD = "alumno";
        // El ciclo 'for' primero busca en la tabla "alumno"
            // y despues en la tabla "instructor".
        for(int i = 0; i < 2; i++) {
            // result = ¿Ya se encuentra en la base de datos?
            boolean result = true;
            String validarCorreo = "SELECT * FROM " + tabBD
                + " WHERE " + varBD + "=?";
            PreparedStatement validar;
            try {
                // Inicio del PreparedStatement validar
                validar =  conn.prepareStatement(validarCorreo);
                validar.setString(1, correoField.getText());
                ResultSet rs = validar.executeQuery();
                result = rs.next();
                validar.close();  
                // Fin del PreparedStatement validar
            } catch (SQLException ex) {
                Error.error000();
            }
            if(result) {
               valid = false;
               Error.error008();
               break;
            }
            varBD = "correoInstructor";
            tabBD = "instructor";
        }
        return valid;
    }
   
    // Verifica que el nombre de usuario no este repetido en la BD
    public static boolean usuarioEnBD(Connection conn, JTextField usuarioField) {
        boolean valid = true;
        String varBD2 = "usuarioAlumno";
        String tabBD2 = "alumno";
        // El ciclo 'for' primero busca en la tabla "alumno"
            // y despues en la tabla "instructor".
        for(int i = 0; i < 2; i++) {
            // result = ¿Ya se encuentra en la base de datos?
            boolean result = true;
            String verificarUsuario = "SELECT * FROM " + tabBD2
                + " WHERE " + varBD2 + "=?";
            PreparedStatement verificar;
            try {
                // Inicio del PreparedStatement validar
                verificar = conn.prepareStatement(verificarUsuario);
                verificar.setString(1, usuarioField.getText());
                ResultSet rs = verificar.executeQuery();
                result = rs.next();
                verificar.close(); 
                // Fin del PreparedStatement validar
            } catch (SQLException ex) {
               Error.error000();
            }
            if(result) {
               valid = false;
               Error.error009();
               break;
            }
            varBD2 = "usuarioInstructor";
            tabBD2 = "instructor";
        }
        return valid;
    }
}
