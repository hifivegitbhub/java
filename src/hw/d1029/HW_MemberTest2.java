package hw.d1029;

import java.util.Scanner;

public class HW_MemberTest2 {
	public static void main(String[] args) {
		int memberCount = 0;
		HW_MemberDTO[] memberDTOArr = new HW_MemberDTO[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("학생수를 입력해 주세요: ");
		while (true) {
			String studentNumber = sc.nextLine();
			if (isValidNumber(studentNumber)) {
				if (isValidStudentNumber(studentNumber)) {
					memberCount = Integer.parseInt(studentNumber);
					break;
				}
			}
		}

		for (int i = 0; i < memberCount; i++) {
			memberDTOArr[i] = new HW_MemberDTO();
			System.out.println("이름: ");
			memberDTOArr[i].setName(sc.nextLine());
			System.out.println("나이: ");
			while (true) {
				String age = sc.nextLine();
				if (isValidNumber(age)) {
					memberDTOArr[i].setAge(Integer.parseInt(age));
					break;
				}
			}
		}
		HW_MemberPro2 memPro = new HW_MemberPro2(memberDTOArr, memberCount);
		memPro.sortMemberArr();
		memPro.prt();
		sc.close();
	}

	private static boolean isValidStudentNumber(String validNumber) {
		boolean result = false;
		int studentNumber = Integer.parseInt(validNumber);
		try {
			if (studentNumber < 1 || studentNumber > 10) {
				throw new HW_InvalidNumberRangeException("1~10사이 숫자를 입력해 주세요");
			} else {
				result = true;
			}
		} catch (HW_InvalidNumberRangeException e) {
			System.out.println(e.toString());
		}
		return result;
	}

	private static boolean isValidNumber(String number) {
		boolean result = false;
		try {
			Integer.parseInt(number);
			result = true;
		} catch (NumberFormatException e) {
			System.out.println("정수만 입력해 주세요");
		}
		return result;
	}

}
