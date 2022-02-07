package Objetos;

public class Articulo {
  private String nombre;
  private int cantidad;

  public Articulo (String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  public String toString () {
    return String.format("%s, %d unid.", this.nombre, this.cantidad);
  }

  public String getNombre () {
    return this.nombre;
  }

  public int getCantidad () {
    return this.cantidad;
  }

  public void setCantidad (int cantidad) {
    this.cantidad = cantidad;
  }
}
