package ss.d1106;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		File folder = new File("d:\\sample2");
		if (folder.mkdir()) {
			System.out.println("弃歹积己己傍");
		} else {
			System.out.println("弃歹积己己傍");
		}

		try (FileWriter fw = new FileWriter("d:\\sample2\\sample.txt", true);) {
			fw.append("append");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
