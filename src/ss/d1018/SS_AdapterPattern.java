package ss.d1018;

// Adapter pattern은 이미 구현된 복잡한 알고리즘을 다른 곳에 활용하고자 할 때 AdapterImpl 클래스처럼 해당 기능의 데이터 타입이나 조건에 맞게 변경하여 사용하면 효율적임.  
// 요구사항 1: Math 클래스에 double 타입의 수를 두배, 절반으로 만드는 메서드가 이미 구현되어있지만 Float 타입으로 하기를 원함.
// 요구사항 2: Math 클래스에 새로 추가된 "새로운 두배" 알고리즘을 이용할 수 있게 AdapterImpl의 twiceOf()를 수정하시오.
// 요구사항 3: halfOf()에 로그를 찍는 기능을 추가하시오.

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
	// 요구사항의 기능
	public Float twiceOf(Float f);
	public Float halfOf(Float f);
}

class AdapterImpl implements Adapter {
	@Override
	public Float twiceOf(Float f) {
		// 추가된 요구사항을 아래 처럼 반영했지만 Adapter나 main()을 수정하지 않고 가능했다. 
		return Math.doubled(f.doubleValue()).floatValue();
//		return (float) Math.twoTime(f.doubleValue());
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println(">>> 절반 함수 호출 시작");
		return (float) Math.half(f.doubleValue());
	}
}

class Math {
	// 두배
	public static double twoTime(double num) {
		return num*2;
	}
	
	// 절반
	public static double half(double num) {
		// 여기에 요구사항 3을 구현하면 Math를 이용하는 다른 사용자들에게도 보이게 되므로 halfOf()에 구현이 바람직.
		return num/2;
	}
	
	// 새로운 두배
	public static Double doubled(Double d) {
		return d*2;
	}
}
