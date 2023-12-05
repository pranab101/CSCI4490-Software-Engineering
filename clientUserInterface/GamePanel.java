package clientUserInterface;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import clientCommunication.*;

public class GamePanel extends JPanel {
	public GamePanel(GameControl gc) {
		JPanel north = new JPanel();
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		JPanel center = new JPanel();
		JPanel container = new JPanel(new BorderLayout());

		setBackground(new Color(255, 255, 255));

		JLabel statusText = new JLabel("Score: [Wizard1Score] - [Wizard2Score]");
		north.add(statusText);

		// West - Wizard 1 HP and Cards
		JPanel westRowPanel = new JPanel(new GridLayout(0, 1));

		JLabel wizard1healthLabel = new JLabel("Wizard 1 - [wizard1health] HP");
		westRowPanel.add(wizard1healthLabel);

		JLabel wizard1card1 = new JLabel("");
		wizard1card1.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/fire.png")));
		westRowPanel.add(wizard1card1);

		JLabel wizard1card2 = new JLabel("");
		wizard1card2.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/water.png")));
		westRowPanel.add(wizard1card2);

		JLabel wizard1card3 = new JLabel("");
		wizard1card3.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/electricity.png")));
		westRowPanel.add(wizard1card3);

		west.add(westRowPanel);

		// Center - Wizard Icon, Statuses, and Card Selections
		JPanel centerGrid = new JPanel(new GridLayout(4, 1));

		JLabel wizardIcon = new JLabel("");
		wizardIcon.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/wizardclear.png")));
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
		setLayout(new BorderLayout(0, 0));

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

		// South - Play Hand / Play Again / Quit Game Buttons
		JPanel buttons = new JPanel(new GridLayout(3, 0));
		JButton playHand = new JButton("Play Hand");
		buttons.add(playHand);

		JButton playAgain = new JButton("Play Again");
		playAgain.setVisible(false);
		buttons.add(playAgain);

		JButton quitGame = new JButton("Quit Game");
		quitGame.setVisible(false);
		buttons.add(quitGame);

		centerGrid.add(buttons);

		center.add(centerGrid);

		// East - Wizard 2 HP and Cards
		JPanel eastRowPanel = new JPanel(new GridLayout(0, 1));

		JLabel wizard2healthLabel = new JLabel("Wizard 2 - [wizard2health] HP");
		eastRowPanel.add(wizard2healthLabel);

		JLabel wizard2card1 = new JLabel("");
		wizard2card1.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/health.png")));
		eastRowPanel.add(wizard2card1);

		JLabel wizard2card2 = new JLabel("");
		wizard2card2.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/water.png")));
		eastRowPanel.add(wizard2card2);

		JLabel wizard2card3 = new JLabel("");
		wizard2card3.setIcon(new ImageIcon(GamePanel.class.getResource("/clientUserInterface/fire.png")));
		eastRowPanel.add(wizard2card3);

		east.add(eastRowPanel);

		container.add(north, BorderLayout.NORTH);
		container.add(east, BorderLayout.EAST);
		container.add(west, BorderLayout.WEST);
		container.add(center, BorderLayout.CENTER);

		this.add(container);
	}
}
