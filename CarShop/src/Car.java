
public class Car {

	private String manifacturer;
	private String model;
	private String engine;
	private String color;
	private String owner;
	private int productionYear;
	private double price;
	
	
	Car(String manifacturer, String model, String engine, String color, int productionYear, double price){
		this.setColor(color);
		this.setEngine(engine);
		this.setManifacturer(manifacturer);
		this.setModel(model);
		this.setProductionYear(productionYear);
		this.setPrice(price);
	}
	
	void setProductionYear(int productionYear){
		if(productionYear >= 1990 && productionYear<= 2016){
			this.productionYear = productionYear;
		}
		else
			throw new IllegalArgumentException("Invalid input for productionYear field");
	}
	void setManifacturer(String manifacturer){
		if(manifacturer == null || manifacturer.isEmpty())
			throw new IllegalArgumentException("Invalid input for manifacturer field");
		else
			this.manifacturer = manifacturer;
	}
	
	void setModel(String model){
		if(model == null || model.isEmpty())
			throw new IllegalArgumentException("Invalid input for model field");
		else
			this.model = model;
	}
	
	void setEngine(String engine){
		if(engine == null || engine.isEmpty())
			throw new IllegalArgumentException("Invalid input for engine field");
		else
			this.engine = engine;
	}
	
	void setColor(String color){
		if(color == null || color.isEmpty())
			throw new IllegalArgumentException("Invalid input for engine field");
		else
			this.color = color;
	}
	
	void setPrice(double price){
		if(price>0)
			this.price = price;
		else
			throw new IllegalArgumentException("Invalid input for price field");
	}
	
	void setOwner(Person buyer){
		this.owner = buyer.getName();
	}
	
	double getPrice(){
		return this.price;
	}
	
	String getManifacturer(){
		return this.manifacturer;
	}
	
	String getModel(){
		return this.model;
	}
	
	String getColor(){
		return this.color;
	}
	
	String getEngine(){
		return this.engine;
	}
	
	int getProductionYear(){
		return this.productionYear;
	}
}
