package ss.d1106;

import java.io.File;
import java.io.IOException;

public class FileFolderTest {
	public static void main(String[] args) throws IOException {
		File f = new File("d:\\sample2");
		boolean folderResult = f.mkdir();
		
		if (folderResult) {
			System.out.println("弃歹积己 己傍");
		} else {
			System.out.println("弃歹积己 角菩");
		}
		
		File delete = new File("d:\\sample2");
		delete.delete();
		
//		File f2 = new File("d:\\sample2\\sample.txt");
//		
//		boolean fileResult = f2.createNewFile();
//		
//		if (fileResult) {
//			System.out.println("颇老积己 己傍");
//		} else {
//			System.out.println("颇老积己 角菩");
//		}
		
		
	}
}
