package ss.d1029;

public class SS_HasInterface {

	public static void main(String[] args) {
		SS_Button btn = new SS_Button();
		btn.setOnclickListener(new SS_Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("Å¬¸¯!");
			}
		});
		btn.touch();
	}

}
