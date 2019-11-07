package hw.d1018;

import java.util.Scanner;

public class HW_1Week {

	public static void main(String[] args) {
		System.out.print("학생 인원수를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int studentNumber = Integer.parseInt(sc.nextLine());

		String[] nameArr = new String[studentNumber];
		int[] korArr = new int[studentNumber];
		int[] engArr = new int[studentNumber];
		int[] mathArr = new int[studentNumber];
		int[] totalArr = new int[studentNumber];
		double[] averageArr = new double[studentNumber];

		// 입력
		for (int i = 0; i < studentNumber; i++) {
			System.out.println("이름: ");
			nameArr[i] = sc.nextLine();
			System.out.println("국어: ");
			korArr[i] = Integer.parseInt(sc.nextLine());
			System.out.println("영어: ");
			engArr[i] = Integer.parseInt(sc.nextLine());
			System.out.println("수학: ");
			mathArr[i] = Integer.parseInt(sc.nextLine());
			totalArr[i] = korArr[i] + engArr[i] + mathArr[i];
			averageArr[i] = totalArr[i] / 3.0;
		}
		// 입력

		// 내림차 정렬
		String tempName = "";
		int tempKor = 0, tempEng = 0, tempMath = 0, tempTotal = 0;
		double tempAverage = 0.0;

		for (int i = 0; i < averageArr.length - 1; i++) {
			for (int j = i + 1; j < averageArr.length; j++) {
				if (averageArr[i] < averageArr[j]) {
					tempName = nameArr[j];
					nameArr[j] = nameArr[i];
					nameArr[i] = tempName;

					tempKor = korArr[j];
					korArr[j] = korArr[i];
					korArr[i] = tempKor;

					tempEng = engArr[j];
					engArr[j] = engArr[i];
					engArr[i] = tempEng;

					tempMath = mathArr[j];
					mathArr[j] = mathArr[i];
					mathArr[i] = tempMath;

					tempTotal = totalArr[j];
					totalArr[j] = totalArr[i];
					totalArr[i] = tempTotal;

					tempAverage = averageArr[j];
					averageArr[j] = averageArr[i];
					averageArr[i] = tempAverage;
				}
			}
		}
		// 내림차 정렬

		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t성취도");
		for (int i = 0; i < studentNumber; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t", 
					nameArr[i], korArr[i], engArr[i], mathArr[i],
					totalArr[i], averageArr[i], getAchivement(averageArr[i]));
			System.out.println();
		}

		System.out.printf("%s%.1f", "반평균: ", getClassAverage(averageArr));
		// 출력
		sc.close();
	}

	private static double getClassAverage(double[] average) {
		double classAverage = 0.0;
		for (int i = 0; i < average.length; i++) {
			classAverage += average[i];
		}
		return classAverage / average.length;
	}

	public static String getAchivement(double average) {
		if (average >= 90) {
			return "A";
		} else if (average >= 80) {
			return "B";
		} else if (average >= 70) {
			return "C";
		} else if (average > 60) {
			return "D";
		} else {
			return "F";
		}
	}

}
