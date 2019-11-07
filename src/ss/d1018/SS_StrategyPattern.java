package ss.d1018;

// ���� �˰����� �ϳ��� �߻����� �������� ����� ���������� ���� ��ȯ �����ϵ��� �ϴ� ����.

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
	// ������
	Weapon weapon;
	
	// ��ȯ ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if (weapon != null) {
			// ��������Ʈ (� ��ü�� ����� ������ �� �ٸ� ��ü�� ����� ������ ����ϴ� ��. 
			weapon.attack();
		} else {
			System.out.println("�Ǽհ���!!!");
		}
	}
}

interface Weapon{
	public void attack();
}

class Sword implements Weapon{
	@Override
	public void attack() {
		System.out.println("�� ����!!!");
	}
}

class Knife implements Weapon{
	@Override
	public void attack() {
		System.out.println("Į ����!!!");
	}
}

class Axe implements Weapon{
	@Override
	public void attack() {
		System.out.println("��������");
	}
}