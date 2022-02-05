package Objetos;

public class CuentaCorriente {
  private String numeroDeCuenta;
  private float saldo = 0;

  public CuentaCorriente () {
    String numeroDeCuenta = "";
    for (int i = 0; i < 10; i++) {
      numeroDeCuenta += (int) (Math.random() * 10);
    }

    this.numeroDeCuenta = numeroDeCuenta;
  }

  public CuentaCorriente (float saldo) {
    this();
    this.saldo = saldo;
  }

  public void ingreso (float cantidad) {
    this.saldo += cantidad;
  }

  public void cargo (float cantidad) {
    this.saldo -= cantidad;
  }

  public void transferencia (CuentaCorriente cuentaATransferir, float cantidad) {
    this.cargo(cantidad);
    cuentaATransferir.ingreso(cantidad);
  }

  public String toString() {
    return String.format("Número de cuenta: %s - Saldo: %.2f€", this.numeroDeCuenta, this.saldo);
  }
}
