/* Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
Observa bien lo que hace cada función ya que, si las implementas en el orden
adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
implementar teniendo esPrimo.
  1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
  es capicúa y falso en caso contrario.
  2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
  es primo y falso en caso contrario.
  3. siguientePrimo: Devuelve el menor primo que es mayor al número que
  se pasa como parámetro.
  4. potencia: Dada una base y un exponente devuelve la potencia.
  5. digitos: Cuenta el número de dígitos de un número entero.
  6. voltea: Le da la vuelta a un número.
  7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
  Se empieza contando por el 0 y de izquierda a derecha.
  8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
  dentro de un número entero. Si no se encuentra, devuelve -1.
  9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
  derecha).
  10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
  izquierda).
  11. pegaPorDetras: Añade un dígito a un número por detrás.
  12. pegaPorDelante: Añade un dígito a un número por delante.
  13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
  dentro de un número y devuelve el trozo correspondiente.
  14. juntaNumeros: Pega dos números para formar uno. */
package paquetes;

public class Ejercicios01_14 {
  public static boolean esCapicua (long num) {
    boolean capicua = true;
    int nDigitos = digitos(num);

    for (int i = 0; i < nDigitos && capicua; i++) {
      if (digitoN(num, i) != digitoN(num, nDigitos - i - 1)) capicua = false;
    }

    return capicua;
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
    long primoActual = num;
    boolean encontrado;

    do {
      primoActual++;
      encontrado = esPrimo(primoActual);
    } while (!encontrado);
     
    return primoActual;
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
    for (int i = posInicial; i <= posFinal; i++) {
      resultado = resultado * 10 + digitoN(num, i);
    }
    return resultado;
  }

  public static long juntaNumeros (long num1, long num2) {
    long resultado = num1;

    for (int i = 0; i < digitos(num2); i++) {
      resultado = resultado * 10 + digitoN(num2, i);
    }

    return resultado;
  }
}
