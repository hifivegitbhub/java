package hw.d1018;

public class HW_FP_Sungjuck {
	public static final String NAME = "이름", ENG = "영어: ", KOR = "국어: ", MATH = "수학: ";
	public static void main(String[] args) {
		System.out.println("다음 학생정보를 입력해 주세요");
		
	}
	
}

class StudentInputService{
	
}

class StudentInput{
	public BasicStudent getStudentInfo(BasicStudent student) {
		//System.out.println(NAME);
		return student;
	}
}

class BasicStudent{
	private String name;
	private int eng;
	private int kor;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}

class ArtStudent extends BasicStudent{
	private String art;

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}
}

class ScienceStudent extends BasicStudent{
	private String science;

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}
}