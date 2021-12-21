//Muestra los números capicúa que hay entre 1 y 99999.
import paquetes.Ejercicios01_14;

public class Ejercicio16 {
  public static void main(String[] args) {
    for (int i = 1; i <= 99999; i++) {
      if (Ejercicios01_14.esCapicua(i)) System.out.print(i + " ");
    }
  }  
}
