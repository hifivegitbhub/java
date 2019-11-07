package ss.d1104;

import java.util.regex.Pattern;

public class SS_RegularExpressionTest {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		
		String data = "010-120-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ");
		}else {
			System.out.println("���Խİ� ��ġ ����");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ");
		}else {
			System.out.println("���Խİ� ��ġ ����");
		}
		
	}

}
