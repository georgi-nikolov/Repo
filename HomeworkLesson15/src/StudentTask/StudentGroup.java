package StudentTask;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freeplaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freeplaces = 5;
	}

	StudentGroup(String groupSubject) {
		this();
		this.setGroupSubject(groupSubject);
	}

	void setGroupSubject(String groupSubject) {
		String regex = "[a-zA-Z][a-zA-Z ]*";
		if (groupSubject == null || groupSubject.isEmpty() || (!(groupSubject.matches(regex))))
			throw new IllegalArgumentException("Invalid input for groupSubject field");
		else
			this.groupSubject = groupSubject;
	}

	void addStudent(Student s) {
		if (this.freeplaces > 0 && s.getSubject() == this.groupSubject) {
			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {
					students[i] = s;
					this.freeplaces--;
					break;
				}
			}
		} else
			System.err.println("The group is full or the subject of the student does not match the groupSubject");
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freeplaces = 5;
	}

	String theBestStudent() {
		int maxGradeIndex = 0;
		double maxGrade = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGrade() > maxGrade) {
				maxGradeIndex = i;
				maxGrade = students[i].getGrade();
			}
		}
		return students[maxGradeIndex].getName();
	}

	void printStudentsInGroup() {
		for (int i = 0; i < students.length; i++) {
			if (this.freeplaces == 5) {
				System.out.println("There are no students in this group");
				break;
			}
			if (!(students[i] == null)) {
				System.out.println("Name: " + this.students[i].getName());
				System.out.println("Age: " + this.students[i].getAge());
				System.out.println("Subject: " + this.groupSubject);
				System.out.println("Grade: " + this.students[i].getGrade());
				System.out.println("Year in college: " + students[i].getYearInCollege());
				if (students[i].getIsDegree())
					System.out.println("The student has graduated");
				else
					System.out.println("The student is yet to graduate");
				System.out.println("Money: " + students[i].getMoney());
				System.out.println("---------------");
			}
		}
	}
}
