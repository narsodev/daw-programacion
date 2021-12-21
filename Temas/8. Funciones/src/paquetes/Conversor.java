package paquetes;

public class Conversor {
  public static long binarioADecimal (String binario) {
    long nDecimal = 0;
    int longitudBinario = binario.length();

    for (int i = 0; i < longitudBinario; i++) {
      if (binario.charAt(i) == '1') nDecimal += Ejercicios01_14.potencia(2, longitudBinario - i - 1);
    }

    return nDecimal;
  }

  public static String decimalABinario (long decimal) {
    String binario = "";

    do {
      binario = (decimal % 2 == 0 ? 0 : 1) + binario;
      decimal /= 2;
    } while (decimal > 0);

    return binario;
  }
}
