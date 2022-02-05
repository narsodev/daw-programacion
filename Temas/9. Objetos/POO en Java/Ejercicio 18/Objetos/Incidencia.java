package Objetos;

public class Incidencia {
  private static int cuentaCodigos = 0;
  private static int incidenciasPendientes = 0;

  private int codigo;
  private String estado;
  private int numeroDePuesto;
  private String incidencia;
  private String informacionResolucion;


  public Incidencia (int numeroDePuesto, String incidencia) {
    cuentaCodigos++;
    incidenciasPendientes++;
    this.estado = "Pendiente";
    this.codigo = cuentaCodigos;
    this.numeroDePuesto = numeroDePuesto;
    this.incidencia = incidencia;
  }

  public void resuelve (String informacionResolucion) {
    this.estado = "Resuelta";
    this.informacionResolucion = informacionResolucion;
    incidenciasPendientes--;
  }

  public String toString () {
    String string = "Incidencia " + this.codigo +
      " - " + "Puesto: " + this.numeroDePuesto +
      " - " + this.incidencia +
      " - " + this.estado;

    if (this.estado.equals("Resuelta")) string += " - " + this.informacionResolucion;

    return string;
  }

  public static int getPendientes () {
    return incidenciasPendientes;
  }
}
