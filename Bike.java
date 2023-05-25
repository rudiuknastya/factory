package factory;

public abstract class Bike {
    protected int maxSpeed;
    protected int wheels;

    public Bike(int maxSpeed, int wheels) {
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }

    public abstract void ride();
}
