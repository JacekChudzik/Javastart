
public class Company {

	
	public static void main(String[] args) {
		
		
		Employee JanKowalski = new Employee();
		
		JanKowalski.name = "Jan Kowalski";
		JanKowalski.age = 33;
		JanKowalski.height = 1.75;
		JanKowalski.isEducated = true;
		
		String JanKoInfo = "imię i nazwisko: " + JanKowalski.name 
				+ "\nwiek: " + JanKowalski.age + "\nwzrost: : " + JanKowalski.height + " \nwykształcenie: " + JanKowalski.isEducated;
		
		System.out.println(JanKoInfo);
		
		
		
		
	}
}
