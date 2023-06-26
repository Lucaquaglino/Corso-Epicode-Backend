import java.util.Scanner;

public class Esercizio3 {

	   public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Inserisci la prima stringa:");
	        String stringa1 = input.nextLine();

	        System.out.println("Inserisci la seconda stringa:");
	        String stringa2 = input.nextLine();

	        System.out.println("Inserisci la terza stringa:");
	        String stringa3 = input.nextLine();

	        // Concatenazione delle stringhe in ordine di inserimento
	        String concatenazioneOrdinata = stringa1 +" "+ stringa2+" " + stringa3;
	        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdinata);

	        // Concatenazione delle stringhe in ordine inverso di inserimento
	        
	        String concatenazioneInverso = stringa3+ " " + stringa2+  " " + stringa1;
	        System.out.println("Concatenazione in ordine inverso di inserimento: " + concatenazioneInverso);
	        
	        
	        input.close();
	    }

}
