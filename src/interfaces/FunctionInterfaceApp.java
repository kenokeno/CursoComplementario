package interfaces;

public class FunctionInterfaceApp {
	public double operacion(double a, double b) {
		Operation operation = (x, y)-> x+y;
		
		return operation.add(a, b);
	} 
}
