package d1015;

import java.util.Scanner;

public class SungjukTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		String name = sc.nextLine();
//		System.out.println("국어를 입력하세요");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.println("영어를 입력하세요");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		sc.close();
//		
//		System.out.println("입력한 내용은 다음과 같습니다");
//		System.out.println("이름: " + name);
//		System.out.println("국어: " + kor);
//		System.out.println("영어: " + eng);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		int score = Integer.parseInt(sc.nextLine());
		
		if (score >= 60) {
			System.out.println("결과: 합격");
		} else {
			System.out.println("결과: 불합격");
		}
		
		sc.nextLine();
	}
}
