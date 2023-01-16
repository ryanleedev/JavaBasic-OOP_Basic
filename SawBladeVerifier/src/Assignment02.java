/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Wafa Hasanain
* Due Date: Nov 25th
* Modified: Nov 19th    
* Description: This class determine if diameter and kerf are in tolerance.
*/

/*Make CircularSawBlade by this class and keep track of number of blades and tolerance of
 * diameter and kerf.
 */
public class Assignment02 {

	/* this is a main method */
	public static void main(String[] args) {
		
		/* creating CircularSawBlade object */
		CircularSawBlade blade = new CircularSawBlade();
		/* fields */
		double diameter, kerf;
		int NumBlades = 0, NumDiameterOut = 0, NumKerfOut = 0;
		String result;
		boolean diameterCheck, kerfCheck, whileLoop = true , continueLoop = true;

		while (whileLoop) {

			// Enter measured diameter:
			diameter = User.inputPositiveDouble("Enter measured diameter: ");
			// Enter measured kerf:
			kerf = User.inputPositiveDouble("Enter measured kerf: ");

			// set the diameter and kerf into an instance of CircularSawBlade
			blade.setDiameter(diameter);
			blade.setKerf(kerf);
			// use the toString method of class CircularSawBlade
			result = blade.toString();
			// to output the information for the blade.
			System.out.println(result);

			// Use the CircularSawBladeVerifier methods to obtain a true/false regarding if
			// the
			// blade is within specifications for diameter and kerf.
			// by passing the CircularSawBlade reference-value as an argument into each.
			diameterCheck = CircularSawBladeVerifier.isDiameterInTolerance(blade);
			kerfCheck = CircularSawBladeVerifier.isKerfInTolerance(blade);
			// output a message for diameter and kerf to tell the user if they are within
			// tolerance
			// e.g.
			// diameter is within tolerance
			// kerf is within tolerance
			if (diameterCheck) {
				System.out.println("Diameter in tolerance.");
			} else {
				System.out.println("Diameter out of tolerance.");
				NumDiameterOut++;
			}
			if (kerfCheck) {
				System.out.println("Kerf in tolerance.");
			} else {
				System.out.println("Kerf out of tolerance.");
				NumKerfOut++;
			}

			// collect a count of, and display to the user:
			// the number of blades entered
			NumBlades++;
			System.out.println("Blades Entered:" + NumBlades);
			// the number of diameters out of tolerance
			System.out.println("Diameter(s) out of tolerance:" + NumDiameterOut);
			// the number of kerfs out of tolerance
			System.out.println("Kerf(s) out of tolerance:" + NumKerfOut);
			// print out your name on screen
			System.out.println("Program by Jeonghyeon Lee");
			// using a loop ask if there is more data to enter (yes, no) and continue
			// only if the user enters some form of yes
			// e.g. "YES" "yEs" "yeS" would be acceptable (any capitalization)
			// if yes, processing should repeat starting with the output of the
			// user-instructions.
			continueLoop = true;
			while(continueLoop) {
				String continuity = User.inputString("Continue (yes/no)? ");
				if (continuity.equalsIgnoreCase("no")) {
					whileLoop = false;
					continueLoop = false;
				} else if (continuity.equalsIgnoreCase("yes")) {
					whileLoop = true;
					continueLoop = false;
				} else {
					System.out.println("Invaild input.");
					continueLoop = true;
				}
			}
			// you can use any decision structure or loop for this program,
			// however a for-loop is not recommended for the main-method logic.

		}
		System.out.println("Program has shut down.");

	}
}

/*
 * References: [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?.
 * thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28,
 * 2022).
 */