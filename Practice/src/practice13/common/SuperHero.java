package practice13.common;
public class SuperHero extends Hero {

	Item equipment;

	public SuperHero(int hp,int power, int endurance){
		super(hp,power,endurance);
	}


	public int attack() {
		return super.attack()+this.equipment.getAdditionalDamage();
	}


	public Item getEquipment() {
		return equipment;
	}


	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}




}
