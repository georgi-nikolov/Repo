package StudentTask;

public class College {

	public static void main(String[] args) {

		Student mathOne = new Student("Ivan", "Math", 22);
		// to test the best grade method below
		mathOne.setGrade(5);
		Student mathTwo = new Student("Gosho", "Math", 24);
		Student mathThree = new Student("Mitko", "Math", 20);
		Student mathFour = new Student("Pesho", "Math", 23);
		Student mathFive = new Student("Niki", "Math", 27);

		Student two = new Student("Petyr", "Physics", 21);
		Student three = new Student("Maria", "Law", 23);

		mathOne.receiveScholarship(4.5, 500);
		two.receiveScholarship(3.5, 800);
		
		three.upYear();
		System.out.println(three.getName() + " is in college for " + three.getYearInCollege() + " years\n");

		StudentGroup math = new StudentGroup("Math");
		math.addStudent(mathOne);
		math.addStudent(mathTwo);
		math.addStudent(mathThree);
		math.addStudent(mathFour);
		math.addStudent(mathFive);

		StudentGroup physics = new StudentGroup("Physics");
		physics.addStudent(two);
		StudentGroup law = new StudentGroup("Law");
		law.addStudent(three);

		System.out.println("The best student is " + math.theBestStudent() + "\n");
		
		math.printStudentsInGroup();
		
		physics.emptyGroup();
		physics.printStudentsInGroup();
	}
}
