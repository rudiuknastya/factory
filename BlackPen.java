package factory;

public class BlackPen implements Number {
    private String color;
    public BlackPen(String color){

        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("I draw "+color+" color");
    }
}
