package Clases;

public class Horas extends Empleado {
    private int dias;

    public Horas() {
    }

    public Horas(int dias) {
        this.dias = dias;
    }

    public Horas(String nombre, double salario, int dias, int horas) {
        super(nombre, salario, horas);
        this.dias = dias;
    }

    @Override
    public String calcularBonificacion(){
        return "El empleado "+ getNombre() + " Tiene una bonificacion de: " + getSalario() * 30 / 100;
    }

    @Override
    public String mostrarInformacion(){
        return "El empleado "+ getNombre() + " Tiene un salario base de " + getSalario() + " y trabaja un total de " + getHoras() + " horas y trabaja " + dias + " dias";
    }
}
