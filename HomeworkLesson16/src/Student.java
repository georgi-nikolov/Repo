
public class Student extends Person {

	private double score;
	
	//Student() kato default constructor ne moje da se syzdade bez da se izvika v nego super constructor
	// za6toto class Person ima syzdaden constructor, koito iska parametri i koito trqbva da se izvika zaradi nasledqvaneto
	// v moq slu4ai i vikaneto na super nqma da opravi problema, za6toto parametrite na super sa private
	// tova moje da se opravi s getter-i na harakteristikite v superClass Person
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
		else
			throw new IllegalArgumentException("Invalid input for score field");
	}

	void showStudentInfo() {
		super.showInfo();
		System.out.println("The score of this student is : " + this.score);
	}
}
