package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Jogador {
	protected List<Carta> mao = new LinkedList<>();
	private String nome;
	private int soma;
	
	public Jogador(String n){
		setNome(n);
	}
	
	public void setNome(String n){
		nome = n;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getSoma(){
		for(Carta somar : mao){
			soma = soma + somar.getValor();
		}
		return soma;
	}
	
	public void setMao(Carta m){
		mao.add(m);
	}
	
	public void getMao(){
		for(Carta percorre : mao){
			System.out.println(percorre.getNumero() + " de "+ percorre.getNaipe());
		}
	}
	
}
