package lab4_1;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	public Deck(String[] rank,String[] suit, int[] pointValue)
	{
		for(int x = 0; x < rank.length; x++)
		{
			for(int y = 0; y < suit.length;y++)
			{
					Card push = new Card(rank[x], suit[y], pointValue[x]);
					unDealt.add(push);
			}
		}
	}
	public boolean isEmpty()
	{
		return(unDealt.size()==0);
	}
	public int size()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		if(unDealt.isEmpty())
		{
			return null;
		}
		Card temp = unDealt.get(0);
		unDealt.remove(0);
		Dealt.add(temp);
		return temp;
		
	}
	public void shuffle()
	{
		
	}
}
