package ss.d1021;

import java.util.EnumSet;

//������1. ������ ��� static ���丮 �޼ҵ� ����� �� ��

// ���� 3: ���� Ÿ���� ���� Ÿ�� �ν��Ͻ��� ���� ���� �ִ�
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
	
	// ���� 1: �̸��� ���� �� �־ ��ȯ�ϴ� ��ü�� �����ϱ� ����
	public static SS_StaticFactoryMethod withName(String name) {
		return new SS_StaticFactoryMethod(name);
	}
	
	// ���� 1: �Ȱ��� Ÿ���� �Ķ���ͷ� �޴� �����ڸ� 2�� �̻� ���� �� �ִ�
	public static SS_StaticFactoryMethod withAddress(String address) {
		SS_StaticFactoryMethod sfm = new SS_StaticFactoryMethod();
		sfm.address = address;
		return sfm;
	}
	
	// ���� 2: �ݵ�� ���ο� ��ü�� ���� �ʿ䰡 ����
	public static SS_StaticFactoryMethod getInstance() {
		return SINGLE_INSTANCE;
	}
	
	static class ChildStatic extends SS_StaticFactoryMethod {}
	
	static enum Color {
		RED, BLUE, WHITE
	}
	
	// ���� 4: �����ϴ� ��ü�� Ŭ������ �Է� �Ű������� ���� �Ź� �ٸ� �� �ִ�
	public static SS_StaticFactoryMethod getInstance(boolean flag) {
		return flag ? new SS_StaticFactoryMethod() : new ChildStatic();
	}
	
	public static void main(String[] args) {
		SS_StaticFactoryMethod sfm = new SS_StaticFactoryMethod("Michael");
		SS_StaticFactoryMethod sfm1 = SS_StaticFactoryMethod.withName("Michael");
		SS_StaticFactoryMethod sfm2 = SS_StaticFactoryMethod.getInstance();
		SS_StaticFactoryMethod sfm3 = SS_StaticFactoryMethod.getInstance(false);
		
		// ���� 4: �����ϴ� ��ü�� Ŭ������ �Է� �Ű������� ���� �Ź� �ٸ� �� �ִ�.
		EnumSet<Color> colors = EnumSet.allOf(Color.class);
//		EnumSet<Color> blueAndWhite = EnumSet.of(BLUE, WHITE);
	}

}
