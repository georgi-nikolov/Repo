package employeeTask;

public class Demo {

	public static void main(String[] args) {
		
		Employee ivan = new Employee("Ivan");
		ivan.setHoursLeft(8);
		
		Employee pesho = new Employee("Petyr");
		pesho.setHoursLeft(8);
		
		Employee gosho = new Employee("Gosho");
		gosho.setHoursLeft(8);
		
		Task kopane = new Task("Kopane", 10);
		Task polivane = new Task("Polivane", 5);
		
		pesho.setCurrentTask(kopane);
		ivan.setCurrentTask(polivane);
		
		pesho.work();
		ivan.work();
		
		pesho.showReport();
		ivan.showReport();
		gosho.showReport();
	}
}
