package oopsjava;

class BlackTea extends Tea {
	
	public void prepareTea() {
		System.out.println("Preparing black tea...");
		
	}
}

class GreenTea extends Tea {
	
	public void prepareTea() {
		System.out.println("Preparing green tea...");
		
	}
}

class HerbalTea extends Tea {
	
	public void prepareTea() {
		System.out.println("Preparing herbal tea...");
		
	}
}

public class Tea6 {
	public static void main(String[] args) {
		Tea blackTea = new BlackTea();
		blackTea.prepareTea();

		Tea greenTea = new GreenTea();
		greenTea.prepareTea();

		Tea herbalTea = new HerbalTea();
		herbalTea.prepareTea();
	}
}
