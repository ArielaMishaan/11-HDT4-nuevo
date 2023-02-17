import java.util.ArrayList;

/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase Calculadora: clase que simula una calculadora de expresiones postfix. 
 */

 public class Calculadora{

    private static boolean instance_flag = false;
    private static Calculadora laUnicaCalculadora;
    
    private FactoryStack<Integer> fabricaStack = new FactoryStack<Integer>();
    private Stack<Integer> stack;
    private TraductorPostfix traductor = new TraductorPostfix();

    //constructor

    /***
     * 
     * @throws SingletonException
     * constructor privado de la calculadora que solo se usa dentro de esta clase (patrón singleton)
     */
    private Calculadora() throws SingletonException{
        instance_flag = false;
    }

    /***
     * 
     * @return
     * constructor público de la calculadora, utilizando el patrón singleton (verifica que solo exista una instancia).
     */
    public static Calculadora getInstance(){
        if(instance_flag){
            return laUnicaCalculadora;
        }
        else{
            laUnicaCalculadora = new Calculadora();
            return laUnicaCalculadora;
        }
    }

    //Métodos

    /***
     * 
     * @param infixExpression
     * @param tipoStack 1 = stack usando vector, 2 = arrayList, 3 = lista
     * @param tipoLista 1 = single linked list, 2 = double linked list
     * @return
     * @throws Exception
     * es el método que sirve para calcular la expresión infix que se proporciona (primero la traduce a postfix y luego calcula)
     */
    public int Calculate(ArrayList<String> infixExpression, int tipoStack, int tipoLista) throws Exception{
        
        int resultado = 0;
        ArrayList<String> caracteres = traducirInfix_Postfix(infixExpression);
        this.crearStack(tipoStack, tipoLista);

        for(String caracter : caracteres){
            if(verificar(caracter)){
                int numero = Integer.parseInt(caracter);
                stack.push(numero);
            }
            else if(verificar(caracter) == false){
                if(caracter.equals("+")){
                    resultado = stack.pull() + stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("-")){
                    resultado = stack.pull() - stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("*")){
                    resultado = stack.pull() * stack.pull();
                    stack.push(resultado);
                }
                else if(caracter.equals("/")){
                    resultado = stack.pull() / stack.pull();
                    stack.push(resultado);
                }
            }
        }       

        return resultado;
    }

    /***
     * 
     * @param tipoStack 1 = stack usando vector, 2 = arrayList, 3 = lista
     * @param tipoLista 1 = single linked list, 2 = double linked list
     * crea el stack del tipo que el usuario pidió
     */
    public void crearStack(int tipoStack, int tipoLista){
        switch (tipoStack) {
            case 1: //Vector
                this.stack = fabricaStack.getInstanceStack(1,0);
                break;

            case 2: //ArrayList
                this.stack = fabricaStack.getInstanceStack(2,0);
                break;

            case 3: //Lista

                switch (tipoLista) {
                    case 1: //single linked list
                        this.stack = fabricaStack.getInstanceStack(3,1);
                        break;

                    case 2: //double linked list
                        this.stack = fabricaStack.getInstanceStack(3,2);
                        break;
                
                    default:
                        break;
                }
                break;

            default:
                break;
        }
    }

    /***
     * 
     * @param infixExpression
     * @return postfixExpression
     * @throws Exception
     * convierte la expresión de infix a postfix, utilizando la clase traductora
     */
    public ArrayList<String> traducirInfix_Postfix(ArrayList<String> infixExpression) throws Exception{
        ArrayList<String> postfixExpression = new ArrayList<String>();
        
        postfixExpression = traductor.deInfix_Postfix(infixExpression);
        return postfixExpression;
    }

    /***
     * 
     * @param caracter
     * @return boolean
     * sirve para verificar si un caracter es un número o no
     */
    private boolean verificar(String caracter){
        try {
            Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

}
 