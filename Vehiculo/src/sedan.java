/**
 * Created by Usuario on 24/10/2016.
 */
public class sedan  extends vehiculo {
    int numero_puertas;

    public sedan(String placa, int numero_puertas) {
        super(placa);
        this.numero_puertas = numero_puertas;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    @Override
    public String toString() {
        String tmp = super.toString();
        return  tmp + "sedan{" +

                "numero_puertas=" + numero_puertas +
                '}';

    }

    public sedan(String placa) {
        super(placa);

    }
}
