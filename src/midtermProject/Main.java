package midtermProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineReservation<String, Integer> airlineReservation = new AirlineReservation<>();
		System.out.println("Welcome to our service");
//		System.out.println("Welcome " + airlineReservation.getName());
//        System.out.println("Your Customer ID is " + airlineReservation.getId());
        System.out.println("\n");

        airlineReservation.showMenu();
	}

}
