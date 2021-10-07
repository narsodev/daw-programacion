/* Escribe un programa que declare variables de tipo char y de tipo String. Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println) ¿es posible? */

// Sí, es posible. Solo se necesita sumar los caracteres como Strings.
public class Ejercicio7 {
  public static void main(String[] args) {
    char a = 'H';
    char b = 'e';
    String c = "llo World!";

    System.out.println("" + a + b + c);
  }
  
}
