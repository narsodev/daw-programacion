package Objetos;

public class Gestisimal {
  private Articulo[] articulos;

  public Gestisimal () {
    articulos = new Articulo[0];
  }

  private int getIndexOfArticulo (String codigoArticuloABuscar) {
    int indexArticuloAEliminar = -1;

    for (int i = 0; i < this.articulos.length && indexArticuloAEliminar == -1; i++) {
      if (this.articulos[i].getCodigo().equals(codigoArticuloABuscar)) {
        indexArticuloAEliminar = i;
      }
    }

    return indexArticuloAEliminar;
  }

  public boolean darDeAlta (Articulo nuevoArticulo) {
    if (getIndexOfArticulo(nuevoArticulo.getCodigo()) == 1) return false;

    int tamanioArrayArticulos = this.articulos.length;
    Articulo[] articulosAuxiliar = new Articulo[tamanioArrayArticulos + 1];

    for (int i = 0; i < tamanioArrayArticulos; i++) {
      articulosAuxiliar[i] = articulos[i];
    }

    articulosAuxiliar[tamanioArrayArticulos] = nuevoArticulo;

    this.articulos = articulosAuxiliar;

    return true;
  }

  public boolean darDeBaja (String codigoArticuloAEliminar) {
    int tamanioArrayArticulos = this.articulos.length;
    int indexArticuloAEliminar = this.getIndexOfArticulo(codigoArticuloAEliminar);

    if (indexArticuloAEliminar == -1) return false;

    Articulo[] articulosAuxiliar = new Articulo[tamanioArrayArticulos - 1];

    for (int i = 0; i < indexArticuloAEliminar; i++) {
      articulosAuxiliar[i] = this.articulos[i];
    }

    for (int i = indexArticuloAEliminar; i < this.articulos.length - 1; i++) {
      articulosAuxiliar[i] = this.articulos[i + 1];
    }

    this.articulos = articulosAuxiliar;

    return true;
  }

  public boolean Modificacion (String codigoArticuloAModificar) {
    int indexArticuloAModificar = this.getIndexOfArticulo(codigoArticuloAModificar);
    if (indexArticuloAModificar == -1) return false;

    Articulo articuloAModificar = this.articulos[indexArticuloAModificar];
    articuloAModificar.modificar(descripcion, precioCompra, precioVenta, stock);
    return true;
  }

  public String toString () {
    String cadenaTexto = "";

    for (int i = 0; i < this.articulos.length; i++) {
      cadenaTexto += this.articulos[i];
      cadenaTexto += "\n-------------------------------------\n";
    }

    return cadenaTexto;
  }
}
