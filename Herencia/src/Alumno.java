/**
 * Created by Usuario on 17/10/2016.
 */
public class Alumno extends Persona {
    int semestre;
    protected String carrera;
    protected String matricula;
    Alumno(){}
    Alumno(String name, String mat){
        nombre=name;
        matricula=mat;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
