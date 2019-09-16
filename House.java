/**
 * This is the parent class that contains all the functions of the
 * program. 
 * @author jimenezc1
 *
 */
public class House {

	private int numberOfUnits;
	private int yearBuild;
	private double assessedPrice;
	
	// Single Constructor
	public House() {}
	
	/**
	 * Constructor with three parameters
	 * @param number
	 * @param year
	 * @param price
	 */
	public House(int number, int year, double price) {
		this.numberOfUnits = number;
		this.yearBuild = year;
		this.assessedPrice = price;
	}
	
	// Getters
	public int getNumberOfUnits() {return numberOfUnits;}
	public int getYearBuild() {return yearBuild;}
	public double getAssesedPrice() {return assessedPrice;}
	
	// Setters
	public void setNumberOfUnits(int nUnits) {nUnits = numberOfUnits;}
	public void setAssessedPrice(double aPrice) {aPrice = assessedPrice;}
	
	// toString method
	@Override
	public String toString(){String s = "\n# of the house: " + numberOfUnits + "\nYear built: " + yearBuild + "\nPrice of the unit: $" + assessedPrice; return s;}
}
