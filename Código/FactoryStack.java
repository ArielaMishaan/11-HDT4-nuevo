/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase FactoryStack: sirve para crear los distintos tipos de Stack, según lo que pida el usuario.
 */

 public class FactoryStack<T> {

    //atributo
    private Stack<T> stack;

    /** 
     * @param tipoStack 1 = stack con vector, 2 = arraylist, 3 = lista
     * @param tipoLista 1 = single linked list, 2 = double linked list
     * @return Stack
     * método que sirve para fabricar el stack, implementando ya sea el vector, el array list o la lista (esta puede ser single linked list o double linked list)
     */
    public Stack<T> getInstanceStack(int tipoStack, int tipoLista){

        switch(tipoStack){
            case 1: //Stack vector
                this.stack = new StackVector<T>();
                break;

            case 2: //Stack array list
                this.stack = new StackArrayList<T>();
                break;

            case 3: //Stack lista
                this.stack = new StackLista<T>(tipoLista);
                break;
            
            default:
                break;
        }

        return this.stack;
    }
    
 }
 