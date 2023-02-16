/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase FactoryStack: sirve para crear los distintos tipos de Stack, según lo que pida el usuario.
 */

 public class FactoryStack<T> {

    //atributo
    Stack<T> stack;
    FactoryLista<T> fabricaLista = new FactoryLista<T>();

    public Stack getInstanceStack(int tipo){

        switch(tipo){
            case 1: //Stack vector
                this.stack = new StackVector();
                break;

            case 2: //Stack array list
                this.stack = new StackArrayList();
                break;

            case 3: //Stack lista
                 
                break;
        }

        return this.stack;
    }
    
 }
 