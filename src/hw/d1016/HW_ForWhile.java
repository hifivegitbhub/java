package hw.d1016;

import java.util.Scanner;

public class HW_ForWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.-------------------------------------
//		System.out.println("1. 팩토리얼");
//		System.out.print("팩토리얼 숫자를 입력해 주세요: ");
//		int su = Integer.parseInt(sc.nextLine());
//		int sum = 1;
//		StringBuilder result = new StringBuilder();
//		result.append("결과: ");
//		if (su < 0) {
//			System.out.println("입력오류!!");
//		} else if (su == 0) {
//			System.out.println(su + "!=1");
//		} else {
//			
//			for (int i = su; i >= 1; i--) {
//				result.append(i);
//				if (i > 1) {
//					result.append(" * ");
//				} else {
//					result.append(" = ");
//				}
//				sum *= i;
//			}
//			
//			while (su >= 1) {
//			while (su-- >= 1) { 이런 방법도 있음
//				result.append(su);
//				if (su > 1) {
//					result.append(" * ");
//				} else {
//					result.append(" = ");
//				}
//				sum *= su;
//				su--;
//			}
//			
//			result.append(sum);
//			System.out.println(result);
//		}

		
		// 2.-------------------------------------
//		System.out.println("2. 짝수홀수합계");
//		System.out.print("첫번째 숫자: ");
//		int su1 = Integer.parseInt(sc.nextLine());
//
//		System.out.print("두번째 숫자: ");
//		int su2 = Integer.parseInt(sc.nextLine());
//
//		int even = 0, odd = 0, sum = 0, temp = 0;
//		
//		if (su1 > su2) {
//			temp = su1;
//			su1 = su2;
//			su2 = temp;
//		}
//
//		for (int i = su1; i <= su2; i++) {
//			if (i % 2 == 0) {
//				even += i;
//			} else {
//				odd += i;
//			}
//			sum += i;
//		}
//		
//		while (su1 <= su2) {
//			if (su1 % 2 == 0) {
//				even += su1;
//			} else {
//				odd += su1;
//			}
//			sum += su1;
//			su1++;
//		}
//
//		System.out.println("결과");
//		System.out.println("짝수합:\t" + even);
//		System.out.println("홀수합:\t" + odd);
//		System.out.println("총합:\t" + sum);

		
		// 3.-------------------------------------
//		System.out.println("3. 피보나치");
//		int su = 0;
//		int suLeft = 1, suRight = 1;
//		int sum = 0;
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(suLeft + " " + suRight + " ");
//
//		while(true) {
//			su = Integer.parseInt(sc.nextLine());
//			if (su > 0) {
//				break;
//			}
//			System.out.println("0보다 큰 수를 입력해 주세요.");			
//		}
//		
//		for (int i = 0; i <= su; i++) {
//			sum = suLeft + suRight;
//			suLeft = suRight;
//			suRight = sum;
//			if (suRight >= su) {
//				break;
//			}
//			sb.append(suRight + " ");
//		}
//		
//		int i = 0;
//		while (i <= su) {
//			sum = suLeft + suRight;
//			suLeft = suRight;
//			suRight = sum;
//			if (suRight >= su) {
//				break;
//			}
//			sb.append(suRight + " ");
//			i++;
//		}
//
//		System.out.println(sb);

		
		// 4.-------------------------------------
		System.out.print("4. ");
		System.out.println("숫자를 입력해 주세요: ");
		int su = Integer.parseInt(sc.nextLine());
		double result = 1, fraction = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(1);

//		for (int i = 2; i <= su; i++) {
////			fraction = 1 / (double) i;
//			fraction = 1.0 / i;
//			
//			if (i % 2 == 0) {
//				sb.append(" - 1/" + i);
//				result -= fraction;
//			} else {
//				sb.append(" + 1/" + i);
//				result += fraction;
//			}
//		}
		
		int i = 2;
		while (i <= su) {
			fraction = 1 / (double) i;
			if (i % 2 == 0) {
				sb.append(" - 1/" + i);
				result -= fraction;
			} else {
				sb.append(" + 1/" + i);
				result += fraction;
			}
			i++;
		}
		
		sb.append(" = " + result);

		System.out.println(sb);

		
//		System.out.print("숫자를 입력해 주세요: ");
//		int su = Integer.parseInt(sc.nextLine());
//		String result = "";
//		int sum = 0;
//		
//		for (int i = 1; i <= su; i++) {
//			if (i%2 != 0) {
//				sum += i;
//				if (sum >= su) {
//					break;
//				}
//				result += i + " ";				
//			}			
//		}
//		System.out.println(result);
		sc.close();
		
		
		
	}

}
