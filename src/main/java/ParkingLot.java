import java.util.List;

public class ParkingLot {

    private final int capacity;
    private List<Car> cars;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }


    public void park(Car car) {
        this.cars.add(car);
        this.count++;
    }

    public int getCapacity() {
        return capacity;
    }
}
