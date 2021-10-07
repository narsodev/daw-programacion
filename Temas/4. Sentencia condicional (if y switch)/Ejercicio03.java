/* Escribe un programa en que dado un número del 1 a 7
escriba el correspondiente nombre del día de la semana */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número del día de la semana: ");
    int entrada = s.nextInt();

    String dia;
    
    switch (entrada) {
      case 1:
        dia = "Lunes"; 
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miércoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sábado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "Día no válido";
    }

    System.out.println(dia);

    s.close();
  }
}
