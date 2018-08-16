import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ile liczb chcesz zadeklarować?");
		int numbers = scn.nextInt();
		
		int temp = 0;
		
		while(numbers-- >0) {
			System.out.println("podaj kolejną liczbę");
			temp = temp+scn.nextInt();
		}
		
		System.out.println(temp);
		scn.close();
	}
}