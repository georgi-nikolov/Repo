package employeeTask;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	
	Employee(String name){
		this.setName(name);
	}

	void setName(String name) {
		String regex = "^[\\p{L} .'-]+$";
		if(name == null || name.isEmpty() || (!(name.matches(regex))))
			throw new IllegalArgumentException("Invalid input for name field");
		else
			this.name = name;
	}

	void setCurrentTask(Task currentTask) {
		if(currentTask == null)
			throw new IllegalArgumentException("Invalid input for currentTaks field");
		else
			this.currentTask = currentTask;
	}

	void setHoursLeft(int hoursLeft) {
		if(this.hoursLeft>=0)
		this.hoursLeft = hoursLeft;
	}
	
	
	void work(){
		if(this.hoursLeft>this.currentTask.getWorkingHours()){
			this.hoursLeft = this.hoursLeft - this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
		}
		else{
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
		}
	}
	
	void showReport(){
		System.out.println("This is a report for " + this.name);
		
		if(this.currentTask != null){
			System.out.println("The employee is working  on " + this.currentTask.getName());
			
			if(this.currentTask.getWorkingHours()>0)
				System.out.println("The current task needs to be worked on for another " + this.currentTask.getWorkingHours() + " hours");
			else
				System.out.println("The employee has finished working on his/her task");
		}
		else
			System.out.println("This employee has no task currently set");
		
		System.out.println("The employee has " + this.hoursLeft + " hours left to work today\n");
		
		
	}
}
