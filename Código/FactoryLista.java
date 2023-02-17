/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase FactoryLista: sirve para crear los distintos tipos de lista (double o single linked list), según lo que pida el usuario.
 */

 public class FactoryLista<T> {

    //atributo
    private Lista<T> lista;

    
    /** 
     * @param tipo
     * @return Lista
     * método que sirve para fabricar la lista del tipo que se necesite
     */
    public Lista<T> getInstanceLista(int tipo){
        
        switch(tipo){
            
            case 1: //single linked list
                this.lista = new DoubleLinkedList<T>();
                break;
              
            case 2:
                this.lista = new SingleLinkedList<T>();
                break;

            default:
                break;
        }
        return this.lista;
    }
    
 }
 