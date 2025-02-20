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
                    
                    while(numero2 != 0){
                        int numero3 = numero2;
                        numero2 = numero1 % numero2;
                        numero1 = numero3;
                    }
                    System.out.println("El mcd de esos numeros sera: " + numero1);

                }
                case "19" ->{
                    System.out.println("Escribe la cantidad de numeros que vas a ingresar");
                    int cantidad= sc.nextInt();
                    ArrayList<Integer> numeros = new ArrayList<>();
                    
                    int contador1 = 0;
                    int contador2 = 0;
                    int contador3 = 0;
                    
                    for(int i = 0; i < cantidad; i++){
                        numeros.add(sc.nextInt());
                    }
                    
                    for(int i = 0; i < numeros.size();i++){
                        System.out.println(numeros.get(i));
                        if(numeros.get(i) >0){
                            contador1++;
                        }
                        else if(numeros.get(i) < 0){
                            contador2++;
                        }
                        else{
                            contador3++;
                        }
                    }
                    System.out.println("El total de ceros es de: " +contador3+ " y el total de numeros positivos es de: "+ contador1 + " y el total de negativos es de:  " + contador2);
                    
                }
                case "20" ->{
                    System.out.println("Escribe la cantidad de numeros que vas a ingresar");
                    int cantidad= sc.nextInt();
                    ArrayList<Integer> numeros = new ArrayList<>();
                    
                    int contador1 = 0;
                    int contador2 = 0;
                    int contador3 = 0;
                    
                    for(int i = 0; i < cantidad; i++){
                        numeros.add(sc.nextInt());
                    }
                    
                    Collections.sort(numeros);
                    
                    System.out.println("El primer numero es: " + numeros.get(0) + " el utlimo numero es: " + numeros.get(numeros.size()-1));
                    
                }
                case "21" ->{
                    
                    int suma = 0;
                    
                    for (int i = 100; i < 201; i++){
                        if (i % 9 == 0){
                            System.out.println("Numero divisible por 9: "+i);
                            suma += i;
                        }
                        System.out.println("Suma total: "+ suma);
                    }
                }
                case "22" ->{
                    System.out.println("Escribe el numero binario que deseas convertir");
                    String NumeroBinario = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(NumeroBinario,2);
                    
                    System.out.println("El numero decimal es: " + Decimal);
                }
                case "23" ->{
                    System.out.println("Escribe el numero que desea saber si es fuerte");
                    String NumeroFuerte = sc.nextLine();
                    int save = 0;
                    
                    
                    for(int i = 0; i < NumeroFuerte.length(); i++){
                        int numero = Character.getNumericValue(NumeroFuerte.charAt(i));
                        int factorial =1;
                        
                        for (int j = 1; j <= numero ; j++) {
                        factorial *= j;
                        }
                        save+=factorial;
                        
                    }
                    if (save == Integer.parseInt(NumeroFuerte)) {
                            System.out.println("El numero "+ save+ " es fuerte");
                        }
                    else{
                        System.out.println("El numero no es fuerte");
                    }
                   
                }
                case "24" ->{
                    System.out.println("Escribe el numero hexadecimal");
                    String Hexadecimal = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Hexadecimal, 16);
                    
                    System.out.println(Decimal);
                }
                case "25" ->{
                    System.out.println("Escribe el numero hexadecimal");
                    String Hexadecimal = sc.nextLine();
                    
                    String octal = Integer.toOctalString(Integer.parseInt(Hexadecimal, 16));
                    
                    System.out.println(octal);
                }
                case "26" ->{
                     System.out.println("Escribe el numero hexadecimal");
                    String Hexadecimal = sc.nextLine();
                    
                    String Binario = Integer.toBinaryString(Integer.parseInt(Hexadecimal, 16));
                    
                    System.out.println(Binario);
                }
                case "27" ->{
                    System.out.println("Escribe el numero decimal");
                    int Decimal = sc.nextInt();
                    
                    String Hexadecimal = Integer.toHexString(Decimal).toUpperCase();
                    
                    System.out.println(Hexadecimal);
                }
                case "28" ->{
                    System.out.println("Escribe el numero decimal");
                    int Decimal = sc.nextInt();
                    
                    String Octal = Integer.toOctalString(Decimal);
                    System.out.println("El numero octal es: " + Octal);
                }
                case "29" ->{
                    System.out.println("Escribe el numero decimal");
                    int Decimal = sc.nextInt();
                    
                    String Binario = Integer.toBinaryString(Decimal);
                    System.out.println("El numero binario es: "+ Binario);
                }
                case "30" ->{
                    System.out.println("Escribe el numero binario");
                    String Binario = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Binario, 2);
                    
                    String Octal = Integer.toOctalString(Decimal);
                    
                    System.out.println("El numero octal es: "+ Octal);
                   
                }
                case "31" ->{
                    System.out.println("Escribe el numero binario");
                    String Binario = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Binario, 2);
                    
                    System.out.println("El numero decimal es: " + Decimal);
                }
                case "32" ->{
                    System.out.println("Escribe el numero binario");
                    String Binario = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Binario, 2);
                    
                    String Hexadecimal = Integer.toHexString(Decimal).toUpperCase();
                    
                    System.out.println("El numero hexadecimal es: "+ Hexadecimal);
                }
                case "33" ->{
                    System.out.println("Escribe el numero octal");
                    String Octal = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Octal, 8);
                    
                    String Binario = Integer.toBinaryString(Decimal);
                    
                    System.out.println("El numero binario es " + Binario);
                }
                case "34" ->{
                    System.out.println("Escribe el numero octal");
                    String Octal = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Octal, 8);
                    
                    System.out.println("El numero decimal es: " + Decimal);
                }
                case "35" ->{
                    System.out.println("Escribe el numero octal");
                    String Octal = sc.nextLine();
                    
                    int Decimal = Integer.parseInt(Octal, 8);
                    
                    String Hexadecimal = Integer.toHexString(Decimal);
                    
                    System.out.println("El numero hexadecimal es: "+ Hexadecimal);
                }
                case "36" ->{
                   System.out.println("Elige el numero al que se le hara el complemento a 1");
                    int numero = sc.nextInt();
                    
                    System.out.println("El complemento a 1 del numero: "+ numero + " es: "+ ~numero);
                }
                case "37" ->{
                    System.out.println("Escribe un programa para encontrar el complemento a 2 de un número binario en Java.");
                }
                case "38" ->{
                    System.out.println("Elige el numero al que llegara la serie de fibonacci.");
                    int numero = sc.nextInt();
                    int numero1 = 0,  numero2 = 1, suma = 1;

                    for (int i = 1; i < numero; i++) {
                        System.out.println(suma);
                        suma = numero1 + numero2;
                        numero1 = numero2;
                        numero2 = suma;
                    }
                }
                case "39" ->{
                    for(int k = 1; k < 100000; k++  ){
                        String NumeroFuerte = String.valueOf(k);
                        int save = 0;
                    
                    
                    for(int i = 0; i < NumeroFuerte.length(); i++){
                        int numero = Character.getNumericValue(NumeroFuerte.charAt(i));
                        int factorial =1;
                        
                        for (int j = 1; j <= numero ; j++) {
                        factorial *= j;
                        }
                        save+=factorial;
                        
                    }
                    if (save == Integer.parseInt(NumeroFuerte)) {
                            System.out.println("El numero "+ save+ " es fuerte");
                        }
                    }
                }
                case "40" ->{
                        for (int k = 1; k <10000 ; k++){
                            int suma = 0;

                            for(int i = 1; i < k; i++){
                                if(k % i == 0){
                                    suma+=i;
                                }
                            }
                            if(k == suma){
                                System.out.println("Es un numero perfecto" + k);
                             }
                          }
                }
                case "41" ->{
                    System.out.println("Ingrese el numero que desea saber si es perfecto");
                    int k = sc.nextInt();
                    int suma = 0;

                            for(int i = 1; i < k; i++){
                                if(k % i == 0){
                                    suma+=i;
                                }
                            }
                            if(k == suma){
                                System.out.println("Es un numero perfecto " + k);
                             }
                            else{
                                System.out.println("No es un numero perfecto " + k);
                            }
                }
                case "42" ->{
                    for(int k = 1; k < 1000 ; k++){
                        String armstrong = String.valueOf(k);
                        int save = 0;
                    
                    
                    for(int i = 0; i < armstrong.length(); i++){
                        int numero = Character.getNumericValue(armstrong.charAt(i));
                        int factorial =1;
                        
                        for (int j = 1; j <= armstrong.length() ; j++) {
                        factorial *= numero;
                        }
                        save+=factorial;
                    }
                    
                    if (save == Integer.parseInt(armstrong)) {
                            System.out.println("El numero "+ save+ " es un armstrong");
                        }
                    }
                }
                case "43" ->{
                    System.out.println("Ingrese el numero que desea saber si es armstrong");
                    String armstrong = sc.nextLine();
                    
                    int save = 0;
                    
                    
                    for(int i = 0; i < armstrong.length(); i++){
                        int numero = Character.getNumericValue(armstrong.charAt(i));
                        int factorial =1;
                        
                        for (int j = 1; j <= armstrong.length() ; j++) {
                        factorial *= numero;
                        }
                        save+=factorial;
                    }
                    
                    if (save == Integer.parseInt(armstrong)) {
                            System.out.println("El numero "+ save+ " es un armstrong");
                        }
                    else{
                        System.out.println("El numero no es un armstrong");
                    }
                    
                }
                case "44" ->{
                    System.out.println("Ingrese un numero para sacar sus factores primos");
                    int numero = sc.nextInt();
                    
                    int num = 2;

                    while(numero!=1) {
                         while(numero%num==0) {
                              System.out.println(num);
                              numero /= num;
                         }
                    }
                }
                   
            }

        }
    }
    
}