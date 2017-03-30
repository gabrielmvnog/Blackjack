package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho{
	 private ArrayList<Carta> baralho = new ArrayList<Carta>();
	 private String[] naipes = {"Espadas", "Copas", "Paus", "Ouros"};
	 private String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama","Rei"};
	 
	public Baralho(){
		int b = 0;
		 for (int i=0; i < nomes.length; i++){
			 for(int j = 0; j < naipes.length;j++){
				 baralho.add(new Carta(nomes[i],naipes[j]));
				 if((i >= 0) && (i <= 9)){
					baralho.get(b).setValor(i + 1);  
				 }
				 else{
					 baralho.get(b).setValor(10);
				 }
				 
				 b++;
			 }
		 }
		  
	}
	
	public ArrayList<Carta> embaralhar(){
		Collections.shuffle(baralho);
		return baralho;
	}
	
	public void getBaralho(){
		for(Carta varrer : baralho){
			System.out.println(varrer.getNumero() + " de " + varrer.getNaipe() + " = " + varrer.getValor());
		}		
	}
	
	public int tiraCarta(int tira){
		int valor;
		valor = baralho.get(tira).getValor();
		return valor;
	}
	
	public Carta tiraC(int tira){
		Carta carta;
		carta = baralho.get(tira);
		return carta;
	}
}
