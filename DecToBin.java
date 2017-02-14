/**
 * @author Cristian Morales
 */
import java.util.Scanner;

public class DecToBin {
	private static Scanner keyboard = new Scanner(System.in);
	private static int UserChoice = 0;
	private static double decimal = 0.0;
	private static float floatNum = 0;
	private static String binary = " ";
	private static String hex = " ";
	private static int binVal = 0;

	public static void main(String[] args) {

		do {
			System.out.println("This program will convert between Decimal and IEEE-754 binary.");
			printMenu();

			switch (UserChoice) {
			case 1:
				DecToSingle();
				break;
			case 2:
				DecToDouble();
				break;
			case 3:
				SingleToDec();
				break;
			case 4:
				DoubleToDec();
				break;
			case 0:
				System.out.println("Good Bye.");
				break;
			}

		} while (UserChoice != 0); // till user wants to quit

	}

	

	

	private static void printMenu() {

		System.out
				.println("Please select the number that correspondes with the conversion you will like:");
		System.out
				.println("1) Convert from decimal number to IEEE-754 Single Precision Floating-Point Representation");
		System.out
				.println("2) Convert from decimal number to IEEE-754 Double Precision Floating-Point Representation");
		System.out
				.println("3) Convert from IEEE-754 Single Precision to decimal number");
		System.out
				.println("4) Convert from IEEE-754 Double Precision to decimal number");
		System.out.println("0) Exit");
		UserChoice = keyboard.nextInt();
		keyboard.nextLine();
		while (UserChoice < 0 || UserChoice > 4) {
			System.out.println("Invalid Choice pick between 0 and 4");
			System.out.println("");
			printMenu();
		}
	}

	private static void DecToSingle() {
		System.out
				.println("Enter a Decimal number to convert to Single precision binary.");
		decimal = keyboard.nextDouble();
		floatNum = (float) decimal;
		binVal = Float.floatToIntBits(floatNum);
		binary = Integer.toBinaryString(binVal);
		System.out.println(binary);

	}

	private static void DecToDouble() {
		System.out
				.println("Enter a Decimal number to convert to Double precision binary.");
		decimal = keyboard.nextDouble();
		binary = Long.toString(Double.doubleToLongBits(decimal), 2);
		System.out.println(binary);

	}

	private static void SingleToDec() {
		float deciFinal;
		System.out
				.println("Enter A Single precision binary number to convert to decimal. ");
		binary = keyboard.nextLine().trim();
		deciFinal = Float.intBitsToFloat(Integer.parseInt(binary, 2));
		System.out.println(deciFinal);

	}

	private static void DoubleToDec() {
		System.out
				.println("Enter A Double precision binary number to convert to decimal.");
		binary = keyboard.nextLine().trim();
		decimal = Double.longBitsToDouble(Long.parseLong(binary, 2));
		System.out.println(decimal);

	}


}
