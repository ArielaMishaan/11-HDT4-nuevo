/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Lista: clase abstracta, padre de la single linked list y la double linked list. 
 */

 public abstract class Lista<T> implements IList<T> {

    //atributos
    protected int count;

    //métodos

    public Lista(){
        count = 0;
    }

    @Override
    public void InsertAtStart(T value) {
        // TODO Auto-generated method stub
    }
    
    @Override
    public void InsertAtEnd(T value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void Insert(T value, int index) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public T Delete(int index) {
        // TODO Auto-gsenerated method stub
        return null;
    }
    @Override
    public T DeleteAtStart() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T Get(int index) {
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
 