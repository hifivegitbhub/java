package ss.d1104;

import java.util.Arrays;

public class SS_ArrayEqualsTest {

	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		System.out.println("���� ������ ��");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� ��: " + original.equals(clone1));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, clone1));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, clone1));
		
		
		System.out.println("���� ������ ��");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� ��: " + original.equals(clone2));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, clone2));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, clone2));
	}

}
