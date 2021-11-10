/* Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. */
public class Ejercicio13 {
  public static void main(String[] args) {
    int dado1, dado2;

    do {
      dado1 = (int) (Math.random() * 6) + 1;
      dado2 = (int) (Math.random() * 6) + 1;
      
      System.out.printf("Dado 1: %d\tDado 2: %d\n", dado1, dado2);
    } while (dado1 != dado2);
  }  
}
