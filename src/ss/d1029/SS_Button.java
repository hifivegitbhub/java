package ss.d1029;

public class SS_Button {
	private OnClickListener onClickListener;
	
	public void setOnclickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void touch() {
		onClickListener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
