/* Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente). */
public class Ejercicio13 {
  public static void main(String[] args) {
    final String[] PAISES = { "España", "Rusia", "Japón","Australia" };

    int[][] estaturas = new int[4][10];
    int[] maximos = new int [4];
    int[] minimos = new int[4];
    double[] medias = new double[4];

    for (int i = 0; i < 4; i++) {
      maximos[i] = 140;
      minimos[i] = 210;
      medias[i] = 0;
    }

    for (int i = 0; i < 4; i++) {
      System.out.printf("%s: \n", PAISES[i]);
      for (int j = 0; j < 10; j++) {
        int estatura = (int) (Math.random() * 71) + 140;
        System.out.print(estatura + " ");
        estaturas[i][j] = estatura;
        if (estatura < minimos[i]) minimos[i] = estatura;
        if (estatura > maximos[i]) maximos[i] = estatura;
        medias[i] += estatura;
      }
      System.out.printf("\nMáximo: %d\n", maximos[i]);
      System.out.printf("Mínimo: %d\n", minimos[i]);
      System.out.printf("Media: %.2f\n\n", medias[i] / 10);
    }
  }  
}
