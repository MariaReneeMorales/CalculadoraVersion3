//Librerías especiales.
import java.util.Scanner;

//Función de tipo "CalculadoraVersion3".
public class CalculadoraVersion3 {
    //Función suma.
    public static void operarSuma(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación.
        lnResultado = lnValor1 + lnValor2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " + " + lnValor2 + " = " + lnResultado);
    }

    //Función resta.
    public static void operarResta(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación.
        lnResultado = lnValor1 - lnValor2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " - " + lnValor2 + " = " + lnResultado);
    }

    //Funicón multiplicación.
    public static void operarMultiplicacion(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación.
        lnResultado = lnValor1 * lnValor2;
        System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " x " + lnValor2 + " = " + lnResultado);
    }

    //Funicón división.
    public static void operarDivision(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación + Condición para evitar que se divida entre 0.
        if(lnValor2 != 0){
            //Cálculos + Impresión de datos.
            lnResultado = lnValor1 / lnValor2;
            System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " / " + lnValor2 + " = " + lnResultado);
        }
        else{
            System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " / " + lnValor2 + " = Math error... ");
        }
    }

    //Funicón potenciación.
    public static void operarPotenciacion(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación.
        lnResultado = Math.pow(lnValor1, lnValor2);
        System.out.println(" \uD83D\uDD38 El resultado de " + lnValor1 + " ^ " + lnValor2 + " = " + lnResultado);
    }

    //Funicón raíz cuadrada.
    public static void operarRaiz(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación + Evitando que se saqué la raíz de un número negativo.
        if(lnValor1 >= 0 || lnValor2 >= 0){
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnValor1 + " = " + Math.sqrt(lnValor1));
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnValor2 + " = " + Math.sqrt(lnValor2));
        }
        else {
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnValor1 + " = Math error... ");
            System.out.println(" \uD83D\uDD38 La raíz cuadrada de " + lnValor2 + " = Math error... ");
        }
    }

    //Funicón residuo.
    public static void operarResiduo(double lnValor1, double lnValor2){
        //Definición e Inicialización de variables.
        var lnResultado = 0.0;

        //Operación.
        lnResultado = lnValor1 % lnValor2;
        System.out.println(" \uD83D\uDD38 El residuo de " + lnValor1 + " % " + lnValor2 + " = " + lnResultado);
    }

    //Función principal.
    public static void main(String[] args) {
        //Definición e inicialización de variables.
        var lnNumero1 = 0.0;
        var lnNumero2 = 0.0;
        var lnOpcion = 0;
        var lnCount  = 0;
        String laMenuOpciones[] = {"Suma", "Resta", "Multiplicación", "Division", "Potenciación", "Raíz cuadrada", "Residuo de la división", "Acerca de", "Salir"};

        //Definición del scanner.
        Scanner lsDatos = new Scanner(System.in);

        //Ciclo para que se repita n cantidad de veces hasta que el usuario decida salir del programa.
        do{
            //Título + Saltos de línea.
            System.out.println(" ");
            System.out.println(" +===========================================+ ");
            System.out.println(" | C A L C U L A D O R A   V E R S I Ó N   3 | ");
            System.out.println(" +===========================================+ ");
            System.out.println(" ");

            //Menú de opciones + Saltos de línea.
            System.out.println("\n Nuestro menú de opciones es el siguiente: \n");

            //Ciclo para acceder al contenido del arreglo.
            for(lnCount = 0; lnCount <= 8; lnCount++){
                System.out.println(" " + (lnCount + 1) + ". " + laMenuOpciones[lnCount]);
            }

            //Captura de datos.
            System.out.println(" ");
            System.out.print(" ¿Qué opción desea utilizar? (1 - 9): ");
            lnOpcion = lsDatos.nextInt();

            //Condición para determinar cuando se sale del ciclo o no.
            if(lnOpcion > 0 && lnOpcion < 8){
                //Captura de datos + Saltos de línea.
                System.out.println(" ");
                System.out.print(" ✔ Ingrese el primer número: ");
                lnNumero1 = lsDatos.nextDouble();
                System.out.print(" ✔ Ingrese el segundo número: ");
                lnNumero2 = lsDatos.nextDouble();
                System.out.println(" ");

                //Condición múltiple.
                switch(lnOpcion){
                    case 1:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=========* ");
                        System.out.println(" | S U M A | ");
                        System.out.println(" *=========* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarSuma(lnNumero1, lnNumero2);
                        break;

                    case 2:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *===========* ");
                        System.out.println(" | R E S T A | ");
                        System.out.println(" *===========* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarResta(lnNumero1, lnNumero2);
                        break;

                    case 3:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=============================* ");
                        System.out.println(" | M U L T I P L I C A C I Ó N | ");
                        System.out.println(" *=============================* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarMultiplicacion(lnNumero1, lnNumero2);
                        break;

                    case 4:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=================* ");
                        System.out.println(" | D I V I S I Ó N | ");
                        System.out.println(" *=================* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarDivision(lnNumero1, lnNumero2);
                        break;

                    case 5:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=========================* ");
                        System.out.println(" | P O T E N C I A C I Ó N | ");
                        System.out.println(" *=========================* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarPotenciacion(lnNumero1, lnNumero2);
                        break;

                    case 6:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *===========================* ");
                        System.out.println(" | R A Í Z   C U A D R A D A | ");
                        System.out.println(" *===========================* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarRaiz(lnNumero1, lnNumero2);
                        break;

                    case 7:
                        //Subtítulo + Saltos de línea.
                        System.out.println(" ");
                        System.out.println(" *=================================* ");
                        System.out.println(" | R E S I D U O   D I V I S I Ó N | ");
                        System.out.println(" *=================================* ");
                        System.out.println(" ");

                        //Llamamos a la función.
                        operarResiduo(lnNumero1, lnNumero2);
                        break;
                }
            }
            else if(lnOpcion == 8){
                //Título + Saltos de línea.
                System.out.println(" ");
                System.out.println(" *====================* ");
                System.out.println(" | A C E R C A    D E | ");
                System.out.println(" *====================* ");
                System.out.println(" ");

                //Acerca de.
                System.out.println(" — Es una calculadora basada con herramientas de programación más estructuradas, completas y complejas. ");
                System.out.println(" ©2022 María Reneé Academy. All rights reserved.");
            }
            else if(lnOpcion == 9){
                //Rompemos el ciclo.
                break;
            }
            else{
                //En dado caso se pase del rango.
                System.out.println("\n La opción ingresada no es correcta, intente de nuevo... ");
            }
        }while(lnOpcion != 9);
        //Título + Saltos de línea
        System.out.println(" ");
        System.out.println(" \uD83D\uDD39 Gracias por utilizar Calc Advanced! ");
        System.out.println(" ");
    }
}
