import paquetes.Utils;

public class Ejercicio16 {
  public static void main(String[] args) {
    for (int i = 0; i < 9999; i++) {
      if (Utils.esCapicua(i)) System.out.print(i + " ");
    }
  }
}
