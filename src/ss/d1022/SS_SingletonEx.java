package ss.d1022;

import java.util.function.Supplier;

class SingleTon {
	public static final SingleTon instance = new SingleTon();
	
	int count;
	
	// ���÷����� ����ؼ� private �����ڸ� ȣ���� �� ������ count�� ����ؼ� ���� �� �ִ�.
	private SingleTon() {
		count++;
		if (count != 1) {
			throw new IllegalStateException("no more instance!!");
		}
	}
	
	public static SingleTon getInstance() {
		// ����: ���߿� �̱����� �ƴϰ� �ϰ� ���� �� return new SingleTon() ���� �ٲٸ� 
		//      getInstance() �� ȣ���ϴ� Ŭ���̾�Ʈ �κ��� �� �ٲ㵵 �Ǽ� ����.
		return instance;
	}
}

public class SS_SingletonEx {	
	
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.instance;
		SingleTon s2 = SingleTon.getInstance();
		Supplier<SingleTon> s1supplier = SingleTon::getInstance;
//		s1supplier.get().count;
	}

}
