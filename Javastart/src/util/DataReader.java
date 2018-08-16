package util;

import java.util.Scanner;

import data.Book;
import data.Magazine;

public class DataReader {

	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}
	
	public int getInt() {
		int number = sc.nextInt();
		sc.nextLine();
		return number;
	}
	
	
	public Book ReadAndCreateBook() {
		System.out.println(("Tytuł: "));
		String title = sc.nextLine();
		System.out.println("Autor: ");
		String author = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("ISBN: ");
		String isbn = sc.nextLine();
		System.out.println("Rok wydania: ");
		int releaseDate = sc.nextInt();
		sc.nextLine();
		System.out.println("Liczba stron: ");
		int pages = sc.nextInt();
		sc.nextLine();
		
		return new Book(title, author, publisher, isbn, releaseDate, pages);
	}
	
	public Magazine readAndCreateMagazine() {
		System.out.println("Tytuł: ");
		String title = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("Język: ");
		String language = sc.nextLine();
		System.out.println("Rok wydania: ");
		int releaseDate = sc.nextInt();
		sc.nextLine();
		System.out.println("Miesiąc: ");
		int month = sc.nextInt();
		sc.nextLine();
		System.out.println("Dzień: ");
		int day = sc.nextInt();
		sc.nextLine();
		
		return new Magazine (title, publisher, language, releaseDate, month, day);
	}

}
