import java.util.Arrays;
import java.util.Iterator;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//metodo 1
	 int moltiplicazione = moltiplica(3,2);
	 System.out.println(moltiplicazione);
	 
	 //metodo 2
	 String concatenazione = concatena("ciao il numero è: ",5);
	 System.out.println(concatenazione);
	 
	 //metodo 3
	 String[] vecchioArray = {"pippo","pluto","paperino","minnie","qui"};
	 String stringaDaAggiungere = "luca";
	
	 for (String x : inseriscilnArray(vecchioArray,stringaDaAggiungere)) {
			System.out.println(x);
		}
	
	}

	
	public static int moltiplica(int a, int b) {
		return a * b;
		
		
		}

	  public static String concatena(String str, int numero) {
	        return str + numero;
	  }
	  
	  
	  public static String[] inseriscilnArray(String[]array, String stringaDaAggiungere) {
		  String[] nuovoArray = new String[6];
		
		    int indiceNuovoArray = 0;

		    for (int i = 0; i < array.length; i++) {
		        if (i == 2) {
		            nuovoArray[indiceNuovoArray] = stringaDaAggiungere;
		            indiceNuovoArray++;
		        }

		        nuovoArray[indiceNuovoArray] = array[i];
		        indiceNuovoArray++;
		    }

		    return nuovoArray;
		  
	  }
}
