package ss.d1106;

import java.io.File;

public class FileListTest {
	public static void main(String[] args) {
		File f = new File("d:\\javadb");
		String[] list = f.list();
		
		for (String string : list) {
			System.out.println(string);
		}
		
		File[] list2 = f.listFiles();
		
		for (File file : list2) {
			System.out.println(file + " " + file.isDirectory());
		}
	}
}
