package serverCommunication;

import clientCommunication.*;
import java.util.Random;


public class GameController 
{
	//GuWeeOhServer server = new GuWeeOhServer();
	clientCommunication.GameData gamedata= new clientCommunication.GameData();
	
	public GameController()
	{
		User player1 = null;
		User player2 = null;
		

		Random rand = new Random(); 
		String[] cards = {"Fire", "Water", "Electricity", "Health"};
		String[] wizard1cards = {"?", "?", "?"};
		String[] wizard2cards = {"?", "?", "?"};
		
		int wizard1health = 100;
		int wizard2health = 100;
		
		for (int i = 0; i < 3; i ++) 
		{
			if (wizard1cards[i] == "?")
				wizard1cards[i] = cards[rand.nextInt(4)];
			if (wizard2cards[i] == "?")
				wizard2cards[i] = cards[rand.nextInt(4)]; 
		}
		//player1.setCards(wizard1cards[0], wizard1cards[1], wizard1cards[2]);
		//player2.setCards(wizard2cards[0], wizard2cards[1], wizard2cards[2]);
		
		

	}

}
