package ss.d1022;

import java.util.function.Supplier;

class SingleTon {
	public static final SingleTon instance = new SingleTon();
	
	int count;
	
	// 리플렉션을 사용해서 private 생성자를 호출할 수 있지만 count를 사용해서 막을 수 있다.
	private SingleTon() {
		count++;
		if (count != 1) {
			throw new IllegalStateException("no more instance!!");
		}
	}
	
	public static SingleTon getInstance() {
		// 장점: 나중에 싱글톤이 아니게 하고 싶을 때 return new SingleTon() 으로 바꾸면 
		//      getInstance() 를 호출하는 클라이언트 부분은 안 바꿔도 되서 좋다.
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
