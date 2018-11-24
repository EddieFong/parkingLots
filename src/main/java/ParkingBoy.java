import java.util.ArrayList;

public class ParkingBoy {
    private ArrayList<ParkingLot> parkingLots;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }

    public void setParkingLots(ArrayList<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public String getLastErrorMessage() {

        return lastErrorMessage;
    }

    private String lastErrorMessage;

    public void add(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }

    public Car fetch(ParkingTicket ticket) {
        return null;
    }

    public ParkingTicket park(Car car) {
        ParkingLot parkingLot = findTargetParkingLot();
        parkingLot.park(car);
        ParkingTicket parkingTicket = new ParkingTicket(car.getId());
        return parkingTicket;
    }

    private ParkingLot findTargetParkingLot() {
        ParkingLot target;
        for(ParkingLot parkingLot:parkingLots){
            if (parkingLot.getCapacity() > parkingLot.getCount())
                return parkingLot;
        };

        return null;

    }




}
