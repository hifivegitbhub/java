package ss.d1025;

public class SS_AnnotationService {
	@SS_PrintAnnotation
	public void method1() {
		System.out.println("run 1");
	}

	//@SS_PrintAnnotation("*")
	public void method2() {
		System.out.println("run 2");
	}

	@SS_PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("run 3");
	}
}
