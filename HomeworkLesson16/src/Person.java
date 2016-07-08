
public class Person {

	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		if (!name.isEmpty()) {
			this.name = name;
		}
		if (age > 0) {
			this.age = age;
		}
		this.isMale = isMale;
	}

	void showInfo() {
		System.out.println("The name of the person is : " + this.name);
		if (isMale) {
			System.out.println("He is " + age + " years old");
		} else {
			System.out.println("She is " + age + " years old");
		}
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}

}
