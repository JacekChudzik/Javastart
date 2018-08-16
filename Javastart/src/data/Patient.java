package data;

public class Patient {

	private String name;
	private String surname;
	private int pesesl;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPesesl() {
		return pesesl;
	}
	public void setPesesl(int pesesl) {
		this.pesesl = pesesl;
	}
	public Patient(String name, String surname, int pesesl) {
		super();
		this.name = name;
		this.surname = surname;
		this.pesesl = pesesl;
	}
	
	
	
}
