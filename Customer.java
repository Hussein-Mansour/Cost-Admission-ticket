/*
 * Student Name: Hussein Mansour
 * Modified: 2023-03-17
 */

/*
 * This class represents the process for customer ticket price
 */
public class Customer {
	private int age;
	
	/*
	 * no-argument constructor, sets age to zero.
	 */
	public Customer() {
		this(0);
	}
	
	/*
	 * Parameterized constructor, accepts a value for
	 * age
	 */
	public Customer(int age) {
		this.age = age;
	}

	/*
	 * accessor for age
	 */
	public int getAge() {
		return this.age;
	}

	/*
	 * mutator for age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * Worker method that calculates ticket price
	 * using if else statments
	 */
	public double calculateTicketPrice() {
		double price = -1.0; // set to -1 in case the age is invalid.
		
		if (age >= 0 && age <= 3) {
			price = 0;
		} else if (age >= 3 && age <= 13) {
			price = 7.99;
		} else if (age >= 14 && age <= 65) {
			price = 10.99;
		} else if (age >= 65 && age < 110) {
			price = 8.50;
		}

		return price; 
	}
	
}
