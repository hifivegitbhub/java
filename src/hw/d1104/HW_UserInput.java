package hw.d1104;

import java.util.Scanner;

public class HW_UserInput {
	static Scanner sc = new Scanner(System.in);
	
	public static String getStrInput(String message) {
		System.out.print(message);
		return sc.nextLine();
	}
}
