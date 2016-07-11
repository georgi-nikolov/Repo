
public class Demo {

	public static void main(String[] args) {
		
		CarShop magazin = new CarShop(10);
		
		Car one = new Car("Bmw", "E36", "1.8is", "Black", 1995, 2000);
		Car two = new Car("Kia", "Rio", "2.0", "Red", 2005, 5000);
		Car three = new Car("Mercedes", "S class", "4.5 v8", "White", 2015, 80000);
		
		//magazin.addCar(one);
		//magazin.addCar(two);
		//magazin.addCar(three);
		
		Person ivan = new Person("Ivan", 1000);
		
		magazin.sellNextCar(ivan);
		
		
		
		magazin.ShowAllCarsInTheShop();
				
	}
}
