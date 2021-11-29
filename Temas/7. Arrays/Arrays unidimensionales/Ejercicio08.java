/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */
public class Ejercicio08 {
  public static void main(String[] args) {
    int[] meses = new int[12];

    for (int i = 0; i < 12; i++) {
      System.out.printf("Temperatura del mes %d: ", i + 1);
      meses[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("-----------------------------------");
    System.out.println("Diagrama:");

    for (int i = 0; i < 12; i++) {
      System.out.printf("Mes %2d: ", i + 1);
      for (int j = 0; j < meses[i]; j++) System.out.print("*");
      System.out.println();
    }
  }
}
