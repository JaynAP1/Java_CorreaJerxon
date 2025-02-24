package Clases;

public class Hospital extends Estructura{
    int Cant_pacientes;

    public Hospital(int id, String nombre, int capacidad, int Cant_pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.Capacidad = capacidad;
        this.Cant_pacientes = Cant_pacientes;
    }


    @Override
    public String toString() {
        return "{" +
                "Cant_pacientes=" + Cant_pacientes +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Capacidad=" + Capacidad +
                '}';
    }
}
