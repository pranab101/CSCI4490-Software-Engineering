package clientCommunication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import clientUserInterface.*;


public class LobbyControl implements ActionListener
{
	private JPanel container;
	 private GuWeeOhClient client;
	 
	public LobbyControl(JPanel container, GuWeeOhClient client)
	{
		 this.container = container;
		 this.client = client;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if (command.equals("New Game"))
		{
			CardLayout cardLayout = (CardLayout)container.getLayout();
		      cardLayout.show(container, "5");
		      
		      try {
		  		client.sendToServer("NewGame:");
		  	} catch (IOException e) {
		  		// TODO Auto-generated catch block
		  		e.printStackTrace();
		  	}
		}
		else if (command.equals("Quit Game"))
		{
			CardLayout cardLayout = (CardLayout)container.getLayout();
		      cardLayout.show(container, "2");
		}
	}
}
