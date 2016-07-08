
public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc = new Computer();
		pc.year = 2000;
		pc.isNotebook = false;
		pc.hardDiskMemory = 80000;
		pc.operationSystem = "Win XP";
		pc.price = 600;
		pc.freeMemory = 20000;
		
		Computer laptop = new Computer();
		laptop.year = 2005;
		laptop.isNotebook = true;
		laptop.hardDiskMemory = 160000;
		laptop.operationSystem = "Linux Ubuntu";
		laptop.price = 1000;
		laptop.freeMemory = 80000;
		
		
		pc.useMemory(100);
		laptop.changeOperationSystem("Win 7");
		
		System.out.println("The pc is made in " + pc.year + ", it costs " + pc.price + ", it runs " + pc.operationSystem + ", the hard drive is " + pc.hardDiskMemory + " mb and the free memory is " + pc.freeMemory);
		System.out.println("The laptop is made in " + laptop.year + ", it costs " + laptop.price + ", it runs " + laptop.operationSystem + ", the hard drive is " + laptop.hardDiskMemory + " mb and the free memory is " + laptop.freeMemory);
	}
}


