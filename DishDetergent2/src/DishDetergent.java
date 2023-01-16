/*
 * Author/modified by: Jeonghyeon Lee
 * Professor: Wafa Hasanain
 * Date: Dec 2nd 
 * Description: Lab Exam 02 (22F) Section 351
 */

/*
 * this class represents a DishDetergent
 */

public class DishDetergent {
	private double washCount; 
	private double volumePerWash; // in millilitres
	
	/*
	 * no argument constructor, sets fields to zero
	 */
	public DishDetergent() {
		this(0.0,0.0);
	}
	
	/*
	 * argument constructor
	 */
	public DishDetergent(double washCount, double volumePerWash) {
		this.washCount = washCount;
		this.volumePerWash = volumePerWash;
	}
	
	/*
	 * accessor for washCount
	 */
	public double getWashCount() {
		return washCount;
	}
	
	/*
	 * mutator for washCount 
	 */
	public void setWashCount(double washCount) {
		this.washCount = washCount;
	}
	
	/*
	 * accessor for volumePerWash
	 */
	public double getVolumePerWash() {
		return volumePerWash;
	}
	
	/*
	 * mutator for volumePerWash 
	 */
	public void setVolumePerWash(double volumePerWash) {
		this.volumePerWash = volumePerWash;
	}
	
	/*
	 * This worker method calculates the amount of 
	 *  dish detergent needed in millilitres 
	 *  using the washCount and volumePerWash fields.
	 */
	public double calculateTotalVolume() {
		double totalVolume  = this.volumePerWash * this.washCount;
		return totalVolume ;
	}
	
	/*
     * This method check if total volume is less than 0 output total volume invalid,
     * if total volume greater than 351 output total volume too high
     * and else output total volume within range
     */
    public String checkTotalVolume(){
        String report;
        if (calculateTotalVolume() < 0) {
        	report = "total volume invalid";
        } else if (calculateTotalVolume() > 351) {
        	report = "total volume too high";
        } else {
        	report = "total volume within range";
        }

        return report; // return the actual report
    }

	
}
