/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase NodoSingle: es el nodo que usa la Single Linked list, con una referencia al siguiente nodo. 
 */

 public class NodoSingle <T>{
    
    //atributos
    protected T valor;
    private NodoSingle<T> next;

    //métodos

    public NodoSingle(T valor, NodoSingle<T> next){
        this.setValor(valor);
        this.next = next;
    }

    public NodoSingle(T valor){
        this(valor, null);
    }

    public NodoSingle(){
        this(null, null);
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
     * @return NodoSingle<T>
     * método para obtener el valor del siguiente nodo
     */
    public NodoSingle<T> getNext() {
        return this.next;
    }

    
    /** 
     * @param next
     * método para cambiar el valor del siguiente nodo
     */
    public void setNext(NodoSingle<T> next) {
        this.next = next;
    }
}
 