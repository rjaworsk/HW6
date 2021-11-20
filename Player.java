package task2;

public class Player {

	int max_it;
	BetMore_Game Bet;
	String name;
	int card_number;

	public Player(int max_it, BetMore_Game Bet, String name) {
		this.max_it = max_it;
		this.Bet = Bet;
		this.name = name;
	}

	public int start() {
		card_number = Bet.play(max_it);
		return card_number;
	}

}
