package day4.flight;

public class Flight {
    int seats;
    int passengers;

    Flight() {
        seats = 10;
        passengers = 0;
    }

    // ACT: TODO validate if there are available seats; if no display "FULL"
    public void addPassenger() {
        if(passengers<seats) {
            this.passengers++;
        } else {
            System.out.println("FULL"); // prevent adding of passengers if no more seats
        }
    }

    // ACT: TODO set new value of addPassenger is allowed again
    public void setNumberofSeats(int seats) {
        this.seats = seats;
    }
}
