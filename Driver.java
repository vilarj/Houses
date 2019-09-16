
public class Driver {

	public static void main(String[] args) {
		// Creating the objects
		House h1 = new House(2, 2013, 500.98);
		House h2 = new House (3, 2014, 600);
		StreetHouse sHouse = new StreetHouse(5, 2013, 500.98, 23, "Daniel Vilar");
		StreetHouse sHouse2 = new StreetHouse(10, 2019, 900.67, 19, "Peter Cane");
		Street street = new Street("Las carreras",1);
		Street street2 = new Street("Huntington Avenue", 2);
		
		// Building the new houses
		street.buildHouse(h1);
		street2.buildHouse(h2);
		
		// Printing out the objects
		System.out.println("\n" + sHouse);
		System.out.println("\n" + sHouse2);
		System.out.println("\n" + street);
		System.out.println("\n" + street2);
	}
}
