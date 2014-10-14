import java.util.*;
import java.io.*;

public class BaseChar extends Mob{
	public BaseChar(int h, String s, int l, int atkdmg, int dex, int spd){
		super.health = h;
		super.name = s;
		super.level = l;
		super.experience = 0;
		super.strength = atkdmg;
		super.dexterity = dex;
		super.speed = speed;
	}

//Data Grabbers
	public int health(){return super.health;}
	public int level(){return super.level;}
	public int experience(){return super.experience;}
	public int dexterity(){return super.dexterity;}
	public int speed(){return super.speed;}
	public int strength(){return super.strength;}
	public String name(){return super.name;}
	
//Data Setters
	public void setHealth(int n){super.health = n;}
	public void setExperience(int n){super.experience = n;}
	public void setLevel(int n){super.level = n;}
	public void setStrength(int n){super.strength = n;}
	public void setDexterity(int n){super.dexterity = n;}
	public void setSpeed(int n){super.speed = n;}
	public void setName(String s){super.name = s;}

//BaseChar types:
/*
	Warrior - Object (High Attack Damage, High Dexterity, Low Speed)
	Mage - Object (High speed, High Attack Damage, Low Dexterity)
	Archer - Object (High Speed, Very high attack damage, low health, low dexterity)
	Dwarf - Object (High Health, Very High Dexterity, Very Low Speed, Slightly Low Attack Damage)
*/
	public void warriorTemplate(String s){
		super.health = 100;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 8;
		super.dexterity = 5;
		super.speed = 2;
	}

	public void mageTemplate(String s){
		super.health = 100;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 8;
		super.dexterity = 1;
		super.speed =  4;
	}

	public void archerTemplate(String s){
		super.health = 65;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 13;
		super.dexterity = 0;
		super.speed = 5;
	}

	public void dwarfTemplate(String s){
		super.health = 120;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 7;
		super.dexterity = 9;
		super.speed = 1;
	}

}