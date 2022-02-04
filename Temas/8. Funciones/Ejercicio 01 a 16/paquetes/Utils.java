package paquetes;

public class Utils {
  public static boolean esCapicua (long num) {
    return num == voltea(num);
  }

  public static boolean esPrimo (long num) {
    if (num <= 1) return false;

    boolean esPrimo = true;

    for (int i = 2; i <= (int) Math.sqrt(num) && esPrimo; i++) {
      if (num % i == 0) esPrimo = false;
    }

    return esPrimo;
  }

  public static long siguientePrimo (long num) {
    do {
      num++;
    } while (!esPrimo(num));
     
    return num;
  }

  public static long potencia (long num, int exponente) {
    long resultado = 1;

    for (int i = 0; i < exponente; i++) {
      resultado *= num;
    }

    return resultado;
  }

  public static int digitos (long num) {
    int nDigitos = 0;

    do {
      nDigitos++;
      num /= 10;
    } while (num > 0);

    return nDigitos;
  }

  public static long voltea (long num) {
    long resultado = 0;

    for (int i = digitos(num) - 1; i >= 0; i--) {
      resultado = resultado * 10 + digitoN(num, i);
    }

    return resultado;
  }

  public static int digitoN (long num, int posicion) {
    return (int) (num / potencia(10, digitos(num) - posicion - 1) % 10);
  }

  public static int posicionDeDigito (int num, int digito) {
    int posicion = -1;

    for (int i = 0; i < digitos(num) && posicion == -1; i++) {
      if (digitoN(num, i) == digito) posicion = i;
    }

    return posicion;
  }

  public static long quitaPorDetras (long num, int nQuitar) {
    return num / potencia(10, nQuitar);
  }

  public static long quitaPorDelante (long num, int nQuitar) {
    return num % potencia(10, digitos(num) - nQuitar);
  }
  
  public static long pegaPorDetras (long num, int digito) {
    return num * 10 + digito;
  }

  public static long pegaPorDelante (long num, int digito) {
    return digito * potencia(10, digitos(num)) + num;
  }

  public static long trozoDeNumero (long num, int posInicial, int posFinal) {
    long resultado = 0;
    for (int i = posInicial; i <= posFinal && resultado < num; i++) {
      resultado = resultado * 10 + digitoN(num, i);
    }
    return resultado;
  }

  public static long juntaNumeros (long num1, long num2) {
    return num1 * potencia(10, digitos(num2)) + num2;
  }
}
