
import java.util.Scanner;

public class VracanjeUProslost {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Molimo unesite broj godina koji zelite da se vratite u proslost: ");

		long godine = input.nextLong();

		izracunajSekundeMinuteSate(godine);
		izracunajDaneMjeseceGodine(godine);
		izracunajDecenijeStoljecaMilenije(godine);

		izracunajCentimetreMetreKilometre(godine);

		izracunajKolikoPutaPrehodatiStadion(godine);

		izracunajKolikoPutaPrehodatiObimZemlje(godine);

	}

	public static void izracunajSekundeMinuteSate(long godine) {

		long sati = godine / 3600;
		long minuta = (godine % 3600) / 60;
		long sekundi = (godine % 3600) % 60;

		System.out.println("Da bismo se vratili u proslost " + godine + " godina sa super avionom, potrebno nam je:");
		System.out.println(sati + " sati");
		System.out.println(minuta + " minuta");
		System.out.println(sekundi + " sekundi");
		System.out.println();
	}

	public static void izracunajDaneMjeseceGodine(long godine) {

		long godina = godine / 31536000;
		long mjeseci = (godine % 31536000) / 2592000;
		long dana = ((godine % 31536000) % 2592000) / 86400;

		System.out.println("Da bismo se vratili u proslost " + godine + " godina sa super avionom, potrebno nam je:");
		System.out.println(godina + " godina");
		System.out.println(mjeseci + " mjeseci");
		System.out.println(dana + " dana");
		System.out.println();
	}

	public static void izracunajDecenijeStoljecaMilenije(long godine) {

		long milenija = godine / 31536000000L;
		long stoljeca = (godine % 31536000000L) / 3153600000L;
		long decenija = ((godine % 31536000000L) % 3153600000L) / 315360000;

		System.out.println("Da bismo se vratili u proslost " + godine + " godina sa super avionom, potrebno nam je:");
		System.out.println(milenija + " milenija");
		System.out.println(stoljeca + " stoljeca");
		System.out.println(decenija + " decenija");
		System.out.println();
	}

	public static void izracunajCentimetreMetreKilometre(long godine) { // 1korak = 75cm

		long kilometara = (75 * godine) / 100000;
		// long kilometara1 = godine * (75 / 100000);

		long metara = ((75 * godine) % 100000) / 100;
		// long metara1 = (godine * (75 % 100000)) / 100;

		long centimetara = ((75 * godine) % 100000) % 100;
		// long centimetara1 = (godine * (75 % 100000)) % 100;

		System.out.println("Da bismo se vratili u proslost " + godine + " godina koracima, potrebno nam je:");
		System.out.println(kilometara + " kilometara");
		System.out.println(metara + " metara");
		System.out.println(centimetara + " centimetara");
		System.out.println();
	}

	public static void izracunajKolikoPutaPrehodatiStadion(long godine) { // stadion = 105m

		long stadion = (godine * 75) / 10500;

		System.out.println("Stadion bi prehodali " + stadion + " puta.");
		System.out.println();
	}

	public static void izracunajKolikoPutaPrehodatiObimZemlje(long godine) { // obim zemlje = 40.075km

		long zemlja = (godine * 75) / 4007500;

		System.out.println("Zemlju bi prehodali " + zemlja + " puta.");
	}

}
