package ss.d1029;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}



class Parent {
	public void parentMethod() {
		
	}
}

class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		
		@Override
		public void parentMethod() {
			childField = 3;
			childMethod();
		}
	};
	
	void method() {
//		field.childField = 3; ���� �Ұ�
//		field.childMethod(); ���� �Ұ�
		field.parentMethod();
	}
}

public class SS_AnnoymousClass {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
		}
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
