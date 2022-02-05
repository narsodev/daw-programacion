# Ejercicio 13

Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número
de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se
pide llevar un registro de los movimientos realizados.

Programa principal:

```java
CuentaCorriente cuenta1 = new CuentaCorriente();
CuentaCorriente cuenta2 = new CuentaCorriente(1500);
CuentaCorriente cuenta3 = new CuentaCorriente(6000);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
cuenta1.ingreso(2000);
cuenta2.cargo(600);
cuenta3.ingreso(75);
cuenta1.cargo(55);
cuenta2.transferencia(cuenta3, 100);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
```

Salida:
> Número de cta: 6942541557 Saldo: 0,00 €  
> Número de cta: 9319536518 Saldo: 1500,00 €  
> Número de cta: 7396941518 Saldo: 6000,00 €  
> Número de cta: 6942541557 Saldo: 1945,00 €  
> Número de cta: 9319536518 Saldo: 800,00 €  
> Número de cta: 7396941518 Saldo: 6175,00 €  
