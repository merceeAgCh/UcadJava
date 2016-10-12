import java.util.Scanner;

/**
 * Created by Usuario on 05/10/2016.
 */
public class usartriangulo {
    public static void main(String []arg){
        triangulo a = new triangulo();
        triangulo b = new triangulo(6 , 4);
        triangulo c;
        Scanner datin = new Scanner(System.in );
        System.out.println("Ingrese el valor de la base: ");
        a.setBase(datin.nextInt());
        System.out.println("Ingresa el valor de la altura: ");
        a.setAltura(datin.nextInt());
        System.out.println("El triangulo mas grande es: ");
        if (a.getArea() > b.getArea()){
            System.out.println("El triangulo ingresado \n");
            c = a;
            System.out.println("Ingrese otro triangulo base: ");
            a.setBase(datin.nextInt());
            System.out.println("Altura ");
            a.setBase(datin.nextInt());
             if (a.getPerimetro()> c.getPerimetro()){
                 System.out.println("El segundo triangulo tiene mas perimetro ");
                 else
                 System.out.println("El primer triangulo tiene mas perimetro");

             }
            else System.out.println("el triangulo mas grande es " + "Mas grande");
        }

    }
}
