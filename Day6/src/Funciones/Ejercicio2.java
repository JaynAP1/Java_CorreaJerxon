package Funciones;

import Clases.Producto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        Producto producto1 = new Producto("1", "Pizza", 2, 5);
        Producto producto2 = new Producto("2","Pan", 3, 2 );
        Producto producto3 = new Producto("3","Torta", 4, 10);

        boolean boleanito = true;
        while (boleanito) {
            System.out.println("""
                =============================
                1).Ver productos.
                2).Vender productos o agregar stock.
                3).Salir.
                =============================
                """);
            String opcion = sc.nextLine();
            switch (opcion){
                case "1"->{
                    System.out.println("===============================");
                    producto1.mostrarinformacion();
                    System.out.println("===============================");
                    producto2.mostrarinformacion();
                    System.out.println("===============================");
                    producto3.mostrarinformacion();
                }
                case "2"->{
                    System.out.println("===============================");
                    producto1.mostrarinformacion();
                    System.out.println("===============================");
                    producto2.mostrarinformacion();
                    System.out.println("===============================");
                    producto3.mostrarinformacion();

                    System.out.println("Escriba el codigo del producto que desea actualizar");
                    String codigo = sc.nextLine();
                    if (codigo.equals(producto1.getCodigo()) ){
                        System.out.println("Para vender un producto coloque la cantidad que el cliente desea en negativo, para aumentar el stock coloque la cantidad en positivo.");
                        int StockAc = sc.nextInt();
                        producto1.actualizarStock(StockAc);

                        producto1.mostrarinformacion();

                        sc.nextLine();
                    } else if (codigo.equals(producto2.getCodigo()) ){
                        System.out.println("Para vender un producto coloque la cantidad que el cliente desea en negativo, para aumentar el stock coloque la cantidad en positivo.");
                        int StockAc = sc.nextInt();
                        producto2.actualizarStock(StockAc);

                        producto2.mostrarinformacion();

                        sc.nextLine();
                    } else if (codigo.equals(producto3.getCodigo()) ) {
                        System.out.println("Para vender un producto coloque la cantidad que el cliente desea en negativo, para aumentar el stock coloque la cantidad en positivo.");
                        int StockAc = sc.nextInt();
                        producto3.actualizarStock(StockAc);

                        producto3.mostrarinformacion();

                        sc.nextLine();
                    }
                    else {
                        System.out.println("Escribe un codigo valido");
                    }
                }
                case "3"->{
                    boleanito = false;
                }
            }
        }


    }
}
