package oopsjava;

public class Tea {

	public void prepareTea() {
		System.out.println("Preparing Basic Tea with hot water and tea leaves...");
	}

	public void addMilk() {
		System.out.println("Adding Milk to the Tea...");
	}

	public void addSugar() {
		System.out.println("Adding Sugar to the Tea...");
	}

	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareTea();
		myTea.addMilk();
		myTea.addSugar();
	}
}
