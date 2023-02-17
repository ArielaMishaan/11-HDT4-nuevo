import java.util.Vector;

/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase StackVector: es un Stack hecho de un vector.
 */

 public class StackVector<T> extends Stack<T>{

    private Vector<T> listaInterna = new Vector<T>();

    
    /** 
     * @return int
     * retorna la cantidad de elementos de la lista
     */
    @Override
    public int count() {
        // TODO Auto-generated method stub
        return listaInterna.size();
    }

    
    /** 
     * @return boolean
     * retorna true si la lista está vacía y false si tiene elementos
     */
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return listaInterna.isEmpty();
    }

    
    /** 
     * @param valor
     * inserta un elemento al stack
     */
    @Override
    public void push(T valor) {
        // TODO Auto-generated method stub
        listaInterna.add(0, valor);
    }

    
    /** 
     * @return Object
     * saca el último elemento del stack
     */
    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return listaInterna.remove(0);
    }

    
    /** 
     * @return Object
     * retorna el último elemento del stack
     */
    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return listaInterna.get(0);
    }
    
 }
 