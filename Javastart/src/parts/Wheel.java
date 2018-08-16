package parts;

public class Wheel extends Part {

	int size;
	int width;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void printInfo() {
		System.out.println(getName() + ";" + getSize());
	}
	
}
