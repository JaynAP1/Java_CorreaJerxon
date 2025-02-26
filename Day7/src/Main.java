import Clases.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean boleanito = true;

        while (boleanito) {
            System.out.println("""
                    ======================
                    1).Ejercicio 1.
                    2).Ejercicio 2.
                    ======================
                    """);
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1"->{
                    Motocicleta moto1 = new Motocicleta("Suzuki", "Gn125", "Bajito");
                    moto1.mostrarDetalles();
                    Coche coche1 = new Coche("Toyota", "Hilux", 4);
                    coche1.mostrarDetalles();
                }
                case "2"->{
                    Fijos empleado1 = new Fijos("Jair", 2000 , 8, 2);
                    Fijos empleado2 = new Fijos("Wilmer", 3000 , 10, 1);
                    Horas empleado3 = new Horas("Jose", 1000, 4, 40);
                    Horas empleado4 = new Horas("Yessica", 2000, 7, 50);

                    empleados.add(empleado1);
                    empleados.add(empleado2);
                    empleados.add(empleado3);
                    empleados.add(empleado4);

                    for(Empleado i : empleados){
                        System.out.println(i.calcularBonificacion());
                        System.out.println(i.mostrarInformacion());
                        sc.nextLine();
                    }

                }
            }
        }



    }
}