/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Calculadora: clase que simula una calculadora de expresiones postfix. 
 */

 public class Calculadora<T> {

    private static boolean instance_flag = false;
    private static Calculadora laUnicaCalculadora;
    
    private FactoryStack<T> fabricaStack;
    private Stack<T> stack;

    //constructor
    private Calculadora() throws SingletonException{
        instance_flag = false;
    }

    public static Calculadora getInstance(){
        if(instance_flag){
            return laUnicaCalculadora;
        }
        else{
            laUnicaCalculadora = new Calculadora();
            return laUnicaCalculadora;
        }
    }

    public void crearStack(int tipoStack, int tipoLista){
        switch (tipoStack) {
            case 1:
                
                break;

            case 2:
                break;

            case 3: 
                break;
        
            default:
                break;
        }
    }
}
 