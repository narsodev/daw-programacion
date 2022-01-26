package objetos;

public class Pizza {
  private String tipo;
  private String size;
  private String estado;
  static int numPedidas = 0;
  static int numServidas = 0;
  
  public Pizza (String tipo, String size) {
    this.tipo = tipo;
    this.size = size;
    this.estado = "pedida";
    numPedidas++;
  }

  public static int getTotalPedidas () {
    return numPedidas;
  }

  public static int getTotalServidas () {
    return numServidas;
  }

  public void sirve () {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      numServidas++;
    } else System.out.println("esta pizza ya se ha servido");
  }

  public String toString() {
    return "pizza " + this.tipo + " " + this.size + ", " + this.estado;
  }
}
