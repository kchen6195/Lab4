package lab4_1;

public class Card {
	
	private String rank;
	private String suit;
	private int pointValue;
	public Card(String rank,String suit,int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	public String getRank()
	{
		return this.rank;
	}
	public String getSuit()
	{
		return this.suit;
	}
	public int getPointValue()
	{
		return this.pointValue;
	}
	public boolean equals(Card otherCard)
	{
		return(this.rank == otherCard.getRank() &&
			this.suit == otherCard.getSuit() &&
			this.pointValue == otherCard.getPointValue());
			
	}
	public String toString()
	{
		return "This card is " + rank + " of "+ suit + " and has "
				+ "a value of "+ pointValue + " .";
	}
}
