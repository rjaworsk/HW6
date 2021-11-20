package task2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting Bet-More-Game. You play against the computer and the h"
				+ "ighest card (1 to 100) wins the game.");
		BetMore_Game Bet = new BetMore_Game();
		Player Computer = new Player(1, Bet, "Computer");
		Player Player2 = new Player(5, Bet, "You");

		Game_Chair Game_Chair = new Game_Chair(Computer, Player2, Bet);

		Game_Chair.start_game();

	}
}
