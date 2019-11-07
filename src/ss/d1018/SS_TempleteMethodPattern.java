package ss.d1018;

// 템플릿 메서드 패턴은 구현하려는 알고리즘(접속)이 일정한 프로세스(보안 > 검증 > 권한 > 접속)가 있고 변경 가능성(보안강화 등)이 있는 경우에 사용.
// 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴.
// 구현방법: 1. 알고리즘을 여러 단계로 나눈다.
//		   2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
//		   3. 알고리즘을 수행할 템플릿 메소드를 만든다.
//		   4. 하위 클래스에서 나눠진 메소드들을 구현한다.
// 요구사항 1: 신작 게임의 접속을 구현해 주세요.
// 요구사항 2: 유저가 게임 접속 시 다음을 고려해야 합니다.
//			- 보안과정: 보안 관련 부분 처리.
//			- 인증과정: user name과 password가 일치하는지 확인.
//			- 권한과정: 접속자가 유료 회원인지 무료회원인지 게임 마스터인지 확인.
//			- 접속과정: 접속자에게 커넥션 정보를 넘겨줍니다.
// 요구사항 3: 정부 정책에 의해 보안이 강화되었으므로 암호수준을 올려주세요.
// 요구사항 4: 여가부에서 청소년은 밤 10시 이후에 접속이 제한 되도록 하였습니다.

public class SS_TempleteMethodPattern {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("접속정보입력");
	}

}

class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSercurity(String string) {
//		아래는 요구사항 3을 반영하기 위해 생겼으며 인코딩 부분도 같이 강화 되어야 함. 
		System.out.println("강화된 알고리즘을 이용한 디코드");
//		System.out.println("디코드"); 요구사항 3을 반영하며 지워짐.
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
//		서버에서 유저 나이를 확인하고 청소년이면 현재 시간이 10시가 지났다면 권한이 없는 것으로 한다.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계."); // 쓰레드나 접속주소를 넘겨주는 단계.
		return info;
	}

}

abstract class AbstGameConnectHelper {
//	접속 알고리즘은 외부에 노출되면 안되므로 같은 패키지에서만 접근할 수 있게 protected로 함. 지금은 연습으로 한 파일에 클래스들을 생성했음.
	protected abstract String doSercurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	// 템플릿 메서드
	public String requestConnection(String encodedInfo) {

		// 보안작업 -> 인코딩 된 문자열을 디코딩 한다.
		String decodedInfo = doSercurity(encodedInfo);

		// 반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "decodedInfo.aa";
		String password = "decodedInfo.bb";

		if (!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}

		String userName = "userName";
		int i = authorization(userName);

		switch (i) {
		// 요구사항 4를 반영하기 위해 아래 내용 추가됨.
		case -1: // 밤 10시 이후 청소년 접속제한.
			throw new Error("셧다운");
			
		case 0: // 게임 메니저

			break;

		case 1: // 유료 회원
			// 레어 아이템 잘 나오게
			break;

		case 2: // 무료 회원
			// 레어 아이템 잘 안나오게
			break;

		case 3: // 권한 없음

			break;

		default: // 기타
			break;
		}

		return connection(decodedInfo);
	}

}
