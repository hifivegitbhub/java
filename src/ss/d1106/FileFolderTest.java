package ss.d1106;

import java.io.File;
import java.io.IOException;

public class FileFolderTest {
	public static void main(String[] args) throws IOException {
		File f = new File("d:\\sample2");
		boolean folderResult = f.mkdir();
		
		if (folderResult) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� ����");
		}
		
		File delete = new File("d:\\sample2");
		delete.delete();
		
//		File f2 = new File("d:\\sample2\\sample.txt");
//		
//		boolean fileResult = f2.createNewFile();
//		
//		if (fileResult) {
//			System.out.println("���ϻ��� ����");
//		} else {
//			System.out.println("���ϻ��� ����");
//		}
		
		
	}
}
