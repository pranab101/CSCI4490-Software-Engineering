package clientUserInterface;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


import clientCommunication.*;

public class GamePanel extends JPanel 
{
	public GamePanel(GameControl gc)
	{
		JPanel north = new JPanel();
		JPanel east = new JPanel();
		JPanel south = new JPanel();
		JPanel west = new JPanel();
		JPanel center = new JPanel();
		
		JLabel statusText = new JLabel("Score: [Wizard1Score] - [Wizard2Score]");
		north.add(statusText);
		
		// West - Wizard 1 HP and Cards
		JPanel westRowPanel = new JPanel(new GridLayout(0, 1));
		west.add(westRowPanel);
		
		JLabel wizard1healthLabel = new JLabel("Wizard 1 - [wizard1health] HP");
		westRowPanel.add(wizard1healthLabel);

		JLabel wizard1card1 = new JLabel("");
		wizard1card1.setIcon(new ImageIcon(GamePanel.class.getResource("./fire.png")));
		westRowPanel.add(wizard1card1);
		
		JLabel wizard1card2 = new JLabel("");
		wizard1card2.setIcon(new ImageIcon(GamePanel.class.getResource("./water.png")));
		westRowPanel.add(wizard1card2);

		JLabel wizard1card3 = new JLabel("");
		wizard1card3.setIcon(new ImageIcon(GamePanel.class.getResource("./electricity.png")));
		westRowPanel.add(wizard1card3);

		// Center - Wizard Icon, Statuses, and Card Selections
		JPanel centerGrid = new JPanel(new GridLayout(3, 1));

		JLabel wizardIcon = new JLabel("");
		wizardIcon.setIcon(new ImageIcon(GamePanel.class.getResource("./wizardclear.png")));
		centerGrid.add(wizardIcon);
		
		JPanel cardChoicePanel = new JPanel(new GridLayout(2, 1));
		cardChoicePanel.setSize(300, 50);

		JLabel card1choice = new JLabel("Card 1:");
		cardChoicePanel.add(card1choice);

		JComboBox card1options = new JComboBox();
		card1options.setModel(new DefaultComboBoxModel(new String[] { "Electricity", "Water", "Fire", "Health" }));
		cardChoicePanel.add(card1options);

		JPanel card2choicePanel = new JPanel();
		card2choicePanel.setSize(300, 50);

		JLabel card2choice = new JLabel("Card 2:");
		cardChoicePanel.add(card2choice);

		JComboBox card2options = new JComboBox();
		card2options.setModel(new DefaultComboBoxModel(new String[] { "Electricity", "Water", "Fire", "Health" }));
		cardChoicePanel.add(card2options);
		centerGrid.add(cardChoicePanel);

		JPanel statusBox = new JPanel();
		statusBox.setBorder(BorderFactory.createLineBorder(Color.black));
		statusBox.setLayout(new GridBagLayout());
		JLabel status = new JLabel();
		status.setText("[set status text here]");

		statusBox.add(status);
		centerGrid.add(statusBox);

		center.add(centerGrid);

		// East - Wizard 2 HP and Cards
		JPanel eastRowPanel = new JPanel(new GridLayout(0, 1));
		east.add(eastRowPanel);

		JLabel wizard2healthLabel = new JLabel("Wizard 1 - [wizard1health] HP");
		eastRowPanel.add(wizard2healthLabel);

		JLabel wizard2card1 = new JLabel("");
		wizard2card1.setIcon(new ImageIcon(GamePanel.class.getResource("./health.png")));
		eastRowPanel.add(wizard2card1);

		JLabel wizard2card2 = new JLabel("");
		wizard2card2.setIcon(new ImageIcon(GamePanel.class.getResource("./water.png")));
		eastRowPanel.add(wizard2card2);

		JLabel wizard2card3 = new JLabel("");
		wizard2card3.setIcon(new ImageIcon(GamePanel.class.getResource("./fire.png")));
		eastRowPanel.add(wizard2card3);

		// South - Play Hand / Play Again / Quit Game Buttons
		JButton playHand = new JButton("Play Hand");
		south.add(playHand);

		JButton playAgain = new JButton("Play Again");
		south.add(playAgain);

		JButton quitGame = new JButton("Quit Game");
		south.add(quitGame);

		this.add(north, BorderLayout.NORTH);
		this.add(east, BorderLayout.EAST);
		this.add(south, BorderLayout.SOUTH);
		this.add(west, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
	}
}

