/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Wafa Hasanain
 * Due Date: Nov 25th
 * Modified: Nov 19th    
* Description: This class is for CircularSawBladeVerifier
*/

/* This is a CircularSawBladeVerifier class for verifying intolerance from blCircularSawBlade 
 * object 
*/
public class CircularSawBladeVerifier {
	// ToDo: Create a public static final EPSILON with value 0.015625
	//       i.e. one-64th of an inch 1/64
	public static final double EPSILON = 0.015625;
	
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {}
	
	/* from this static method we can verify diameter tolerance */
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		// check that the diameter does not differ more than EPSILON and expected diameter

		// Tip: The constant in class CircularSawBlade documents the expected
		// value for diameter.
		// return a boolean that indicates if the circular saw blade diameter is within 
		// tolerance (i.e. difference of actual and expected is less than or equal to EPSILON) 
		boolean bool;
		double expectedDiameter = blade.EXPECTED_DIAMETER;
		double value = Math.abs(expectedDiameter - blade.getDiameter());
		if(value <= EPSILON) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}
	
	/* from this static method we can verify kerf tolerance */
	public static boolean isKerfInTolerance(CircularSawBlade blade) {
		// check that the diameter does not differ more than EPSILON and expected kerf

		// Tip: The constant in class CircularSawBlade documents the expected
		// value for kerf.
		// return a boolean that indicates if the circular saw blade kerf is within 
		// tolerance (i.e. difference of actual and expected is less than or equal to EPSILON)
		boolean bool;
		double expectedKerf = blade.EXPECTED_KERF;
		double value = Math.abs(expectedKerf - blade.getKerf());
		if(value <= EPSILON) {
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */
