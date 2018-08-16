package parts;

public class ExhaustPart extends Part {

	boolean isEuro5;

	public boolean isEuro5() {
		return isEuro5;
	}

	public void setEuro5(boolean isEuro5) {
		this.isEuro5 = isEuro5;
	}
	
	public void printInfo() {
		System.out.println(getName() + ";" + isEuro5());
	}
	
}
