package day4.Scratch.flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();

        // initial value
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        // add passengers
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        // value after adding passengers
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        // should be full
        manilaToBoracay.setNumberofSeats(5);
        manilaToBoracay.addPassenger();

        //add seats and allow add passengers
        manilaToBoracay.setNumberofSeats(7);
        manilaToBoracay.addPassenger();

        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        System.out.println(
                "Current number of available seats: " + manilaToBoracay.seats
        );
        System.out.println(
                "Current number of passengers: " + manilaToBoracay.passengers
        );
    }
}
