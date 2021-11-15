/* Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. */
public class Ejercicio19 {
  public static void main(String[] args) {
    int numGenerado;
    int maximoPar = -100;
    int minimoImpar = 200;
    double media = 0;

    for (int i = 0; i < 50; i++) {
      numGenerado = (int) (Math.random() * 301) - 100;

      System.out.print(numGenerado + " ");

      if (numGenerado % 2 == 0) {
        if (numGenerado > maximoPar) maximoPar = numGenerado;
      } else if (numGenerado < minimoImpar) minimoImpar = numGenerado;

      media += numGenerado;
    }

    media /= 50;

    System.out.println("\nMáximo par: " + maximoPar);
    System.out.println("Mínimo impar: " + minimoImpar);
    System.out.println("Media: " + media);

  }  
}
