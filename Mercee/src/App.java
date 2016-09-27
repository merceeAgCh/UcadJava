import java.util.Scanner;
public class App { //Nombre de la clase
    public static void main(String[] args) { // Función principal de la clase
    double valor ; // valor a transformar
        Scanner input = new Scanner(System.in);
        System.out.print("\n Programa que convierte un numero fraccionario en base decimal a binario");
        System.out.print("\n Teclea el numero decimal: ");
        valor = input.nextFloat();
        String res = "0."; // iniciacion de resultado
        String lista = ""; // iniciacion de lista
        do { // comienzo de ciclo repetitivo
            lista = lista + valor + "\n"; // Valor a transformar
            valor = valor * 2; // Multiplicacion
            res = res + conv(valor); // llamado a funcion de comparación
            if (valor >= 1) // Comparacion de valor actual
                valor = valor-1; //Si es mayor de 1 restarle 1
        }
        while (valor !=0); // Realizar el ciclo hasta que valor sea 0
        //System.out.printf(lista); // impresión del los valores a trasnformar
        System.out.print("\n El resultado es: ");
        System.out.printf(res); // impresión de resultado
        valor = input.hashCode();
    } // fin de funcion principal
    public static String conv(double valor){ // Funcion de comparacion
        if (valor >= 1) // comparacion con 1
            return "1"; // si es mayor a 1 regresa 1
        else return "0"; // de lo contrario regresa 0
    }  // fin de funcion
}// fin de clase conv
