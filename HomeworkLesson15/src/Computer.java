
public class Computer {

	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.setYear(year);
		this.setPrice(price);
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this.setYear(year);
		this.setPrice(price);
		this.isNotebook = isNotebook;
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
		this.setOperationSystem(operationSystem);
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price)
			return -1;
		else if(c.price>this.price)
			return 1;
		else
			return 0;
	}
	
	void changeOperationSystem(String newOperationSystem){
		setOperationSystem(newOperationSystem);
	}
	
	void useMemory(int memory){
		if(freeMemory>memory)
			freeMemory -= memory;
		else
			System.out.println("Not enough free memory!");
	}
	
	void setYear(int year){
		if(year>0)
			this.year = year;
	}
	
	int getYear(){
		return this.year;
	}
	
	void setPrice(double price){
		if(price>0)
			this.price = price;
	}
	
	void setHardDiskMemory(double hardDiskMemory){
		if(hardDiskMemory > 0)
			this.hardDiskMemory = hardDiskMemory;
	}
	
	void setFreeMemory(double freeMemory){
		if(freeMemory >= 0 && freeMemory<this.hardDiskMemory)
			this.freeMemory = freeMemory;
	}
	
	void setOperationSystem(String operationSystem){
		if(operationSystem == null || operationSystem.isEmpty())
			throw new IllegalArgumentException("Invalid input for operationSystem field");
		else
			this.operationSystem = operationSystem;
	}
	
	void setIsNotebook(boolean isNotebook){
		this.isNotebook = isNotebook;
	}
	double getPrice(){
		return this.price;
	}
}
