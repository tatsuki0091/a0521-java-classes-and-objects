package midtermProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AirlineReservation<fa, sa> {
	// The seat map
	private Map<Integer, String> seatMap = new HashMap<>();
	private Map<Integer, String> adminMap = new HashMap<>();
	
	// Limit of seats
	private final int SEAT_LIMIT = 3;

	// Constructor
	AirlineReservation() {
		adminMap.put(1, "Tatsuki Yamatani");
	}

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
			System.out.println("D : Check all seats(Only administrator)");
			System.out.println("E : Exit");
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
				System.out.println("-------------------------------------------------------");
				System.out.println("Check all seats(Only administrator)");
				System.out.println("-------------------------------------------------------");
				UserInfo inputUserInfo = inputUser(scanner);
				showList(inputUserInfo.getName(), inputUserInfo.getId());
				break;
				
			case 'e':
				System.out.println(
						"=========================================================================================================");
				break;
			default:
				// System.out.println("Invalid Option!! Please Enter Correct Option...");
				break;
			}
		} while (Character.toLowerCase(option) != 'e');
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
	
	private void showList(String name, int id) {
		if (adminMap.containsKey(id) && adminMap.get(id).equals(name)) {
			for (int key : seatMap.keySet()) {
			    System.out.println(key + " => " + seatMap.get(key));
			}
		} else {
			System.out.println("You are not admin user, so you can not use this service.");
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
