package logic;

import java.util.Scanner;

import data.Patient;

public class Hospital {

	// logika: dopisanie pacjenta do kolejki; wyświetlenie pacjentów;

	public static Patient[] kolejka = new Patient[10];

	Scanner scn = new Scanner(System.in);

	public Patient addPatient() {

		System.out.println("Podaj dane pacjenta: imię, nazwisko, pesel");
		String name = scn.nextLine();
		String surname = scn.nextLine();
		int pesel = scn.nextInt();
		scn.nextLine();

		return new Patient(name, surname, pesel);

	}

	public void info() {
		System.out.println("zapisani pacjenci");
		for (int x = 0; x < kolejka.length; x++) {
			if (kolejka[x] != null) {
				System.out.println(kolejka[x].getName() + "," + kolejka[x].getSurname() + "," + kolejka[x].getPesesl());
			}
		}
	}

}
