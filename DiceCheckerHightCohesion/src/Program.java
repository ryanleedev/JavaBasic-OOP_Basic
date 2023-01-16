/*
* Student Name: Jeonghyeon Lee
* Lab Professor: Wafa Hasanain
* Due Date: Dec 4th
* Modified: Dec 1st 
* Description: This class take input from user and count dice face.
*/
public class Program {

	/* this is a main method */
	public static void main(String[] args) {
		/* Menu numbers variable with final */
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		/* variable for switch option */
		int option = 0;
		/* creating DiceChecker object */
		DiceChecker diceChecker = new DiceChecker();
		/* boolean variable for do while loop */
		boolean bool = true;


		do {
			String menu = Menu.prepareMenu();
			Output.print(menu);
			option = User.inputInteger("Select option:");
			switch (option) {
			case ENTER_VALUES:
				diceChecker.enterData();
				break;
			case DISPLAY_REPORT:
				diceChecker.printReport();
				break;
			case RESET_VALUES:
				diceChecker.resetData();
				break;
			case EXIT_PROGRAM:
				bool = false;
			}

		} while (bool);

		Output.print("Program by Jeonghyeon Lee\nProgram Exit");

	}

}
