
public class NotebookShop {
	public static void main(String[] args) {

		Computer c1 = new Computer("Acer", 3330);
		Computer c2 = new Computer("lenovo", 500);
		Computer c3 = new Computer("lenovo", 500);
		Computer c4 = new Computer("McBook", 666);
		Computer c5 = new Computer("Asus", 132);
		
		
		DataStore d1 = new DataStore();
		d1.addComputer(c2);
		d1.addComputer(c1);
		d1.addComputer(c5);
		d1.addComputer(c4);
		d1.addComputer(c3);
		
		
		System.out.println("Sprawdzanie dostępności danego egzemplarza: ");
		d1.checkAvailability(c1);
		
		
		System.out.println("\nDostępne modele w sklepie:");
		d1.printDatabase();
	
		//System.out.println(c2.equals(c3));
		
		
		
		
	}
}
