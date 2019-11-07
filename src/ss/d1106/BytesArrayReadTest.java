package ss.d1106;

import java.io.FileInputStream;

public class BytesArrayReadTest {
	public static void main(String[] args) {
		String result = "";
		try (FileInputStream fi = new FileInputStream("d:\\sample\\bytearray.txt");) {
			byte[] temp = new byte[3];
			int readSize = 0;
			while((readSize = fi.read(temp)) != -1) {
				result += new String(temp, 0, readSize); // temp�迭���� 0���� readSize���� �аڴٴ� �ǹ�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
	}
}
