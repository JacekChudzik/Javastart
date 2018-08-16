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

	public void printInfo() {
		String info = getTitle() + ";" + getAuthor() + ";" + getReleaseDate() + ";" + getPublisher() + ";" + getPages()
				+ ";" + getIsbn();
		System.out.println(info);
	}

}
