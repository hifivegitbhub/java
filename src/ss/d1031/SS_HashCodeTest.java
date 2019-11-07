package ss.d1031;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class SS_HashCodeTest {

	public static void main(String[] args) {

		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] " + value);
		}
		
		String value = System.getenv("JAVA_HOME");
		System.out.println(value);
	}

	static class Student {
		int sno;
		String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student s = (Student) obj;
				if (s.sno == this.sno) {
					if (s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}

	}

}
