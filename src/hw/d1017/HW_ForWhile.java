package hw.d1017;

import java.util.Scanner;

public class HW_ForWhile {

	public static void main(String[] args) {
		
//		2.
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j > i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}			
			System.out.println();
		}
		
		int i = 0, j = 1;
		while (i <= 4) {
			j = 1;
			while (j <= 5) {
				if (j > i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;				
			}
			i++;
			System.out.println();
		}
		
//		3.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해 주세요: ");
//		int su = Integer.parseInt(sc.nextLine());
//		int counter = 1;
//		
//		for (int i = 0; i < su; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(counter + "\t");
//				counter += 2;
//			}
//			System.out.println();
//		}
//		
//		int i = 0, j = 0;
//		
//		while (i < su) {
//			j = 0;
//			while (j <= i) {
//				System.out.print(counter + "\t");
//				counter += 2;
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
//		sc.close();
	}
}
