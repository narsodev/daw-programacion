package paquetes;

public class Conversor {
  public static long binarioADecimal (String binario) {
    long nDecimal = 0;
    int longitudBinario = binario.length();

    for (int i = 0; i < longitudBinario; i++) {
      if (binario.charAt(i) == '1') nDecimal += Utils.potencia(2, longitudBinario - i - 1);
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

  public static String decimalAOctal (long decimal) {
    String octal = "";

    do {
      octal = decimal % 8 + octal;
      decimal /= 8;
    } while (decimal > 0);

    return octal;
  }

  public static String decimalAHexadecimal (long decimal) {
    String hexadecimal = "";

    do {
      int resto = (int) (decimal % 16);
      hexadecimal = (resto < 10 
        ? resto
        : String.valueOf((char) ((int) 'A' + resto - 10)))
      + hexadecimal;

      decimal /= 16;
    } while (decimal > 0);

    return hexadecimal;
  }

  
}
