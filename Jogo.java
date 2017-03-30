package blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
	private static Scanner sc;

	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		List<Jogador> jogadores = new LinkedList<>();
		Dealer dealer = new Dealer("Dealer");
		
		sc = new Scanner(System.in);
		
		System.out.println("Quantos jogadores? ");
		int numeroJogadores = sc.nextInt();
		int nJ = numeroJogadores;
		
		while(numeroJogadores != 0){
			String nome = "";
			System.out.println("Entre com um nome para o jogador: ");
			nome = sc.next();
			
			jogadores.add(new Jogador(nome));
			numeroJogadores--;
		}
		
		baralho.embaralhar();
		
		int tira = 0;
		
		for(Jogador darCarta : jogadores){
			darCarta.setMao(baralho.tiraC(tira));
			tira++;
			darCarta.setMao(baralho.tiraC(tira));
			tira++;
		}
		
		dealer.setMao(baralho.tiraC(tira));
		tira++;
		dealer.setMao(baralho.tiraC(tira));
		tira++;
			
		for(Jogador darCarta : jogadores){
			System.out.println(darCarta.getNome() + " tem na mão:");
			darCarta.getMao();
			System.out.println("");
		}
		
		System.out.println("O Dealer tem:");
		dealer.getCartaDeCima();
		System.out.println("");
		
		for(Jogador continuar : jogadores){
			System.out.println(continuar.getNome() + " deseja comprar mais cartas? (S/N): ");
			String opc = sc.next();
			while(opc.equals("s") || opc.equals("S")){
				continuar.setMao(baralho.tiraC(tira));
				tira++;
				System.out.println(continuar.getNome() + " tem na mão");
				continuar.getMao();
				System.out.println("");
				System.out.println(continuar.getNome() + " deseja comprar mais cartas? (S/N): ");
				opc = sc.next();
			}
		}
		
		System.out.println("Dealer mostra as cartas: ");
		dealer.getMao();
		System.out.println("");
		
		System.out.println("Pontuação: ");
		
		for(Jogador somar : jogadores){
				System.out.println(somar.getNome() + " : " + somar.getSoma() + " pontos! ");
				
		}	
		
		System.out.println(dealer.getNome() + " : " + dealer.getSoma() + " pontos!");

		for(Jogador ganhador : jogadores){
			if(ganhador.getSoma() > dealer.getSoma()){
				System.out.println(ganhador.getNome()+" ganhou do dealer!");
			}else{	
				System.out.println("Dealer ganhou!");
			}
		}	
	
		
		

	}
}
