import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private final int capacity;
    private List<Car> cars;

    public ParkingLot() {
        this(10);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }


    public void park(Car car) {
        this.cars.add(car);
        this.count++;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableParkingPosition() {
        return count - capacity;
    }

    public Car fetch(Car car) {
        int index = this.cars.indexOf(car);
        if (index >= 0 ){
            Car carFetch = this.cars.remove(index);
            return carFetch;
        }else{
            return null;
        }

    }
}
