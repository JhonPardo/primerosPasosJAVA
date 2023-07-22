package paquetePruebas;
import java.lang.*;

class SumaNumeros {
    public int suma(int a, int b){
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        byte numero1 = 127;  /* 1 byte */
        short valor = 32000;  /* 2 bytes */
        int valor2 = 2147483647;  /* 4 bytes */
        long valor3 = 9000000000000000000L; /* 8 bytes especificar con una L al final mayuscula cuando sea un tipo long  */
        float valor4 = 235.678F; /* 4 bytes especificar con una F el valor float */
        double valor5 = 235.6565656656; /* 8 bytes */
        char letra = 'a'; /* 2 bytes, solo una letra o simbolo puede ser cualquiera */
        /* bolean =  true or false  */

        /* las constantes siempre comienza con la palabra final y solo puede tener un
        VALOR los nombres de las constantes siempre en mayuscula */
        final double PI = 3.14161821232527;
        final double DOLAR;
        DOLAR = 4999.9999999;

        /* OPERADORES MATEMATICOS */
        int  numero10 = 10;
        int numero20 = 50;
        int resultado1 = numero10 + numero20;
        int resultado2 = numero10 - numero20;
        int resultado3 = numero10 * numero20;
        int resultado4 = numero10 / numero20;

        //operadores de comparacion buleanos
        boolean comparacion = 20>10; //20 es mayor de 10 true
        boolean comparacion2 = 20<10; // 20 es menos de 10 false
        // ejercicio con valiables
        byte numero2 = 50;
        byte numero3 = 70;
        boolean comparacion3 = numero2 > numero3; // 50 es mayor de 70 result false
        boolean comparacion4 = numero2 >=  numero3; // 50 es mayor o gual a 70 false
        boolean comparacion5 = numero2 <= numero3; // 50 es menor o igual a 70 true
        boolean comparacion6 = numero2 == numero3; // 50 es igual a 70 false
        boolean comparacion7 = numero2 != numero3; // 50 es diferente que 70 true


        /* bloques de codigo en java empieza con { y cierra con }
         metodo es un bloque de codigo que esta dentro de la clase
         ejemplo
         public class Main <-- esta es la clase y sera el nivel superior  {
            public static void main(String[] args) <--- este es el metodo y  siempre estara dentro de la clase son mini programamas necesarios para intruccion u otros bloques de codigo {
                int  numero10 = 10;
                int numero20 = 50;
                int resultado = numero10 + numero20;
                if ( resultado > 50 ){    // estos son bloques de nivel inferior y deben ir dentro de un metodo se inicia en { y termina en }
                    System.out.print("El resultado de la suma es: " + resultado );
                }
                for(int x = 0; x <= 10; x++){
                    system.out.println("El valor es "+ x )
                }

    }
}
         */

        //estructuras de control de flujo (condicionales if) se escribe asi if(condicion){ bloque de codigo si es true }
        // else if se utiliza si es true igualmente y else si es false
        int numero11 = 11;
        int numero12= 12;
        int numero13 = 11;

        //condicional if y else
        if (numero11 < numero12) {
            System.out.println("esto es verdaderon.");
        }else if (numero11 == numero13) {
            System.out.println("verdadero los numero son iguales. ");
        }else {
            System.out.println("esto es falso.");
        }

        /* condicional switch es una estructura condicional como if else pero
        este tiene una sola expresion y se evaluan una serie de selectores de codigo diferente a los selectores
        su sintasis es asi: switch(){ caso valor1: instrucciones del codigo break para cerrar y default para cuando ningun case
        coincidan;}
         */

        int error = 100;

        //condicional switch
        switch (error){
            case 200:
                System.out.println("todo correcto.");
                break;
            case 301:
                System.out.println("movimiento permanente de la pagina.");
                break;
            case 302:
                System.out.println("movimiento temporal de la pagina.");
                break;
            case 404:
                System.out.println("Pagina no encontrada.");
                break;
            case 500:
                System.out.println("Error de la pagina.");
                break;
            case 583:
                System.out.println("Servicio no disponible");
                break;
            default:
                System.out.println("Codigo de error de disponibilidad");

        }

        /* BUCLE WHILE son estructuras de control de codigo y estan diseñados para repetir bloque de codigo
        su sintaxis es interador;   while(conducion){ // bloque de codigo incremento o decremento }
         */


        int b = 10; // i significa iterador o valor inicial

        while (b > 0) {
            System.out.println(" el valor es " + b );
            b--;
        }

        //BLoque do while a diferencia de while do while siempre se ejecuta si es false o true
        int a = 15;
        do{
            System.out.println("El valor es: " + a);
        }while (a < 10);

        /* bucle for es igual que el while pero en for sabemos cuantas veses se va
        a ejecutar el bucle se escribe asi for ( inicializador; condicion de salida; iteracion) { // bloque de codigo}
        */
        for(int i = 0; i < 5; i++){  // i inicia en 0 y mientras i sea menos de 5 i se incrementa
            System.out.println("el valor es " + i);
        }
        /* programaciónn orientada a objetos//  se basa en objetos y clases los objetos son entidades que conbinan objetos
        y comportamientos - tinen atributos que describen como son y metodos que les
        permiten realizar acciones- se utilizan clases para crear estos objetos y se crean objetos apartir de dichas clases
        las clases son plantillas con una estructura general las cuales sirven para crear objetos
        ventajas= reutilizar codigo, extencibilidad(se puede agregar cosas), modularidad(dividir el codigo para mejorar el
        desarrollo, la depuracion y el mantenimiento del codigo) mejora el diseño y promuebe buenas practicas de diseño
        desventajas= mayor tiempo de ejecucion, mayor uso de memoria , mayoe complejidad a la hora de programar
        */

        /* sintaxis
        modificadorDeAcceso class nombreDeLaClase {
        // atributo de la clase
        // constructores de la clase
        // métodos de la clase
        }
         */


        /* re asignacion de variables
        usuario2.nombre = "fredy";
        usuario2.apellidos = "cifuentes";

        System.out.println(usuario1.nombre);
        System.out.println(usuario1.apellidos);
        System.out.println(usuario2.nombre);
        System.out.println(usuario2.apellidos);
        */
        /* metodo de una clase son boques de codigo que pertenecen a una clase y
        se pueden ejecutar cuando querramos y se les pueden pasar argumentos */

        /* encapsulacion pemite controlar los datos o metodos dentro de los objetos
        public= se puede aceder desde cualquier parte del codigo
        private= solo esta disponible en el clase que se llama ni archivos ni paquetes tienen acceso
        protectic
        cuando no se asigna ni public o private queda por default
        defoult private-paquet= se asigna si no se poner nada .. y solo se puede utilizar dentro
        del mismo paquete
         */

        /* PAQUETES EN JAVA permite agrupar clases realacionadas en ellos y permite organizar el codigo y
        evitar conflitos con nombres repetidos ademas permite utilizar los modificadores de acceso para
        controlar el alcanse de las clases y metodos en nuestros paquetes se declara al principio del codigo
        con la palabra recervada packege simpre tiene que estar dentro de la carpeta raiz (src)
         */

        /* VOID Y PRINT el void se utiliza para los metodos en java que no devuelven ningun valor solo para print
        para devolver un valor al programa se utiliza un return
         */

        SumaNumeros suma1 = new SumaNumeros();
        int operacion = suma1.suma(10,7);
        System.out.println("El resultado de la operacion es : " + operacion);


        /* herencia de clases permite que una clase herede los atributos y metodos de otra clase de esta manera
        se pueden crear clases nuevas que comprarten caracteristicas con otras ta existentes esto evita diplicar el codigo
         */

        /* COMVERSION DE DATOS IMPLISITA Y EXPLISITAS (se hacen manejodar mejor los datos cuando sea necesario)
        IMPLISITA (promocion de tipos apcasting o conversion aotomatica) se produce cuando java hace automaticamente un tipo
        de dato a otro
        EXPLISITAS (conversion manual,) es cuando la conversion la hacemos nosotros y forzamos el dato o resultado
         */

        /*Strings (o secuencia de caracteres)
        y cada caracter ocupa un espacio de memoria
        ----concatenacion de caracteres----

        ---primera forma----
        String texto = texto1 + "" + texto3;

        ---segunda forma----
        String texto3 = texto1.concat("").concat(texto2);

        -- ARRAY--
        UN array o areglo es una estructura de datos que alcenan una coleccion de alementos de mismo tipo
         los arrays tiene un tamaño fijo y se definen en su creacion cada elemento del array se puede acceder
         mediante un indice numerico que representa su pocision en el array

         int[] numero = new int[4]  // es como una variable normal pero con cuatro espacios
         numero[0] = 10;
         */

        /*EXCEPTION un evento o error que ocurre durante la ejecucion del programa
        se dividen en dos tipos comprobadas o no comprovadas
        COMPROVADAS son los tipos de errores que el compilador de java
        sabe que van a ocurrir si no se corrigen el programa no funcionara
        NO COMPROVADAS son las que el compilador de java no sabe que van a ocurrir
        pueden ocurrir durante la ejecucion de programa
        PROPAGACION DE UNA excepción se refiere al proceso trasferir el proceso de la
        excepción a otro lugar del codigo donde pueda ser manejada
         */

    }
}

