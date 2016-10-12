/**
 * Created by Usuario on 10/10/2016.
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String fecha_nac;

    Persona(){
        nombre = "Sin nombre";
        edad = 0;
        sexo = "";
        fecha_nac = "";
    }

    Persona(String nombre){
        this.nombre = nombre;
        edad = 0;
        sexo = "";
        fecha_nac = "";

    }

    public void impDatos(){
        System.out.println("Mi nombre es: " + nombre + " y tengo " + edad + " años " +
        " soy " + sexo + "y " + " naci el dia " + fecha_nac);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void impDatos(int nivel){
    if (nivel>2)
        System.out.println("Mi nombre es: "+ nombre);
        if (nivel>3)
            System.out.println("Tengo: "+ edad + "años");

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }
}
