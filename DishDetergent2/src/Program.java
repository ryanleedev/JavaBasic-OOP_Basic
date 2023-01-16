/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Wafa Hasanain
* Due Date: Dec 2nd
* Modified: Dec 2nd    
* Description: This class makes DishDetergent object and execute.
*/

import java.util.Scanner;

//This is an actual program that creates DishDetergent and execute.
public class Program {

	//this is a main method
	public static void main(String[] args) {

		//fields
		double count;
		double volume;
		String input;
		boolean cont1, cont2;

		//boolean for while loop
		cont1 = true;
		
		
		while (cont1) {
			//creating DishDetergent object and scanner
			DishDetergent dish = new DishDetergent();
			Scanner sc = new Scanner(System.in);

			//user input wash count and setWashCount
			System.out.print("enter wash count: ");
			count = sc.nextDouble();
			dish.setWashCount(count);

			//user input volume per wash and setVolumePerWash
			System.out.print("enter volume per wash (millilitres): ");
			volume = sc.nextDouble();
			dish.setVolumePerWash(volume);

			//ouput report
			System.out.println("checkTotalVolume reports: " + dish.checkTotalVolume());

			//boolean for while loop asking user enter values again
			cont2 = true;
			while(cont2) {
				System.out.print("Enter values again? (Y/N): ");
				input = sc.next();
				
				if (input.equalsIgnoreCase("N")) {
					cont2 = false;
					cont1 = false;
				} else if(input.equalsIgnoreCase("Y")) {
					cont2 = false;
					cont1 = true;
				} else {
					cont2 = true;
				}
				
			}
			
		}
		System.out.println("Program by Jeonghyeon Lee");

	}

}
