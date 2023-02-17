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
     * @param tipoStack
     * @param tipoLista
     * @return Stack
     * método que sirve para fabricar el stack, implementando ya sea el vector, el array list o la lista (esta puede ser single linked list o double linked list)
     */
    public Stack getInstanceStack(int tipoStack, int tipoLista){

        switch(tipoStack){
            case 1: //Stack vector
                this.stack = new StackVector();
                break;

            case 2: //Stack array list
                this.stack = new StackArrayList();
                break;

            case 3: //Stack lista
                switch (tipoLista) {
                    case 1: // single Linked list
                        this.stack = new StackLista(tipoLista);
                        break;

                    case 2: //double linked list
                        this.stack = new StackLista(tipoLista);
                        break;
                
                    default:
                        break;
                }
                break;
            
            default:
                break;
        }

        return this.stack;
    }
    
 }
 