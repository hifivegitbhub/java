package hw.d1021;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

class NutritionFacts {
	private int servingSize;
	private int sodium;
	private int carbohydrate;
	private int servings;
	
	public static void main(String[] args) {
//		NutritionFacts nutritionFacts = NutritionFacts.builder()
//				.servings(10)
//				.servingSize(1)
//				.build();
	}
}

abstract class Pizza {
	
	public enum Topping {
		HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
	}
	
	final Set<Topping> toppings;
	
	abstract static class Builder<T extends Builder<T>> { // 재귀적인 타입 매개변수
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		
		abstract Pizza build(); // Convariant 리턴 타입을 위한 준비작업
		
		protected abstract T self(); // self-type 개념을 사용해서 매소드 체이닝이 가능케 함
	}
	
	Pizza(Builder<?> builder) {
		toppings = builder.toppings;
	}
	
}

public class NYPizza extends Pizza {

	public enum Size {
		SMALL, MEDIUM, LARGE
	}
	
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;
		
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override
		public NYPizza build() {
			return new NYPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}
	
	NYPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
	

}

class Calzone extends Pizza {
	private final boolean sauceInside;
	
	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false;
		
		public Builder sauceInde() {
			sauceInside = true;
			return this;
		}

		@Override
		public Calzone build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}
	
	private Calzone(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}
	
}

class PizzaClient {
	
	NYPizza np = new NYPizza.Builder(NYPizza.Size.MEDIUM)
			.addTopping(Pizza.Topping.HAM)
			.addTopping(Pizza.Topping.ONION)
			.build();
	
	Calzone calzone = new Calzone.Builder()
			.addTopping(Pizza.Topping.ONION)
			.sauceInde()
			.build();
	
}
