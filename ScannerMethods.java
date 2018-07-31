package carlot.co.grandcircus;

import java.util.Scanner;

public class ScannerMethods {

	static Scanner scnr = new Scanner(System.in);

	// Add a car Method

	public static Car UserCar() {
		// Take user input for new car
		System.out.println("Give us some inputs for a car: \nMake, Model, Year, Price");
		Car userCar = new Car(scnr.next(), scnr.next(), scnr.nextInt(), scnr.nextDouble());
		return userCar;

	}

	// Add new car Formatted

	public static Car UserCarFormatted() {
		// Take user input for new car
		System.out.println("Give us some inputs for a new car.");
		System.out.print("Enter Model: ");
		String userMake = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Enter Model: ");
		String userModel = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Enter Year: ");
		int userYear = Validator.getInt(scnr, "");
		System.out.print("Enter Price: ");
		double userPrice = Validator.getDouble(scnr, "");

		Car userCar = new Car(userMake, userModel, userYear, userPrice);
		return userCar;

	}

	// Add Used Car Formatted

	public static UsedCar UserUsedCarFormatted() {
		// Take user input for new car
		System.out.println("Give us some inputs for a used car.");
		System.out.print("Enter Model: ");
		String userMake = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Enter Model: ");
		String userModel = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Enter Year: ");
		int userYear = Validator.getInt(scnr, "");
		System.out.print("Enter Price: ");
		double userPrice = Validator.getDouble(scnr, "");
		System.out.print("Enter Milage: ");
		double userMilage = Validator.getDouble(scnr, "");

		UsedCar userUsedCar = new UsedCar(userMake, userModel, userYear, userPrice, userMilage);
		return userUsedCar;

	}

	// Add a car Method

	public static UsedCar UserUsedCar() {
		// Take user input for new car
		System.out.println("Give us some inputs for a car: \nMake, Model, Year, Price");

		UsedCar userUsedCar = new UsedCar(scnr.next(), scnr.next(), scnr.nextInt(), scnr.nextDouble(),
				scnr.nextDouble());
		return userUsedCar;

	}

}
