package hw.d1023;

import java.util.Scanner;

class SungJuck {
	private String hakno;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public SungJuck(String hakno, String name, int kor, int eng, int math) {
		this.hakno = hakno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = (double) total / 3;
	}
	
	public int getTotal() {
		return total;
	}

	public void prt() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\n", hakno, name, kor, eng, math, total, avg);
	}
}

public class HW_SungJuckTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력해 주세요: ");
		int studentCount = Integer.parseInt(sc.nextLine());
		
		SungJuck[] sjArr = new SungJuck[studentCount];
		
		String hakno = null;
		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for (int i = 0; i < sjArr.length; i++) {
			System.out.println("학번: ");
			hakno = sc.nextLine();
			System.out.println("이름: ");
			name = sc.nextLine();
			System.out.println("국어: ");
			kor = Integer.parseInt(sc.nextLine());
			System.out.println("영어: ");
			eng = Integer.parseInt(sc.nextLine());
			System.out.println("수학: ");
			math = Integer.parseInt(sc.nextLine());

			sjArr[i] = new SungJuck(hakno, name, kor, eng, math);
		}
		
		SungJuck tempSungJuck = null;
		
		for (int i = 0; i < sjArr.length-1; i++) {
			for (int j = i+1; j < sjArr.length; j++) {
				
				if (sjArr[i].getTotal() < sjArr[j].getTotal()) {
					tempSungJuck = sjArr[i];
					sjArr[i] = sjArr[j];
					sjArr[j] = tempSungJuck;
				}
			}
		}
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평군");
		for (int i = 0; i < sjArr.length; i++) {
			sjArr[i].prt();
		}
		
		sc.close();
		
	}
	
}
