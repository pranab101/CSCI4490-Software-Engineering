package clientCommunication;

import java.io.Serializable;
import java.util.ArrayList;


public class GameData implements Serializable
{
	private User player1;
	private User player2;
	//private String[] cards = {"Electricity", "Water", "Fire", "Health", "Unsure"};
	
	public GameData()
	{
	}
	
	public void setCards(long l, String card1, String card2, String card3)
	{
		if (player1.getID() == l)
		{
			player1.setCard1(card1);
			player1.setCard2(card2);
			player1.setCard3(card3);
		}
		else if (player2.getID() == l)
		{
			player2.setCard1(card1);
			player2.setCard2(card2);
			player2.setCard3(card3);
		}
	}
}
