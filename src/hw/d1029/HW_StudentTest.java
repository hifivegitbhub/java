package hw.d1029;

public class HW_StudentTest {

	public static void main(String[] args) {
		HW_Student s1 = new HW_Student();
		s1.name = "ȫ�浿";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;

		System.out.println("�̸�:" + s1.name);
		System.out.println("����:" + s1.getTotal());
		System.out.println("���:" + s1.getAverage());

		HW_Student s2 = new HW_Student("ȫ�浿", 1, 1, 100, 60, 76);
		System.out.println(s2.info());
	}

}
