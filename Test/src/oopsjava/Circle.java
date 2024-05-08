package oopsjava;

public class Circle {
	// Data member
	double radius;

	// No-argument constructor
	public Circle() {
		this.radius = 0.0; // Default radius
	}

	// Two-argument constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Method to calculate circumference
	double calculateCircumference() {
		return 2 * Math.PI * radius;
	}


	// Main method for testing
	public static void main(String[] args) {
		// Create Circle objects using different constructors
		Circle circle1 = new Circle(); // No-argument constructor
		Circle circle2 = new Circle(10.0); // Two-argument constructor with radius 10.0

		// Calculate circumference for circle1 and circle2
		System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
		System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
	}
}