import java.util.ArrayList;
import java.util.Stack;

/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase TraductorPostfix: sirve para pasar las expresiones de infix a postfix y pasárselas luego a la clase calculadora. 
 */

 public class TraductorPostfix {


    //constructor
    public TraductorPostfix(){
    }

    //métodos
    
    /** 
     * @param infixExpression
     * @return ArrayList<String>
     * @throws Exception
     * es el método que pasa las expresiones de infix a postfix. Si encuentra caracteres no permitidos,  tira una excepción.
     */
    public ArrayList<String> deInfix_Postfix(ArrayList<String> infixExpression) throws Exception{
        
        ArrayList<String> expresionPostfix = new ArrayList<String>();
        Stack<String> listaTemporal = new Stack<String>();
        String ultimoCaracter = "";

        for (String caracter : infixExpression) {

            if (listaTemporal.size() != 0){
                ultimoCaracter = listaTemporal.peek();
            }

            if(esNumerico(caracter)){
                expresionPostfix.add(caracter);
            }
            
            else if(esParentesisAbierto(caracter)){
                listaTemporal.push(caracter);
            }

            else if(esOperador(caracter) && (nivelPrecedencia(caracter) > nivelPrecedencia(ultimoCaracter))){
                listaTemporal.push(caracter);
            }

            else if(esParentesisCerrado(caracter)){
                
                while((listaTemporal.size() != 0) && (!ultimoCaracter.equals("("))){
                    expresionPostfix.add(listaTemporal.pop());
                    ultimoCaracter = listaTemporal.peek();
                }
                listaTemporal.pop();
            }

            else if(esOperador(caracter) && (nivelPrecedencia(caracter) < nivelPrecedencia(ultimoCaracter))){
                while (listaTemporal.size() != 0 && (nivelPrecedencia(caracter) < nivelPrecedencia(ultimoCaracter))) {
                    expresionPostfix.add(listaTemporal.pop());
                }
                listaTemporal.push(caracter);
            }
        }

        for (int i = listaTemporal.size()-1; i >= 0; i--) {
            expresionPostfix.add(listaTemporal.get(i));
        } 

        /*for (int i = 0; i < listaTemporal.size(); i++) {
            int ultimo = listaTemporal.size()-1;
            expresionPostfix.add(listaTemporal.get(ultimo));
        }*/

        /*for (String caracter : listaTemporal) {
            expresionPostfix.add(caracter);
        }*/

        return expresionPostfix;

    }

    
    /** 
     * @param caracter
     * @return boolean
     * revisa si un caracter es numérico
     */
    public boolean esNumerico(String caracter){
        try {
            Integer.parseInt(caracter);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
  
    
    /** 
     * @param caracter
     * @return boolean
     * revisa si un caracter es un paréntesis abierto
     */
    public boolean esParentesisAbierto(String caracter){
        boolean esParentesis = false;

        if(caracter.equals("(")){
            esParentesis = true;
        }

        return esParentesis;
    }

    
    /** 
     * @param caracter
     * @return boolean
     * revisa si un caracter es un paréntesis cerrado
     */
    public boolean esParentesisCerrado(String caracter){
        boolean esParentesis = false;

        if(caracter.equals(")")){
            esParentesis = true;
        }

        return esParentesis;
    }

    
    /** 
     * @param caracter
     * @return boolean
     * revisa si un caracter es un operador
     */
    public boolean esOperador(String caracter){
        
        boolean esOperador = false;

        if(caracter.equals("+") | caracter.equals("-")| caracter.equals("*")| caracter.equals("/")){
            esOperador = true;
        }

        return esOperador;
    }

    
    /** 
     * @param operador
     * @return int
     * revisa el nivel de precedencia de un caracter (si es + o -, retorna 0, si es * o / retorna 1, si es potencia retorna 2 y con cualquier otro retorna -1)
     */
    public int nivelPrecedencia(String operador){
        int retorno = 0;

        switch (operador) {
            case "+":
                retorno = 0;
                break;

            case "-":
                retorno = 0;
                break;
                
            case "*":
                retorno = 1;
                break;

            case "/":
                retorno = 1;
                break;

            case "^":
                retorno = 2;
                break;
        
            default:
                retorno = -1;
                break;
        }

        return retorno;
    }

}
 