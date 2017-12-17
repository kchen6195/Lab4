/**
 * Author: Kelvin Chen
 * Date: 12/17/2017
 * Lab 4.1
 */
package lab4_1;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> dealt;
	/**
	 * Constructor
	 * @param rank
	 * @param suit
	 * @param pointValue
	 */
	public Deck(String[] rank,String[] suit, int[] pointValue)
	{
		ArrayList<Card> cards = new ArrayList<>();
		dealt = new ArrayList<>();
		for(int x = 0; x < rank.length; x++)
		{
			
			for(int y = 0; y < suit.length;y++)
			{
					Card push = new Card(rank[x], suit[y], pointValue[x]);
					cards.add(push);
			}
		}
		this.unDealt = cards;
	}
	/**
	 * if unDealt is empty
	 * @return if empty or not
	 */
	public boolean isEmpty()
	{
		return(unDealt.size()==0);
	}
	/**
	 * 
	 * @return size of unDealt
	 */
	public int size()
	{
		return unDealt.size();
	}
	/**
	 * puts undealt card int dealt and "deal" card
	 * @return card
	 */
	public Card deal()
	{
		if(unDealt.isEmpty())
		{
			return null;
		}
		Card temp = unDealt.get(0);
		unDealt.remove(0);
		dealt.add(temp);
		return temp;
		
	}
	/**
	 * randomly puts dealt cards into unDealt 
	 *
	 */
	public void shuffle()
	{
		for(int x = dealt.size()-1; x > 0; x--)
		{
			int r= (int)(Math.random()* (x+1));
			Card temp = dealt.get(x);
			Card otherTemp = dealt.get(r);
			dealt.remove(x);
			dealt.add(x, otherTemp);
			dealt.remove(r);
			dealt.add(r, temp);
		}
		for(int x = 0; x < dealt.size()-1;x++)
		{
			Card temp = dealt.get(0);
			dealt.remove(0);
			unDealt.add(temp);
		}
	}
}
