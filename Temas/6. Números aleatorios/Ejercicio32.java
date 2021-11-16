/* Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
Por cada metro de sendero - representado por una línea - puede que haya un
obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
  Ejemplo 1:
    Introduzca la longitud del sendero en metros: 7
    | *  |
     |   O|
     |    |
    |  * |
     |*   |
     |  O |
      |    |
*/
public class Ejercicio32 {
  public static void main(String[] args) {
    int longitud;
    int posicion = 0;
    String caracter = "";
    int posicionObstaculo;

    System.out.print("Introduzca la longitud del sendero en metros: ");
    longitud = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < longitud; i++) {
      for (int j = 0; j < posicion; j++) System.out.print(" ");

      posicionObstaculo = (int) (Math.random() * 2) == 0
        ? 100
        : (int) (Math.random() * 4);

      System.out.print("|");
      for (int j = 0; j < 4; j++) {
        if (posicionObstaculo == j)  caracter = (int) (Math.random() * 2) == 0 ? "*" : "O";
        else caracter = " ";
        System.out.print(caracter);
      }
      System.out.print("|\n");

      posicion += (int) (Math.random() * 3) - 1;
    }
  }
}
