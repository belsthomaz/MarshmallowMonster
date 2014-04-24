package marsh.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import marsh.controller.MonsterController;

public class MonsterPanel extends JPanel
{
	private MonsterController baseController;
	
	private SpringLayout baseLayout;
	
	public MonsterPanel(MonsterController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
