/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase StackLista: es un Stack construido en base a una lista. 
 */

 public class StackLista<T> extends Stack<T>{

    private Lista<T> listaInterna;
    private FactoryLista<T> fabricaLista = new FactoryLista<T>();

    //constructor
    public StackLista(int tipo){
        listaInterna = fabricaLista.getInstanceLista(tipo);
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return listaInterna.Count();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return listaInterna.IsEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        listaInterna.InsertAtEnd(value);
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        T objetoTemporal = listaInterna.Get(listaInterna.Count());
        listaInterna.DeleteAtEnd();
        return objetoTemporal;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return (T) listaInterna.Get(listaInterna.Count());
    }
    
 }
 