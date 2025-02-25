package Clases;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public String getNumeroCuenta(){
        return numeroCuenta;
    }


    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("deposito realizado");
        }else{
            System.out.println("la cantidad debe ser positiva");
        }
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("saldo retirado");
        }else if (cantidad > saldo){
            System.out.println("la cantidad a retirar es mayor a su saldo");
        }else{
            System.out.println("debes retirar una cantidad menos a tu saldo");
        }
    }
    public void mostrarInformacion(){
        System.out.println("Numero Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);

    }
}
