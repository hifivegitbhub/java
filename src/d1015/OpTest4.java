package d1015;

public class OpTest4 {
	public static void main(String[] args) {
		int su = 3;
		int total = ++su + ++su; // C언어는 결과가 10이고 Java는 9이므로 이러한 코드는 좋지 못함. 단항연산자는 한줄에 하나가 좋음.
		System.out.println(total);
	}
}
