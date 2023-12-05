package clientCommunication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.*;
import clientUserInterface.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

public class GameControl implements ActionListener {
	private User user;
	private JPanel container;
	private GuWeeOhClient client;
	private GameData gameData;
	private String[]player1Cards;
//	private int firstCardSelection;
//	private int secondCardSelection;

	Random rand = new Random();
	String[] allCards = { "Fire", "Water", "Electricity", "Health" };

	public GameControl(JPanel container, GuWeeOhClient client) 
	{
		this.container = container;
		this.client = client;
		//System.out.println("\nHere");
	}

	// Action listner
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		// If user presses the play hand
		if (command.equals("Play Hand"))
		{
			try {
				client.sendToServer(allCards);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
//		if (command == "Play Hand") {
//			if ((user.pick1 == "Water" && user.pick2 == "Electricity")
//					|| (user.pick1 == "Electricity" && user.pick2 == "Water")) {
//				user.setStatus("Thunderstorm! Double damage.");
//				if ((user.opponentHealth - 40) < 0) {
//					user.opponentHealth = 0;
//				} else
//					user.opponentHealth -= 40;
//				user.setStatus("Wizard 2's user.health is " + user.opponentHealth + ".");
//			} else if ((user.pick1 == "Water" && user.pick2 == "Fire")
//					|| (user.pick1 == "Fire" && user.pick2 == "Water")) {
//				user.setStatus("Water Vapor. Half damage...");
//				if ((user.opponentHealth - 10) < 0) {
//					user.opponentHealth = 0;
//				} else
//					user.opponentHealth -= 10;
//				user.setStatus("Wizard 2's health is " + user.opponentHealth + ".");
//			} else if ((user.pick1 == "Health"
//					&& (user.pick2 == "Fire" || user.pick2 == "Water" || user.pick2 == "Electricity"))
//					|| ((user.pick1 == "Fire" || user.pick1 == "Water" || user.pick1 == "Electricity")
//							&& user.pick2 == "Health")) {
//				user.setStatus("Healing attack! 10 health to yourself and 10 damage to opponent.");
//				if ((user.opponentHealth - 10) < 0) {
//					user.opponentHealth = 0;
//				} else
//					user.opponentHealth -= 10;
//
//				if ((user.health + 10) > 100) {
//					user.health = 100;
//				} else
//					user.health += 10;
//				user.setStatus("Your new health is " + user.health + ".");
//				user.setStatus("Wizard 2's health is " + user.opponentHealth + ".");
//			} else if ((user.pick1 == "Health" && user.pick2 == "Health")) {
//				user.setStatus("Great heal! 30 health to yourself.");
//				if ((user.health + 30) > 100) {
//					user.health = 100;
//				} else
//					user.health += 30;
//				user.setStatus("Your new health is " + user.health + ".");
//				user.setStatus("Wizard 2's health is " + user.opponentHealth + ".");
//			} else {
//				user.setStatus("20 points of damage.");
//				if ((user.opponentHealth - 20) < 0) {
//					user.opponentHealth = 0;
//				} else
//					user.opponentHealth -= 20;
//				
//				user.setStatus("Wizard 2's health is " + user.opponentHealth + ".");
//			}
//
//			if (user.opponentHealth <= 0) {
//				user.setStatus("Wizard 1, you win!");
//			}
//		} else if (command == "Play Again") {
//			gameData.resetGame();
//		} else if (command == "Quit Game") {
//
//		}
//
	}
}
