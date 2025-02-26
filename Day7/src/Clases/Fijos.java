package Clases;

public class Fijos extends Empleado{
    private int DiasLibres;

    public Fijos() {
    }

    public Fijos(int diasLibres) {
        this.DiasLibres = diasLibres;
    }

    public Fijos(String nombre, double salario, int horas, int diasLibres) {
        super(nombre, salario, horas);
        DiasLibres = diasLibres;
    }

    public Fijos(String nombre, double salario, int diasLibres) {
        super(nombre, salario);
        this.DiasLibres = diasLibres;
    }

    @Override
    public String calcularBonificacion() {
        return "El empleado "+ getNombre() + " Tiene una bonificacion de: " + getSalario() * 20 / 100;
    }
    @Override
    public String mostrarInformacion(){
        return "El empleado "+ getNombre() + " Tiene un salario base de " + getSalario() + " y trabaja un total de " + getHoras() + " horas al dia y tiene un total de dias libres de " + DiasLibres;
    }

}
