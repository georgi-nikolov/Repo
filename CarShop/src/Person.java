
public class Person {

	private String name;
	private double money;
	private Car car;
	
	Person(String name, double money){
		this.setName(name);
		this.setMoney(money);
	}
	
	void setName(String name) {
		String regex = "^[\\p{L} .'-]+$";
		if (name == null || name.isEmpty() || (!(name.matches(regex))))
			throw new IllegalArgumentException("Invalid input for name field");
		else
			this.name = name;
	}
	
	void setMoney(double money){
		if(money>0)
			this.money = money;
	}
	
	void setCar(Car car){
		if(!(car == null))
		this.car = car;
	}
	
	double getMoney(){
		return this.money;
	}
	
	String getName(){
		return this.name;
	}
	
	Car getCar(){
		try{
				return this.car;
			} catch (NullPointerException nfe) {
				System.err.println("No car");
		}
		return this.car;
		
	}
	
}
