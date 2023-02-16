/**
 * @author MAAG
 *
 */

 /*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase IList: interface para una lista. 
 */

 public interface IList<T> {

    void InsertAtStart(T value);

    void InsertAtEnd(T value);

    void Insert(T value, int index);

    T Delete(int index);

    T DeleteAtStart();

    T DeleteAtEnd();

    T Get(int index);

    boolean IsEmpty();
    
    int Count();
}
