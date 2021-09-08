package arithmeticop;

public class ArithmeticOperations {

	public static void main(String[] args) {
		ArithOperations add=(int a, int b)->a+b;
	        System.out.println("Sum: "+add.arithoper(8,4));


	        ArithOperations sub = (int c, int d)->c-d;
	        System.out.println("Difference: "+sub.arithoper(5,2));

	        ArithOperations multiply = (int e, int f)->e*f;
	        System.out.println("Product: "+multiply.arithoper(6,3));

	        ArithOperations division = (int g, int h)->g/h;
	        System.out.println("Division result: "+division.arithoper(3,3));
	}

}
@FunctionalInterface 
interface ArithOperations{
	public int arithoper(int a, int b);
}

	
