package ss.d1016;

public class SS_OOP_FP_Java8 {

	// Functional Programming을 하면 병렬 프로그래밍을 쉽게 할 수 있는 장점이 있는데 이번에는 다른 장점에 대해 살펴보기.
	// Functional Programming은 memory allocation과 garbage collection의 발달 영향이 큼.
	// Java에서는 메서드가 First class citizen이 아니므로 항상 클래스를 생성해야 함.

	// First Class Citizen 이란? (FCC = Java object, Java8 부터는 method도 가능)
	// Function에 Parameter와 Return값으로  Element를 넘길 수 있어야 함.
	// Data structure에 저장이 될 수 있어야 함.
	
	
	public static void main(String[] args) {
//		CalculatorService cs = new CalculatorService();
		// 곱하기 나누기 등 요구사항이 늘어날 때 마다 계속 추가되어야 하므로 SORID 위반.
		// S: Single responsibility. (Object은 한가지 이유로만 수정 되어야 함.)
		// O: Open closed.
		// R: Liskov substitution.
		// I: Interface segregation.
		// D: Dependency inversion.
		
//		int additionResult = cs.calculate('+', 1, 1);
//		System.out.println(additionResult);
//		
//		int subtractionResult = cs.calculate('-' ,1, 1);
//		System.out.println(subtractionResult);
		
//		0이 들어가면 오류가 나고 코드가 커지면 어디서 0이 들어오는지 디버깅 힘들어짐.
//		int divisionResult = cs.calculate('/' ,1, 0);
//		System.out.println(divisionResult);
		
//		OOP는 빼기, 더하기 등 기능이 추가되면 새로운 인스턴스를 계속 주입해야함.
		CalculatorService cs = new CalculatorService(new Division(), new Multiplication());
		
		int divisionResult = cs.divisionCalculation(12, 2);
		System.out.println(divisionResult);
		
		int multiplicationResult = cs.multiplicationCalculation(12, 2);
		System.out.println(multiplicationResult);
		
//		int subtractionResult = cs.subtractionCalculation(12, 2);
//		System.out.println(subtractionResult);
//		
//		int additionResult = cs.additionCalculation(12, 2);
//		System.out.println(additionResult);
		
//		아래와 같이 메서드에 DI를 주입하면 
		final FpCalculatorService fp = new FpCalculatorService();
//		System.out.println("      Addition: " + fp.calculate(new Addition(), 11, 3));
//		System.out.println("   Subtraction: " + fp.calculate(new Subtraction(), 11, 3));
//		System.out.println("Multiplication: " + fp.calculate(new Multiplication(), 11, 3));
//		System.out.println("      Division: " + fp.calculate(new Division(), 15, 3));
		
//		Anonymous function 중에 하나인 람다를 이용한 방법
//		자주쓰는 표현인 경우 테스트는 다음과 같이 addition을 테스트하면 됨. 
		Calculation addition = (i1, i2) -> i1 + i2;
		System.out.println("      Addition: " + fp.calculate(addition, 11, 3));
		System.out.println("   Subtraction: " + fp.calculate((i1, i2) -> i1 - i2, 11, 3));
		System.out.println("Multiplication: " + fp.calculate((i1, i2) -> i1 * i2, 11, 3));
		System.out.println("      Division: " + fp.calculate((i1, i2) -> i1 / i2, 11, 3));
		System.out.println("   custom calc: " + fp.calculate((i1, i2) -> (i1 + i2) * i2, 11, 3));
	}
}

interface Calculation {
	int calculate (int num1, int num2);
}

//기능별로 클래스를 분리해서 오류가 나면 해당 클래스만 보면 되므로 버그를 찾기 쉽다.
class Addition implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}

class Subtraction implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
}

class Division implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 / num2;
	}
}

class Multiplication implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}
}

// Strategy pattern.
class CalculatorService {
	private final Calculation calculation;
	private final Calculation calculation2;
	
	// Dependency injection
	public CalculatorService(final Calculation calculation, final Calculation calculation2) {
		this.calculation = calculation;
		this.calculation2 = calculation2; //이처럼 OOP는 추가적인 기능을 넣을 때 DI를 계속 추가해야함.
	}
	
	public int divisionCalculation(int num1, int num2) {
		// 유효성 검증
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
		
//		너무 많은 기능이 하나의 메서드에 있어서 SORID 위반. 그래서 위에 각각 클래스로 기능을 분리.
//		if (calculation == '+') {
//			return num1 + num2;
//		} else if (calculation == '-') {
//			return num1 - num2;
//		} else if (calculation == '/') {
//			return num1 / num2;
//		} else {
//			throw new IllegalArgumentException();
//		}
	}
	
	//이처럼 OOP는 추가기능을 위해 위의 calculate() 와 내용이 calculation2 만 다른 boilerplate 코드를 계속 생산하게 되는 단점. 
	public int multiplicationCalculation(int num1, int num2) {
		// 유효성 검증
		if (num1 > 10 && num2 < num1) {
			return calculation2.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
	}
}

class FpCalculatorService {
	public int calculate(Calculation calculation, int num1, int num2) {
		// 유효성 검증
		if (num1 > 10 && num2 < num1) {
			// FP에서는 기능별 calculation을 받아서 OOP의 calculate() 와 compute() 를 하나로 만들게 함.
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
	}
}