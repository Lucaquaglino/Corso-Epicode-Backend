import java.util.Arrays;

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
	 
	 System.out.println(inseriscilnArray(vecchioArray,stringaDaAggiungere));
	
	}

	
	public static int moltiplica(int a, int b) {
		return a * b;
		
		
		}

	  public static String concatena(String str, int numero) {
	        return str + numero;
	  }
	  
	  
	  public static String inseriscilnArray(String[]array, String stringaDaAggiungere) {
		  String[] nuovoArray = new String[6];
		  nuovoArray[0]=array[0];
		  nuovoArray[1]=array[1];
		  nuovoArray[2]=stringaDaAggiungere;
		  nuovoArray[3]=array[2];
		  nuovoArray[4]=array[3];
		  nuovoArray[5]=array[4];
		  
		  return Arrays.toString(nuovoArray);
		  
	  }
}
