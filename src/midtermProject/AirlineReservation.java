package midtermProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AirlineReservation<fa, sa> {
	// The seat map
	private Map<Integer, String> seatMap = new HashMap<>();

//	// Customer's name
//	private final String name;
//	// Customer's id
//	private final int id;
	// Limit of seats
	private final int SEAT_LIMIT = 3;

	// Constractor
//	AirlineReservation(String name, int id) {
//		this.name = name;
//		this.id = id;
//	}

	// Getters
//	public String getName() {
//		return name;
//	}
//
//	public int getId() {
//		return id;
//	}

	// Showing a menu.
	public void showMenu() {
		char option;
		// Input information on the console.
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(
					"=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Enter Your Option");
			System.out.println(
					"=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("A : Booking");
			System.out.println("B : Cancel");
			System.out.println("C : Confirm");
			System.out.println("D : Exit");
			option = scanner.nextLine().charAt(0);
			System.out.println("\n");

			switch (Character.toLowerCase(option)) {
			case 'a':
				try {
					UserInfo inputUserInfo = inputUser(scanner);
					booking(inputUserInfo.getName(), inputUserInfo.getId());
					System.out.println("\n");
				} catch (Exception e) {
					errorMessage("Wrong input! Please try again.");
					scanner.nextLine();
				}

				System.out.println("\n");
				break;
			case 'b':
				System.out.println("-------------------------------------------------------");
				System.out.println("Input your name and id ");
				System.out.println("-------------------------------------------------------");

				try {
					UserInfo inputUserInfo = inputUser(scanner);
					cancel(inputUserInfo.getName(), inputUserInfo.getId());
					System.out.println("\n");
				} catch (Exception e) {
					errorMessage("Wrong input! Please try again.");
					scanner.nextLine();
				}
				break;

			case 'c':
				System.out.println("-------------------------------------------------------");
				System.out.println("Confirm");
				System.out.println("-------------------------------------------------------");
				try {
					UserInfo inputUserInfo = inputUser(scanner);
					confirm(inputUserInfo.getName(), inputUserInfo.getId());
					System.out.println("\n");
				} catch (Exception e) {
					errorMessage("Wrong input! Please try again.");
					scanner.nextLine();
				}
				break;
			case 'd':
				System.out.println(
						"=========================================================================================================");
				break;
			default:
				// System.out.println("Invalid Option!! Please Enter Correct Option...");
				break;
			}
		} while (Character.toLowerCase(option) != 'd');
		System.out.println("Thank You for using our service!!");
		scanner.close();
	}

	// Booking System
	private void booking(String name, int id) {
		// seatMap check
		// If numbers of seatMap < SEAT_LIMIT, add the user info to seatMap
		if (seatMap.size() < SEAT_LIMIT && !seatMap.containsKey(id)) {
			seatMap.put(id, name);
			System.out.println("We've booked the seat for you.");
		} else if (seatMap.size() >= SEAT_LIMIT) {
			System.out.println("Sorry.");
			System.out.println("Every seat's already booked.");
		} else if (seatMap.containsKey(id) && seatMap.get(id).equals(name)) {
			System.out.println("You've already book the seat.");
		} else if(seatMap.containsKey(id)) {
			System.out.println("Your information is wrong, please try again.");
		}else {
			System.out.println("Sorry.");
			System.out.println("We've got a error, please try again.");
		}
	}

	private void cancel(String name, int id) {
		if (seatMap.containsKey(id) && seatMap.get(id).equals(name)) {
			seatMap.remove(id);
			System.out.println("Your booking has been cancel.");
		} else {
			System.out.println("There is not your reservation.");
			System.out.println("Please confirm your booking or your user information.");
		}
	}

	private void confirm(String name, int id) {
		if (seatMap.containsKey(id) && seatMap.get(id).equals(name)) {
			System.out.println("Your booking is valid.");
		} else {
			System.out.println("There is not your reservation.");
			System.out.println("Please confirm your booking or your user information.");
		}
	}

	private void errorMessage(String message) {
		System.out.println("\n");
		System.out.println("-------------------------------------------------------");
		System.out.println("!!! " + message);
		System.out.println("-------------------------------------------------------");
		System.out.println("\n");
	}
	
	private UserInfo inputUser(Scanner scanner) {
		System.out.println("Your ID");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Your name");
		String name = scanner.nextLine();
		UserInfo userInfo = new UserInfo(id, name);
		return userInfo;
	}
}
