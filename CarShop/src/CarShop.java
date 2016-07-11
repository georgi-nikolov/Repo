
public class CarShop {
	
	
	private Car[] carsInShop;
	
	
	CarShop(int capacity){
		if(capacity>0){
			carsInShop = new Car[capacity];
		}
		else
			throw new IllegalArgumentException("Invalid input for capacity field");
	}
	
	
	
	boolean addCar(Car car){
		boolean isCarAdded = false;
		for (int i = 0; i < carsInShop.length; i++) {
			if(carsInShop[i] == null){
				carsInShop[i] = car;
				isCarAdded = true;
				break;
			}
		}
		return isCarAdded;
	}
	
	Car getNextCar() {
		int index = 0;
		try {
			for (int i = 0; i < carsInShop.length; i++) {
				if (!(carsInShop[i] == null)) {
					index = i;
					break;
				}
			}
		} catch (NullPointerException nfe) {
			System.err.println("There are no cars in the shop");
		}
		return carsInShop[index];
	}
	
	void sellNextCar(Person buyer){
		if(!(getNextCar()== null)){
			if(buyer.getMoney()>= getNextCar().getPrice()){
				buyer.setCar(this.getNextCar());
				removeCar(buyer.getCar());
				buyer.setMoney(buyer.getMoney() - getNextCar().getPrice());
			}
			else{
				System.err.println(buyer.getName() + " does not have enough money to buy this car");
			}
		}
		else
			System.err.println("There are no cars in the shop to sell");
	}
	
	boolean removeCar(Car car){
		boolean isRemoved = false;
		for (int i = 0; i < carsInShop.length; i++) {
			if(carsInShop[i] == car){
				carsInShop[i] = null;
				isRemoved = true;
				break;
			}
		}
		return isRemoved;
	}
	
	void ShowAllCarsInTheShop(){
		boolean flag = false;
		for (int i = 0; i < carsInShop.length; i++) {
			if(!(carsInShop[i] == null)){
				System.out.println(carsInShop[i].getManifacturer() + " " + carsInShop[i].getModel());
				System.out.println("The car was produced in " + carsInShop[i].getProductionYear());
				System.out.println("The car is " + carsInShop[i].getColor());
				System.out.println("The engine is " + carsInShop[i].getEngine());
				System.out.println("The car costs " + carsInShop[i].getPrice());
				System.out.println("---------");
				flag = true;
			}
			else
				continue;
		}
		if(!flag)
			System.out.println("There are no cars in the shop at the moment");
	}
}
