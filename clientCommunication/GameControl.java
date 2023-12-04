package clientCommunication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import clientUserInterface.*;
import javax.swing.*;


public class GameControl implements ActionListener
{
	private JPanel container;
	private GuWeeOhClient client;
	
	public GameControl(JPanel container, GuWeeOhClient client)
	{
		this.container = container;
		this.client = client;
	}
	
	//Action listner
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		// If user presses the play  hand 
		if (command == "Play Hand")
		{
			// Select card from dropdown
			
            String actionCommand = ae.getActionCommand();
            

		}
	}
	
}
