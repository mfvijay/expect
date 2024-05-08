package oopsjava;

import javapackage.Person;

public class Personsample {
	String name;
	int age;

	// Constructor
	public void Person1(String a, int b) {

		name = a;
		age = b;

	}

	public String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// Create a Person object
		Person person1 = new Person("Alice", 30);

		// using getter methods
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());
	}
}