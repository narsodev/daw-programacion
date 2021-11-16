/* Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.
  Ejemplo:
    1. Primavera
    2. Verano
    3. Otoño
    4. Invierno
    Seleccione la estación del año (1-4): 4
    Previsión del tiempo para mañana
    --------------------------------
    Temperatura mínima: 10ºC
    Temperatura máxima: 16ºC
    Nublado
*/
public interface Ejercicio29 {
  public static void main(String[] args) {
    final int MINIMA_PRIMAVERA = 15;
    final int MAXIMA_PRIMAVERA = 30;
    final int MINIMA_VERANO = 25;
    final int MAXIMA_VERANO = 45;
    final int MINIMA_OTONIO = 20;
    final int MAXIMA_OTONIO = 30;
    final int MINIMA_INVIERNO = 0;
    final int MAXIMA_INVIERNO = 25;

    int estacion, minima, maxima;

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");

    System.out.print("Seleccione la estación del año (1-4): ");
    estacion = Integer.parseInt(System.console().readLine());

    int auxMinima = 0;
    int auxMaxima = 0;

    switch (estacion) {
      case 1:
        auxMinima = MINIMA_PRIMAVERA;
        auxMaxima = MAXIMA_PRIMAVERA;
        break;
      case 2:
        auxMinima = MINIMA_VERANO;
        auxMaxima = MAXIMA_VERANO;
        break;
      case 3:
        auxMinima = MINIMA_OTONIO;
        auxMaxima = MAXIMA_OTONIO;
        break;
      case 4:
        auxMinima = MINIMA_INVIERNO;
        auxMaxima = MAXIMA_INVIERNO;
        break;
      default:
    }

    minima = (int) (Math.random() * (auxMaxima - auxMinima + 1) + auxMinima);
    do {
      maxima = (int) (Math.random() * (auxMaxima - auxMinima) + auxMinima);
    } while (maxima < minima);


    System.out.println();
    System.out.println("--------------------------------");
    System.out.printf("Temperatura mínima: %dºC\n", minima);
    System.out.printf("Temperatura máxima: %dºC\n", maxima);
  }
}
