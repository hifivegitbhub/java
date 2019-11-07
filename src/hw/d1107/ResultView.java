package hw.d1107;

import java.util.List;

public class ResultView {
	public void viewList(List<Score> list) {
		for (Score dto : list) {
			System.out.println(dto);
		}
	}
}
