package d1014;

public class VariableTest5 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int result = a + b;
		System.out.println("a+b=" + result);
		
		byte su1 = 10, su2 = 20;
		int result2 = su1 + su2; // 연산이 일어나면 int 타입으로 변경되어 계산하므로 int로 받아줘야 함.
		System.out.println("a+b=" +result2);
		
		short su3 = 20;
		short su4 = 40;
		int result3 = su3 + su4;
		
		int su5 = 20;
		long su6 = 30L;
		long result4 = su5 + su6; // int와 long 연산시 long으로 결과가 나옴
		
		float su7 = 10;
		long su8 = 300;
		float result5 = su7 + su8;
		double result6 = su7 + su8;
		System.out.println(result5);
		System.out.println(result6);
	}

}
