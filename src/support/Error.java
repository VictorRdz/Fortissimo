package support;
import javax.swing.JOptionPane;

public abstract class Error {
   
    // Error al conectar con la base de datos.
    public static void error000() {
        JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.",
            "Error 000", JOptionPane.ERROR_MESSAGE); 
    }
   
    // El nombre es incorrecto.
    public static void error001() {
        JOptionPane.showMessageDialog(null, "El nombre es introducido es incorrecto.",
            "Error 001", JOptionPane.ERROR_MESSAGE);
    }
  
    // La fecha no es válida
    public static void error002() {
        JOptionPane.showMessageDialog(null, "La fecha no es válida.",
                "Error 002", JOptionPane.ERROR_MESSAGE);
    }
   
    // El correo introducido no es válido.
    public static void error003() {
        JOptionPane.showMessageDialog(null, "El correo introducido"
            + " no es válido.", "Error 003", JOptionPane.ERROR_MESSAGE);
    }
   
    // El nombre de usuario debe tener entre 5 y 20 caracteres válidos.
    public static void error004() {
        JOptionPane.showMessageDialog(null, "El nombre de usuario"
            + " debe tener entre 5 y 20 caracteres válidos.",
            "Error 004", JOptionPane.ERROR_MESSAGE);
    }
   
    // Las contraseñas no coinciden.
    public static void error005() {
        JOptionPane.showMessageDialog(null, "Las contraseñas no "
            + "coinciden.", "Error 005", JOptionPane.ERROR_MESSAGE);
    }
   
    // La contraseña debe tener entre 6 y 20 caracteres.
    public static void error006() {
            JOptionPane.showMessageDialog(null, "La contraseña debe "
        + "tener entre 6 y 20 caracteres.", "Error 006", JOptionPane.ERROR_MESSAGE);
    }
   
    // El formato de telefono no es válido.
    public static void error007() {
        JOptionPane.showMessageDialog(null, "El formato de telefono"
            + " no es válido.", "Error 007", JOptionPane.ERROR_MESSAGE);
    }
   
    // El correo introducido ya está en uso.
    public static void error008() {
        JOptionPane.showMessageDialog(null, "El correo introducido ya está en uso.",
            "Error 008", JOptionPane.ERROR_MESSAGE);
    }
   
    // El nombre de usuario introducido ya está en uso.
    public static void error009() {
        JOptionPane.showMessageDialog(null, "El nombre de usuario introducido"
            + " ya está en uso.", "Error 009", JOptionPane.ERROR_MESSAGE);
    }
   
    // Error, el driver no existe.
    public static void error010() {
        JOptionPane.showMessageDialog(null, "Error, el driver no existe.",
            "Error 010", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
   
   // Ha ocurrido un error con la interfaz .
    public static void error011() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la interfaz.\n"
                + "Intentelo de nuevo mas tarde.",
            "Error 011", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
   
    // Los datos introducidos son incorrectos o el usuario no está registrado.
    public static void error012() {
        JOptionPane.showMessageDialog(null, "Los datos introducidos son incorrectos"
            + " o el usuario no está registrado.", "Error 012", JOptionPane.ERROR_MESSAGE);        
    }
    
    // La contraseña introducida es incorrecta.
    public static void error013() {
        JOptionPane.showMessageDialog(null, "La contraseña introducida es incorrecta.", 
            "Error 013", JOptionPane.ERROR_MESSAGE);        
    }
    
    // La constante introducida no es válida.
    public static void error014() {
        JOptionPane.showMessageDialog(null, "La constante introducida no es válida.", 
            "Error 014", JOptionPane.ERROR_MESSAGE);        
    }
    
    // La dirección introducida es incorrecta.
    public static void error015() {
        JOptionPane.showMessageDialog(null, "La dirección introducida es incorrecta.", 
            "Error 015", JOptionPane.ERROR_MESSAGE);        
    }
    
    // Ha ocurrido un error al cerrar la conexión de la base de datos.
    public static void error016() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cerrar la conexión de "
                + "la base de datos.", 
            "Error 016", JOptionPane.ERROR_MESSAGE);        
    }
    
    // Ha ocurrido un error al cargar los datos.
    public static void error017() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al cargar los datos.",
            "Error 017", JOptionPane.ERROR_MESSAGE);   
        System.exit(0);
    }
    
    // La descripcion no es válida.
    public static void error018() {
        JOptionPane.showMessageDialog(null, "La descripcion no es válida.", 
            "Error 018", JOptionPane.ERROR_MESSAGE); 
    }
    
    // El precio ingresado no es válido.
    public static void error019() {
        JOptionPane.showMessageDialog(null, "El precio ingresado no es válido.", 
            "Error 019", JOptionPane.ERROR_MESSAGE); 
    }
    
    // La duración del curso no es válida.
    public static void error020() {
        JOptionPane.showMessageDialog(null, "La duración del curso no es válida.", 
            "Error 020", JOptionPane.ERROR_MESSAGE); 
    }
    
        
    // La duración del curso no es válida.
    public static void error021() {
        JOptionPane.showMessageDialog(null, "No ha seleccionado los días del curso.", 
            "Error 021", JOptionPane.ERROR_MESSAGE); 
    }
    
    
    // El curso debe durar al menos una semana.
    public static void error022() {
        JOptionPane.showMessageDialog(null, "El curso debe durar al menos una semana.", 
            "Error 022", JOptionPane.ERROR_MESSAGE); 
    }
    
    // La dirección es muy larga o muy corta.
    public static void error023() {
        JOptionPane.showMessageDialog(null, "La dirección es muy larga o muy corta.", 
            "Error 023", JOptionPane.ERROR_MESSAGE); 
    }

        
    // Las horas ingresadas no son válidas.
    public static void error024() {
        JOptionPane.showMessageDialog(null, "Las horas ingresadas no son válidas.", 
            "Error 024", JOptionPane.ERROR_MESSAGE); 
    }
    
    // El instrumento no está dado de alta.
    public static void error025() {
        JOptionPane.showMessageDialog(null, "El instrumento no está dado de alta.", 
            "Error 025", JOptionPane.ERROR_MESSAGE); 
    }    
    
    // El instrumento no está dado de alta.
    public static void error026() {
        JOptionPane.showMessageDialog(null, "El instrumento ya está dado de alta.", 
            "Error 026", JOptionPane.ERROR_MESSAGE); 
    }    
    
    // Hubo un error al seleccionar un instrumento.
    public static void error027() {
        JOptionPane.showMessageDialog(null, "Hubo un error al seleccionar un instrumento.", 
            "Error 027", JOptionPane.ERROR_MESSAGE); 
    }    
    
    // Ha ocurrido un error y no se ha realizado la inscripción.
    public static void error028() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error y no se ha realizado la inscripción.", 
            "Error 028", JOptionPane.ERROR_MESSAGE); 
    } 
    
    // Ha ocurrido un error.
    public static void error029() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error.", 
            "Error 029", JOptionPane.ERROR_MESSAGE); 
    } 
    
    // No puede volver a inscribirse al mismo curso.
    public static void error030() {
        JOptionPane.showMessageDialog(null, "No puede volver a inscribirse al mismo curso.", 
            "Error 030", JOptionPane.ERROR_MESSAGE); 
    } 
    
    
    
    // Error de prueba
    public static void testError() {
        JOptionPane.showMessageDialog(null, "ERROR DE PRUEBA ****************\n"
            + "**********************\n**********************", "Error 012", JOptionPane.ERROR_MESSAGE);  
    }
   
}
