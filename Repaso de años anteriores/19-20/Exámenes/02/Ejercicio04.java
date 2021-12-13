public class Ejercicio04 {
  public static void main(String[] args) {
    int[] COEFICIENTES_ANIOS = { 5, 3, 1, 0, -2, 4 };
    int[] COEFICIENTES_MESES = { 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
    String[] DIAS = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };

    int anio, mes, dia;

    int coeficienteA, coeficienteB, coeficienteC, coeficienteD;

    System.out.println("Este programa calcula el día de la semana que corresponde a una fecha.");
    System.out.println("Válido para fechas comprendidas entre 1/1/1700 y 31/12/2299.");
    System.out.println("Introduzca fecha, indicando día, mes y año (dd mm aaaa).");

    System.out.print("Día: ");
    dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Mes: ");
    mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Año: ");
    anio = Integer.parseInt(System.console().readLine());

    coeficienteA = COEFICIENTES_ANIOS[anio / 100 - 17];
    coeficienteB = anio % 100 + (anio % 100) / 4;
    coeficienteC = (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) ? - 1 : 0;
    coeficienteD = COEFICIENTES_MESES[mes - 1];

    String diaSemana = DIAS[(coeficienteA + coeficienteB + coeficienteC + coeficienteD + dia) % 7];

    System.out.printf("La fecha %d/%d/%d cae en: %s", dia, mes, anio, diaSemana);
  }
}
