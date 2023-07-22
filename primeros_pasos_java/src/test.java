import paquetePruebas.Usuarios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test {
        public static void main(String[]args){
        Usuarios usuario1 = new Usuarios("jhon", "pardo Cifuentes", "cll 34a sur n 99 a 45", "+57-3102164420", 32); // new Usuario es el constructor
        Usuarios usuario2 = new Usuarios("lix", "bru", "cra 3 n 15-85", "+57-3014621758", 27);
        //Usuarios Usuario3 = new Usuarios.Empleado("martha", "Cardona");

        usuario1.nombre = "Veronica";

        usuario1.mostrarDatos();
        usuario2.mostrarDatos();
        //Usuario3.mostrarDatos(true);

            int numero36 = 36;
            double numero85 = 85.252;
            double numeroMayor = (double) Math.max(numero85, numero36);
            System.out.println("el numero mayor es: " + numeroMayor);

            //arrays
            int[] numeros = new int[4];
            numeros[0] = 10;
            numeros[1] = 20;
            numeros[2] = 30;
            numeros[3] = 40;
            System.out.println("el valor del array en la primera posicion es: " + numeros[0] );

            /*tambien se puede expresar asi */
            int[] list = {11,22,33,44};
            System.out.println("el valor del array en la primera posicion es: " + list[1] );

            //para reasignar algun valor de array
             list[1] = 4000;
            System.out.println("el valor del array en la primera posicion es: " + list[1] );

            //interación con arrays
            for (int numero : list) {
                System.out.println("for el valor de list = " + numero + ".");
            }
            // ordenar los datos por orden numerico con Arrays.sort();
            int[] numeroDesordenados = {125,7,5,100};
            Arrays.sort(numeroDesordenados);

            for (int numeroDesorden: numeroDesordenados) {
                System.out.println("for el valor de list = " + numeroDesorden + ".");
            }

            // ordenar los datos por orden numerico a la inversa ();
            Integer [] numeroinvertidos = {125,7,5,100};
            Arrays.sort(numeroinvertidos, Collections.reverseOrder());

            for (int i: numeroinvertidos) {
                System.out.println("for el valor de list = " + i + ".");
            }

            // buscar valores en arrays
            int[] numeross = {125,7,5,100};

            int indice = Arrays.binarySearch(numeross,0 );
            System.out.println("en la posicion 3 esta el valor  = " + indice);

            // ARRAYS CON String
            String[] colores = {"rojo", "verde"};
            System.out.println("el color 1 es  = " + colores[0]);

            //paso de valores por consola con el import java.util.Scanner;
             Scanner entrada = new Scanner(System.in); // intanciamos un objeto del Scanner llamado entrada para que lea
            // el valor pasado por consola

            //imprimimos un mensaje para que el usuario sepa que tiene que imprimir en la consola
             System.out.println("cual es tu nombre?");
             //se crea una variable llamada nombre con un metodo llamado nextLine que almacena el texto escrito en la consola
             String nombre = entrada.nextLine();

             // emprimos el mensaje final con el valor ya guardado de nombre en la consola
             System.out.println("hola, " + nombre + " . ");

             //calculadora en consola
            Scanner calculadora = new Scanner(System.in);
            System.out.println("Ingresa el primer numero : " );
            int valor1 = calculadora.nextInt();
            System.out.println("Ingresa el segundo numero : ");
            int valor2 = calculadora.nextInt();
            int result = valor1 + valor2;
            System.out.println("El Resultado de la suma de " + valor1 + " y "+ valor2 + " es " + result);

            //calculadora en consola con valor Float
            Scanner calculadora2 = new Scanner(System.in);
            System.out.println("Ingresa el primer numero : " );
            float valorr1 = calculadora2.nextFloat();
            System.out.println("Ingresa el segundo numero : ");
            float valorr2 = calculadora2.nextFloat();
            float results = valorr1 + valorr2;
            System.out.println("El Resultado de la suma de " + valorr1 + " y "+ valorr2 + " es " + results);

            //entrada por consola de arrays
            Scanner entradass = new Scanner(System.in);   //esta es la entrada el System.in es para la entrada por teclado
            System.out.println("Cuantos numeros quiere ingresar? ");  // este es el mensaje de bienvenida
            int cantidad = entradass.nextInt();     // se almacena en una variable el volor del bucle que sera pasado por consola
            int[] numerosss = new int[cantidad];     // se crea el array con la variable que se pasara por consola
            for(int i = 0; i < cantidad; i++ ) {       // se inicia el bucle con el limite del valor de cantidad
                System.out.println("Ingresa el numero " + ( i + 1) + ": ");   // se imprime por con el valor + 1 para quitar el 0 la consola
                numerosss[i]= entradass.nextInt(); // se guarda la camtidad de numeros del interador (i) enviados por consola
            }
            System.out.println("Los valores ingresados son:");
            for(int numero: numerosss){  //en el for imprimos el valor de numeross asignado a numero
                System.out.println(numero);
            }


    }
}