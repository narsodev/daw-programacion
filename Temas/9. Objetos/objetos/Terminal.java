package objetos;

public class Terminal {
  private String numero;
  private int segundosConversacion;

  public Terminal (String numero) {
    this.numero = numero;
    segundosConversacion = 0;
  }

  public void llama (Terminal terminalLlamada, int segundos) {
    this.segundosConversacion += segundos;
    terminalLlamada.segundosConversacion += segundos;
  }

  public String toString() {
    return "Nº " + this.numero + " - " + segundosConversacion + "s de conversación";
  }
}
