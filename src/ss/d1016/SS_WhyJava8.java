package ss.d1016;

import java.util.List;
import java.util.Arrays;

public class SS_WhyJava8 {

	public static void main(String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		StringBuilder sb = new StringBuilder();
		
//		자바8이 좋은 이유를 다음의 결과를 출력하기 위한 코드를 비교하면 이해 가능하다.
//      1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
		
		
//		1. 소스가 복잡함
//		String separator = " : ";
//		for (Integer number : numbers) {
//			sb.append(number).append(separator);
//		}
//		
//		int length = sb.length();
//		if (length > 0) {
//			sb.delete(length - separator.length(), length);
//		}
		
		
//		2. 결과는 나오지만 소스가 복잡해지면 오류 나기 쉬운 케이스
//		int size = numbers.size();
//		for (int i = 0; i < numbers.size(); i++) {
//			sb.append(numbers.get(i));
//			if (i != size - 1) {
//				sb.append(" : ");
//			}
//		}
//		System.out.println(sb);
		
		
//		3. 이해하기 쉽고 오류발생 적다.
//		.map(String::valueOf)은 컬랙션이 아닌 하나의 타입을 다른 타입으로 매핑한다는 의미로 String.valueOf(numbers) 를 통해 문자로 변환
		String result = numbers.stream()
							   .map(String::valueOf)
							   .collect(java.util.stream.Collectors.joining(" : "));
		
		System.out.println(result);
		
	}

}
