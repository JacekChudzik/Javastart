
public class DataStore {

	int compNumb;
	int maxComp = 100;
	int counter = 0;
	Computer[] comp = new Computer[maxComp];

	public void addComputer(Computer computer) {
		if (compNumb < maxComp) {
			comp[compNumb] = computer;
			compNumb++;
		} else {
			System.out.println("nie można dodać komputera");
		}
	}

	public void printDatabase() {
		for (int x = 0; x < comp.length; x++) {
			if (comp[x] != null)
				System.out.println(comp[x]);
		}
	}

	public void checkAvailability(Computer obj) {

		for (int x = 0; x < comp.length; x++) {
			if (comp[x] != null) {
				if (obj.equals(comp[x])) {
					counter++;
				}
			}

		}

		System.out.println("Dostępnych jest " + counter + " sztuk danego modelu");

	}
}
