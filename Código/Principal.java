import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Principal: clase que interactúa con el usuario
 */

 public class Principal{
    public static void main(String[] args) {


        Archivo archivo = new Archivo("./datos.txt");
        ArrayList<String> lineasDatos = archivo.leerArchivo();

        Calculadora calculadora = Calculadora.getInstance();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        String menu = "\n°°°°°°°°°°°°°°°°°°° CALCULADORA DE EXPRESIONES INFIX °°°°°°°°°°°°°°°°°°°°\n";
        menu = menu + "\n\nSeleccione el tipo de stack con el que quiere que se calcule la expresión: ";
        menu = menu + "\n\n1. Stack utilizando vectores\n2. Stack utilizando ArrayList \n3. Stack utilizando lista.\n4. Salir";

        while(opcion >= 0 && opcion < 4 ){
            try {
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();
                
                switch (opcion) {
                    case 1: //vector

                        System.out.println("\nResultado calculado con un stack hecho de listas: ");
                        
                        for (String fila : lineasDatos) {
                            ArrayList<String> oneLine = new ArrayList<String>();
                            String [] lineaSeparada = fila.split(" ");
                            for (String caracter : lineaSeparada) {
                                oneLine.add(caracter);
                            }
                            
                            try {
                                System.out.println("Resultado: " + calculadora.Calculate(oneLine, 1, 0));


                            } catch (Exception e) {
                                System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                            }
                        }
                        break;

                    case 2: // arraylist
                        for (String fila : lineasDatos) {
                            ArrayList<String> oneLine = new ArrayList<String>();
                            String [] lineaSeparada = fila.split(" ");
                            for (String caracter : lineaSeparada) {
                                oneLine.add(caracter);
                            }
                            
                            try {
                                System.out.println("Resultado: " + calculadora.Calculate(oneLine, 2, 0));


                            } catch (Exception e) {
                                System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                            }
                        }
                        break;

                    case 3: // lista

                        System.out.println("\n¿De qué tipo quiere que sea la lista utilizada?");
                        System.out.println("1. Single Linked List\n2. Double Linked List");
                        int opcionLista = teclado.nextInt();
                        teclado.nextLine();

                        if(opcionLista!=1 && opcionLista!=2){
                            System.out.println("Ingrese un número valido");

                            boolean entradaIncorrecta = true;
                            while(entradaIncorrecta){
                                System.out.println("\n1. Single Linked List \n2. Double Linked List");
                                opcionLista = teclado.nextInt();
                                teclado.nextLine();

                                if(opcionLista ==1 || opcionLista ==2){
                                    entradaIncorrecta = false;
                                }

                                else{
                                    System.out.println("Ingrese un numero valido");
                                }
                            }

                            switch (opcionLista) {
                                case 1: //Single linked list
                                    for (String fila : lineasDatos) {
                                        ArrayList<String> oneLine = new ArrayList<String>();
                                        String [] lineaSeparada = fila.split(" ");
                                        for (String caracter : lineaSeparada) {
                                            oneLine.add(caracter);
                                        }
                                        
                                        try {
                                            System.out.println("Resultado: " + calculadora.Calculate(oneLine, 3, 1));
            
            
                                        } catch (Exception e) {
                                            System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                                        }
                                    }
                                    break;
                            
                                case 2: //Double Linked List
                                    for (String fila : lineasDatos) {
                                        ArrayList<String> oneLine = new ArrayList<String>();
                                        String [] lineaSeparada = fila.split(" ");
                                        for (String caracter : lineaSeparada) {
                                            oneLine.add(caracter);
                                        }
                                        
                                        try {
                                            System.out.println("Resultado: " + calculadora.Calculate(oneLine, 3, 2));
            
            
                                        } catch (Exception e) {
                                            System.out.println("No se pudo realizar la operación, revise archivo de entrada");
                                        }
                                    }
                                    break;
                                
                                default:
                                    break;
                            }
                        }
                        break;
                    
                    case 4:
                        System.out.println("\nGracias por utilizar el servicio.");
                        break;

                    default:
                        break;
                }

            } catch (Exception e) {
                // TODO: handle exception
                teclado.nextLine();
                System.out.println("\nEntrada incorrecta. Verificar que el tipo de dato ingresado sea el solicitado.");
                System.out.println();
            }
        }

    }
}