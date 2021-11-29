/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */
public class Ejercicio11 {
  public static void main(String[] args) {
    int[] array = new int[10];

    System.out.println("Rellene el array:");
    for (int i = 0; i < 10; i++) {
      System.out.print(i + ": "); 
      array[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("Su array es:");
    for (int i = 0; i < 10; i++) System.out.printf("%d : %d\n", i, array[i]);

    for (int i = 0; i < 10; i++) {
      int num = array[i];
      int contador = 2;
      boolean primo = true;

      while (primo && contador <= Math.sqrt(num)) {
        primo = num % contador != 0;
        contador++;
      }

      if (primo) {
        for (int j = i; j > 0; j--) array[j] = array[j - 1];
        array[0] = num;
      }
    }

    System.out.println("El array resultante es:");
    for (int i = 0; i < 10; i++) System.out.printf("%d: %d\n", i, array[i]);
  }
}
