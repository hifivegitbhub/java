package d1015;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Student {
	private String name, averageGrade, averageRate;
	private final String NAMETEXT = "이름: ", KORTEXT = "국어: ", ENGTEXT = "영어: ", MATHTEXT = "수학: ", TOTALTEXT = "총점: ",
			AVERAGETEXT = "평균: ", ACHIEVEMENTTEXT = "성취결과: ", RATETEXT = "성취도: ";
	private int kor, eng, math, total;
	private double average, averageRound2;
	private String lineSeparator = System.getProperty("line.separator");
	private Scanner sc;
	private DecimalFormat df = new DecimalFormat("#.##");

	public Student() {
		this.name = getTextInput(NAMETEXT);
		this.kor = getNumberInput(KORTEXT);
		this.eng = getNumberInput(ENGTEXT);
		this.math = getNumberInput(MATHTEXT);
		total = kor + eng + math;
		average = (double) total / 3;
		averageRound2 = Double.parseDouble(df.format(average));// Math.round((average * 100) / 100.0);		
		caculateSingleGrade();
		caculateTotalGrade();		
		
		sc.close();
	}

	private void caculateTotalGrade() {
		if (kor >= 90 && eng >= 90 && math >= 90) {
			averageRate = "Very Good";
		} else if (kor >= 90 || eng >= 90 || math >= 90) {
			averageRate = "Good";
		} else if (kor <= 90 && eng <= 90 && math <= 90) {
			averageRate = "Bad";
		}
	}

	private void caculateSingleGrade() {
		if (averageRound2 >= 90) {
			averageGrade = "A";
		} else if (averageRound2 >= 80) {
			averageGrade = "B";
		} else if (averageRound2 >= 70) {
			averageGrade = "C";
		} else if (averageRound2 >= 60) {
			averageGrade = "D";
		} else if (averageRound2 >= 50) {
			averageGrade = "E";
		} else {
			averageGrade = "F";
		}
	}

	private int getNumberInput(String message) {
		System.out.println(message);
		sc = new Scanner(System.in);

		return Integer.parseInt(sc.nextLine());
	}

	private String getTextInput(String message) {
		System.out.println(message);
		sc = new Scanner(System.in);

		return sc.nextLine();
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append(NAMETEXT);
		result.append(name);
		result.append(lineSeparator); // "이름: "

		result.append(KORTEXT);
		result.append(kor);
		result.append(lineSeparator); // "국어: "

		result.append(ENGTEXT);
		result.append(eng);
		result.append(lineSeparator); // "영어: "

		result.append(MATHTEXT);
		result.append(math);
		result.append(lineSeparator); // "수학: "

		result.append(TOTALTEXT);
		result.append(total);
		result.append(lineSeparator); // "총점: "

		result.append(AVERAGETEXT);
		result.append(averageRound2);
		result.append(lineSeparator); // "평균: "

		result.append(ACHIEVEMENTTEXT);
		result.append(averageGrade);
		result.append(lineSeparator); // "성취결과: "
		
		result.append(RATETEXT);
		result.append(averageRate);
		result.append(lineSeparator); // "성취도: "

		return result.toString();
	}
}
