import paquetes.Utils;

public class Ejercicio01_14 {
  public static void main(String[] args) throws Exception {
    System.out.println("Es capicua:");
    System.out.println("\t" + 11 + ": " + Utils.esCapicua(11));
    System.out.println("\t" + 24 + ": " + Utils.esCapicua(24));
    System.out.println("\t" + 3 + ": " + Utils.esCapicua(3));

    System.out.println("Es primo:");
    System.out.println("\t11: " + Utils.esPrimo(11));
    System.out.println("\t24: " + Utils.esPrimo(24));
    System.out.println("\t3: " + Utils.esPrimo(3));
    
    System.out.println("Siguiente primo:");
    System.out.println("\t11: " + Utils.siguientePrimo(11));
    System.out.println("\t24: " + Utils.siguientePrimo(24));
    System.out.println("\t3: " + Utils.siguientePrimo(3));
    
    System.out.println("Potencia:");
    System.out.println("\t11 ^ 2: " + Utils.potencia(11, 2));
    System.out.println("\t24 ^ 2: " + Utils.potencia(24, 2));
    System.out.println("\t3 ^ 2: "  + Utils.potencia(3, 2));
    
    System.out.println("Digitos:");
    System.out.println("\t11: " + Utils.digitos(11));
    System.out.println("\t24: " + Utils.digitos(24));
    System.out.println("\t3: "  + Utils.digitos(3));
    
    System.out.println("Voltea:");
    System.out.println("\t11: " + Utils.voltea(11));
    System.out.println("\t24: " + Utils.voltea(24));
    System.out.println("\t3: "  + Utils.voltea(3));
    
    System.out.println("Digito N:");
    System.out.println("\t11 -> 2: " + Utils.digitoN(11, 2));
    System.out.println("\t24 -> 1: " + Utils.digitoN(24, 1));
    System.out.println("\t3 -> 1: "  + Utils.digitoN(3, 1));
    
    System.out.println("Posición de dígito:");
    System.out.println("\t11 -> 1: " + Utils.digitoN(11, 1));
    System.out.println("\t24 -> 4: " + Utils.digitoN(24, 4));
    System.out.println("\t3 -> 3: "  + Utils.digitoN(3, 3));
    
    System.out.println("Quita por detrás:");
    System.out.println("\t11 -> 1: " + Utils.quitaPorDetras(11, 1));
    System.out.println("\t24 -> 4: " + Utils.quitaPorDetras(24, 4));
    System.out.println("\t3 -> 3: "  + Utils.quitaPorDetras(3, 3));

    System.out.println("Quita por delante:");
    System.out.println("\t11 -> 1: " + Utils.quitaPorDelante(11, 1));
    System.out.println("\t24 -> 4: " + Utils.quitaPorDelante(24, 4));
    System.out.println("\t3 -> 3: "  + Utils.quitaPorDelante(3, 3));

    System.out.println("Pega por detrás:");
    System.out.println("\t11 -> 1: " + Utils.pegaPorDetras(11, 1));
    System.out.println("\t24 -> 4: " + Utils.pegaPorDetras(24, 4));
    System.out.println("\t3 -> 3: "  + Utils.pegaPorDetras(3, 3));

    System.out.println("Pega por delante:");
    System.out.println("\t11 -> 1: " + Utils.pegaPorDelante(11, 1));
    System.out.println("\t24 -> 4: " + Utils.pegaPorDelante(24, 4));
    System.out.println("\t3 -> 3: "  + Utils.pegaPorDelante(3, 3));

    System.out.println("Trozo de número:");
    System.out.println("\t11 -> 1, 1: " + Utils.trozoDeNumero(11, 1, 1));
    System.out.println("\t24 -> 0, 3: " + Utils.trozoDeNumero(24, 0, 3));
    System.out.println("\t3 -> 1, 2: "  + Utils.trozoDeNumero(3, 1, 2));

    System.out.println("Junta números:");
    System.out.println("\t11, 10: " + Utils.juntaNumeros(11, 10));
    System.out.println("\t24, 3: " + Utils.juntaNumeros(24, 3));
    System.out.println("\t3, 15: "  + Utils.juntaNumeros(3, 15));
  }
}