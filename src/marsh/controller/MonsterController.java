package marsh.controller;

import marsh.view.MonsterFrame;

public class MonsterController
{
	private MonsterFrame appFrame;
	
	public void start()
	{
		appFrame = new MonsterFrame(this);
	}
	
	public void addMonster(String name, int legs, int eyes, int arms, boolean hasHorns)
	{
		
	}
}
