package Day8Trabajo.clases;

public class Equipos {
    private int id;
    private String nombre;
    private int miembros;
    private int partidosJugados;

    public Equipos() {
    }

    public Equipos(int id, String nombre, int miembros, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.miembros = miembros;
        this.partidosJugados = partidosJugados;
    }
    
    
    
    public Equipos(String nombre, int miembros, int partidosJugados) {
        this.nombre = nombre;
        this.miembros = miembros;
        this.partidosJugados = partidosJugados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    
    public void mostrarInformacion(){
        System.out.println("======================================");
        System.out.println("id equipo: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Cantidad miembros: "+ miembros);
        System.out.println("Partidos jugados: "+ partidosJugados);
    }
    
    
    
}
