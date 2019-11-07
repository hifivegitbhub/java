package ss.d1025;

import java.lang.reflect.Method;

public class SS_AnnotationTest {

	public static void main(String[] args) {
		Method[] declaredMethods = SS_AnnotationService.class.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			if(method.isAnnotationPresent(SS_PrintAnnotation.class)) {
				SS_PrintAnnotation printAnnotation = 
						method.getAnnotation(SS_PrintAnnotation.class);
				
				// �޼ҵ� �̸� ���
				System.out.println(method.getName() + "���� ����Ǿ� ����");
				
				// ���м� ���
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				// �޼ҵ� ȣ��
				try {
					method.invoke(new SS_AnnotationService());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
				
			} else {
				System.out.println(method.getName() + "���� ����Ǿ� ���� ����");
			}
			
		}
	}
}
