package StudentTask;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.setName(name);
		this.setSubject(subject);
		this.setAge(age);
	}

	void upYear() {
		if (this.yearInCollege < 4)
			this.yearInCollege++;
		else {
			this.isDegree = true;
		}
	}

	double receiveScholarship(double min, double ammount) {
		if (this.grade >= min && this.age < 30 && min > 2 && min <= 6 && ammount > 0)
			this.setMoney(money += ammount);
		return this.money;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		String regex = "^[\\p{L} .'-]+$";
		if(name == null || name.isEmpty() || (!(name.matches(regex))))
			throw new IllegalArgumentException("Invalid input for name field");
		else
			this.name = name;
	}

	String getSubject() {
		return this.subject;
	}

	void setSubject(String subject) {
		String regex = "[a-zA-Z][a-zA-Z ]*";
		if(subject == null || subject.isEmpty() || (!(subject.matches(regex))))
			throw new IllegalArgumentException("Invalid input for subject field");
		else
			this.subject = subject;
	}

	double getGrade() {
		return this.grade;
	}

	void setGrade(double grade) {
		if (grade >= 2 && grade <= 6)
			this.grade = grade;
	}

	int getYearInCollege() {
		return this.yearInCollege;
	}

	void setYearInCollege(int yearInCollege) {
		if (this.yearInCollege > 0 && this.yearInCollege <= 4)
			this.yearInCollege = yearInCollege;
	}

	int getAge() {
		return this.age;
	}

	void setAge(int age) {
		if (age > 18)
			this.age = age;
	}

	boolean getIsDegree() {
		return this.isDegree;
	}

	double getMoney() {
		return this.money;
	}

	void setMoney(double money) {
		if (money >= 0)
			this.money = money;
	}
}
