import java.util.ArrayList;

public class ParkingLotServiceManager extends ParkingBoy{
    private ArrayList<ParkingBoy> managementList;
    public ParkingLotServiceManager(ArrayList<ParkingBoy> managementList) {
        super((ParkingLot) null);
        this.managementList = managementList;
    }

    public ParkingLotServiceManager() {
        super((ParkingLot) null);
        this.managementList = new ArrayList<>();

    }


    public void addParkingBoy(ParkingBoy parkingBoy) {
        this.managementList.add(parkingBoy);
    }
}
