package clientCommunication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


public class GameData implements Serializable
{
	private User player1;
	private User player2;
	private String[] cards;
	public int health;
	public int score;
	public String pick1;
	public String pick2;
	public String status;
	public int opponentHealth;
	
	Random rand = new Random();

	String[] allCards = {"Fire", "Water", "Electricity", "Health"};

	
	 public int getHealth()
	  {
		  return health;
	  }
	  public int getScore()
	  {
		  return score;
	  }
	  public String getPick1()
	  {
		  return pick1;
	  }
	  public String getPick2()
	  {
		  return pick2;
	  }
	  public String getStatus()
	  {
		  return status;
	  }
	  public int getOpponentHealth()
	  {
		  return opponentHealth;
	  }
	  public void setHealth(int health)
	  {
		  this.health = health;
	  }
	  public void setScore(int score)
	  {
		  this.score = score;
	  }
	  public void setPick1(String pick1)
	  {
		  this.pick1 = pick1;
	  }
	  public void setPick2(String pick2)
	  {
		  this.pick2 = pick2;
	  }
	  public void setStatus(String status)
	  {
		  this.status = status;
	  }
	  public void setOpponentHealth(int opponentHealth)
	  {
		  this.opponentHealth = opponentHealth;
	  }
	  
	  public String[] dealCards(long l)
		{
		  if (player1.getID()== l)
		  {
				String cards[] = getCards();
				
				for (int i = 0; i < 3; i ++) 
				{
					if (cards[i] == "Unsure")
						cards[i] = allCards[rand.nextInt(4)];
				}
		  }
		  else if (player2.getID()== l)
		  {

				String cards[] = getCards();
				
				for (int i = 0; i < 3; i ++) 
				{
					if (cards[i] == "Unsure")
						cards[i] = allCards[rand.nextInt(4)];
					}
		  }
			return cards;
		}
	  
	
	public GameData()
	{
		player1 = new User();
		player2 = new User();
	}
	
	public void setCards(long l, String[] cards)
	{
		if (player1.getID() == l)
		{
			player1.setCards(cards);
		}
		else if (player2.getID() == l)
		{
			player2.setCards(cards);
		}
	}
	
	public void setPlayer1(User player1)
	{
		this.player1 = player1;
	}
	
	public void setPlayer2(User player2)
	{
		this.player2 = player2;
	}
	
	public String[] getCards()
	{
		return cards;
	}
	
	public User getPlayer1()
	{
		return player1;
	}
	
	public User getPlayer2()
	{
		return player2;
	}
	
//	public void resetGame()
//	{
//		player1.setHealth(100);
//		player1.setHealth(100);
//	}
}
