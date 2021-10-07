/* Escribe un programa que calcule el volumen de un cono según la fórmula
"V = 1 \ 3 * π * r^2 * h " */
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double radio, altura, volumen;
    
    System.out.println("Introduza el radio del cono:");
    radio = s.nextDouble();

    System.out.println("Introduzca la altura del cono: ");
    altura = s.nextDouble();

    volumen = (double) 1 / 3 * Math.PI * radio * radio * altura;

    System.out.printf("El volumen del cono es %.2f metros cúbicos.", volumen);

    s.close();
  }  
}
