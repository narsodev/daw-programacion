package Objetos;

public class Vendedor extends Persona {
  private String cargo;
  private Articulo[] articulosVendidos;

  public Vendedor (String nombre, String correoElectronico, String cargo) {
    super(nombre, correoElectronico);
    this.cargo = cargo;
    articulosVendidos = new Articulo[0];
  }

  public String toString() {
    String string = super.toString() + String.format("\nCargo: %s\n", this.cargo);

    string += "Ventas realizadas\n========================\n";

    for (int i = 0; i < articulosVendidos.length; i++) {
      string += this.articulosVendidos[i] + "\n";
    }

    return string;
  }

  public void addArticuloVendido (Articulo articuloVendido) {
    int articulosVendidosSize = this.articulosVendidos.length;

    boolean encontrado = false;
    int contador = 0;

    while (!encontrado && contador < articulosVendidosSize) {
      Articulo articuloActual = articulosVendidos[contador];
      if (articuloActual.getNombre().equals(articuloVendido.getNombre())) {
        encontrado = true;
        articuloActual.setCantidad(articuloActual.getCantidad() + articuloVendido.getCantidad());
      } else contador++;
    }

    if (!encontrado) {
      Articulo[] nuevosArticulosVendidos = new Articulo[articulosVendidosSize + 1];
      
      for (int i = 0; i < articulosVendidosSize; i++) {
        nuevosArticulosVendidos[i] = this.articulosVendidos[i];
      }
      
      nuevosArticulosVendidos[articulosVendidosSize] = articuloVendido;
      
      this.articulosVendidos = nuevosArticulosVendidos;
    }
  }
}
