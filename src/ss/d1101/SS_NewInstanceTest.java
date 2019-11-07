package ss.d1101;

interface Action {
	public abstract void execute();
}

class SendAction implements Action{
	@Override
	public void execute() {
		System.out.println("Send Action Execute");
	}
}

class ReceiveAction implements Action {
	@Override
	public void execute() {
		System.out.println("Receive Action Execute");
	}
}

public class SS_NewInstanceTest {

	public static void main(String[] args) {	
		try {
//			Class c = Class.forName("d1101.SendAction");
			Class c = Class.forName("d1101.ReceiveAction");
			Action action = (Action) c.newInstance();
			action.execute();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
