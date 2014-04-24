package marsh.controller;

import marsh.model.Monster;
import marsh.view.MonsterFrame;

public class MonsterController
{
	private MonsterFrame appFrame;
	private Monster [] monsters;
	private Monster monsterCount;
	
	public MonsterController()
	{
		monsters = new Monster[4];
		monsterCount = 0;
	}
	
	public void start()
	{
		appFrame = new MonsterFrame(this);
	}
	
	public void addMonster(String name, int legs, int eyes, int arms, boolean hasHorns)
	{
		if(monsterCount < monsters.length)
		{
			Monster tempMonster = new Monster(name, legs, eyes, arms, hasHorns);
			monsters[monsterCount] = tempMonster;
			monsterCount++;
		}
		else
		{
			
		}
	}
}
