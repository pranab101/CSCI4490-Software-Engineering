package clientCommunication;


import java.io.Serializable;
import java.util.Random;

public class User implements Serializable
{
  // Private data fields for the username and password.
  private String username;
  private String password;
  private Long userID;
  public String[] cards;
  
  
  Random rand = new Random();
  String[] allCards = {"Fire", "Water", "Electricity", "Health"};
  
  public User()
  {
	  cards = new String[]{"Unsure", "Unsure", "Unsure"};
	  //health = 100;
	  //opponentHealth = 100;
	  //score = 0;
  }
  
  // Getters for the username and password.
  public String getUsername()
  {
    return username;
  }
  public String getPassword()
  {
    return password;
  }
  public long getID()
  {
	  return userID;
  }
  public String[] getCards()
  {
	  return cards;
  }
 
  
  // Setters for the username and password.
  public void setUsername(String username)
  {
    this.username = username;
  }
  public void setPassword(String password)
  {
    this.password = password;
  }
  public void setID(Long userID)
  {
	  this.userID = userID;
  }
  public void setCards(String[] cards)
  {
	  this.cards = cards;
  }
  
  
  public String[] dealCards()
	{
		String cards[] = getCards();
		
		for (int i = 0; i < 3; i ++) {
			if (cards[i] == "Unsure")
				cards[i] = allCards[rand.nextInt(4)];
		}
		
		return cards;
	}
  
  
  
  
  // Constructor that initializes the username and password.
  public User(String username, String password, Long id)
  {
    setUsername(username);
    setPassword(password);
    setID(id);
  }
}