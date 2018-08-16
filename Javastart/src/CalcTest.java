import java.util.Locale;
import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		System.out.println("Podaj pierwszą liczbę: ");
		double a = scan.nextDouble();
		scan.nextLine();
		System.out.println("Podaj jakie działanie chcesz wykonać (+, -, *, /): ");
		String operator = scan.nextLine();
		
		System.out.println("Podaj drugą liczbę: ");
		double b = scan.nextDouble();
		
		Calaculator calc = new Calaculator();
		
		
		
		double result = calc.calculate(a, b, operator);
		System.out.println(result);
		
		scan.close();
		
	}
}
