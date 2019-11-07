package hw.d1028;

abstract class TestTEst{
	
}

public class HW_JavaJungSuk {

	public static void main(String[] args) {
		// 4-3 while
		int result = 1;
		String resultText = "1";
		
		int i = 2;
		while (i <= 10) {
			resultText += "+(";
			
			for (int j = 1; j <= i; j++) {
				if (j <= 1) {
					resultText += j;
				} else if (j > 1) {
					resultText += "+" + j;
				}
				result += j;
			}
			resultText += ")";
			i++;
		}
		System.out.printf("%s = %d", resultText, result);
		// 4-3 while

		// 4-3 for
//		for (int i = 2; i <= 10; i++) {
//			resultText += "+(";
//			for (int j = 1; j <= i; j++) {
//				if (j <= 1) {
//					resultText += j;
//				} else if (j > 1) {
//					resultText += "+" + j;
//				}
//				result += j;
//			}
//			resultText += ")";
//		}
		// 4-3 for
		
		// 4-4 while
//		int result = 0;
//		String resultText = "1";
//			
//		int i = 2;
//		while (result <= 100) {
//			resultText += "+";
//			if (i%2==0) {
//				result -= i;
//				resultText += "(-" + i + ")";
//			} else {
//				result += i;
//				resultText += i;
//			}
//			i++;
//		}
//		System.out.println(resultText + " = " + result);
		// 4-4 while
		
		// 4-4 for		
//		for (int i = 2; result <= 100 ; i++) {
//		resultText += "+";
//		if (i%2==0) {
//			result -= i;
//			resultText += "(-" + i + ")";
//		} else {
//			result += i;
//			resultText += i;
//		}
//	}
		// 4-4 for
		
		
//		4-6
//		int sum = 0;
//		for (int i = 1; i < 7; i++) {
//			for (int j = 1; j < 7; j++) {
//				sum = i+j;
//				if(sum == 6) {
//					System.out.println(i + " + " + j + " = " + sum);
//				}
//			}
//		}
//		4-6
		
//		5-8		
//		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
//		int[] counter = new int[4];
//		int temp;
//		
//		switch 문으로도 가능		
//		for (int i = 0; i < answer.length-1; i++) {
//			for (int j = i + 1; j < answer.length; j++) {
//				if (answer[i] > answer[j]) {
//					temp = answer[i];
//					answer[i] = answer[j];
//					answer[j] = temp;
//				}
//			}
//		}		
//		
//		for (int i = 0; i < counter.length; i++) {
//			for (int j = 0; j < answer.length; j++) {
//				if(answer[j] == i+1) {
//					counter[i]++;
//				}
//			}
//			System.out.print(counter[i]);
//			for (int k = 0; k < counter[i]; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		5-8		
	}

}
