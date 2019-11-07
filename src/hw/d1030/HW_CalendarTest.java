package hw.d1030;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Person {
	private String name;
	private String id;
	private String gender;
	private int age;
	private int year;
	private int month;
	private int day;
	private char genderNo;
	private GregorianCalendar calendar = new GregorianCalendar();
	private int thisYearInt = calendar.get(Calendar.YEAR);

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
		getBirthdayAge();
	}

	public void getBirthdayAge() {
		year = Integer.parseInt(id.substring(0, 2));
		month = Integer.parseInt(id.substring(2, 4));
		day = Integer.parseInt(id.substring(4, 6));
		genderNo = id.charAt(7);
		
		if (genderNo == '1' || genderNo == '2') {
			year += 1900;
		} else if (genderNo == '3' || genderNo == '4') {
			year += 2000;
		}

		switch (genderNo) {
		case '1':
		case '3':
			gender = "남";
			break;
		case '2':
		case '4':
			gender = "여";
			break;
		default:
			gender = "모름";
			break;
		}
		
		age = thisYearInt - year;
	}

	public void prt() {
		System.out.println("이름:\t" + name);
		System.out.println("성별:\t" + gender);
		System.out.printf("생년월일:\t%d년 %d월 %d일\n", year, month, day);
		System.out.printf("나이:\t만 %d살", age);
		
	}
}

public class HW_CalendarTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";

		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("주민번호: ");
		id = sc.nextLine();

		Person p = new Person(name, id);
		p.prt();
		
		sc.close();
	}

}
