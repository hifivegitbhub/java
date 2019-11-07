package ss.d1018;

// ���ø� �޼��� ������ �����Ϸ��� �˰���(����)�� ������ ���μ���(���� > ���� > ���� > ����)�� �ְ� ���� ���ɼ�(���Ȱ�ȭ ��)�� �ִ� ��쿡 ���.
// �˰����� ������ �޼ҵ忡 �����ϰ� ���� Ŭ�������� �˰��� ������ ������� �˰����� ������ �ϴ� ����.
// �������: 1. �˰����� ���� �ܰ�� ������.
//		   2. ������ �˰����� �ܰ踦 �޼ҵ�� �����Ѵ�.
//		   3. �˰����� ������ ���ø� �޼ҵ带 �����.
//		   4. ���� Ŭ�������� ������ �޼ҵ���� �����Ѵ�.
// �䱸���� 1: ���� ������ ������ ������ �ּ���.
// �䱸���� 2: ������ ���� ���� �� ������ ����ؾ� �մϴ�.
//			- ���Ȱ���: ���� ���� �κ� ó��.
//			- ��������: user name�� password�� ��ġ�ϴ��� Ȯ��.
//			- ���Ѱ���: �����ڰ� ���� ȸ������ ����ȸ������ ���� ���������� Ȯ��.
//			- ���Ӱ���: �����ڿ��� Ŀ�ؼ� ������ �Ѱ��ݴϴ�.
// �䱸���� 3: ���� ��å�� ���� ������ ��ȭ�Ǿ����Ƿ� ��ȣ������ �÷��ּ���.
// �䱸���� 4: �����ο��� û�ҳ��� �� 10�� ���Ŀ� ������ ���� �ǵ��� �Ͽ����ϴ�.

public class SS_TempleteMethodPattern {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("���������Է�");
	}

}

class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSercurity(String string) {
//		�Ʒ��� �䱸���� 3�� �ݿ��ϱ� ���� �������� ���ڵ� �κе� ���� ��ȭ �Ǿ�� ��. 
		System.out.println("��ȭ�� �˰����� �̿��� ���ڵ�");
//		System.out.println("���ڵ�"); �䱸���� 3�� �ݿ��ϸ� ������.
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
//		�������� ���� ���̸� Ȯ���ϰ� û�ҳ��̸� ���� �ð��� 10�ð� �����ٸ� ������ ���� ������ �Ѵ�.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�."); // �����峪 �����ּҸ� �Ѱ��ִ� �ܰ�.
		return info;
	}

}

abstract class AbstGameConnectHelper {
//	���� �˰����� �ܺο� ����Ǹ� �ȵǹǷ� ���� ��Ű�������� ������ �� �ְ� protected�� ��. ������ �������� �� ���Ͽ� Ŭ�������� ��������.
	protected abstract String doSercurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// ���ø� �޼���
	public String requestConnection(String encodedInfo) {

		// �����۾� -> ���ڵ� �� ���ڿ��� ���ڵ� �Ѵ�.
		String decodedInfo = doSercurity(encodedInfo);

		// ��ȯ�� ���� ������ ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		String id = "decodedInfo.aa";
		String password = "decodedInfo.bb";

		if (!authentication(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}

		String userName = "userName";
		int i = authorization(userName);

		switch (i) {
		// �䱸���� 4�� �ݿ��ϱ� ���� �Ʒ� ���� �߰���.
		case -1: // �� 10�� ���� û�ҳ� ��������.
			throw new Error("�˴ٿ�");
			
		case 0: // ���� �޴���

			break;

		case 1: // ���� ȸ��
			// ���� ������ �� ������
			break;

		case 2: // ���� ȸ��
			// ���� ������ �� �ȳ�����
			break;

		case 3: // ���� ����

			break;

		default: // ��Ÿ
			break;
		}

		return connection(decodedInfo);
	}

}
