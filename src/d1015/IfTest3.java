package d1015;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input su");
		int su=Integer.parseInt(sc.nextLine());
		
		if (su > 100 || su < 0) {
			System.out.println("범위없음");		
		} else if (su > 80) {
			System.out.println("T1");
		} else if (su > 60) {
			System.out.println("T2");
		} else if (su < 60) {
			System.out.println("T3");
		}
	}
}
