

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Agenda {

    Contacto[] contactos = new Contacto[70];
    private int cont = 0;

    public void Consultar(String nombre, int telefono) {
        for (int i = 0; i < this.cont; i++) {

            if (nombre.equals(this.contactos[i].getNombre())) {
                System.out.println("Ya existe un contacto con ese nombre");
            }
        }

    }

    public void Anadir(String nombre, int telefono) {
        if (cont< 99) {
            this.contactos[cont] = new Contacto();
            this.contactos[cont].set_nombre(nombre);
            //this.contactos[cont].set_mail(mail;)
            this.contactos[cont].set_telefono(telefono);
            this.cont++;
            Ordenar();
        } else {
            System.out.println("La agenda está llena");
        }

    }

    public void Buscar(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < cont; i++) {
            if (nombre.equals(this.contactos[i].getNombre())) {
                System.out.println(this.contactos[i].getNombre() + "-" + "Tf:" + this.contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto deseado no existe");
        }
    }

    public void Ordenar() {

        int N = this.cont;
        String nombre1;
        String nombre2;

        if (cont >= 2) {
            for (int i = 1; i <= N - 1; i++) {
                for (int j = 1; j <= N - i; j++) {
                    nombre1 = this.contactos[j - 1].getNombre();
                    nombre2 = this.contactos[j].getNombre();
                    if (nombre1.charAt(0) > nombre2.charAt(0)) {
                        Contacto tmp = this.contactos[j - 1];
                        this.contactos[j - 1] = this.contactos[j];
                        this.contactos[j] = tmp;
                    }
                }
            }
        }
    }

    public void Mostrar() {
        if (this.cont == 0) {
            System.out.println("No hay contactos");
        } else {
            for (int t = 0; t < this.cont; t++) {
                // Es necesario por precaución usar el this para el metodo, puesto que si se ejecuta muchas veces la referencias a memoria pueden fallar.
                System.out.println(this.contactos[t].getNombre() + "-" + "Tf:" + Integer.toString(this.contactos[t].getTelefono()));
            }
        }
    }

    public void Vaciar() {
        try {
            System.out.println("Se eliminarán todos los contactos");
            System.out.println("¿Estas seguro (S/N)?");
            String respuesta;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            respuesta = teclado.readLine();
            respuesta = respuesta.toUpperCase();
            if (respuesta.equals("S")) {

                //Lo hago por mera formalidad porque java se encarga de liberar los objetos no referenciados creados. El garbage collector
                for (int i = 0; i < this.cont; i++) {
                    this.contactos[i].set_nombre("");
                    this.contactos[i].set_telefono(0);
                }
                cont = 0;
                System.out.println("Agenda vaciada correctamente");
            } else {
                System.out.println("Acción cancelada");
            }
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Eliminar() {
        try {
            boolean encontrado = false;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre de contacto a eliminar:");
            String eliminar = teclado.readLine().toUpperCase();
            if (cont == 0) {
                System.out.println("No hay contactos");
            } else {
                for (int i = 0; i < cont; i++) {

                    if (eliminar.equals(this.contactos[i].getNombre())) {
                        System.out.println(i + 1 + ". " + this.contactos[i].getNombre() + "-" + "Tf:" + this.contactos[i].getTelefono());
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("¿Qué contacto quieres eliminar, introduce el número asociado?");
                    int eliminar_numero = Integer.parseInt(teclado.readLine());
                    eliminar_numero--;
                    System.out.println("¿Estas seguro (s/n)?");
                    String respuesta;
                    respuesta = teclado.readLine();
                    respuesta = respuesta.toUpperCase();
                    if (respuesta.equals("S")) {
                        Contacto[] temporal = new Contacto[70];
                        int ii = 0;
                        boolean encontrado2=false;
                        for (int i = 0; i < this.cont; i++) {

                            if (i != eliminar_numero) {
                                // Creo el objeto temporal para el borrado
                                if (!encontrado2)
                                {
                                    temporal[ii] = this.contactos[ii];
                                    ii++;
                                }
                                else
                                {
                                    if (ii<this.cont)
                                    { temporal[ii] = this.contactos[ii+1];
                                        ii++;
                                    }
                                }

                            } else {
                                temporal[ii] = this.contactos[ii + 1];
                                ii++;
                                encontrado2=true;

                            }
                        }
                        this.cont--;
                        System.out.println("Se ha borrado de tus contactos ");
                        for (int j = 0; j < this.cont; j++) {
                            this.contactos[j] = temporal[j];

                        }

                    }

                } else {
                    System.out.println(" No se ha encontrado el nombre");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Modificar() {
        try {
            boolean encontrado = false;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre de contacto a modificar:");
            String eliminar = teclado.readLine().toUpperCase();
            if (cont == 0) {
                System.out.println("No hay contactos");
            } else {
                for (int i = 0; i < this.cont; i++) {

                    if (eliminar.equals(this.contactos[i].getNombre())) {
                        System.out.println(i + 1 + ". " + this.contactos[i].getNombre() + "-" + "Tf:" + this.contactos[i].getTelefono());
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("¿Qué contacto quieres modificar?, introduce el número:");
                    int modificar_numero = Integer.parseInt(teclado.readLine());

                    System.out.println("Introduce nombre:");
                    String nombre_nuevo = teclado.readLine();
                    System.out.println("Introduce teléfono, formato numerico:");
                    int telefono_nuevo = Integer.parseInt(teclado.readLine());

                    this.contactos[modificar_numero - 1].set_nombre(nombre_nuevo);
                    this.contactos[modificar_numero - 1].set_telefono(telefono_nuevo);
                    Ordenar();
                } else {
                    System.out.println("El nombre ingresado no esta en tus contactos");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}