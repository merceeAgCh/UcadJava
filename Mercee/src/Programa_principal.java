import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Programa_principal {


    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String texto="";
            char opcion='1';
            Agenda agendam= new Agenda();
            while ((opcion=='1') || (opcion=='2') || (opcion=='3') || (opcion=='4')|| (opcion=='5') || (opcion=='6') )
            {
                //System.out.println("......................");
                System.out.println("AGENDA");
                //System.out.println("......................");
                System.out.println("1-Nuevo");
                System.out.println("2-Buscar");
                System.out.println("3- Editar");
                System.out.println("4-Eliminar");
                System.out.println("5-Lista de contactos");
                System.out.println("6-Vaciar agenda");
                System.out.println("0-Salir");
                //System.out.println("......................");
                texto=teclado.readLine();
                opcion= texto.charAt(0);
                System.out.println("Opción: ");
                //System.out.println("......................");

                switch(opcion){
                    case '1':
                        String nombre;
                        String telefono;
                        //String mail;
                        boolean validar;
                        System.out.println("Ingresa el nombre:");
                        nombre=teclado.readLine();
                        System.out.println("Ingresa un mail:");
                        //mail=teclado.readLine();
                        System.out.println("Ingresaun numero telefonico:");
                        telefono=teclado.readLine();
                        validar=esNumerica(telefono);
                        if (validar){
                            int telefonox= Integer.parseInt(telefono);
                            agendam.Consultar(nombre, telefonox);
                            agendam.Anadir(nombre, telefonox);
                        }
                        else{
                            System.out.println("El numero ingresado es incorrecto, intenta de nuevo");}


                        break;


                    case '2':
                        System.out.println("Nombre a buscar:");
                        nombre=teclado.readLine().toUpperCase();
                        agendam.Buscar(nombre);
                        break;
                    case '3':
                        agendam.Modificar();
                        break;
                    case '4':
                        agendam.Eliminar();
                        break;
                    case '5':
                        agendam.Mostrar();
                        break;
                    case '6':
                        agendam.Vaciar();
                        break;
                    case '0':
                        System.out.println("Ha salido del programa");
                        break;

                    default:
                        System.out.println("Opción incorrecta :(");
                        opcion='1';

                }

            }

        } catch (IOException ex) {
            Logger.getLogger(Programa_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static boolean esNumerica(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}