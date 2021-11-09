/* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */
public class Ejercicio05 {
  public static void main(String[] args) {
    int num;
    int max = 100;
    int min = 199;
    double media = 0;

    for (int i = 0; i < 50; i++) {
      num = (int) (Math.random() * 100) + 100;
      max = num > max ? num : max;
      min = num < min ? num : min;
      media += num;
      System.out.print(num + " ");
    }

    media /= 50;

    System.out.println("\nNúmero máximo generado: " + max);
    System.out.println("Número mínimo generado: " + min);
    System.out.println("Media de los números generados: " + media);

  }  
}
