package hw.d1107;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileTest {
	public static void main(String[] args) {
		List<Score> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("d:\\sample2\\data.txt"))) {
			String temp = "";
			StringTokenizer st = null;
			while ((temp = br.readLine()) != null) {
				st = new StringTokenizer(temp, ",");
				while (st.hasMoreElements()) {
					list.add(new Score(st.nextToken(), Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ResultView rv = new ResultView();
		rv.viewList(list);
	}

}