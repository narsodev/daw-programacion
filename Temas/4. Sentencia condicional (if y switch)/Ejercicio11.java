/* Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int horas, minutos, resultado;

    System.out.print("Introduce las horas: ");
    horas = s.nextInt();

    System.out.print("Introduce los minutos: ");
    minutos = s.nextInt();

    s.close();

    resultado = ((24 - horas) * 60 - minutos) * 60;

    System.out.printf("Faltan %d segundos.", resultado);
  }
}
