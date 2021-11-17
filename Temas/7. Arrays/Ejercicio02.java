/* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados? */
public class Ejercicio02 {
  public static void main(String[] args) {
    char[] simbolos = new char[10];

    simbolos[0] = 'a';
    simbolos[1] = 'x';
    simbolos[4] = '@';
    simbolos[7] = '+';
    simbolos[8] = 'Q';

    for (char simbolo: simbolos) System.out.print(simbolo + " ");
  }
}
