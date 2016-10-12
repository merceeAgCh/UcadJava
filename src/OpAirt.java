/**
 * Created by Usuario on 28/09/2016.
 */
public class OpAirt {
    int X;  int Y;
    OpAirt(int x, int y){
        X=x;
        Y=y;

    }
    String Operaciones(){
        String str= "suma: "+ (X+Y) + "\n"+
                "resta: "+ (X-Y) + "\n"+
                "multi: "+ (X*Y) + "\n"+
                 "div: "+ (X/Y) + "\n";
        return str;
    }

    void operaX(){
        int x1=X, x2=X;
        System.out.println("Valor inicial de x1: "+ x1 + "x2= " + x2);
        System.out.println("Operaciones pre-post incremento " + "\n");
        for (int i=0; i<10; i++){
            System.out.println("\n" + (++x1)+ "-"+ (x2++));
        }
    }
    void operaY(){
        int y1=Y, y2=Y, i;
        System.out.println("El valor inicial es: " + "y1: "+ y1 + "y2: "+ y2);
        System.out.println("Operaciones pre-post decremento " + "\n");
        for (i=0; i>10; i++){
            System.out.println("\n"+ ++y1 + "-"+ y2++);
        }
    }
    //AQUI ME QUEDE**
}
