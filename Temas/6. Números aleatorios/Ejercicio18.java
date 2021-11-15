/* Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja. */
public class Ejercicio18 {
  public static void main(String[] args) {
    int numGenerado;
    int numGenerado1 = 10;
    int numGenerado2 = 10;
    int contador = 0;
    String color;
    boolean repetir;

    do {
      numGenerado = (int) (Math.random() * 6);
      repetir = numGenerado == numGenerado1 || numGenerado == numGenerado2;

      if (!repetir) {
        contador++;
        if (contador == 1) numGenerado1 = numGenerado;
        if (contador == 2) numGenerado2 = numGenerado;

        switch (numGenerado) {
          case 0:
            color = "rojo";
            break;
          case 1:
            color = "azul";
            break;
          case 2:
            color = "verde";
            break;
          case 3:
            color = "amarillo";
            break;
          case 4:
            color = "violeta";
            break;
          case 5:
            color = "naranja";
            break;
          default:
            color = "";
            break;
        }

        System.out.printf("Dormitorio %d: %s\n", contador, color);
      }
    } while (contador < 3 || repetir);
    
  }
}
