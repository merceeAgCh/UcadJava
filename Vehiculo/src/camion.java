/**
 * Created by Usuario on 24/10/2016.
 */
public class camion extends vehiculo {
    remolque rmlq;

    public camion(String placa) {
        super(placa);
        this.rmlq = rmlq;
    }
     public void  Ponremolque(remolque x){
         rmlq = x;
     }

    @Override
    public void acelerar(double velocity) {
        if (velocity > 100)
            velocity = 100;
        super.acelerar(velocity);
    }

    @Override
    public String toString() {
        String tmp = super.toString();
        return tmp + rmlq.toString();
    }

    public void Quitaremolque(){
        rmlq = null;
    }
}
