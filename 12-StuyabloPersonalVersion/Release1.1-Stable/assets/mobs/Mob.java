public class Mob implements Comparable{
	public int health;
	public String name;
	public int dexterity; //Damage redux
	public int strength; //Attack Damage
	public int speed; //Movement and attack speed
	public int level;
	public int experience;
	public int maxHealth;
	public String type;
	public int xcor;
	public int ycor;
/*
	public Mob(int h, String s, int l, int atkdmg, int dex, int spd){
		health = h;
		name = s;
		level = l;
		experience = 0;
		strength = atkdmg;
		dexterity = dex;
		speed = speed;


	}
*/
	public int compareTo(Object obj){
		Mob them = (Mob)obj;
		return (this.level * 100 + this.experience) - (them.level * 100 + them.experience);
	}
}
