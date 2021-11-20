package task2;

public class Game_Chair {

	public Player Computer;
	public Player Player2;
	public BetMore_Game Bet;

	public Game_Chair(Player Computer, Player Player2, BetMore_Game Bet) {
		this.Computer = Computer;
		this.Player2 = Player2;
		this.Bet = Bet;
	}

	public void start_game() {
		int card_number_1 = Computer.start();
		int card_number_2 = Player2.start();
		String Winner = Bet.FindWinner(Computer, Player2);

		System.out.println("Game outcome: " + Winner);

	}
}
