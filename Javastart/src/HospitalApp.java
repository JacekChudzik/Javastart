import java.util.Scanner;

import logic.Hospital;

public class HospitalApp {
	public static void main(String[] args) {

		System.out.println("Wybierz opcję:");
		System.out.println("0 - wyjście z programu");
		System.out.println("1 - dopisanie pacjenta");
		System.out.println("2 - odczyt listy pacjentów");

		final int exit = 0;
		final int add = 1;
		final int show = 2;

		Scanner scn = new Scanner(System.in);

		int operator = scn.nextInt();
		scn.nextLine();
		Hospital hp = new Hospital();

		while (operator != 0) {

			switch (operator) {
			case (add):

				for (int x = 0; x < Hospital.kolejka.length; x++) {
					if (Hospital.kolejka[x] == null) {
						Hospital.kolejka[x] = hp.addPatient();
						break;
					}
				}

				break;
			case (show):
				hp.info();
				break;
			case (exit):

				break;
			default:
				System.out.println("Podaj liczbę z zakresu 0-2");
			}
			System.out.println("co chcesz zrobić?");
			scn.hasNextLine();
			operator = scn.nextInt();
			scn.nextLine();

		}
		System.out.println("Pa pa!");

		scn.close();
	}
}
