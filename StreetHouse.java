/**
 * Daughter class that inheritances from the class House
 * 
 * @author jimenezc1
 *
 */
public class StreetHouse extends House{
	
	int StreetNumber;
	String homeowner;
	StreetHouse leftNeighbor, rightNeighbor;
	
	/**
	 * Constructor passed by one parameter.
	 * @param StreetNumber
	 */
	public StreetHouse(int StreetNumber) {
		this.StreetNumber = StreetNumber;	
		
		homeowner = "No name yet"; //Empty right now
		leftNeighbor = null;
		rightNeighbor = null;
		}
	
	/**
	 * Second parameter with all the passed values
	 * @param numberOfUnits
	 * @param yearsBuild
	 * @param assessedPrice
	 * @param StreetNumber
	 * @param homeowner
	 */
	public StreetHouse(int numberOfUnits, int yearsBuild, double assessedPrice, int StreetNumber, String homeowner) {
		super(numberOfUnits, yearsBuild, assessedPrice);
		this.StreetNumber = StreetNumber;
		this.homeowner = homeowner;
	}
	
	// Getters
	public int getStreetNumber() {return StreetNumber;}
	public String getHomeowner() {return homeowner;}
	public StreetHouse getLeftNeightbor() {return leftNeighbor;}
	public StreetHouse getRightNeightbor() {return rightNeighbor;}
	
	// Setters
	public int setStreetNumber(int StreetNumber) {return StreetNumber;}
	public String setHomeowner(String homeowner) {return homeowner;}
	public StreetHouse setLeftNeightbor(StreetHouse leftNeighbor) {return leftNeighbor;}
	public StreetHouse setRightNeightbor(StreetHouse rightNeighbor) {return rightNeighbor;}
	
	@Override
	public String toString(){
		int nUnits = getNumberOfUnits();
		int yBuild = getYearBuild();
		double aPrice = getAssesedPrice();
		
		String s = "\n# of the House: " + nUnits + "\nYear Built: " + yBuild + "\nPrice of the house: " + aPrice + "\n# of the Street: " + StreetNumber + "\nOwner of the house: " + homeowner;
		return s; 
		}
}
