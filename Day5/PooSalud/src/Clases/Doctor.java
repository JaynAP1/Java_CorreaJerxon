package Clases;

public class Doctor extends Persona {
    String Tipo;
    String Especialidad;
    String Equipo;
    String Fecha_vinculacion;

    public Doctor(int id, String nombre, String tipo, String especialidad, String equipo, String fecha_vinculacion) {
        this.id = id;
        this.nombre = nombre;
        this.Tipo = tipo;
        this.Especialidad = especialidad;
        this.Equipo = equipo;
        this.Fecha_vinculacion = fecha_vinculacion;
    }

    @Override
    public String toString() {
        return "{" +
                "Tipo='" + Tipo + '\'' +
                ", Especialidad='" + Especialidad + '\'' +
                ", Equipo='" + Equipo + '\'' +
                ", Fecha_vinculacion='" + Fecha_vinculacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
