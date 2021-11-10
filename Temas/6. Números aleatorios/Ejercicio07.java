/* Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas). */
public class Ejercicio07 {
  public static void main(String[] args) {
    int resultado;
    int columnas = 3;

    for (int i = 1; i <= 15; i++) {
      System.out.print(i + ":\t");

      if (i == 15) columnas = 1;

      for (int j = 0; j < columnas; j++) {
        resultado = (int) (Math.random() * 3);
        System.out.print((resultado == 0 ? "x" : resultado) + "\t");
      }

      System.out.println();
    }
  }
}

