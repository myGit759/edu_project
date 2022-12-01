package day06;

import java.util.Random;

public class Gacha {
	Random ran = new Random(); 
	private int weaponlevel;
	private int money;
	private int cost;
	
	
	public int getProb(int level) {
		int num = 10 - level;
		return num;
	}

	public int getLevel() {
		return weaponlevel;
	}

	public void setLevel(int level) {
		this.weaponlevel = level;
	}

	public int getButton() {
		int result = 2;
		money -= cost;
		if(money < cost)	return 0;
		if(ran.nextInt(getProb(weaponlevel)) != 0) {
			result = 1;
			weaponlevel++;
		}
		return result;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCost() {
		return cost = 100 * (weaponlevel + 1);
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
