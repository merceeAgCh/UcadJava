/**
 * Created by Usuario on 26/10/2016.
 */
public class SimuladorVehiculo {
   static sedan v;
    static camion ca;

    public static void main(String[] args){
        System.out.println("Datos Sedan: " );
        v = new sedan("576-ESF " , 2);
        v.acelerar(60);
        System.out.println(v.toString());

        System.out.println( "Datos Camion: " );
        ca = new camion( "987-GTS" );
        ca.acelerar(90);
        System.out.println(ca.toString());

        System.out.println(" Datos Camion Remolque: " );
        ca = new camion( "061-WOA" );
        ca.Ponremolque(new remolque(350));
        ca.acelerar(80);
        System.out.println(ca.toString());

        System.out.println( "Datos Camion Sin Remolque: " );
        ca = new camion( "067-XAH " );
        ca.Quitaremolque();
        ca.acelerar(110);
        System.out.println(ca.toString());
    }
}
