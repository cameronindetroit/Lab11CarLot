/*
 * Cameron Barnes
 * Grand Circus Lab 11
 * Car Lot Application 
 * 7/30/2018
 */

package carlot.co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarLotApp {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		ArrayList<Car> cars = new ArrayList<>();

		// Class Variables
		String userInput = "";
		int userNumber = 1;
		double milage = 0;
		boolean listCars = true;
		// format variable
		String format = "%s." + "%-8s    %-8s        %-6s        $%-8s        %-8s      %n";

		// List of new Cars
		Car car1 = new Car("Ford", "Focus", 2017, 14000.00);
		Car car2 = new Car("Ford", "Escape", 2015, 12000.00);
		Car car3 = new Car("Chevy", "Volt", 2019, 30000.00);

		// List of used Cars
		UsedCar car4 = new UsedCar("Dodge", "Ram", 2011, 10000.00, 154000.00);
		UsedCar car5 = new UsedCar("Hyundai", "Elantra", 2010, 8000.00, 126000.00);
		UsedCar car6 = new UsedCar("Mazda", "Tribute", 2011, 10000.00, 154000.00);

		// Add cars to arrayList
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);

		System.out.println("Welcome to the Grand Circus Motors admin consolse!\n");

		// Start App
		while (listCars == true) {

			// Ask user if they would like to list car, add car, remove car, look up car

			System.out.println(
					"Would you like to (list all cars, add car, add used car, remove car, look up car, quit?)");
			userInput = Validator.getStringWithValidInformation(scnr, "");

			// conditional for user to choose option
			if (userInput.toLowerCase().equals("quit")) {
				listCars = false;

			} else if (userInput.toLowerCase().equals("list all cars")) {
				// List All Cars
				for (int i = 0; i < cars.size(); i++) {

					Car item = cars.get(i);

					if (item instanceof UsedCar) {
						UsedCar usedcar = (UsedCar) item;
						milage = usedcar.getMileage();

					}

					System.out.printf(format, i + 1, item.getMake(), item.getModel(), item.getYear(), item.getPrice(),
							milage);

				}

				// Add car
			} else if (userInput.toLowerCase().equals("add car")) {

				cars.add(ScannerMethods.UserCarFormatted());
				System.out.println("Your car has been added.");
				scnr.nextLine();

				// add used car
			} else if (userInput.toLowerCase().equals("add used car")) {

				cars.add(ScannerMethods.UserUsedCarFormatted());
				System.out.println("Your used car has been added.");
				scnr.nextLine();

				// remove car
			} else if (userInput.toLowerCase().equals("remove car")) {

				System.out.println("Which Car would you like to remove? Pick a number");
				userNumber = Validator.getInt(scnr, "", 1, cars.size() + 1);
				cars.remove(userNumber - 1);
				scnr.nextLine();

				// look up car
			} else if (userInput.toLowerCase().equals("look up car")) {
				System.out.println("Which car would you like to lookup? pick a number");
				userNumber = Validator.getInt(scnr, "", 1, cars.size());
				System.out.println(cars.get(userNumber).toString());
				scnr.nextLine();

				// Input does not exist
			} else {
				System.out.println(
						"item does not exits.\nPlease type (add car, add used car, remove car, look up car, or quit)");

			}

		}
		System.out.println("Have A Great day!");

	}

}
