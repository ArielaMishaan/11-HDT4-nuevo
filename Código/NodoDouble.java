/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase NodoDouble: es el nodo que usa la double linked list, con una referencia al objeto anterior y una al siguiente. s
 */

 public class NodoDouble <T>{
    
    //atributos
    private T valor;
    private NodoDouble<T> next;
    private NodoDouble<T> previous;

    //métodos
    /*
     * Constructor del nodo doble
     */
    public NodoDouble(T valor){
        this.setValor(valor);
    }

    /** 
     * @return T
     * método para obtener el valor del nodo
     */
    public T getValor() {
        return this.valor;
    }

    
    /** 
     * @param valor
     * método para cambiar el valor del nodo
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

    
    /** 
     * @return NodoDouble<T>
     * método para obtener el valor del siguiente nodo de la lista
     */
    public NodoDouble<T> getNext() {
        return this.next;
    }

    
    /** 
     * @param next
     * método para cambiar el siguiente nodo de la lista
     */
    public void setNext(NodoDouble<T> next) {
        this.next = next;
    }

    
    /** 
     * @return NodoDouble<T>
     * método para obtener el nodo anterior
     */
    public NodoDouble<T> getPrevious() {
        return this.previous;
    }

    
    /** 
     * @param previous
     * método para cambiar el nodo anterior
     */
    public void setPrevious(NodoDouble<T> previous) {
        this.previous = previous;
    }

}
