/* Escribe un programa que declare 5 variables de tipo char. A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatenación de
las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado? */

// El problema es que suma los valores ASCII de los caracteres.
// Lo he solucionado concatenando al principio una String vacía ("").
public class Ejercicio8 {
  public static void main(String[] args) {
    char a = 'W';
    char b = 'o';
    char c = 'r';
    char d = 'l';
    char e = 'd';

    System.out.println("" + a + b + c + d + e);
  }
}
