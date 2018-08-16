
public class Calaculator {

	
	
	public double calculate (double a, double b, String operator) {
	
		double result = 0;
		
	switch (operator) {
	case "+":
		result = a+b;
		break;
	case "-":
		result = a-b;
		break;
	case "*":
		result = a*b;
		break;
	case "/":
		result = a/b;
		break;
	default:
		System.out.println("podałeś niepoprawny operator matematyczny");
	}
	
	return result;
	
}
}
