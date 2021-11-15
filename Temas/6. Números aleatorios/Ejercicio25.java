/* Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).*/
public class Ejercicio25 {
  public static void main(String[] args) {
    int num;
    for (int i = 0; i < 100; i++) {
      num = (int) (Math.random() * 191) + 10;
      
      if (i == 0 || i == 99) System.out.print("#");
      if (num % 5 == 0) System.out.print("[");
      System.out.print(num);
      if (i == 0 || i == 99) System.out.print("#");
      if (num % 5 == 0) System.out.print("]");
      System.out.print(" ");
    }
  }
}
