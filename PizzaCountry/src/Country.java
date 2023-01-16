
public class Country {
	
	private String name;
	private long population;
	private double gDP;
	private boolean driveSideRight;
	
	//parameterized constructor with all private data members as parameters
	
	//no-arg constructor
	public Country() {
		
	}
	//parameterized constructor with just the private data member name as a parameter
	public Country(String name) {
		this.name = name;
	}
	
	public Country(String name, long population, double gDP, boolean driveSideRight) {
		this.name = name;
		this.population = population;
		this.gDP = gDP;
		this.driveSideRight = driveSideRight;
	}
	//setters for all parameters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGDP(double gDP) {
		this.gDP = gDP;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public void setDriveSideRight(boolean driveSideRight) {
		this.driveSideRight = driveSideRight;
	}
	//getters for all parameters
	public String getName() {
		return name;
	}
	
	public double getGDP() {
		return gDP;
	}
	
	public long getPopulation() {
		return population;
	}
	
	public boolean getDriveSideRight() {
		return driveSideRight;
	}
	//toString() method
	public String toString() {
		String msg = String.format("Name: %s, Population: %d, GDP: $%.2f, Drive Right Side?: %b", name, population, 
				gDP, driveSideRight);
		return msg;
	}
	//helper method to compute and print GDP per capita (per person)
	
	public void printGDPper() {
		System.out.printf("the GDP per capita of %s is $%.2f\n", name, gDP/population);
		
	}
	
	

}
