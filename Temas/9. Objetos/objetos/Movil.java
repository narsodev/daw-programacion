package objetos;

import java.text.DecimalFormat;

public class Movil extends Terminal {
  float tarifa;
  private double eurosTarificados = 0;

  final private static int RATA = 0;  
  final private static int MONO = 1;  
  final private static int BISONTE = 2;
  final private static float[] PRECIOS = new float[] { 0.06f, 0.12f, 0.3f };

  public Movil(String numero, String tarifa) {
    super(numero);
    switch (tarifa) {
      case "rata":
        this.tarifa = PRECIOS[RATA];
        break;
      case "mono":
        this.tarifa = PRECIOS[MONO];
        break;
      case "bisonte":
        this.tarifa = PRECIOS[BISONTE];
        break;
      default:
        this.tarifa = 0;
    }
  }

  @Override 
  public void llama (Terminal terminalLlamada, int segundos) {
    super.llama(terminalLlamada, segundos);
    this.eurosTarificados += this.tarifa * segundos / 60;
  }

  @Override
  public String toString () {
    return super.toString() + " - tarificados " + new DecimalFormat("0.00").format(this.eurosTarificados) + " euros";
  }
}
