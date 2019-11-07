package ss.d1016;

public class SS_OOP_FP_Java8 {

	// Functional Programming�� �ϸ� ���� ���α׷����� ���� �� �� �ִ� ������ �ִµ� �̹����� �ٸ� ������ ���� ���캸��.
	// Functional Programming�� memory allocation�� garbage collection�� �ߴ� ������ ŭ.
	// Java������ �޼��尡 First class citizen�� �ƴϹǷ� �׻� Ŭ������ �����ؾ� ��.

	// First Class Citizen �̶�? (FCC = Java object, Java8 ���ʹ� method�� ����)
	// Function�� Parameter�� Return������  Element�� �ѱ� �� �־�� ��.
	// Data structure�� ������ �� �� �־�� ��.
	
	
	public static void main(String[] args) {
//		CalculatorService cs = new CalculatorService();
		// ���ϱ� ������ �� �䱸������ �þ �� ���� ��� �߰��Ǿ�� �ϹǷ� SORID ����.
		// S: Single responsibility. (Object�� �Ѱ��� �����θ� ���� �Ǿ�� ��.)
		// O: Open closed.
		// R: Liskov substitution.
		// I: Interface segregation.
		// D: Dependency inversion.
		
//		int additionResult = cs.calculate('+', 1, 1);
//		System.out.println(additionResult);
//		
//		int subtractionResult = cs.calculate('-' ,1, 1);
//		System.out.println(subtractionResult);
		
//		0�� ���� ������ ���� �ڵ尡 Ŀ���� ��� 0�� �������� ����� �������.
//		int divisionResult = cs.calculate('/' ,1, 0);
//		System.out.println(divisionResult);
		
//		OOP�� ����, ���ϱ� �� ����� �߰��Ǹ� ���ο� �ν��Ͻ��� ��� �����ؾ���.
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
		
//		�Ʒ��� ���� �޼��忡 DI�� �����ϸ� 
		final FpCalculatorService fp = new FpCalculatorService();
//		System.out.println("      Addition: " + fp.calculate(new Addition(), 11, 3));
//		System.out.println("   Subtraction: " + fp.calculate(new Subtraction(), 11, 3));
//		System.out.println("Multiplication: " + fp.calculate(new Multiplication(), 11, 3));
//		System.out.println("      Division: " + fp.calculate(new Division(), 15, 3));
		
//		Anonymous function �߿� �ϳ��� ���ٸ� �̿��� ���
//		���־��� ǥ���� ��� �׽�Ʈ�� ������ ���� addition�� �׽�Ʈ�ϸ� ��. 
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

//��ɺ��� Ŭ������ �и��ؼ� ������ ���� �ش� Ŭ������ ���� �ǹǷ� ���׸� ã�� ����.
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
		this.calculation2 = calculation2; //��ó�� OOP�� �߰����� ����� ���� �� DI�� ��� �߰��ؾ���.
	}
	
	public int divisionCalculation(int num1, int num2) {
		// ��ȿ�� ����
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
		
//		�ʹ� ���� ����� �ϳ��� �޼��忡 �־ SORID ����. �׷��� ���� ���� Ŭ������ ����� �и�.
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
	
	//��ó�� OOP�� �߰������ ���� ���� calculate() �� ������ calculation2 �� �ٸ� boilerplate �ڵ带 ��� �����ϰ� �Ǵ� ����. 
	public int multiplicationCalculation(int num1, int num2) {
		// ��ȿ�� ����
		if (num1 > 10 && num2 < num1) {
			return calculation2.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
	}
}

class FpCalculatorService {
	public int calculate(Calculation calculation, int num1, int num2) {
		// ��ȿ�� ����
		if (num1 > 10 && num2 < num1) {
			// FP������ ��ɺ� calculation�� �޾Ƽ� OOP�� calculate() �� compute() �� �ϳ��� ����� ��.
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("Invalid input num1: " + num1 + "Invalid input num2: " + num2);
		}
	}
}