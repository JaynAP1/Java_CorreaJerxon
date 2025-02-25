package Clases;
import java.util.*;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado (String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        if (salario > 0){
            this.salario = salario;
        }
        else{
            System.out.println("El salario no puede ser negativo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo");
        }
        else {
            this.salario = salario;
            System.out.println("Salario cambiado con exito");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Salario: " + salario);
    }

}
