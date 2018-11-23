
import java.util.Scanner;

public class Svemir {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite broj svjetlosnih godina koje biste zeljeli putovati: ");

		long svjetlosneGodine = input.nextLong();

		izracunajBrojKilometara(svjetlosneGodine);
		izracunajBrojAstronomskihJedinica(svjetlosneGodine);
		izracunajBrojParseca(svjetlosneGodine);

		izracunajNaseVrijeme(svjetlosneGodine);
	}

	public static void izracunajBrojKilometara(long svjetlosneGodine) { // predjeniPut =
																		// brzinaSvjetlosti*svjetlosneGodine

		double brzinaSvjetlosti = 299792458;
		double predjeniPut = brzinaSvjetlosti * (0.001 / (1.0 / 31536000)) * svjetlosneGodine;

		System.out.println("Predjeni put svjetlosti (u km) za " + svjetlosneGodine + " godina je: " + predjeniPut);
		System.out.println();
	}

	public static void izracunajBrojAstronomskihJedinica(long svjetlosneGodine) {

		double brzinaSvjetlosti = 299792458;
		double predjeniPut = brzinaSvjetlosti * (0.001 / (1.0 / 31536000)) * svjetlosneGodine;

		double brojAU = predjeniPut / (149.6 * 1000000);

		System.out.println("Broj AU koje svjetlost predje za " + svjetlosneGodine + " iznosi: " + brojAU);
		System.out.println();

	}

	public static void izracunajBrojParseca(long svjetlosneGodine) {

		double brojParseca = svjetlosneGodine / 3.26;

		System.out.println("Broj parseca koje svjetlost predje za " + svjetlosneGodine + " iznosi: " + brojParseca);
		System.out.println();

	}

	public static void izracunajNaseVrijeme(long svjetlosneGodine) { // vrijeme = predjeniPut/brzinaHeliosa

		double brzinaSvjetlosti = 299792458; // m/s
		double predjeniPutKm = brzinaSvjetlosti * (0.001 / (1.0 / 31536000)) * svjetlosneGodine;

		double vrijeme = predjeniPutKm / 252792.537 * (1.0 / (1.0 / 8760));

		System.out.println(
				"Broj godina koji je nama potreban da predjemo istu razdaljinu sa Helios2 objektom je: " + vrijeme);

	}

}
