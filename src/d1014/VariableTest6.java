package d1014;

public class VariableTest6 {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 3;
		int r1, r2, r3, r4, r5;
		
		r1 = su1 + su2;
		r2 = su1 - su2;
		r3 = su1 * su2;
		r4 = su1 / su2;
		r5 = su1 % su2;
		
		double r6 = su1 / (double)su2; //나눈 결과가 소수라도 int타입이면 int결과가 나오므로 double결과를 보려면 한쪽을 double로 형변환 해서 double로 계산하도록 해야함.
		int t2 = (int) r6;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		System.out.println(t2);
	}
}
