package d1015;

import java.util.Scanner;

public class SungjukTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���");
//		String name = sc.nextLine();
//		System.out.println("��� �Է��ϼ���");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.println("��� �Է��ϼ���");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		sc.close();
//		
//		System.out.println("�Է��� ������ ������ �����ϴ�");
//		System.out.println("�̸�: " + name);
//		System.out.println("����: " + kor);
//		System.out.println("����: " + eng);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int score = Integer.parseInt(sc.nextLine());
		
		if (score >= 60) {
			System.out.println("���: �հ�");
		} else {
			System.out.println("���: ���հ�");
		}
		
		sc.nextLine();
	}
}
