package data;

public class Book extends Publication {

	private String author;
	private int pages;
	private String isbn;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book(String title, String author, String publisher, String isbn, int releaseDate, int pages) {
		super(releaseDate, publisher, title);
		this.setAuthor(author);
		this.setPages(pages);
		this.setIsbn(isbn);

	}

	public Book(Book book) {
		this(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getIsbn(), book.getReleaseDate(),
				book.getPages());
	}

	
	public String toString() {
		return getTitle() + ";" + getAuthor() + ";" + getReleaseDate() + ";" + getPublisher() + ";" + getPages()
		+ ";" + getIsbn();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + pages;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	
	

}
