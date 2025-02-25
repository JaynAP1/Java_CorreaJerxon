package Funciones;
import java.util.Scanner;

import Clases.Empleado;

public class Ejercicio1 {


    public static void Ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribiras los datos del empleado.");

        System.out.println("Escribe el nombre del empleado:");
        String nombre = sc.nextLine();
        System.out.println("Escribe el id del empleado:");
        int id = sc.nextInt();
        System.out.println("Escribe el salario del empleado:");
        double salario = sc.nextDouble();

        Empleado empleado = new Empleado( nombre, id, salario);

        boolean boleanito2 = true;
        sc.nextLine();

        while (boleanito2) {
            System.out.println("""
                                ======================
                                1).Cambiar nombre.
                                2).Cambiar salario.
                                3).Mostrar informacion.
                                4).Salir.
                                ======================
                                """);
            String opcion2 = sc.nextLine();
            switch (opcion2) {
                case "1"->{
                    System.out.println("Escribe el nuevo nombre");
                    String nombreN = sc.nextLine();
                    empleado.setNombre(nombreN);
                    System.out.println("Nombre cambiado con exito");
                    sc.nextLine();
                }
                case "2"->{
                    System.out.println("Escribe el nuevo salario");
                    double salarioN = sc.nextDouble();
                    empleado.setSalario(salarioN);
                    sc.nextLine();
                }
                case "3"->{
                    empleado.mostrarInformacion();
                    sc.nextLine();
                }
                case "4"->{
                    boleanito2 = false;
                    sc.nextLine();
                }
            }
        }
    }
}
