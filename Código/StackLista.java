/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase StackLista: es un Stack construido en base a una lista. 
 */

 public class StackLista<T> extends Stack<T>{

    private FactoryLista<T> fabricaLista = new FactoryLista<T>();
    private Lista<T> listaInterna;//cuando solo declaraba la variable en las clases stackVector y stackArrayList, no funcionaba. Tuve que crear un new Vector() y un new ArrayList. Pero aquí no puedo porque List es abstracta.

    //constructor
    public StackLista(int tipo){
        this.listaInterna = fabricaLista.getInstanceLista(tipo);
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
 