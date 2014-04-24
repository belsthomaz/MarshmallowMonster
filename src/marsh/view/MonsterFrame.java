package marsh.view;

import javax.swing.JFrame;

import marsh.controller.MonsterController;

public class MonsterFrame extends JFrame
{
	private MonsterController baseController;
	private MonsterPanel basePanel;
	
	public MonsterFrame(MonsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new MonsterPanel(baseController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800, 800);
		this.setVisible(true);
	}
}
