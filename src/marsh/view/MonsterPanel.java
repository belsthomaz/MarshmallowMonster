package marsh.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import marsh.controller.MonsterController;
import java.awt.Color;
import java.net.URL;

public class MonsterPanel extends JPanel
{
	private MonsterController baseController;
	private JTextField nameField;
	private JTextField armsField;
	private JTextField legsField;
	private JTextField eyesField;
	private JTextField hornsField;
	private JLabel nameLabel;
	private JLabel armsLabel;
	private JLabel legsLabel;
	private JLabel eyesLabel;
	private JLabel hornsLabel;
	private SpringLayout baseLayout;
	private PicturePanel picturePanel;
	private URL imageURL;
	
	public MonsterPanel(MonsterController baseController)
	{
		this.baseController = baseController;
		
		nameField = new JTextField(25);
		armsField = new JTextField(25);
		eyesField = new JTextField(25);
		legsField = new JTextField(25);
		hornsField = new JTextField(25);
		nameLabel = new JLabel("Name:");
		armsLabel = new JLabel("# of Arms:");
		legsLabel = new JLabel("# of Legs:");
		eyesLabel = new JLabel("# of Eyes: ");
		hornsLabel = new JLabel("Has Horns?:");
		baseLayout = new SpringLayout();
		picturePanel = new PicturePanel(imageURL, 300, 300);
		imageURL = getClass().getResource("/monster/marsh.view/monster.images/monster1");
		baseLayout.putConstraint(SpringLayout.WEST, picturePanel, 273, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, picturePanel, -224, SpringLayout.SOUTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(eyesField);
		this.add(armsField);
		this.add(legsField);
		this.add(nameField);
		this.add(hornsField);
		this.add(nameLabel);
		this.add(armsLabel);
		this.add(legsLabel);
		this.add(eyesLabel);
		this.add(hornsLabel);
		this.add(picturePanel);
	}
	
	public void setupLayout()
	{
		setBackground(new Color(0, 206, 209));
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 3, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, armsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, armsField, 14, SpringLayout.EAST, armsLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, armsField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, eyesField);
		baseLayout.putConstraint(SpringLayout.WEST, hornsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, eyesLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, legsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, armsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, hornsLabel, 3, SpringLayout.NORTH, hornsField);
		baseLayout.putConstraint(SpringLayout.NORTH, hornsField, 6, SpringLayout.SOUTH, eyesField);
		baseLayout.putConstraint(SpringLayout.WEST, hornsField, 0, SpringLayout.WEST, eyesField);
		baseLayout.putConstraint(SpringLayout.NORTH, eyesLabel, 3, SpringLayout.NORTH, eyesField);
		baseLayout.putConstraint(SpringLayout.NORTH, eyesField, 6, SpringLayout.SOUTH, legsField);
		baseLayout.putConstraint(SpringLayout.EAST, eyesField, 0, SpringLayout.EAST, armsField);
		baseLayout.putConstraint(SpringLayout.SOUTH, armsField, -6, SpringLayout.NORTH, legsField);
		baseLayout.putConstraint(SpringLayout.NORTH, legsField, -3, SpringLayout.NORTH, legsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, legsField, 0, SpringLayout.EAST, armsField);
		baseLayout.putConstraint(SpringLayout.NORTH, legsLabel, 17, SpringLayout.SOUTH, armsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, armsLabel, 60, SpringLayout.NORTH, this);
	}
	
	public void setupListeners()
	{
		
	}
}
