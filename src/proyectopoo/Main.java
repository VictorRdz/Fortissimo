package proyectopoo;
import javax.swing.UnsupportedLookAndFeelException;
import proyectopoo.alumno.*;
import proyectopoo.instructor.*;
import support.Error;
import javax.swing.UIManager;


public class Main {

    public static void main(String args[]) {
        String modoVisual = "Windows";
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (modoVisual.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            Error.error011();
        }        
        java.awt.EventQueue.invokeLater(() -> {
            Inicio = new InicioJF();
            Inicio.setVisible(true); 
        });
    }


    
    // Frames
    public static InicioJF Inicio;
    public static RegistroJF Registro;
    public static AlumnoJF Alumno;
    public static InstructorJF Instructor;    
}