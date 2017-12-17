/**
 * Author: Kelvin Chen
 * Date: 12/17/2017
 * Lab 4.1
 */
package lab4_1;

public class DeskTester {

	public static void main(String[] args) 
	{
		String[] ranks = new String[] { "Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",};
		String[] suits = new String[] {"Diamond","Heart", "Clover", "Spade"};
		int[] pointValues = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		Deck deck = new Deck(ranks, suits, pointValues);
		for (int x = deck.size(); x > 0; x--) 
		{
			deck.deal();
		}
		deck.shuffle();
		for (int x = deck.size(); x > 0; x--) 
		{
			System.out.println(deck.deal());
		}
		
	}

}
