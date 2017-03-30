package blackjack;

public class Carta {
	private String numero;
	private String naipe;
	private int valor;
	
	public Carta(String num, String n){
		setNumero(num);
		setNaipe(n);
	}
	
	public void setNumero(String n){
		numero = n;
	}
	
	public  String getNumero(){
		return numero;
	}
	
	public void setNaipe(String n){
		naipe = n;
	}
	
	public String getNaipe(){
		return naipe;
	}
	
	public void setValor(int v){
		valor = v;
	}
	
	public int getValor(){
		return valor;
	}
	
}
