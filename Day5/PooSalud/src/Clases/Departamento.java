package Clases;

public class Departamento extends Estructura{
    int id_hospital;
    public Departamento(int id, String nombre, int capacidad, int id_hospital) {
        this.id = id;
        this.nombre = nombre;
        this.Capacidad = capacidad;
        this.id_hospital = id_hospital;
    }

    @Override
    public String toString() {
        return "{" +
                "id_hospital=" + id_hospital +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Capacidad=" + Capacidad +
                '}';
    }
}
