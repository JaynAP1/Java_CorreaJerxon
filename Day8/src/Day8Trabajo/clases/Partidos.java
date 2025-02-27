
package Day8Trabajo.clases;

public class Partidos {
    private int idEquipo1;
    private int idEquipo2;
    private int marcadorEquipo1;
    private int marcadorEquipo2;
    private String Estado;
    private int idGanador;

    public Partidos(int idEquipo1, int idEquipo2, int marcadorEquipo1, int marcadorEquipo2, String Estado) {
        this.idEquipo1 = idEquipo1;
        this.idEquipo2 = idEquipo2;
        this.marcadorEquipo1 = marcadorEquipo1;
        this.marcadorEquipo2 = marcadorEquipo2;
        this.Estado = Estado;
    }

    public Partidos() {
    }
    
    public void infoPartido(){
        System.out.println("======Equipo 1======");
        System.out.println("Puntos: "+ marcadorEquipo1);
        System.out.println("Id del equipo: "+ idEquipo1);
        
        System.out.println("======Equipo 2======");
        System.out.println("Puntos: "+ marcadorEquipo2);
        System.out.println("Id del equipo: "+ idEquipo2);
        
        System.out.println("Estado del partido: "+ Estado);
    }

    public int getIdEquipo1() {
        return idEquipo1;
    }

    public void setIdEquipo1(int idEquipo1) {
        this.idEquipo1 = idEquipo1;
    }

    public int getIdEquipo2() {
        return idEquipo2;
    }

    public void setIdEquipo2(int idEquipo2) {
        this.idEquipo2 = idEquipo2;
    }

    public int getMarcadorEquipo1() {
        return marcadorEquipo1;
    }

    public void setMarcadorEquipo1(int marcadorEquipo1) {
        this.marcadorEquipo1 = marcadorEquipo1;
    }

    public int getMarcadorEquipo2() {
        return marcadorEquipo2;
    }

    public void setMarcadorEquipo2(int marcadorEquipo2) {
        this.marcadorEquipo2 = marcadorEquipo2;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdGanador() {
        return idGanador;
    }

    public void setIdGanador(int idGanador) {
        this.idGanador = idGanador;
    }
    
    public void empezarPartido(){
        System.out.println("El partido a comenzado.");
        Estado = "En juego";
    }
    public void marcadorEquipo1(){
        this.marcadorEquipo1 += 1;
        System.out.println("El equipo 1 a anotado un punto");
    }
    public void marcadorEquipo2(){
        this.marcadorEquipo2 += 1;
        System.out.println("El equipo 2 a anotado un punto");
    }
    public void definirGanador(){
        if(marcadorEquipo1 > marcadorEquipo2){
            System.out.println("El equipo: "+ idEquipo1 + " a ganado");
            Estado = "Terminado";
            idGanador = idEquipo1;
        }
        else if(marcadorEquipo2 > marcadorEquipo1){
            System.out.println("El equipo: "+ idEquipo2 + " a ganado");
            Estado = "Terminado";
            idGanador = idEquipo2;
        }
        else{
            System.out.println("El partido no puede terminar hasta que no desempaten");
        }
    }
}
