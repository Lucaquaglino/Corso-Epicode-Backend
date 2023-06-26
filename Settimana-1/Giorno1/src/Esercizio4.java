import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Metodo 1
		System.out.println("Inserisci la lunghezza decimale del primo lato del rettangolo:");
		double lunghezza1 = input.nextDouble();

		System.out.println("Inserisci la lunghezza decimale del secondo lato del rettangolo:");
		double lunghezza2 = input.nextDouble();

		double perimetro = perimetroRettangolo(lunghezza1, lunghezza2);
		System.out.println("Il perimetro è: " + perimetro);

		// Metodo 2
		System.out.println("Inserisci un numero intero:");
		int numero = input.nextInt();

		int risultato = pariDispari(numero);
		System.out.println(risultato == 0 ? "Il numero è pari" : "Il numero è dispari");

		// Metodo 3
		System.out.println("Inserisci la lunghezza decimale del primo lato del triangolo:");
		double lato1 = input.nextDouble();

		System.out.println("Inserisci la lunghezza decimale del secondo lato del triangolo:");
		double lato2 = input.nextDouble();

		System.out.println("Inserisci la lunghezza decimale del terzo lato del triangolo:");
		double lato3 = input.nextDouble();

		double area = perimetroTriangolo(lato1, lato2, lato3);
		System.out.println("L'area del triangolo è: " + area);

		input.close();
	}

	public static double perimetroRettangolo(double lunghezzaLato1, double lunghezzaLato2) {
		double perimetro = 2 * (lunghezzaLato1 + lunghezzaLato2);
		return perimetro;
	}

	public static int pariDispari(int numero) {
		if (numero % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
		double semiPerimetro = (lato1 + lato2 + lato3) / 2;
		double area = Math
				.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
		return area;
	}
}