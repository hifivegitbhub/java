package hw.d1018;

import java.util.Scanner;

public class HW_1Week {

	public static void main(String[] args) {
		System.out.print("�л� �ο����� �Է��� �ּ���: ");
		Scanner sc = new Scanner(System.in);
		int studentNumber = Integer.parseInt(sc.nextLine());

		String[] nameArr = new String[studentNumber];
		int[] korArr = new int[studentNumber];
		int[] engArr = new int[studentNumber];
		int[] mathArr = new int[studentNumber];
		int[] totalArr = new int[studentNumber];
		double[] averageArr = new double[studentNumber];

		// �Է�
		for (int i = 0; i < studentNumber; i++) {
			System.out.println("�̸�: ");
			nameArr[i] = sc.nextLine();
			System.out.println("����: ");
			korArr[i] = Integer.parseInt(sc.nextLine());
			System.out.println("����: ");
			engArr[i] = Integer.parseInt(sc.nextLine());
			System.out.println("����: ");
			mathArr[i] = Integer.parseInt(sc.nextLine());
			totalArr[i] = korArr[i] + engArr[i] + mathArr[i];
			averageArr[i] = totalArr[i] / 3.0;
		}
		// �Է�

		// ������ ����
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
		// ������ ����

		// ���
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���뵵");
		for (int i = 0; i < studentNumber; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t", 
					nameArr[i], korArr[i], engArr[i], mathArr[i],
					totalArr[i], averageArr[i], getAchivement(averageArr[i]));
			System.out.println();
		}

		System.out.printf("%s%.1f", "�����: ", getClassAverage(averageArr));
		// ���
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
