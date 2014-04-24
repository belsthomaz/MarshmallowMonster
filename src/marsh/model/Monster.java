package marsh.model;

public class Monster
{
	private String name;
	private int legs;
	private int eyes;
	private int arms;
	private boolean hasHorns;

	public Monster()
	{
		name = "";
		legs = 1;
		eyes = 6;
		arms = 0;
		hasHorns = false;
	}
	
	public Monster(String name, int legs, int eyes, int arms, boolean hasHorns)
	{
		this.name = name;
		this.legs = legs;
		this.eyes = eyes; 
		this.arms = arms;
		this.hasHorns = hasHorns;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getLegs()
	{
		return legs;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public int getEyes()
	{
		return eyes;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public int getArms()
	{
		return arms;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public boolean isHasHorns()
	{
		return hasHorns;
	}

	public void setHasHorns(boolean hasHorns)
	{
		this.hasHorns = hasHorns;
	}
}
