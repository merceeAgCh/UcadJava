/**
 * Created by Usuario on 28/09/2016.
 */
   public class Test2 {
    public static void main(String[]X){
        int n=66;
        System.out.println("Variable n " + n);
        Integer x = new Integer(n + 1);
        System.out.println("Variable x: " + x);
        String s= x.toString();
        System.out.println("Cadena: " + s);
        n= Integer.parseInt(s);
        System.out.println("Variable n: "+ n);
        x=Integer.decode(s+3);
        System.out.println("Variable x: "+ x);
        n= x.intValue();
        System.out.println("Variable n"+ n);
        System.out.println("Min valint: "+ Integer.MIN_VALUE);
        System.out.println("Max valint: " + Integer.MAX_VALUE);
            }
}


