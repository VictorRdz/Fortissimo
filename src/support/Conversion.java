package support;

import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyectopoo.RegistroJF;


public class Conversion {

    // Obtener contraseña en formato sql.Date
    public static java.sql.Date fecha(JComboBox diaBox, JComboBox mesBox, JComboBox añoBox) {
        int DD = Integer.parseInt((String)diaBox.getSelectedItem());
        int MM = Conversion.getMonthNumber((String)mesBox.getSelectedItem());
        int YYYY = Integer.parseInt((String)añoBox.getSelectedItem());
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.clear();
        fechaNac.set(Calendar.YEAR, YYYY);
        fechaNac.set(Calendar.MONTH, MM);
        fechaNac.set(Calendar.DAY_OF_MONTH, DD);
        return new java.sql.Date(fechaNac.getTime().getTime());
    }
    
    // Obtener telefono en formato long
    public static long telefono(JTextField telField) {
        String tel = telField.getText();
        if (tel.equals("")) {
            tel = "0";
        }
        return Long.parseLong(tel);  
    }
    
    // Obtener el género en formato int 
    public static int genero(JComboBox generoBox) {
        // Genero: Desconocido = 0
        // Genero: Masculino = 1
        // Genero: Femenino = 2
        // Genero: No especificado = 3
        String gen = (String) generoBox.getSelectedItem();
        int intGen = 0;
        switch (gen) {
            case "Desconocido":
                intGen = 0;
                break;
            case "Masculino":
                intGen = 1;
                break;
            case "Femenino":
                intGen = 2;
                break;
            case "No especificado":
                intGen = 3;
        }
        return intGen;
    }
    
    public static String generoAString(int genero) {
        String gen = null;
        switch (genero) {
            case 0:
                gen = "Desconocido";
                break;
            case 1:
                gen = "Masculino";
                break;
            case 2:
                gen = "Femenino";
                break;
            case 3:
                gen = "No especificado";
        }
        return gen;
    }
    
    
    
    // Obtener contraseña en formato String
    public static String contraseña(JPasswordField contraseñaField) {
        return new String(contraseñaField.getPassword());
    }
    
    // Obtener tabla en formato String
    public static String tabla(JRadioButton alumno) {
        String tabla;
        if(alumno.isSelected())
            tabla = "alumno";
        else
            tabla = "instructor"; 
        return tabla;
    }
    
    // Devuelve el número del mes comenzando por 0.
    public static int getMonthNumber(String mes) {
        int i = 0;
        String[] MM = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        while(!mes.equalsIgnoreCase(MM[i])) {
            i++;
            if(i > 11) {
                i = 99;
                break;
            }
        }
        return i;
    }
    
    // Devuelve el día de la fecha
    public static int dia(java.sql.Date fec) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fec);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        return dia;
    }
    
    // Devuelve el mes de la fecha
    public static int mes(java.sql.Date fec) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fec);
        int mes = cal.get(Calendar.MONTH);
        return mes;
    }   
    
    // Devuelve el año de la fecha
    public static int año(java.sql.Date fec) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fec);
        int año = cal.get(Calendar.YEAR);
        return año;
    }    
    
    // Devuelve el precio en formato double
    public static double JTFtoDouble(JTextField precioJTF) {
        return Double.parseDouble(precioJTF.getText());
    }
    
    // Devuelve en int los días seleccionados
    public static int diasCurso(JCheckBox lun, JCheckBox mar, JCheckBox mie, JCheckBox jue,
                JCheckBox vie, JCheckBox sab, JCheckBox dom) {
        String a = "", b = "", c = "", d = "", e = "", f = "", g = "";
        if(lun.isSelected())
            a = "1";
        if(mar.isSelected())
            b = "2";
        if(mie.isSelected())
            c = "3";
        if(jue.isSelected())
            d = "4";
        if(vie.isSelected())
            e = "5";
        if(sab.isSelected())
            f = "6";
        if(dom.isSelected())
            g = "7";
        String dias = (a+b+c+d+e+f+g);
        return Integer.parseInt(dias);
    }
    
    public static String diasALetras(int d) {
        String diasNum = String.valueOf(d);
        String diasChar = "";
        if(diasNum.contains("1")) {
            diasChar = diasChar.concat("-Lun");
        }
        if(diasNum.contains("2")) {
            diasChar = diasChar.concat("-Mar");
        }
        if(diasNum.contains("3")) {
            diasChar = diasChar.concat("-Mié");
        }
        if(diasNum.contains("4")) {
            diasChar = diasChar.concat("-Jue");
        }
        if(diasNum.contains("5")) {
            diasChar = diasChar.concat("-Vie");
        }
        if(diasNum.contains("6")) {
            diasChar = diasChar.concat("-Sab");
        }
        if(diasNum.contains("7")) {
            diasChar = diasChar.concat("-Dom");
        }
        return diasChar;
    }
    
    
    // Retorna true si el día especificado se encuentra en 'dias'
    public static boolean diasAComboBox(int selected, int dias) {
        boolean valid = false;
        String dia = String.valueOf(dias);
        String select = String.valueOf(selected);
        if(dia.contains(select)) {
            valid = true;
        }
        return valid;
    }
    
    
    
    // Devuelve la hora en formato Time
    public static java.sql.Time hora(JComboBox hora, JComboBox minuto) {     
        return new java.sql.Time(hora.getSelectedIndex(), minuto.getSelectedIndex(), 0); 
    }
    
    
}


