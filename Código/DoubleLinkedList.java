/*
 * Código tomado de ejemplo del paquete uvg.structures, @author MAAG
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase DoubleLinkedList: es una lista de nodos con dos referencias, una al objeto anterior y uno al siguiente. 
 */

 public class DoubleLinkedList <T>extends Lista<T>{

    //atributos
    private NodoDouble<T> start;
	private NodoDouble<T> end;
	private int count;
    
    public DoubleLinkedList(){
        super();
        start = null;
        end = null;
    }

    /** 
     * @param value
     * inserta un elemento al inicio de la lista
     */
    @Override
    public void InsertAtStart(T value) {
        // TODO Auto-generated method stub
        NodoDouble<T> newNode = new NodoDouble<T>(value);
		
		if (IsEmpty()) {
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} 
        
        else {	
			newNode.setNext(start);
			start.setPrevious(newNode);
			newNode.setPrevious(end);
			end.setNext(newNode);
			start = newNode;
		}
		
		count++;
    }

    
    /** 
     * @param value
     * inserta un elemento al final de la lista
     */
    @Override
    public void InsertAtEnd(T value) {
        // TODO Auto-generated method stub
        NodoDouble<T> newNode = new NodoDouble<T>(value);
		
		if (IsEmpty()) {
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} 
        
        else {
			newNode.setPrevious(end);
			newNode.setNext(start);
			start.setPrevious(newNode);
			end.setNext(newNode);
			end = newNode;
		}
		
		count++;
    }

    
    /** 
     * @param value
     * @param index
     * inserta un elemento en el índice deseado
     */
    @Override
    public void Insert(T value, int index) {
        // TODO Auto-generated method stub
        if (IsEmpty()){//si la lista está vacía insertar al inicio
            InsertAtStart(value);
        }

        else{
            if (index >= Count()){ //si el index es mayor al número de elementos de la lista, insertar al final
                InsertAtEnd(value);
            } 

            else if (index == 0) {
                InsertAtStart(value);
            }

            else if ((index > 0) && (index < Count())){
                NodoDouble<T> newNode = new NodoDouble<T>(value);
                NodoDouble<T> temp = start;
                int i = 0;

                //Buscar la posición donde se insertará el nodo
                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }

                //insertar el nodo
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }

    }

    
    /** 
     * @param index
     * @return Object
     * elmina el elemento deseado
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
            NodoDouble<T> pretemp = start;
            NodoDouble<T> temp = start.getNext();
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
     * elimina el primer elemento de la lista
     */
    @Override
    public T DeleteAtStart() {
        // TODO Auto-generated method stub
        if (!IsEmpty()) {
			
			if (Count() == 1) {
				NodoDouble<T> temp = start;
				start = null;
				end = null;
				count--;
				return temp.getValor();

			} 
            
            else {
				NodoDouble<T> temp = start;
				end.setNext(temp.getNext());
				temp.getNext().setPrevious(end);
				start = temp.getNext();
				count--;
				return temp.getValor();
			}
			
		} else {
			return null;
		}		
    }

    
    /** 
     * @return Object
     * elimina el último elemento de la lista
     */
    @Override
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub
        if (!IsEmpty()) {

            if (Count() == 1){ 
                NodoDouble<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValor();
            }

            else{
                NodoDouble<T> pretemp = start;
                NodoDouble<T> temp = start.getNext();

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

        }
        return null;
    }

    
    /** 
     * @param index
     * @return Object
     * obtiene un elemento deseado
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

                NodoDouble<T> temp = start;
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
     * retorna true si la lista está vacía, false si contiene algo
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
 