package data;

public class Magazine extends Publication {

	private int month;
	private int day;
	private String language;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Magazine(String title, String publisher, String language, int releaseDate, int month, int day) {
		super(releaseDate, publisher, title);
		setLanguage(language);
		setMonth(month);
		setDay(day);
	}

	public void printInfo() {
		String info = getTitle() + ";" + getPublisher() + ";" + getReleaseDate() + ";" + getMonth() + ";" + getDay()
				+ ";" + getLanguage();
		System.out.println(info);
	}

}
