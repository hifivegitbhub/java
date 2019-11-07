package hw.d1029;

import java.util.Scanner;

public class HW_MemberPro {
	private HW_MemberDTO[] memberArr = new HW_MemberDTO[10];
	private int memberCount;
	
	public void setMemberArray() {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생수를 입력해 주세요: ");
		while (true) {
			try {
				memberCount = Integer.parseInt(sc.nextLine());
				if (memberCount < 1 || memberCount > 10) {
					System.out.println("1~10사이 숫자를 입력해 주세요");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요");
			}
		}

		for (int i = 0; i < memberCount; i++) {
			memberArr[i] = new HW_MemberDTO();
			System.out.println("이름: ");
			memberArr[i].setName(sc.nextLine());
			System.out.println("나이: ");
			memberArr[i].setAge(Integer.parseInt(sc.nextLine()));
		}
		
		sc.close();
	}

	public void sortMemberArr() {
		HW_MemberDTO tempDTO = new HW_MemberDTO();

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (memberArr[i].getAge() < memberArr[j].getAge()) {
					tempDTO = memberArr[i];
					memberArr[i] = memberArr[j];
					memberArr[j] = tempDTO;
				}
			}
		}
	}

	public void prt() {
		System.out.println("이름\t나이");
		for (int i = 0; i < memberCount; i++) {
			System.out.printf("%s\t%s", memberArr[i].getName(), memberArr[i].getAge());
			System.out.println();
		}
	}
}
