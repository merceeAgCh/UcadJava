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
            System.out.println("RFC");
            alumno_ucad [i].setRFC(reed.next());
            System.out.println("Matrícula");
            alumno_ucad [i].setMatricula(reed.next());
            System.out.println("Carrera");
            alumno_ucad [i].setCarrera(reed.next());
        }
        profesor_ucad[0] = new Profesor(" Benjamin ", " 13170001 ");
        profesor_ucad[1] = new Profesor(" Mercedes ", " 15061834");
        for (i=0; i<10; i++){
            System.out.println(profesor_ucad[i].toString());
        }
    }

}
