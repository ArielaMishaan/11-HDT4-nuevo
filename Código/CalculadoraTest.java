import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
/*
 * Ariela Mishaan (22052)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 * Clase CalculadoraTest: Pruebas Unitarias
 */


public class CalculadoraTest {

    Calculadora calculadora = Calculadora.getInstance();
    FactoryStack<Integer> fabricaStack = new FactoryStack<Integer>();
    int numero = 4;

    //Tests para el vector

    @Test
    void pullpushTestVector(){
        Stack<Integer> stack = fabricaStack.getInstanceStack(1,0);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        int resultado = 0;
        resultado = stack.pull();
        assertEquals(2, resultado);
    }

    
	/** 
	 * @throws Exception
	 * test para sumar con un stack hecho de vector
	 */
	@Test
	void sumaTestVector() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("+");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,1,0);
		assertEquals(5, resultado);
	}

	/** 
	 * @throws Exception
	 * test para restar con un stack hecho de vector
	 */
    @Test
	void restaTestVector() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("-");
		lista.add("3");
		int resultado = calculadora.Calculate(lista, 1, 0);
		assertEquals(-1, resultado);
	}

	/** 
	 * @throws Exception
	 * test para multiplicar con un stack hecho de vector
	 */
	@Test
	void multiTestVector() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("*");
		lista.add("9");
		int resultado = calculadora.Calculate(lista, 1, 0);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestVector() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("24");
		lista.add("/");
		lista.add("6");
		int resultado = calculadora.Calculate(lista, 1, 0);
		assertEquals(4, resultado);
	}

    @Test
	void unmontonTestVector() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add(")");
		lista.add("*");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,1,0);
		assertEquals(15, resultado);
	}

	@Test
	void unmontonTestVector2() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("*");
		lista.add("4");
		lista.add(")");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,1,0);
		assertEquals(2, resultado);
	}

	@Test
	void unmontonTestVector3() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,1,0);
		assertEquals(3, resultado);
	}

	@Test
	void unmontonTestVector4() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("4");
		lista.add("/");
		lista.add("2");
		lista.add("-");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,1,0);
		assertEquals(0, resultado);
	}

    //Tests para el stack con arraylist

    @Test
    void pullpushTestArrayList(){
        Stack<Integer> stack = fabricaStack.getInstanceStack(2,0);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        int resultado = 0;
        resultado = stack.pull();
        assertEquals(2, resultado);
    }
    
    @Test
	void sumaTestArrayList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("3");
		lista.add("+");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,2,0);
		assertEquals(5, resultado);
	}
    
    @Test
	void restaTestArrayList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("-");
		lista.add("3");
		int resultado = calculadora.Calculate(lista, 2, 0);
		assertEquals(-1, resultado);
	}

	@Test
	void multiTestArrayList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("*");
		lista.add("9");
		int resultado = calculadora.Calculate(lista, 2, 0);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestArrayList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("24");
		lista.add("/");
		lista.add("6");
		int resultado = calculadora.Calculate(lista, 2, 0);
		assertEquals(4, resultado);
	}

    @Test
	void unmontonTestArrayList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add(")");
		lista.add("*");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,2,0);
		assertEquals(15, resultado);
	}

	@Test
	void unmontonTestArrayList2() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("*");
		lista.add("4");
		lista.add(")");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,2,0);
		assertEquals(2, resultado);
	}

	@Test
	void unmontonTestArrayList3() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,2,0);
		assertEquals(3, resultado);
	}

	@Test
	void unmontonTestArrayList4() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("4");
		lista.add("/");
		lista.add("2");
		lista.add("+");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,2,0);
		assertEquals(4, resultado);
	}
    //Tests para el stack con single linked list

    @Test
    void pullpushTestSingleLinkedList(){
        Stack<Integer> stack = fabricaStack.getInstanceStack(3,1);
        stack.push(4);
        stack.push(3);
        stack.push(2);
		int resultado = stack.pull();
		assertEquals(2, resultado);
    }

    @Test
	void sumaTestSingleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("+");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,3,1);
		assertEquals(5, resultado);
	}

    @Test
	void restaTestSingleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("-");
		lista.add("3");
		int resultado = calculadora.Calculate(lista, 3,1);
		assertEquals(-1, resultado);
	}

	@Test
	void multiTestSingleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("*");
		lista.add("9");
		int resultado = calculadora.Calculate(lista, 3, 1);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestSingleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("24");
		lista.add("/");
		lista.add("6");
		int resultado = calculadora.Calculate(lista, 3, 1);
		assertEquals(4, resultado);
	}

    @Test
	void unmontonTestSingleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add(")");
		lista.add("*");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,3,1);
		assertEquals(15, resultado);
	}

	@Test
	void unmontonTestSingleLinkedList2() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("*");
		lista.add("4");
		lista.add(")");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,3,1);
		assertEquals(2, resultado);
	}

    //tests para el stack con double linked list

    @Test
    void pullpushTestDoubleLinkedList(){
        Stack<Integer> stack = fabricaStack.getInstanceStack(3,2);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        int resultado = 0;
        resultado = stack.pull();
        assertEquals(2, resultado);
    }
    
    @Test
	void sumaTestDoubleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("+");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,3,2);
		assertEquals(5, resultado);
	}

    @Test
	void restaTestDoubleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("2");
		lista.add("-");
		lista.add("3");
		int resultado = calculadora.Calculate(lista, 3, 2);
		assertEquals(-1, resultado);
	}

	@Test
	void multiTestDoubleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("7");
		lista.add("*");
		lista.add("9");
		int resultado = calculadora.Calculate(lista, 3, 2);
		assertEquals(63, resultado);
	}

	@Test
	void diviTestDoubleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
		lista.add("24");
		lista.add("/");
		lista.add("6");
		int resultado = calculadora.Calculate(lista, 3, 2);
		assertEquals(4, resultado);
	}

    @Test
	void unmontonTestDoubleLinkedList() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("+");
		lista.add("4");
		lista.add(")");
		lista.add("*");
		lista.add("3");
		int resultado = calculadora.Calculate(lista,3,2);
		assertEquals(15, resultado);
	}

	@Test
	void unmontonTestDoubleLinkedList2() throws Exception{
        Calculadora calculadora = Calculadora.getInstance();
		ArrayList<String> lista =  new ArrayList<>();
        lista.add("(");
		lista.add("1");
		lista.add("*");
		lista.add("4");
		lista.add(")");
		lista.add("/");
		lista.add("2");
		int resultado = calculadora.Calculate(lista,3,2);
		assertEquals(2, resultado);
	}
}
