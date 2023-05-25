package factory;

public class AdultBike extends Bike {
    private int speedQuantity;

    public AdultBike(int maxSpeed, int wheels, int speedQuantity) {
        super(maxSpeed, wheels);
        this.speedQuantity = speedQuantity;
    }

    @Override
    public void ride() {
        System.out.println("Ride with max speed "+ maxSpeed);
        
    }

}
