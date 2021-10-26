/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
Ejemplo:
  Por favor, introduzca la primera hora.
  Día: lunes
  Hora: 18
  Por favor, introduzca la segunda hora.
  Día: martes
  Hora: 20
  Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*/
import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dia1, hora1;
    int dia2, hora2;
    int horasTotales = 0;

    System.out.print("Introduzca el día 1 (L: 1, M: 2, X: 3, J: 4, V: 5, S: 6, D: 7): ");
    dia1 = s.nextInt();
    System.out.print("Introduzca la hora del día 1: ");
    hora1 = s.nextInt();

    System.out.print("Introduzca el día 2 (L: 1, M: 2, X: 3, J: 4, V: 5, S: 6, D: 7) (debe ser posterior al introducido anteriormente): ");
    dia2 = s.nextInt();
    System.out.print("Introduzca la hora del día 2: ");
    hora2 = s.nextInt();

    s.close();

    if (dia1 < dia2 || hora1 <= hora2) {
      for (int i = dia1; i < dia2; i++) {
        horasTotales += 24;
      }
  
      for (int i = hora1; i < hora2; i++) {
        horasTotales += 1;
      }
  
      System.out.printf("Entre las %d:00 del día %d y las %d:00 del día %d hay %d hora/s.", hora1, dia1, hora2, dia2, horasTotales);

    } else System.out.println("Ha introducido valores erróneos.");
  }
}
