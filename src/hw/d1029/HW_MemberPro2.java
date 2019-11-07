package hw.d1029;

public class HW_MemberPro2 {
	private HW_MemberDTO[] memberArr;
	private int memberCount;

	public HW_MemberPro2(HW_MemberDTO[] memberArr, int memberCount) {
		this.memberArr = memberArr;
		this.memberCount = memberCount;
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
