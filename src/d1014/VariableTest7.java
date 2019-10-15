package d1014;

public class VariableTest7 {

	public static void main(String[] args) {
		boolean tf = true;
		System.out.println(tf);
		boolean tf2 = false;
		System.out.println(tf2);
//		boolean tf3 = 10;
//		System.out.println(tf3);
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b); //연산시 기본인 int로 바뀌므로 결과를 byte로 형변환
		System.out.println(c);	
	}

}
