package data;

public class Publication {

	private int releaseDate;

	private String title;
	private String publisher;

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	protected Publication(int releaseDate, String title, String publisher) {

		this.releaseDate = releaseDate;
		this.title = title;
		this.publisher = publisher;
	}

}
