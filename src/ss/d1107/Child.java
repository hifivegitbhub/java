package ss.d1107;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 부모 객체가 Serializable을 구현하고 있지 않지만 부모의 멤버를 직렬화 하려는 경우 아래와 같이 해줘야 함.
public class Child extends Parent implements Serializable{
	public String field2;
	
	// 반드시 접근 제한자가 private이어야 함.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
