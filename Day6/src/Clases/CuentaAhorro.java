package Clases;

public class CuentaAhorro extends CuentaBancaria{
    private double tasa_interes;


    public CuentaAhorro(String numeroCuenta, double saldo, double tasa_interes) {
        super(numeroCuenta, saldo);
        this.tasa_interes = tasa_interes;
    }

    public double getTasa_interes() {
        return tasa_interes;
    }

    public double aplicarIntereses(double tasa_interes, double saldo) {
        double SaldoActual = saldo;
        SaldoActual = SaldoActual + (SaldoActual * tasa_interes/100);
        return SaldoActual;
    }
}
