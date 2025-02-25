import Funciones.Ejercicio1;
import Funciones.Ejercicio2;
import Funciones.Ejercicio3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean boleanito = true;

        while (boleanito) {
            System.out.println("""
                =============================
                1).Ejercicio1.
                2).Ejercicio2.
                3).Ejercicio3.
                4).Salir.
                =============================
                """);
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1"->{
                    Ejercicio1.Ejercicio1();
                }
                case "2"->{
                    Ejercicio2.Ejercicio2();
                }
                case "3"->{
                    Ejercicio3.Ejercicio3();
                }
                case "4"->{
                    boleanito = false;
                }
            }

        }




    }
}