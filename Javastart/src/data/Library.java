package data;

public class Library {

	public static final int MAX_BOOKS = 1000;
	public static final int MAX_MAGAZINES = 1000;
	private Book[] books;
	private Magazine[] magazines;
	private int magazineNumber;
	private int booksNumber;

	public Library() {
		books = new Book[MAX_BOOKS];
		magazines = new Magazine[MAX_MAGAZINES];
	}

	
	public int getMagazinesNumber() {
		return magazineNumber;
	}
	
	public Magazine[] getMagazines() {
		return magazines;
	}
	
	public int getBooksNumber() {
		return booksNumber;
	}

	public Book[] getBooks() {
		return books;
	}
	
	
	public void addMagazine(Magazine magazine) {
		if (magazineNumber < MAX_MAGAZINES) {
			magazines[magazineNumber] = magazine;
			magazineNumber++;
		}
		else {
			System.out.println("Nie można dodać więcej gazet do biblioteki. Dokup więcej pułek.");
		}
	}
	
	public void printMagazines() {
		if (booksNumber == 0) {
			System.out.println("Brak magazynów w bibliotece.");
		}
		
		for (int i = 0; i < magazineNumber; i++) {
			System.out.println(magazines[i]);
		}
	}
	

	public void addBook(Book book) {
		if (booksNumber < MAX_BOOKS) {
			books[booksNumber] = book;
			booksNumber++;
		} else {
			System.out.println("Nie można dodać więcej ksiazek do biblioteki. Dokup więcej pułek.");
		}
	}

	public void printBooks() {
		if (booksNumber == 0) {
			System.out.println("Brak książek w bibliotece");
		}

		for (int i = 0; i < booksNumber; i++) {
			System.out.println(books[i]);
		}
	}

}
