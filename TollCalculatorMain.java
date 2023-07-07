package ProjectModules;

import java.util.Scanner;

public class TollCalculatorMain {

	static Scanner s = new Scanner(System.in);

	static int toll = 0;
	static int noOfPersons = 0;

	public static void main(String[] args) {

		int choice = 0;
		while (choice != 5) {

			choice = showMenuAndGetChoice();

			switch (choice) {

			case 1: {
				do {
					System.out.println("Enter The Number Of Persons: ");
					noOfPersons = s.nextInt();
					if (noOfPersons <= 0) {
						System.out.println("No Of Persons Is Invalid!!! Please Re-enter");
					} else {
						Vehicle twoWheeler = new TwoWheeler();

						try {
							toll = twoWheeler.calculateToll(noOfPersons);
						} catch (InvalidNumberOfPersonsException e) {
							System.out.println(e.getMessage());
						}

						System.out.println("Total Toll Of Your Vehicle Is: " + toll);
					}
				} while (noOfPersons <= 0);
			}
				break;

			case 2: {
				do {
					System.out.println("Enter The Number Of Persons: ");
					noOfPersons = s.nextInt();
					if (noOfPersons <= 0) {
						System.out.println("No Of Persons Is Invalid!!! Please Re-enter");
					} else {

						Vehicle threeWheeler = new ThreeWheeler();

						try {
							toll = threeWheeler.calculateToll(noOfPersons);
						} catch (InvalidNumberOfPersonsException e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Total Toll Of Your Vehicle Is: " + toll);
					}
				} while (noOfPersons <= 0);
			}
				break;

			case 3: {
				do {
					System.out.println("Enter The Number Of Persons: ");
					noOfPersons = s.nextInt();
					if (noOfPersons <= 0) {
						System.out.println("No Of Persons Is Invalid!!! Please Re-enter");
					} else {

						Vehicle fourWheeler = new FourWheeler();

						try {
							toll = fourWheeler.calculateToll(noOfPersons);
						} catch (InvalidNumberOfPersonsException e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Total Toll Of Your Vehicle Is: " + toll);
					}

				} while (noOfPersons <= 0);
			}
				break;

			case 4: {
				do {
					System.out.println("Enter The Number Of Persons: ");
					noOfPersons = s.nextInt();
					if (noOfPersons <= 0) {
						System.out.println("No Of Persons Is Invalid!!! Please Re-enter");
					} else {

						Vehicle heavyVehicle = new HeavyVehicle();

						try {
							toll = heavyVehicle.calculateToll(noOfPersons);
						} catch (InvalidNumberOfPersonsException e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Total Toll Of Your Vehicle Is: " + toll);
					}

				} while (noOfPersons <= 0);
			}
				break;

			case 5: {
				break;
			}

			default: {
				System.out.println("Invalid Choice...Please Try Again!");
				break;
			}
			}

		}

	}

	private static int showMenuAndGetChoice() {

		System.out.println("Welcome To Online Toll Calculator");
		System.out.println("1. Two Wheeler");
		System.out.println("2. Three Wheeler");
		System.out.println("3. Four Wheeler");
		System.out.println("4. Heavy Wheeler");
		System.out.println("5. Exit");
		System.out.println("Enter Your Vehicle Type: ");
		int choice = s.nextInt();
		return choice;

	}
}
