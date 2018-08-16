
public class Apple extends Fruit {

	String genre;
	
	public Apple(String genre){
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public void printInfo() {
		super.PrintInfo();
		System.out.println(" - " + getGenre());
		
	}
	
	
}
