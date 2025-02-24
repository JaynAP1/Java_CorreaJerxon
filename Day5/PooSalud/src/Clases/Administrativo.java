package Clases;

public class Administrativo extends Persona{
    String fecha_vinculacion;

    public Administrativo(int id, String nombre, String fecha_vinculacion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_vinculacion = fecha_vinculacion;
    }

    @Override
    public String toString() {
        return "{" +
                "fecha_vinculacion='" + fecha_vinculacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
