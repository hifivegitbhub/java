package hw.d1105;

import java.util.HashMap;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		Secretary secretary1 = new Secretary("hong", 1, "secretary", 800);
		Sales sales1 = new Sales("kim", 2, "sales", 1200);

		map.put(secretary1.getNumber(), secretary1);
		map.put(sales1.getNumber(), sales1);

		int key = 0;
		Iterator<Integer> keys = map.keySet().iterator();
		System.out.println("name\tdepartment\tsalary");
		System.out.println("---------------------------------------");
		for (int i = 0; i < map.size(); i++) {
			key = keys.next();
			System.out.printf("%s\t%s\t%s\t\n", map.get(key).getName(), 
					map.get(key).getDepartment(), map.get(key).getSalary());
		}
		System.out.println();

		// Bonus b1 = (Bonus)map.get(1);
		// b1.incentive(100);
		// Bonus b2 = (Bonus)map.get(2);
		// b2.incentive(100);

		keys = map.keySet().iterator();
		for (int i = 0; i < map.size(); i++) {
			key = keys.next();
			Bonus b = (Bonus) map.get(key);
			b.incentive(100);
		}

		System.out.println("인센티브 100 지급");
		System.out.println();

		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("---------------------------------------------");
		keys = map.keySet().iterator();
		for (int i = 0; i < map.size(); i++) {
			key = keys.next();
			System.out.printf("%s\t%s\t%s\t%.1f\n", map.get(key).getName(), 
					map.get(key).getDepartment(), map.get(key).getSalary(), map.get(key).tax());
		}
	}
}
