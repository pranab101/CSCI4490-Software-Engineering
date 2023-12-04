package clientUserInterface;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import clientCommunication.*;

public class LobbyPanel extends JPanel 
{
	private JPanel container;
	private GuWeeOhClient client;
	
	
	public LobbyPanel (LobbyControl lc)
	{
		setBackground(new Color(255, 255, 255));
		
		// Create the information label.
		JLabel titleLabelIntro = new JLabel("Welcome to", JLabel.CENTER);
	    JLabel titleLabel = new JLabel("", JLabel.CENTER);

	    titleLabel.setIcon(new ImageIcon(LobbyPanel.class.getResource("/clientUserInterface/GuWeeOhLogo.png")));
	    JPanel titleBufferPanel = new JPanel(new GridLayout(2,0,5,5));
	    titleBufferPanel.setBackground(new Color(255, 255, 255));
	    titleBufferPanel.add(titleLabelIntro);
	    titleBufferPanel.add(titleLabel);
	    
	    // Create the newGame button.
	    JButton newGameButton = new JButton("New Game");
	    newGameButton.addActionListener(lc);
	    JPanel newGameButtonBuffer = new JPanel();
	    newGameButtonBuffer.setBackground(new Color(255, 255, 255));
	    //newGameButtonBuffer.add(newGameButton);
	    
	    // Create the quit button.
	    JButton quitButton = new JButton("Quit Game");
	    //joinGameButton.setVerticalAlignment(SwingConstants.TOP);
	    quitButton.addActionListener(lc);
	    JPanel joinGameButtonBuffer = new JPanel(new GridLayout(2,0,5,25));
	    joinGameButtonBuffer.setBackground(new Color(255, 255, 255));
	    joinGameButtonBuffer.add(newGameButton);
	    joinGameButtonBuffer.add(quitButton);
	    

	    // Arrange the components in a grid.
	    JPanel upperFill = new JPanel();
	    upperFill.setBackground(new Color(255, 255, 255));
	    setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	    JPanel grid = new JPanel(new GridLayout(4, 1, 10, 30));
	    grid.setBackground(new Color(255, 255, 255));
	    //grid.add(upperFill);
	    grid.add(titleBufferPanel);
	    //grid.add(newGameButtonBuffer);
	    grid.add(joinGameButtonBuffer);
	    this.add(grid);
	    
	}

}
