package ss.d1016;

import java.util.List;
import java.util.Arrays;

public class SS_WhyJava8 {

	public static void main(String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		StringBuilder sb = new StringBuilder();
		
//		�ڹ�8�� ���� ������ ������ ����� ����ϱ� ���� �ڵ带 ���ϸ� ���� �����ϴ�.
//      1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
		
		
//		1. �ҽ��� ������
//		String separator = " : ";
//		for (Integer number : numbers) {
//			sb.append(number).append(separator);
//		}
//		
//		int length = sb.length();
//		if (length > 0) {
//			sb.delete(length - separator.length(), length);
//		}
		
		
//		2. ����� �������� �ҽ��� ���������� ���� ���� ���� ���̽�
//		int size = numbers.size();
//		for (int i = 0; i < numbers.size(); i++) {
//			sb.append(numbers.get(i));
//			if (i != size - 1) {
//				sb.append(" : ");
//			}
//		}
//		System.out.println(sb);
		
		
//		3. �����ϱ� ���� �����߻� ����.
//		.map(String::valueOf)�� �÷����� �ƴ� �ϳ��� Ÿ���� �ٸ� Ÿ������ �����Ѵٴ� �ǹ̷� String.valueOf(numbers) �� ���� ���ڷ� ��ȯ
		String result = numbers.stream()
							   .map(String::valueOf)
							   .collect(java.util.stream.Collectors.joining(" : "));
		
		System.out.println(result);
		
	}

}
