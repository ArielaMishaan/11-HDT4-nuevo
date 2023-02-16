/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Lista: clase abstracta, padre de la single linked list y la double linked list. 
 */

 public abstract class Lista<T> implements IList {

    //atributos
    protected int count;

    //métodos

    @Override
    public void InsertAtStart(Object value) {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void InsertAtEnd(Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void Insert(Object value, int index) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Object Delete(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object DeleteAtStart() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object DeleteAtEnd() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object Get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean IsEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public int Count() {
        // TODO Auto-generated method stub
        return 0;
    }

    
 }
 