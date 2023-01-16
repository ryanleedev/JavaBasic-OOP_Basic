/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Leanne Seaward
* Due Date: October 7th
* Modified: October 1st
* Description: This class is for cone object
*/

//This is a Cone class for creating cone object
public class Cone {
	private double height;
	private double radius;
	private double volume;
	
	
	//This is a no-arg constructor
	public Cone() {
		
	}
	
	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter for height
	public double getHeight() {
		return height;
	}
	
	//setter for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//getter for radius
	public double getRadius() {
		return radius;
	}
	
	//setter for volume
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	//getter for volume
	public double getVolume() {
		return volume;
	}

	//this method returns a String which contains the private data members of Cone with labels
	@Override
	public String toString() {
		return "Cone [height=" + height + ", radius=" + radius + ", volume=" + volume + "]";
	}
	
	//this method is a worker method which computes cone volume based on height and weight 
	//prints the value to 2 decimal places
	/* Reference for volume of cone formula
	 * Admin, “Volume of cone - formula, derivation and examples,” BYJUS,
	 * 07-Jun-2022. [Online]. Available: https://byjus.com/maths/volume-of-cone/.
	 * [Accessed: 30-Sep-2022].
	 */	
	public void calculateVolume() {
		volume = (1/3.0)*Math.PI*Math.pow(radius, 2)*height;
		System.out.printf("volume is : %.2f %n", volume);
	}
	
	
}
