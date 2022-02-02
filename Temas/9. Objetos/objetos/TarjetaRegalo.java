package objetos;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  private double saldo;
  private String numeroTarjeta;

  private static final DecimalFormat formateador = new DecimalFormat("0.00");

  public TarjetaRegalo (double saldo) {
    this.saldo = saldo;

    String numeroTarjetaAleatorio = "";
    for (int i = 0; i < 5; i++) numeroTarjetaAleatorio += (int) (Math.random() * 10);

    this.numeroTarjeta = numeroTarjetaAleatorio;
  }

  public void gasta (double cantidad) {
    if (this.saldo >= cantidad) this.saldo -= cantidad;
    else System.out.println("No tiene saldo suficiente para gastar " + formateador.format(cantidad) + "€.");
  }

  public TarjetaRegalo fusionaCon (TarjetaRegalo tarjetaAFusionar) {
    TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(this.saldo + tarjetaAFusionar.saldo);
    this.saldo = 0;
    tarjetaAFusionar.saldo = 0;
    return nuevaTarjeta;
  }
  
  public String toString() {
    return "Tarjeta nº " + numeroTarjeta + " - Saldo " + formateador.format(this.saldo) + "€.";
  }
}
