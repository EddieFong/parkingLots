import java.util.ArrayList;

public class ParkingBoy {
    private ArrayList<ParkingLot> parkingLots;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLots = new ArrayList<>();
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
        if ( (ticket.getCar() == null) || (ticket.getParkingLot() == null) ){
            this.lastErrorMessage = "Unrecognized parking ticket.";
            return null;
        }

        ParkingLot parkingLot = ticket.getParkingLot();
        return parkingLot.fetch(ticket.getCar());
    }

    public ParkingTicket park(Car car) {
        ParkingLot parkingLot = findTargetParkingLot();
        if (parkingLot != null) {
            parkingLot.park(car);
            ParkingTicket parkingTicket = new ParkingTicket(car, parkingLot);
            this.lastErrorMessage = null;
            return parkingTicket;
        } else {
            System.out.println("Error");
            return null;
        }
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
