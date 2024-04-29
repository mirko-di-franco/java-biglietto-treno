package biglietto;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		//prezzo al Km
		float prezzoKm = 0.21F;
		
		//inizializzo lo scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanti anni hai?");
		int etaUtente = scanner.nextInt();
		
		System.out.println("Quanti chilometri vuoi percorrere?");
		int numeroKm = scanner.nextInt();
		
		scanner.close();
		
		float prezzoBiglietto = prezzoKm * numeroKm;
		
		if(etaUtente < 18) {
			prezzoBiglietto = prezzoBiglietto * 0.8F;
		}else if(etaUtente > 65) {
			prezzoBiglietto = prezzoBiglietto * 0.6F;
		}
		
		System.out.println("Il prezzo del tuo biglietto è "+ String.format("%.02f", prezzoBiglietto)+ "€");
	}

}
