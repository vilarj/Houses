/**
 * Daughter class that inheritances from the class House
 * This class creates a street with houses
 * 
 * @author jimenezc1
 *
 */
public class Street {

	String streetName;
	House[] houses;
	int numberOfHouses;
	
	/**
	 * Constructor with two parameters
	 * Also, an array of type House is instantiated
	 * @param streetName
	 * @param total
	 */
	public Street(String streetName, int total) {
		this.streetName = streetName; 
		this.numberOfHouses = 0;
		houses = new House[total];
	}
	
	/**
	 * method that returns true if a house is build - false otherwise
	 * @param h
	 * @return true
	 */
	public boolean buildHouse (House h) {
		if(numberOfHouses < houses.length) {
			houses[numberOfHouses] = h;
			numberOfHouses++;
			return true;
			}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "\nName of the street: " + streetName;
		
		for (int i = 0; i < numberOfHouses; i ++) {
			s += (houses[i].toString());
		}
		return s;
	}
}
