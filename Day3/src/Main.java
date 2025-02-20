import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean boleanito = true;
        Scanner sc = new Scanner(System.in);

        while (boleanito) {
            sc.nextLine();
            System.out.println("Elije con un numero alguna de las tareas subidas al clasroom:");
            String select = sc.nextLine();

            switch (select) {
                case "1"->{
                    System.out.println("Elige el numero hasta el que deseas contar.");
                    int numero = sc.nextInt();
                    if (numero > 0 ){
                        for (int i = 0; i < numero; i++) {
                            System.out.println(i);
                        }
                    }else{
                        System.out.println("Solo elije numeros positivos");
                    }
                }
                case "2"->{
                    System.out.println("Elige el numero desde el que deseas contar.");
                    int numero = sc.nextInt();
                    if (numero > 0 ){
                        for (int i = numero; i > 0 ; i--) {
                            System.out.println(i);
                        }
                    }
                    else {
                        System.out.println("Solo elije numeros positivos");
                    }
                }
                case "3" ->{
                    System.out.println("Elige el numero al que se le hara la tabla de multiplicar.");
                    int numero = sc.nextInt();
                    if (numero > 0 ){
                        for (int i = 1; i < 11; i++) {
                            System.out.println(numero + " * " + i +" = "+ numero*i);
                        }
                    }
                    else {
                        System.out.println("Solo elije numeros positivos");
                    }
                }
                case "4" ->{
                    System.out.println("Elige el numero al que se le hara la tabla de multiplicar.");
                    int numero = sc.nextInt();
                    if (numero > 0 ){
                        for (int i = 10; i > 0; i--) {
                            System.out.println(numero + " * " + i +" = "+ numero*i);
                        }
                    }
                    else {
                        System.out.println("Solo elije numeros positivos");
                    }
                }
                case "5" ->{
                    for (char car = 'a'; car <= 'z'; car++ ) {
                        System.out.println(car);

                    }
                }
                case "6" ->{
                    for (char car = 'Z'; car >= 'A'; car-- ) {
                        System.out.println(car);

                    }
                }
                case "7" ->{
                    for (int i = 1; i < 101; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
                case "8" ->{
                    for (int i = 1; i < 101; i++) {
                        if(i % 2 != 0){
                            System.out.println(i);
                        }
                    }
                }
                case "9" ->{
                    System.out.println("Elige el numero al que llegara la suma de los numeros.");
                    int numero = sc.nextInt();
                    int numero1 = 0,  numero2 = 1, suma = 1;

                    for (int i = 1; i < numero; i++) {
                        System.out.println(suma);
                        suma = numero1 + numero2;
                        numero1 = numero2;
                        numero2 = suma;
                    }
                }
                case "10" ->{
                    System.out.println("Elige el numero al que llegara la suma de los numeros.");
                    int numero = sc.nextInt();
                    int numero1 = 0, suma = 0;

                    for (int i = 1; i < numero ; i++) {
                        if (i % 2 == 0){
                            System.out.println(suma);

                            numero1 = i;

                            suma += numero1;

                        }
                    }
                }
                case "11" ->{
                    System.out.println("Elige el numero al que llegara la suma de los numeros.");
                    int numero = sc.nextInt();
                    int numero1 = 0, suma = 0;

                    for (int i = 1; i < numero ; i++) {
                        if (i % 2 != 0){
                            System.out.println(suma);
                            numero1 = i;
                            suma += numero1;

                        }
                    }
                }
                case "12" ->{
                    for (char car = ' '; car <= '~'; car++ ) {
                        System.out.println("El caracter ascii es: "+ (int)car + " y su simbolo es : "+ car);
                    }
                }
                case "13" ->{
                    System.out.println("Elige el numero al que llegara el factorial del numero.");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    int factorial = 1;
                    for (int i = 2; i <= numero ; i++) {
                        factorial *= i;
                    }
                    System.out.println(factorial);
                }
                case "14" ->{
                    System.out.println("Escribe el numero que se potenciara");
                    int numero = sc.nextInt();
                    System.out.println("Escribe el numero por el que se potenciara");
                    int result = numero;
                    int numer2 = sc.nextInt();
                    for (int i = 1; i < numer2; i++) {
                        result *=  numero;

                    }
                    System.out.println(result);
                }
                case "15" ->{
                    System.out.println("Escribe el numero que se invertira");
                    String numero = sc.nextLine();
                    if (numero.length() > 1){
                            for (int i = numero.length()-1; i > -1; i--) {
                                System.out.print(numero.charAt(i));
                            }
                        sc.nextLine();
                    }else {
                        System.out.println("El numero debe tener mas de un digito");
                    }

                }
                case "16" ->{
                    System.out.println("Escribe el numero que se sumara");
                    String numero = sc.nextLine();
                    int suma = 0;
                    if (numero.length() > 1){
                        for (int i = 0 ; i < numero.length(); i++) {
                            suma += Integer.parseInt(String.valueOf(numero.charAt(i)));
                        }
                        System.out.println(suma);
                        sc.nextLine();
                    }else {
                        System.out.println("El numero debe tener mas de un digito");
                    }
                }
                case "17" ->{
                    System.out.println("Escribe el numero que averiguara si es primo");
                    int numero = sc.nextInt();
                    int contador = 0;
                    for (int i = 1; i < numero+1 ; i++) {
                        if (numero % i == 0) {
                            contador++;
                        }
                    }
                    System.out.println(contador);
                    if (contador == 2){
                        System.out.println("El numero es primo");
                    }else {
                        System.out.println("El numero no es primo");
                    }
                }
                case "18" ->{
                    System.out.println("Escribe el primer numero para averiguar su mcd");
                    int numero1 = sc.nextInt();
                    System.out.println("Escribe el segundo numero para averiguar su mcd");
                    int numero2 = sc.nextInt();

                }
                case "19" ->{
                    
                }
            }

        }
    }
}