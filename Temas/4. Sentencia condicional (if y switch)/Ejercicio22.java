/* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h. */
import java.util.Scanner;

public class Ejercicio22 {  
  public static void main(String[] args) {
    int dia = 0;
    int hora = 0;
    int minutos = 0;
    int resultado;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el día de la semana (L, M, X, J, V): ");
    switch (s.nextLine().charAt(0)) {
      case 'L':
        dia = 1;
        break;
      case 'M':
        dia = 2;
        break;
      case 'X':
        dia = 3;
        break;
      case 'J':
        dia = 4;
        break;
      case 'V':
        dia = 5;
        break;
      default:
        System.out.println("Día no válido.");
        break;
    }

    System.out.print("Introduzca la hora (0 - 23): ");
    hora = s.nextInt();

    System.out.print("Introduzca los minutos (0 - 59): ");
    minutos = s.nextInt();

    s.close();

    resultado = ((5 * 24 + 15) * 60) - ((dia * 24 + hora) * 60 + minutos);
    System.out.printf("Quedan %d minutos para que llegue el fin de semana.", resultado);
  }

}
