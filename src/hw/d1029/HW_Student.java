package hw.d1029;

public class HW_Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public HW_Student() {
	}
	
	public HW_Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return Math.round((getTotal()/3.0f)*10)/10.0f;
	}
	
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," 
	+ eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}
