// Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
public class Ejercicio03 {
  public static void main(String[] args) {
    int i = 5;
    do {
      if (i != 0 && i % 5 == 0) System.out.println(i);
      i++;
    } while (i <= 100);
  }  
}
