/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase SingleLinkedList: lista de nodos con una referencia cada uno (al objeto siguiente)
 */

 public class SingleLinkedList<T> extends Lista<T>{

    //atributos
    private int count;
    private NodoSingle<T> start;
    private NodoSingle<T> end;

    public SingleLinkedList(){
        start = null;
        count = 0;
    }
    
    /** 
     * @param value
     * inserta el valor al inicio de la lista
     */
    @Override
    public void InsertAtStart(T value) {
        NodoSingle<T> nuevoNodo = new NodoSingle<T>(value);

        if(IsEmpty()){
            start = nuevoNodo;
            end = nuevoNodo;
        }
        else{
            nuevoNodo.setNext(start);
            start = nuevoNodo;
        }
        count++;
        // TODO Auto-generated method stub
    }

    
    /** 
     * @param value
     * inserta el valor al final de la lista
     */
    @Override
    public void InsertAtEnd(T value) {
        // TODO Auto-generated method stub
        NodoSingle<T> nuevoNodo = new NodoSingle<T>(value);

        if(IsEmpty()){
            start = nuevoNodo;
            end = nuevoNodo;
        }
        count++;
    }

    
    /** 
     * @param valor
     * @param index
     * inserta un valor en el índice deseado
     */
    @Override
    public void Insert(T valor, int index) {
        // TODO Auto-generated method stub
        if(IsEmpty()){
            InsertAtStart(valor);
        }
        else{

            if(index >= Count()){
                InsertAtEnd(valor);
            }
            else if(index ==0){
                InsertAtStart(valor);
            }
            else if((index>0) && (index<Count())){
                NodoSingle<T> nuevoNodo = new NodoSingle<T>(valor);
                NodoSingle<T> pretemp = start;
                NodoSingle<T> temp = start.getNext();
                int i = 1;

                //buscar la posición donde se insertará el nodo
                while((temp != null) && (i<index)){
                    pretemp = temp;
                    temp = temp.getNext();
                    i++;
                }

                //insertar
                nuevoNodo.setNext(temp);
                pretemp.setNext(nuevoNodo);
                count++;
            }
        }
        
    }
    
    
    /** 
     * @param index
     * @return Object
     * elimina un valor del índice deseado
     */
    @Override
    public T Delete(int index) {
        // TODO Auto-generated method stub
        if (index == 0){
            return DeleteAtStart();
        }

        else if (index == (Count() - 1)){
            return DeleteAtEnd();
        }

        else if ((index > 0) && (index < (Count() - 1))){
            NodoSingle<T> pretemp = start;
            NodoSingle<T> temp = start.getNext();
            int i = 1;

            //Buscar la posición donde se insertará el nodo
            while ((temp != null) && (i < (Count() - 1))){
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }
            
            //Borrar el nodo
            pretemp.setNext(temp.getNext());
            count--;
            return temp.getValor();
        }

        else{
            return null;
        }
    }
    
    
    /** 
     * @return Object
     * elimina el primer valor de la lista
     */
    @Override
    public T DeleteAtStart() {
        // TODO Auto-generated method stub
        if (!IsEmpty()) {

            NodoSingle<T> temp = start;
            start = start.getNext();
            count--;
            return temp.getValor();
        }

        return null;
    }

    
    /** 
     * @return Object
     * elimina el último valor de la lista
     */
    @Override
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub

        NodoSingle<T> finger = start;
        NodoSingle<T> previous = null;

        while(finger.getNext()!= null){
            previous = finger;
            finger = finger.getNext();
        }
        //finger es 0 o apunta la final de la lista
        if(previous == null){
            start = null; //tiene exactamente un elemento
        }
        else{
            previous.setNext(null); //el apuntador al últimio elemento es reseteado
        }
        count --;
        return finger.getValor();

        /*if (!IsEmpty()) {

            if (Count() == 1){ 
                NodoSingle<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValor();
            }

            else if(Count() > 1){
                NodoSingle<T> pretemp = start;
                NodoSingle<T> temp = start.getNext();

                //Search the position where the node will be inserted
                while (temp != null)
                {
                    pretemp = temp;
                    temp = temp.getNext();
                }

                //Delete the node
                end = pretemp;
                end.setNext(null);
                count--;
                return temp.getValor();
            }

        }*/
    }

    
    /** 
     * @param index
     * @return Object
     * obtiene el valor del índice deseado
     */
    @Override
    public T Get(int index) {
        // TODO Auto-generated method stub
        if (!IsEmpty()){

            if (index == 0){
                return start.getValor();
            }

            else if (index == (Count() - 1)){
                return end.getValor();
            }

            else if ((index > 0) && (index < (Count() - 1))){

                NodoSingle<T> temp = start;
                int i = 0;

                while ((temp != null) && (i != index)){
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null){
                    return temp.getValor();
                }

                else{
                    return null;
                }
            }
            
            else{
                return null;
            }
        }
        return null;
    } 

    
    /** 
     * @return boolean
     * retorna true si la lista está vacía, false si tiene elementos
     */
    @Override
    public boolean IsEmpty() {
        // TODO Auto-generated method stub
        return count == 0;
    }

    
    /** 
     * @return int
     * retorna la cantidad de elementos que tiene la lista. 
     */
    @Override
    public int Count() {
        // TODO Auto-generated method stub
        return count;
    }

   
 }
 