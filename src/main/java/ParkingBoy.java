import java.util.ArrayList;

public class ParkingBoy {
    private ArrayList<ParkingLot> parkingLots;

    public void add(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }

    public Car fetch(ParkingTicket ticket) {

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
