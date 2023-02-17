/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Stack: clase abstracta, padre de las clases StackVector, StackArrayList y StackLista. 
 */

 public abstract class Stack <T> implements IStack<T>{
    
    protected int count;

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }
 }
 