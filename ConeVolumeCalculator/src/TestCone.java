/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Leanne Seaward
* Due Date: October 7th
* Modified: October 1st
* Description: This class makes Cone object and calculate volume by users input
*/

import java.util.Scanner;

//This is an actual program that creates cone object and execute.
public class TestCone {

	//this is a main method
	public static void main(String[] args) {

		//Creating Cone by cone constructor and Scanner
		Cone cone = new Cone();
		Scanner sc = new Scanner(System.in);
		//height and radius variable initialization
		double height, radius;
		
		System.out.print("Enter height: ");
		height = sc.nextDouble();
		cone.setHeight(height);
		
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();
		cone.setRadius(radius);
		
		cone.calculateVolume();
		
		System.out.println("Program by Jeonghyeon Lee");
		
		
		
	}

}
