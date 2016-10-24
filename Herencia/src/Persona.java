
/**
 * Created by Usuario on 17/10/2016.
 */
public class Persona {
    protected  String nombre;

    protected String fecha_nacimiento;
    protected String RFC;
     Persona(){}
    Persona(String name){
        nombre=name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", RFC='" + RFC + '\'' +
                '}';
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
