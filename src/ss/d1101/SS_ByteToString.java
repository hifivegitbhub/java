package ss.d1101;

import java.io.IOException;

public class SS_ByteToString {

	public static void main(String[] args) throws IOException {
//		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};	
		byte[] bytes = "Hello Java".getBytes("UTF-8");
		String str1 = new String(bytes, "UTF-8");
		System.out.println(str1);
		
		System.out.println("ют╥б: ");		
		byte[] bytes100 = new byte[100];
		int readByteNo = System.in.read(bytes100);
		String str2 = new String(bytes, 0, readByteNo-2);
		System.out.println(str2);
	}

}
