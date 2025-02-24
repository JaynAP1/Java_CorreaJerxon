package poosalud;

import Clases.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PooSalud {

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fechaActual = String.valueOf(LocalDate.now());

        ArrayList<Pacientes> pacientes = new ArrayList<>();
        ArrayList<Doctor> doctores = new ArrayList<>();
        ArrayList<Hospital> hospitales = new ArrayList<>();
        ArrayList<Pabellon> pabellons = new ArrayList<>();
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Enfermera> enfermeras = new ArrayList<>();
        ArrayList<Administrativo> administrativos = new ArrayList<>();

        Pacientes Paciente1 = new Pacientes(1,"Jerxon Jair Correa Amaris", fechaActual, "2003-05-11", 1,1 );
        Doctor Doctor1 = new Doctor(1, "Jose Maldonado", "Señor", "No tiene", "Dinamita", "2012-07-12");
        Hospital Hospital1 = new Hospital(1, "Xayeh", 1000, 700);
        Pabellon Pabellon1 = new Pabellon(1, "Quemaduras", 200, 1);
        Departamento Departamento1 = new Departamento(1, "Enfermeria", 10, 1);
        Enfermera Enfermera1 = new Enfermera(1 , "Maria Jose","2012-07-12" );
        Administrativo Administrativo1 = new Administrativo(1, "Jose Carmen", "2012-07-12");

        doctores.add(Doctor1);
        pacientes.add(Paciente1);
        hospitales.add(Hospital1);
        pabellons.add(Pabellon1);
        departamentos.add(Departamento1);
        enfermeras.add(Enfermera1);
        administrativos.add(Administrativo1);

        boolean boleanito = true;

        while (boleanito){
            System.out.println("""
                ============================
                1). Ver pacientes.
                2). Ver doctores.
                3). Ver hospitales.
                4). Ver pabellones.
                5). Ver departamentos.
                6). Ver enfermeras.
                7). Ver administrativos.
                8). Cerrar.
                ============================
                """);

            String Seleccion = sc.nextLine();

            switch (Seleccion) {
                case "1" ->{
                    limpiarConsola();

                    System.out.println(pacientes);

                    sc.nextLine();

                }
                case "2" ->{
                    limpiarConsola();

                    System.out.println(doctores);

                    sc.nextLine();
                }
                case "3" ->{
                    limpiarConsola();

                    System.out.println(hospitales);

                    sc.nextLine();
                }
                case "4" ->{
                    limpiarConsola();

                    System.out.println(pabellons);

                    sc.nextLine();
                }
                case "5" ->{
                    limpiarConsola();

                    System.out.println(departamentos);

                    sc.nextLine();
                }
                case "6" ->{
                    limpiarConsola();

                    System.out.println(enfermeras);

                    sc.nextLine();
                }
                case "7" ->{
                    limpiarConsola();

                    System.out.println(administrativos);

                    sc.nextLine();
                }
                case "8" ->{
                    boleanito = false;
                }
            }
        }




    }
    
}
