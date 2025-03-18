import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Funciones Lambda
        //Las funciones lambda son funciones o metodos en java que se representaran de manera anonima
        //pues se definen en linea donde se vayan a utilizar. Dichas funciones pueden recibir cero o
        //mas argumentos y devolver uno o ningun valor de retorno.

        //Sintaxis
        //(parametros) -> { cuerpo de la funcion }
        /*/
        parametros: son los valores de entrada de la funcion.
        operador ->: Separa los parametros de la implementacion.
        Cuerpo de la funcion: Es el codigo que se ejecutara.

        Las expresiones lambda solo funcionan con interfaces funcionales, es decir,
        interfaces que tienen un unico metodo abstracto. Algunas interfaces funcionales predefinidadas en java.

        Function <T,R> -> Recibe un argumeto y devuelve un resultado.
        Consumeer <T> -> Recibe un arumento y no devuelve nada.
        Supplier<T> -> No recibe argumentos, pero devuelve un resultado.
        Predicate<T> -> Recibe un argumento y devuelve true o false.

        Consumer es una interfaz funcional que representa una operacion que acaepta un solo argumento
        de entrada. La interfaz Consumer se utiliza comunmente para realizar acciones o efectos secundarios
        sobre un objeto o agregarlo a una coleccion, o cualquier otra poperacion que no requiera devolver un valor.
         */
        Consumer<String>consumidor = Saludo ->{
            String lenguaje = "Java";

            System.out.println(Saludo + " Bienvenid@ a "+ lenguaje + "!");
        };
        consumidor.accept("Pepe");

        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidors = (nombre, saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        consumidors.accept("Pepe", "Hola");

        /*/
        La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar un proveedor de resultados.
        Esta interfaz no toma ningún argumento y produce un resultado de tipo T.
        Es decir, se utiliza cuando se necesita generar o proporcionar un valor,
        pero no se tiene ningún argumento para hacerlo. Se puede pensar en ello como una fábrica
        que suministra datos.
         */

        // Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);

        /*/
        La sintaxis experimenta ciertos cambios con respecto al Java tradicional,
         ya que se evita escribir los tipos de las variables siempre que no surja ambigüedad.
         */
        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };
        String mensaje = "Holiisssss!";
        int longitud = sizeOf.apply(mensaje);
        System.out.println("Longitud del mensaje: "+ longitud);
        /*/
        Predicate es una interfaz funcional que representa una condición o predicado booleano.
        Esta interfaz tiene un único método llamado test que acepta un argumento y devuelve true
        o false según si la condición se cumple o no.Supongamos que se tiene una lista de números
        y se desea filtrar aquellos que son pares utilizando un Predicate.
        */

        Predicate <Integer> esPar = numero -> numero % 2 ==0;
        System.out.println("¿4 es par? : "+esPar.test(4));
        System.out.println("¿4 es par? : "+esPar.test(7));

        /*/

         */
    }
}