package ss.d1018;

// 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴.

public class SS_StrategyPattern {

	public static void main(String[] args) {
		GameCharacter gc = new GameCharacter();
		gc.attack();
		gc.setWeapon(new Sword());
		gc.attack();
		gc.setWeapon(new Knife());
		gc.attack();
		gc.setWeapon(new Axe());
		gc.attack();
	}
	
}

class GameCharacter{
	// 접근점
	Weapon weapon;
	
	// 교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if (weapon != null) {
			// 델리게이트 (어떤 객체가 기능을 수행할 때 다른 객체의 기능을 가저와 사용하는 것. 
			weapon.attack();
		} else {
			System.out.println("맨손공격!!!");
		}
	}
}

interface Weapon{
	public void attack();
}

class Sword implements Weapon{
	@Override
	public void attack() {
		System.out.println("검 공격!!!");
	}
}

class Knife implements Weapon{
	@Override
	public void attack() {
		System.out.println("칼 공격!!!");
	}
}

class Axe implements Weapon{
	@Override
	public void attack() {
		System.out.println("도끼공격");
	}
}