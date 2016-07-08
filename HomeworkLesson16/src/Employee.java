
public class Employee extends Person {

	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}

	double calculateOvertime(double hours) {
		if (this.getAge() <= 18) {
			return 0;
		} else
			return (((this.daySalary/8)*1.5)*hours);
	}

	void showEmployeeInfo() {
		super.showInfo();
		System.out.println("The daily salary of this employee is " + daySalary);
	}

}
