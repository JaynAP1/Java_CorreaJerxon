
package Day8Trabajo.clases;

public class Partidos {
    private int idEquipo1;
    private int idEquipo2;
    private int marcadorEquipo1;
    private int marcadorEquipo2;
    private String Estado;

    public Partidos(int idEquipo1, int idEquipo2, int marcadorEquipo1, int marcadorEquipo2, String Estado) {
        this.idEquipo1 = idEquipo1;
        this.idEquipo2 = idEquipo2;
        this.marcadorEquipo1 = marcadorEquipo1;
        this.marcadorEquipo2 = marcadorEquipo2;
        this.Estado = Estado;
    }

    public Partidos() {
    }
    
    
    public void empezarPartido(){
        System.out.println("El partido a comenzado.");
    }
    public void marcadorEquipo1(){
        this.marcadorEquipo1 += 1;
    }
    public void marcadorEquipo2(){
        this.marcadorEquipo2 += 1;
    }
    public void definirGanador(){
        if(marcadorEquipo1 > marcadorEquipo2){
            System.out.println("El equipo: "+ idEquipo1 + " a ganado");
        }
        else if(marcadorEquipo2 > marcadorEquipo1){
            System.out.println("El equipo: "+ idEquipo2 + " a ganado");
        }
        else{
            System.out.println("El partido a empatado");
        }
    }
}
