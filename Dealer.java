package blackjack;

public class Dealer extends Jogador{

	public Dealer(String n) {
		super(n);
	}
	
	public void getCartaDeCima(){
			Carta percorre = mao.get(1);
			System.out.println(percorre.getNumero() + " de "+ percorre.getNaipe());
		}
}
