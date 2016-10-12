import java.util.Scanner;

/**
 * Created by Usuario on 05/10/2016.
 */
public class triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b,h;
        System.out.println("Ingresa la base del triangulo ");
        b=sc.nextDouble();
        System.out.println("Ingresa la altura del triangulo ");
        h=sc.nextDouble();
        double area;
        area=b*h/2;
        System.out.print(area);
    }
}
