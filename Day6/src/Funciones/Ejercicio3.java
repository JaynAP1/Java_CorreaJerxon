package Funciones;
import java.util.*;
import Clases.CuentaAhorro;
import Clases.CuentaBancaria;

public class Ejercicio3 {
    public static void Ejercicio3() {
        CuentaBancaria cuenta1 = new CuentaBancaria("12131", 0);
        CuentaAhorro cuentaA1 = new CuentaAhorro(cuenta1.getNumeroCuenta(), cuenta1.getSaldo(), 17);

        Scanner sc = new Scanner(System.in);

        boolean booleanito = true;

        while (booleanito) {
            System.out.println("""
                    1).Deposito.
                    2).Retiro.
                    3).Aplicar intereses.
                    4).Ver cuenta.
                    5).Salir
                    """);
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1"->{
                    System.out.println("Ingrese la cantidad que desea ingresar a la cuenta");
                    double cantidad = sc.nextDouble();
                    cuenta1.depositar(cantidad);
                    sc.nextLine();
                }
                case "2"->{
                    System.out.println("Ingrese la cantidad que desea retirar");
                    double cantidad = sc.nextDouble();
                    cuenta1.retirar(cantidad);
                    sc.nextLine();
                }
                case "3"->{
                    System.out.println("Se aplicaran los intereses a su cuenta, presione enter para continuar");
                    cuenta1.setSaldo(cuentaA1.aplicarIntereses(cuentaA1.getTasa_interes(), cuenta1.getSaldo()));
                    sc.nextLine();
                }
                case "4" ->{
                    cuenta1.mostrarInformacion();
                    sc.nextLine();
                }
                case "5"->{
                    booleanito = false;
                }
            }
        }

    }
}
