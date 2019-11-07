package hw.d1029;

public class HW_StudentTest {

	public static void main(String[] args) {
		HW_Student s1 = new HW_Student();
		s1.name = "È«±æµ¿";
		s1.ban = 1;
		s1.no = 1;
		s1.kor = 100;
		s1.eng = 60;
		s1.math = 76;

		System.out.println("ÀÌ¸§:" + s1.name);
		System.out.println("ÃÑÁ¡:" + s1.getTotal());
		System.out.println("Æò±Õ:" + s1.getAverage());

		HW_Student s2 = new HW_Student("È«±æµ¿", 1, 1, 100, 60, 76);
		System.out.println(s2.info());
	}

}
