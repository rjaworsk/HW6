package task2;

import java.util.Scanner;

public class BetMore_Game {

	public Shuffle s;

	public BetMore_Game() {
		s = new Shuffle();

	}

	public int play(int max_it) {
		int card_number = 0;
		int it = 0;

		boolean user_selected = false;

		if (max_it == 1) {
			card_number = s.pick_card(); // for Computer
			return card_number;
		} else {

			Scanner in = new Scanner(System.in);
			while (it <= max_it) {

				card_number = s.pick_card();

				System.out.println("Your card is " + card_number + ". " + "Do you want to pick this card? [yes = true, no = false]");

				user_selected = in.nextBoolean();

				if (user_selected == true) {

					System.out.println("Your current card is: " + card_number);

					return card_number;
				}

				++it;

			}

			in.close();

			System.out.println("Your current card is: " + card_number);

			return card_number;

		}

	}

	public String FindWinner(Player Computer, Player Player2) {
		String result;

		if (Computer.card_number > Player2.card_number) {
			result = Computer.name + " has won!";

		} else {
			if (Computer.card_number < Player2.card_number) {
				result = Player2.name + " have won!";

			} else {
				result = "Tied";
			}

		}
		return result;

	}
}
