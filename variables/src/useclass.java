/**
 * Created by Usuario on 26/09/2016.
 */
public class useclass {
    public static void main(String[]X){
        variables x;
        variables y;
        x= new variables();
        y= new variables();

        x.setVar_class(10);//Cuando las atributos de la clase son privados, se crea un metodo para asignar valor
        x.setVar_instancia(20);
        y.setVar_class(200);
        y.setVar_instancia(500);
        System.out.println("variables x "+ x.getVar_class() + " " + x.getVar_instancia() + " " + x.metodo_var() );
        System.out.println("variables y " + y.getVar_class() + " "+ y.getVar_instancia()+ " "+ y.metodo_var());

    }
}
