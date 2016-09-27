import javax.swing.*;
import java.util.Scanner;

/**
 * Created by nogala on 03/08/16.
| */
public class primerprograma {
    public static void Progra1(String arg){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Hola ¿cual es tu nombre?");
        String nombre;
        nombre = teclado.next();
        if (nombre.equals(arg))
        System.out.println("Hola " + nombre + "Bienvenido al sistema");
        else
            System.out.println("Disculpa no te conozco");


    }
    public static void main(String[] argumento){
        //System.out.println("Hola " + argumento[0]);
        //Progra1(argumento[0]);
String[] contraseñas;
        String dialog = JOptionPane.showInputDialog("Hola ¿cual es tu nombre?");
        for (int i=0; i==argumento.length;i++){
            if(argumento[i].equals(dialog)){
                JPanel panel = new JPanel();
                JLabel label = new JLabel("Enter a password:");
                JPasswordField pass = new JPasswordField(10);
                panel.add(label);
                panel.add(pass);
                String[] options = new String[]{"OK", "Cancel"};
                int option = JOptionPane.showOptionDialog(null, panel, "The title",
                        JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[1]);
                if(option == 0) // pressing OK button
                {
                    char[] password = pass.getPassword();
                    System.out.println("Your password is: " + new String(password));
                }
             //contraseñas[i].equals(password);
            }
        }


        if(argumento[0].equals(dialog))
            JOptionPane.showMessageDialog(null,"Hola " + argumento[0],
                    "programa hecho por: Mercee",
                    JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Disculpa no te conozco" + dialog,
                    "programa hecho por: Mercee",
                    JOptionPane.WARNING_MESSAGE);


    }
}
