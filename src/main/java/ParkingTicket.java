public class ParkingTicket {
    private final String carId;

    public ParkingTicket(String carId) {
        this.carId = carId;
    }

    public ParkingTicket() {
        this.carId = null;
    }

    public String getCarId() {
        return carId;
    }
}
