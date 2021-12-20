/* Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en posicion. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
se indican del 1 al 8.
  Ejemplo: 
    Introduzca la posición del alfil: d5
    El álfil puede moverse a las siguientes posiciones:
    h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
*/
public class Ejercicio08 {
  public static void main(String[] args) {
    int fila, columna;
    String entrada;

    System.out.print("Posición (ej: a1): ");
    entrada = System.console().readLine();

    columna = (int) entrada.charAt(0) - (int) 'a' + 1;
    fila = Integer.parseInt(String.valueOf(entrada.charAt(1)));

    for (int i = 0; i < 8; i++) {
      int posicion1 = i + columna - fila;
      int posicion2 = 8 - (i + fila - columna);

      if (posicion2 < posicion1) {
        int aux = posicion1;
        posicion1 = posicion2;
        posicion2 = aux;
      }

      if (posicion1 >= 0 && posicion1 < 8 && i + 1 != fila) System.out.printf("%s ", valorAjedrez(i, posicion1));
      if (posicion2 >= 0 && posicion2 < 8 && i + 1 != fila) System.out.printf("%s ", valorAjedrez(i, posicion2));
    }
  }

  public static String valorAjedrez (int fila, int columna) {
    return (char) (columna + (int) 'a') + "" + (fila + 1);
  }
}
