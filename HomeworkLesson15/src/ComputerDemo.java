
public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer pcMasterRace = new Computer(2016, 2500, false, 1000, 800, "Win 10");
		
		Computer laptop = new Computer(2010, 1000, 500, 200);
		
		Computer potato = new Computer();
		
		
		Computer valueKing = new Computer(2015, 1000, false, 250, 150, "Win 8.1");
		
		
		
		if(pcMasterRace.comparePrice(potato)==-1)
			System.out.println("The pcMasterRace is more expensive");
		else if (pcMasterRace.comparePrice(potato)==1)
			System.out.println("The potato is more expensive");
		else
			System.out.println("They are the same price");
		
		if(laptop.comparePrice(potato)==-1)
			System.out.println("The laptop is more expensive");
		else if (laptop.comparePrice(potato)==1)
			System.out.println("The potato is more expensive");
		else
			System.out.println("They are the same price");
	}
}


