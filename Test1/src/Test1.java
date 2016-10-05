/**
 * Created by Usuario on 28/09/2016.
 */
public class Test1 {
    public static void main (String []args){
        int n=65;
        System.out.println("Decimal: " + Integer.toString(n));
        System.out.println("Binario: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal: " + Integer.toHexString(n));
        System.out.println("Termario: " + Integer.toString(n,3));
        n=Integer.parseInt("CAFE",16);
        System.out.println("Valor de CAFE: " + n);
    }
}
