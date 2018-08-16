import java.util.Scanner;

public class University {

	
	Scanner scn = new Scanner (System.in);
	
	public Student addStudi() {
		System.out.println("podaj imie");
		String name = scn.nextLine();
		System.out.println("podaj nazwisko");
		String surname = scn.nextLine();
		System.out.println("podaj nr indexu");
		int index = scn.nextInt();
		scn.nextLine();
		Student.studiNumb++;
		return new Student(name, surname, index);
		
	}
	
	
	public static void main(String[] args) {
		
University agh = new University();

agh.addStudi();
agh.addStudi();

System.out.println(Student.studiNumb);
		
		
		
	}
	
	
}
