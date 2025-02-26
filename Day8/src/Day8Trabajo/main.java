package Day8Trabajo;

import Day8Trabajo.clases.Equipos;
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
                           1).Registrar equipos.
                           2).Empezar torneo.
                           3).Salir
                           ============================
                           """);
            String Opcion = sc.nextLine();
            
            switch(Opcion){
                case "1"->{
                    System.out.println("""
                                       ============================
                                       1).Llave de 2.
                                       2).Llave de 4.
                                       3).Llave de 6.
                                       4).Salir.
                                       ============================
                                       """);
                    String Opcion1 = sc.nextLine();
                    switch(Opcion1){
                        case "1" ->{
                            for (Equipos i : listEquipos){
                                i.mostrarInformacion();
                            }
                            for (int i = 0; i< 3; i++){
                                System.out.println("Ingrese la id del equipo que desa meter a llave");
                                int Select1 = sc.nextInt();
                                for (Equipos a : listEquipos){
                                    if(Select1 == a.getId()){
                                        System.out.println("El equipo: "+ a.getNombre() + " a sido seleccionado.");
                                    }
                                }
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
        Equipos equipo5 = new Equipos(5, "ShoesDelicius", 5, 0);
        Equipos equipo6 = new Equipos(6, "GirlsChampions", 5, 0);
    }   
    
}
