import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class saludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mercee"
                + " \n Escribe: ");

        String cadena = "";
        Scanner pregunta = new Scanner (System.in);
        cadena = pregunta.nextLine ();
        System.out.println ("Has escrito lo siguiente: \"" + cadena +"\"");
    }

}
