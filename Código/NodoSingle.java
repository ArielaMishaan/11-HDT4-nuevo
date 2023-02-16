/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase NodoSingle: es el nodo que usa la Single Linked list, con una referencia al siguiente nodo. 
 */

public class NodoSingle<T> {

    //atributos
    private T valor;
    private NodoSingle<T> next;

    //métodos

    /*
     * Constructor del nodo doble
     */
    public NodoSingle(T valor) {
        this.setValor(valor);
    }    

    
    /** 
     * @return T
     * método que sirve para obtener el valor del nodo
     */
    public T getValor() {
        return this.valor;
    }

    
    /** 
     * @param valor
     * método que sirve para cambiar el valor del nodo
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

    
    /** 
     * @return NodoDouble<T>
     * método que sirve para obtener el valor del nodo siguiente.
     */
    public NodoSingle<T> getNext() {
        return this.next;
    }

    
    /** 
     * @param next
     * método que sirve para cambiar el valor del nodo siguiente
     */
    public void setNext(NodoSingle<T> next) {
        this.next = next;
    }
    
}
