package JavaSessions;

public class Car {

	String name;
	String model;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.model = "520d";
		c1.price = 80;
		c1.color = "Blue";
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(Car.wheels);

		Car c11 = new Car();
		c11.name = "Audi";
		c11.model = "Q5";
		c11.price = 75;
		c11.color = "White";

		Car c12 = new Car();
		c12.name = "Honda";
		c12.model = "Civic";
		c12.price = 30;
		c12.color = "Black";

		Car c13 = new Car();
		c13.name = "Maruti";
		c13.model = "Alto";
		c13.price = 3;
		c13.color = "Red";

	}

}