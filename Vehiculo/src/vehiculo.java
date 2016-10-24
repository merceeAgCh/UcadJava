/**
 * Created by Usuario on 24/10/2016.
 */
public class vehiculo {
    protected String placa;
    protected double velocidad;

    public vehiculo(String placa) {
        this.placa = placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void acelerar(double velocity){

        velocidad=velocity;
    }
}
