package hw.d1016;

import java.util.Scanner;

public class HW_ForWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.-------------------------------------
//		System.out.println("1. ���丮��");
//		System.out.print("���丮�� ���ڸ� �Է��� �ּ���: ");
//		int su = Integer.parseInt(sc.nextLine());
//		int sum = 1;
//		StringBuilder result = new StringBuilder();
//		result.append("���: ");
//		if (su < 0) {
//			System.out.println("�Է¿���!!");
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
//			while (su-- >= 1) { �̷� ����� ����
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
//		System.out.println("2. ¦��Ȧ���հ�");
//		System.out.print("ù��° ����: ");
//		int su1 = Integer.parseInt(sc.nextLine());
//
//		System.out.print("�ι�° ����: ");
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
//		System.out.println("���");
//		System.out.println("¦����:\t" + even);
//		System.out.println("Ȧ����:\t" + odd);
//		System.out.println("����:\t" + sum);

		
		// 3.-------------------------------------
//		System.out.println("3. �Ǻ���ġ");
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
//			System.out.println("0���� ū ���� �Է��� �ּ���.");			
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
		System.out.println("���ڸ� �Է��� �ּ���: ");
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

		
//		System.out.print("���ڸ� �Է��� �ּ���: ");
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
