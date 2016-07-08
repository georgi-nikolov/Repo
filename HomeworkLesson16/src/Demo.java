
public class Demo {

	public static void main(String[] args) {
		Person[] masiv = new Person[10];

		Student ivan = new Student("Ivan", 20, true, 4.5);
		Student petyr = new Student("Pesho", 25, true, 5);

		Person gosho = new Person("Gosho", 30, true);
		Person maria = new Person("Maria", 22, false);

		Employee sasho = new Employee("Sasho", 17, true, 40);
		Employee eva = new Employee("Eva", 19, false, 60);

		masiv[0] = ivan;
		masiv[1] = petyr;
		masiv[2] = gosho;
		masiv[3] = maria;
		masiv[4] = sasho;
		masiv[5] = eva;

		for (int i = 0; i < masiv.length; i++) {
			if (!(masiv[i] == null)) {
				if (masiv[i] instanceof Student) {
					((Student) masiv[i]).showStudentInfo();
					System.out.println();
				} else if (masiv[i] instanceof Employee) {
					((Employee) masiv[i]).showEmployeeInfo();
					System.out.println();
				} else
					masiv[i].showInfo();
				System.out.println();
			} else
				continue;
		}

		for (int i = 0; i < masiv.length; i++) {
			if (masiv[i] instanceof Employee)
				System.out.println("The overtime pay for " + masiv[i].getName() + " is " + ((Employee) masiv[i]).calculateOvertime(2));
		}

	}
}
