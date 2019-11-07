package ss.d1021;

import java.util.EnumSet;

//아이템1. 생성자 대신 static 팩토리 메소드 고려해 볼 것

// 장점 3: 리턴 타입의 하위 타입 인스턴스를 만들 수도 있다
interface StaticInterface {
	public static SS_StaticFactoryMethod getStaticInstance() {
		return new SS_StaticFactoryMethod();
	}
}

public class SS_StaticFactoryMethod {
	
	String name;
	String address;
	private static final SS_StaticFactoryMethod SINGLE_INSTANCE = new SS_StaticFactoryMethod();
	
	public SS_StaticFactoryMethod() {}
	
	public SS_StaticFactoryMethod(String name) {}
	
	// 장점 1: 이름을 가질 수 있어서 반환하는 객체를 예상하기 쉽다
	public static SS_StaticFactoryMethod withName(String name) {
		return new SS_StaticFactoryMethod(name);
	}
	
	// 장점 1: 똑같은 타입을 파라미터로 받는 생성자를 2개 이상 만들 수 있다
	public static SS_StaticFactoryMethod withAddress(String address) {
		SS_StaticFactoryMethod sfm = new SS_StaticFactoryMethod();
		sfm.address = address;
		return sfm;
	}
	
	// 장점 2: 반드시 새로운 객체를 만들 필요가 없다
	public static SS_StaticFactoryMethod getInstance() {
		return SINGLE_INSTANCE;
	}
	
	static class ChildStatic extends SS_StaticFactoryMethod {}
	
	static enum Color {
		RED, BLUE, WHITE
	}
	
	// 장점 4: 리턴하는 객체의 클래스가 입력 매개변수에 따라 매번 다를 수 있다
	public static SS_StaticFactoryMethod getInstance(boolean flag) {
		return flag ? new SS_StaticFactoryMethod() : new ChildStatic();
	}
	
	public static void main(String[] args) {
		SS_StaticFactoryMethod sfm = new SS_StaticFactoryMethod("Michael");
		SS_StaticFactoryMethod sfm1 = SS_StaticFactoryMethod.withName("Michael");
		SS_StaticFactoryMethod sfm2 = SS_StaticFactoryMethod.getInstance();
		SS_StaticFactoryMethod sfm3 = SS_StaticFactoryMethod.getInstance(false);
		
		// 장점 4: 리턴하는 객체의 클래스가 입력 매개변수에 따라 매번 다를 수 있다.
		EnumSet<Color> colors = EnumSet.allOf(Color.class);
//		EnumSet<Color> blueAndWhite = EnumSet.of(BLUE, WHITE);
	}

}
