/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Leanne Seaward
* Due Date: October 14th
* Modified: October 14th
* Description: This class is for DishDetergent Object 
*/

//This is a DishDetergent class for creating dish object
public class DishDetergent {

	private double washCount;
	private double volumePerWash;
	
	// This is a no-arg constructor
	public DishDetergent() {
	}
	
	//getter and setter for washCount
	public double getWashCount() {
		return washCount;
	}
	public void setWashCount(double washCount) {
		this.washCount = washCount;
	}
	//getter and setter for volumePerWash
	public double getVolumePerWash() {
		return volumePerWash;
	}
	public void setVolumePerWash(double volumePerWash) {
		this.volumePerWash = volumePerWash;
	}
	
	//helper method for calculating total volume
	public double calculateTotalVolume() {
		double result = washCount * volumePerWash;
		return result;
	}
	
	
	
	

}
