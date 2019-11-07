package ss.d1018;

// Adapter pattern�� �̹� ������ ������ �˰����� �ٸ� ���� Ȱ���ϰ��� �� �� AdapterImpl Ŭ����ó�� �ش� ����� ������ Ÿ���̳� ���ǿ� �°� �����Ͽ� ����ϸ� ȿ������.  
// �䱸���� 1: Math Ŭ������ double Ÿ���� ���� �ι�, �������� ����� �޼��尡 �̹� �����Ǿ������� Float Ÿ������ �ϱ⸦ ����.
// �䱸���� 2: Math Ŭ������ ���� �߰��� "���ο� �ι�" �˰����� �̿��� �� �ְ� AdapterImpl�� twiceOf()�� �����Ͻÿ�.
// �䱸���� 3: halfOf()�� �α׸� ��� ����� �߰��Ͻÿ�.

public class SS_AdapterPattern {

	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
		System.out.println(adapter.halfOf(200f));
		System.out.println(adapter.halfOf(300f));		
	}

}

interface Adapter {
	// �䱸������ ���
	public Float twiceOf(Float f);
	public Float halfOf(Float f);
}

class AdapterImpl implements Adapter {
	@Override
	public Float twiceOf(Float f) {
		// �߰��� �䱸������ �Ʒ� ó�� �ݿ������� Adapter�� main()�� �������� �ʰ� �����ߴ�. 
		return Math.doubled(f.doubleValue()).floatValue();
//		return (float) Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println(">>> ���� �Լ� ȣ�� ����");
		return (float) Math.half(f.doubleValue());
	}
}

class Math {
	// �ι�
	public static double twoTime(double num) {
		return num*2;
	}
	
	// ����
	public static double half(double num) {
		// ���⿡ �䱸���� 3�� �����ϸ� Math�� �̿��ϴ� �ٸ� ����ڵ鿡�Ե� ���̰� �ǹǷ� halfOf()�� ������ �ٶ���.
		return num/2;
	}
	
	// ���ο� �ι�
	public static Double doubled(Double d) {
		return d*2;
	}
}
