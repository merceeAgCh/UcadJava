/**
 * Created by Usuario on 17/10/2016.
 */
public class Profesor extends Persona {
   protected String numero_emppleado;
    protected String carrera;
    protected String grado;
    protected String nombre;
    Profesor(){}
    Profesor(String name, String numero_emppleado){
        nombre=name;
        numero_emppleado=numero_emppleado;
    }

    public String getNumero_emppleado() {
        return numero_emppleado;
    }

    public void setNumero_emppleado(String numero_emppleado) {
        this.numero_emppleado = numero_emppleado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        String tmp;
        tmp = "";
        tmp = "Nombre: "+ nombre + "\n"+ "Número de Empleado"+ numero_emppleado + "\n"+ "Carrera :"+ carrera + "\n"
                + "Grado: "+ grado + "\n";
        return tmp; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRFC() {
        return super.getRFC();
    }

}