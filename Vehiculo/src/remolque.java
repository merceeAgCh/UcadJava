/**
 * Created by Usuario on 24/10/2016.
 */
public class remolque {
    int peso;

    public remolque(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "remolque{" +
                "peso=" + peso +
                '}';
    }
}
