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
		
		double r6 = su1 / (double)su2; //���� ����� �Ҽ��� intŸ���̸� int����� �����Ƿ� double����� ������ ������ double�� ����ȯ �ؼ� double�� ����ϵ��� �ؾ���.
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
