package Day8Trabajo;

import Day8Trabajo.clases.Equipos;
import Day8Trabajo.clases.Partidos;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Equipos> listEquipos = new ArrayList<>();
        Equipos equipo1 = new Equipos(1, "Redbulls", 5, 0);
        Equipos equipo2 = new Equipos(2, "EyeHalcon", 5, 0);
        Equipos equipo3 = new Equipos(3, "BlueSizes", 5, 0);
        Equipos equipo4 = new Equipos(4, "MonstersHats", 5, 0);
        Equipos equipo5 = new Equipos(5, "ShoesDelicius", 5, 0);
        Equipos equipo6 = new Equipos(6, "GirlsChampions", 5, 0);
        listEquipos.add(equipo1);
        listEquipos.add(equipo2);
        listEquipos.add(equipo3);
        listEquipos.add(equipo4);
        listEquipos.add(equipo5);
        listEquipos.add(equipo6);
        
        
        Scanner sc = new Scanner(System.in);    
        
        boolean booleanito = true;
        while(booleanito){
            System.out.println("""
                           ============================
                           1).Empezar torneo.
                           2).Salir
                           ============================
                           """);
            String Opcion = sc.nextLine();
            
            switch(Opcion){
                case "1"->{
                    System.out.println("Primer partido.");
                    Partidos partido1 = new Partidos(1, 2, 0, 0, "Sin iniciar");
                    partido1.empezarPartido();
                                        
                    while(partido1.getEstado() != "Terminado"){
                        System.out.println("""
                                       ==========================
                                           1.Marcador equipo 1.
                                           2.Marcador equipo 2.
                                           3.Mostrar informacion general.
                                           3.Definir ganador.
                                       ==========================
                                       """);
                        String Seleccion = sc.nextLine();
                        switch(Seleccion){
                            case "1"->{
                                partido1.marcadorEquipo1();
                            }
                            case "2"->{
                                partido1.marcadorEquipo2();
                            }
                            case "3"->{
                                partido1.infoPartido();
                            }
                            case "4"->{
                                partido1.definirGanador();
                            }
                        }
                    }
                    System.out.println("Segundo partido.");
                    Partidos partido2 = new Partidos(3, 4, 0, 0, "Sin iniciar");
                    partido1.empezarPartido();
                                        
                    while(partido2.getEstado() != "Terminado"){
                        System.out.println("""
                                       ==========================
                                           1.Marcador equipo 1.
                                           2.Marcador equipo 2.
                                           3.Mostrar informacion general.
                                           3.Definir ganador. 
                                       ==========================
                                       """);
                        String Seleccion = sc.nextLine();
                        switch(Seleccion){
                            case "1"->{
                                partido2.marcadorEquipo1();
                            }
                            case "2"->{
                                partido2.marcadorEquipo2();
                            }
                            case "3"->{
                                partido2.infoPartido();
                            }
                            case "4"->{
                                partido2.definirGanador();
                            }
                        }
                    }
                    
                    System.out.println("Partido final.");
                    Partidos partido3 = new Partidos(partido1.getIdGanador(), partido2.getIdGanador(), 0, 0, "Sin iniciar");
                    partido1.empezarPartido();
                                        
                    while(partido2.getEstado() != "Terminado"){
                        System.out.println("""
                                       ==========================
                                           1.Marcador equipo 1.
                                           2.Marcador equipo 2.
                                           3.Mostrar informacion general.
                                           3.Definir ganador. 
                                       ==========================
                                       """);
                        String Seleccion = sc.nextLine();
                        switch(Seleccion){
                            case "1"->{
                                partido3.marcadorEquipo1();
                            }
                            case "2"->{
                                partido3.marcadorEquipo2();
                            }
                            case "3"->{
                                partido3.infoPartido();
                            }
                            case "4"->{
                                partido3.definirGanador();
                            }
                        }
                    }
                    
                    
            }

        }
    }
    }
public void AgregarEquipos(){
        Equipos equipo1 = new Equipos(1, "Redbulls", 5, 0);
        Equipos equipo2 = new Equipos(2, "EyeHalcon", 5, 0);
        Equipos equipo3 = new Equipos(3, "BlueSizes", 5, 0);
        Equipos equipo4 = new Equipos(4, "MonstersHats", 5, 0);

    }   
    
}
