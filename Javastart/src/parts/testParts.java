package parts;

public class testParts {

	public static void main(String[] args) {
		
		Part part1 = new Part();
		part1.id = 111;
		part1.model = "imbus";
		part1.name = "wichajster";
		part1.producerName = "Śrubex";
		part1.serialNumb = 321;
		
		Wheel w1 = new Wheel();
		w1.name = "dunlop";
		w1.size = 17;
		
		Tire t1 = new Tire();
		t1.name = "alusy";
		t1.size = 15;
		
		ExhaustPart ex = new ExhaustPart();
		ex.name = "rura";
		ex.isEuro5 = true;
		
		part1.printInfo();
		w1.printInfo();
		t1.printInfo();
		ex.printInfo();

	}

}
