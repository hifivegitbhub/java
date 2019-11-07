package ss.d1107;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// �θ� ��ü�� Serializable�� �����ϰ� ���� ������ �θ��� ����� ����ȭ �Ϸ��� ��� �Ʒ��� ���� ����� ��.
public class Child extends Parent implements Serializable{
	public String field2;
	
	// �ݵ�� ���� �����ڰ� private�̾�� ��.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
