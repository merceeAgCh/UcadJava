/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;  // importa la clase JOptionPane
import java.util.*;
/**
 *
 * @author norbertogarcial
 */
public class Dialogos {

    /**
     * @param args the command line arguments
     */
    
    public static void ingresos() {
        // TODO code application logic here
    int[] autos = {0,0,0,0,0}; 
    int resp,total;
    String mensaje ="Hola Bienvenido al registro";
    JOptionPane.showMessageDialog( null, mensaje );
    do {
        Object[] options = {"Realizar un Ingreso","Revisar Ingresos"};
        int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                               "Realizar un Ingreso", //Object message,
                               "Revisar Ingresos", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.PLAIN_MESSAGE , //int messageType
                               null, //Icon icon,
                               options, //Object[] options,
                               options[1]);//Object initialValue 
        if(choice == 0 ) {
            //Metric was chosen
            Object[] colores = {"Amarilla","Rosa","Roja","Verde","Azul"};
            Object seleccion = JOptionPane.showInputDialog(
                                null ,
                                "Seleccione el color de la calcomania",
                                "Ingreso de nuevo vehiculo",
                                JOptionPane.INFORMATION_MESSAGE ,
                                null,  // null para icono defecto
                                colores,
                                colores[0]);
            if (seleccion.equals("Amarilla"))
                    autos[0]++;
            if (seleccion.equals("Rosa"))
                    autos[1]++;
            if (seleccion.equals("Roja"))
                    autos[2]++;
            if (seleccion.equals("Verde"))
                    autos[3]++;
            if (seleccion.equals("Azul"))
                    autos[4]++;
        mensaje = "Vehiculo con calcomania de color " + seleccion + " ingresado correctamente";
            JOptionPane.showMessageDialog( null, mensaje );    
        }
        else {
            //Imperial was chosen
        total = autos[0] + autos[1] + autos[2] + autos[3] + autos[4];
        mensaje = "Al monento se han registrado " + total + " con las etiquetas: "
                + "\n Amarilla = " + autos[0] 
                + "\n Rosa = " + autos[1] 
                + "\n Roja = " + autos[2] 
                + "\n Verde = " + autos[3] 
                + "\n Azul = " + autos[4];
        JOptionPane.showMessageDialog( null, mensaje );        
        }
    Object[] Salir = {"Si","No"};
    resp = JOptionPane.showOptionDialog(null, //Component parentComponent
                               "Deseas Salir", //Object message,
                               "Deseas Salir?", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.QUESTION_MESSAGE , //int messageType
                               null, //Icon icon,
                               Salir, //Object[] options,
                               Salir[0]);//Object initialValue 
    }
    while (resp == 1);
    }
    
    public static void tienda(){
    double total = 0;
    int resp, items = 0;
    double rojos[] = new double[100];
    double precio[] = new double[100];
    String mensaje = "Hola bienvenido al registro de Caja";
    JOptionPane.showMessageDialog(null, mensaje);
    do {
    mensaje = "Teclea el precio del producto: ";
    precio[items]  = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    Object[] Color = {"Blanca", "Roja"};
    int etiqueta = JOptionPane.showOptionDialog(null, //Component parentComponent
                               "Selecciona el color de la etiqueta", //Object message,
                               "Selecciona el color de la etiqueta", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.WARNING_MESSAGE , //int messageType
                               null, //Icon icon,
                               Color, //Object[] options,
                               Color[1]);//Object initialValue 
    rojos[items] = etiqueta;
    //JOptionPane.showMessageDialog(null, etiqueta);
    items++;
    Object[] Salir = {"Si","No"};
    resp = JOptionPane.showOptionDialog(null, //Component parentComponent
                               "Deseas Salir", //Object message,
                               "Deseas Salir?", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.QUESTION_MESSAGE , //int messageType
                               null, //Icon icon,
                               Salir, //Object[] options,
                               Salir[0]);//Object initialValue      
    }
    while (resp ==1);
    mensaje = "Lista de " + items + " articulos: \n Precio \t\t Descuento \n";
    for (int i=0 ; i<items ; i++){
        if (rojos[i]== 1) {
            rojos[i] = precio[i]-(precio[i]*0.2);
            total = total + rojos[i];
            mensaje = mensaje + "\n " + precio[i] + "\t\t " + (precio[i]*0.2);
        }
        else {
            total = total + precio[i];
            mensaje = mensaje + "\n " + precio[i]+ "\t\t N/A";
        }
    }
    mensaje = mensaje + "\n Total = " + total;
    JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void cajero(){
    JLabel jPassword = new JLabel("NIP");
    JTextField password = new JPasswordField();
    Object[] ob = {jPassword, password};
    double saldo = 10000;
    int retiros = 0, seleccion;
    String pass = "", nip = "", salir = "No";
    int result = JOptionPane.showConfirmDialog(null, ob, "Por favor teclea tu NIP", JOptionPane.WARNING_MESSAGE );
        if (result == JOptionPane.OK_OPTION) 
            pass = password.getText();  
    result = JOptionPane.showConfirmDialog(null, ob, "Por favor teclea tu NIP", JOptionPane.WARNING_MESSAGE );
        if (result == JOptionPane.OK_OPTION) {
            nip = password.getText();
            if (pass.equals(nip)){
                do {
                seleccion = JOptionPane.showOptionDialog(
                        null,
                        "Seleccione la función deseada", 
                        "Funciones",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE ,
                        null,    // null para icono por defecto.
                        new Object[] { "Consulta de saldo", "Retirar", "Cambiar NIP", "Salir"},   // null para YES, NO y CANCEL
                           "Salir");
                if (seleccion == 0)
                    JOptionPane.showMessageDialog( null, "Tu saldo es: $ " + saldo);    
                if (seleccion == 1){
                    Object[] valores = {"200","500","1000","3000"};
                    Object opcion = JOptionPane.showInputDialog(
                                null ,
                                "Selecciona la canidad a retirar",
                                "Retiros",
                                JOptionPane.QUESTION_MESSAGE ,
                                null,  // null para icono defecto
                                valores,
                                valores[0]);
                    if (opcion.equals("200")){
                        if (saldo >= 200)
                            if (retiros <3) {
                            saldo = saldo - 200;
                            retiros ++;
                            }
                            else 
                                JOptionPane.showMessageDialog(null, "Ya no puedes realizar mas retiros");
                        else 
                            JOptionPane.showMessageDialog(null, "No cuentas con el saldo suficiente");
                    }
                    if (opcion.equals("500")){
                        if (saldo >= 500)
                            if (retiros <3) {
                            saldo = saldo - 500;
                            retiros ++;
                            }
                            else 
                                JOptionPane.showMessageDialog(null, "Ya no puedes realizar mas retiros");
                        else 
                            JOptionPane.showMessageDialog(null, "No cuentas con el saldo suficiente");
                    }
                    if (opcion.equals("1000")){
                        if (saldo >= 1000)
                            if (retiros <3) {
                            saldo = saldo - 1000;
                            retiros ++;
                            }
                            else 
                                JOptionPane.showMessageDialog(null, "Ya no puedes realizar mas retiros");
                        else 
                            JOptionPane.showMessageDialog(null, "No cuentas con el saldo suficiente");
                    }
                    if (opcion.equals("3000")){
                        if (saldo >= 3000)
                            if (retiros <3) {
                            saldo = saldo - 3000;
                            retiros ++;
                            }
                            else 
                                JOptionPane.showMessageDialog(null, "Ya no puedes realizar mas retiros");
                        else 
                            JOptionPane.showMessageDialog(null, "No cuentas con el saldo suficiente");
                    }
                }
                if (seleccion == 2){
                   result = JOptionPane.showConfirmDialog(null, ob, "Teclea tu nuevo NIP", JOptionPane.OK_CANCEL_OPTION);
                   if (result == JOptionPane.OK_OPTION) 
                       pass = password.getText();  
                }
                if (seleccion == 3)
                    salir = "Si";
                }
                while (salir == "No");
            }
        else
                JOptionPane.showMessageDialog(null, "El NIP que usaste no es correcto", "Error", JOptionPane.WARNING_MESSAGE );
        }         
    }
    
    public static void main(String[] args) {
    int programa = 0;
    do {
        programa = JOptionPane.showOptionDialog(
                        null,
                        "Que programa deseas efectuar", 
                        "Programas",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE ,
                        null,    // null para icono por defecto.
                        new Object[] { "Ingresos", "Tienda", "Cajero", "Salir"},   // null para YES, NO y CANCEL
                           "Salir");
                if (programa == 0) 
                    ingresos();
                if (programa == 1)
                    tienda();
                if (programa == 2)
                    cajero();
        }
    while (programa != 3);
    }
}
