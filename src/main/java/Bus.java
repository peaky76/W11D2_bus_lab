import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person passenger) {
        if (isNotFull()) {
            this.passengers.add(passenger);
        }
    }

    public boolean isNotFull() {
        return getNumberOfPassengers() < capacity;
    }

    public void removePassenger(Person passenger) {
        int index = this.passengers.indexOf(passenger);
        this.passengers.remove(index);
    }

    public void pickUp(Person passenger, BusStop busStop) {
        this.passengers.add(busStop.removePersonFromQueue(passenger));
    }
}
