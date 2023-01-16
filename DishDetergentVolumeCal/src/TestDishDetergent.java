/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Leanne Seaward
* Due Date: October 14th
* Modified: October 14th
* Description: This class makes DishDetergent object and calculate total volume of needed detergent by users input
*/

import java.util.Scanner;

//This is an actual program that creates Detergent object and execute.
public class TestDishDetergent {

	//this is a main method
	public static void main(String[] args) {
		
		double count;
		double volume;
		
		//creates Scanner object and DishDetergent object
		Scanner sc = new Scanner(System.in);
		DishDetergent dish = new DishDetergent();

		System.out.print("enter wash count: ");
		count = sc.nextDouble();
		dish.setWashCount(count);
		
		System.out.print("enter volume per wash (millilitres): ");
		volume = sc.nextDouble();
		dish.setVolumePerWash(volume);
		
		System.out.printf("getWashCount() reports: %.1f %n", dish.getWashCount());
		System.out.printf("getVolumePerWash() reports: %.1f %n", dish.getVolumePerWash());
		System.out.printf("calculateTotalVolume() reports: %.4f %n", dish.calculateTotalVolume());
		System.out.println("Program by Jeonghyeon Lee");
		
		
	}

}
