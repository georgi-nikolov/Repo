
public class Person {

	private String name;
	private int age;
	private boolean isMale;

	Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
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
	
	void setName(String name) {
		String regex = "^[\\p{L} .'-]+$";
		if(name == null || name.isEmpty() || (!(name.matches(regex))))
			throw new IllegalArgumentException("Invalid input for name field");
		else
			this.name = name;
	}
	
	void setAge(int age){
		if (age > 0) {
			this.age = age;
		}
		else{
			throw new IllegalArgumentException("Invalid input for age field");
		}
	}
	
	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}

}
