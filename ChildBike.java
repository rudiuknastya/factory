package factory;

public class ChildBike extends Bike {

    public ChildBike(int maxSpeed, int wheels) {
        super(maxSpeed, wheels);
    }

    @Override
    public void ride() {
        System.out.println("Ride with max speed "+ maxSpeed);
    }
}
