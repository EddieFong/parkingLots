public class ParkingTicket {
    private final ParkingLot parkingLot;

    public Car getCar() {
        return car;
    }

    private final Car car;

    public ParkingTicket(Car car, ParkingLot parkingLot) {
        this.car = car;
        this.parkingLot = parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }
}
