package d1015;

public class HW_Sunkjuck {

	public static void main(String[] args) {
		createStudents();
	}

	private static void createStudents() {
		System.out.println("다음 학생정보를 입력해 주세요.");
		HW_Student s = new HW_Student();
		System.out.println(s.toString());
	}
	
}
