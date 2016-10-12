import java.util.Scanner;

/**
 * Created by Usuario on 10/10/2016.
 */
public class Principal {
    public static void main (String []args){
        Persona uno = new Persona();
        Persona dos = new Persona();
        Persona tres = new Persona("Benjamin");
        Persona cuatro = new Persona("Dulce");
        Persona cinco = new Persona();
        Persona seis = new Persona();
        Scanner datain = new Scanner(System.in);
        uno.setNombre("Maria");
        uno.setEdad(22);
        uno.setSexo("Mujer");
        uno.setFecha_nac("1994/09/30");
        cuatro.setEdad(29);
        cuatro.setSexo("Mujer");
        cuatro.setFecha_nac("1987/11/17");
        uno.impDatos();
        dos.impDatos();
        tres.impDatos(1);
        
        System.out.println("Nombre: ");
        seis.setNombre(datain.next());
    }

}
