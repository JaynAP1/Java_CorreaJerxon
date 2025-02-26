package Clases;

public class Empleado {
    private String nombre;
    private double salario;
    private int horas;

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }

    public String getNombre() {
        return nombre;
    }
    public Empleado() {
    }
    public Empleado(String nombre, double salario, int horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public String calcularBonificacion() {
        return "El empleado"+ getNombre() + "Tiene una bonificacion de: " + salario * 30 / 100;
    }
    public String mostrarInformacion(){
        return "El empleado "+ nombre + " Tiene un salario base de " + salario + " y trabaja un total de " + horas + " horas al dia";
    }
}
