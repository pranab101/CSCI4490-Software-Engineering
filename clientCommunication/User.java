package clientCommunication;

import java.io.Serializable;

public class User implements Serializable 
{
  // Private data fields for the username and password.
  private String username;
  private String password;
  private Long userID;
  private String card1;
  private String card2;
  private String card3;
  
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
  public String getCard1()
  {
	  return card1;
  }
  
  public String getCard2()
  {
	  return card2;
  }
  public String getCard3()
  {
	  return card3;
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
  public void setCard1(String card1)
  {
	  this.card1 = card1;
  }
  public void setCard2(String card2)
  {
	  this.card2 = card2;
  }
  public void setCard3(String card3)
  {
	  this.card1 = card3;
  }
  // Constructor that initializes the username and password.
  public User(String username, String password)
  {
    setUsername(username);
    setPassword(password);
  }
}