import java.util.Scanner;

/**
 * Created by Usuario on 17/10/2016.
 */
public class Principal {
    public static void main (String []args){
        Scanner reed =new Scanner(System.in);
        Alumno alumno_ucad[]= new Alumno[10];
        Profesor profesor_ucad[]= new Profesor[2];
        int i;
        for (i=2; i<10; i++) {
            alumno_ucad[i] = new Alumno();
            System.out.println(" Nombre: ");
            alumno_ucad[i].setNombre(reed.next());
        }
        alumno_ucad[0] new = new Alumno(" Benjamin ", " 13170001 ");
        alumno_ucad[1] new = Alumno(" Mercedes ", " 15061834");
        for (i=0; i<10; i++){
            System.out.println(alumno_ucad[i].toString());
        }
    }

}
