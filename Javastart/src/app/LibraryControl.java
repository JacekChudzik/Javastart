package app;

import data.Book;
import data.Library;
import data.Magazine;
import util.DataReader;

public class LibraryControl {

	public final static int EXIT = 0;
	public final static int ADD_BOOK = 1;
	public final static int PRINT_BOOKS = 2;
	public final static int ADD_MAGAZINE = 3;
	public final static int PRINT_MAGAZINES = 4;

	private DataReader dataReader;

	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		library = new Library();
	}

	public void controlLoop() {
		int option;
		printOptions();

		while ((option = dataReader.getInt()) != EXIT) {
			switch (option) {

			case ADD_BOOK:
				addBook();
				break;

			case PRINT_BOOKS:
				printBooks();
				break;

			case ADD_MAGAZINE:
				addMagazine();
				break;

			case PRINT_MAGAZINES:
				printMagazines();
				break;

			default:
				System.out.println("nie ma takiej opcji");

			}

			printOptions();
		}

		dataReader.close();

	}

	private void printOptions() {
		System.out.println("Wybierz opcję:");
		System.out.println("0 - wyjście z programu");
		System.out.println("1 - dodanie książki");
		System.out.println("2 - lista dostępnych tytułów");
		System.out.println("3 - dodanie gazety");
		System.out.println("4 - wyświetlenie listy gazet");

	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printMagazines() {
		library.printMagazines();
	}

	private void addBook() {
		Book book = dataReader.ReadAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		library.printBooks();
	}

}
