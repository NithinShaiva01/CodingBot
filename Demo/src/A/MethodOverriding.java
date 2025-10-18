package A;

	// Parent class
	class Vehicle {
	    void start() {
	        System.out.println("Vehicle is starting");
	    }
	}

	// Child class 1
	class Car extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Car is starting with key ignition");
	    }
	}

	// Child class 2
	class Bike extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Bike is starting with kick start");
	    }
	}

	// Main class
	public class MethodOverriding {
	    public static void main(String[] args) {
	        Vehicle v; // Parent reference

	        v = new Car();
	        v.start(); // Calls Car's start() at runtime

	        v = new Bike();
	        v.start(); // Calls Bike's start() at runtime
	    }
	}