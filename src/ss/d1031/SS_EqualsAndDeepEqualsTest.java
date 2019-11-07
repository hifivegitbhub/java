package ss.d1031;

import java.util.Objects;

public class SS_EqualsAndDeepEqualsTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// i1.equals(i2)보다 아래 코드가 매개변수 두 개를 받을 수 있는 장점이 있다.
		System.out.println(Objects.equals(i1, i2)); // true
		System.out.println(Objects.equals(null, null)); // true
		System.out.println(Objects.equals(null, i2)); // false
		
		// 배열이 아닌경우 Objects.equals()와 같다
		System.out.println(Objects.deepEquals(i1, i2)); // true
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2)); // false, 주소 비교
		System.out.println(Objects.deepEquals(arr1, arr2)); // true, 값 비교
	}

}
