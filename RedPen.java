package factory;

public class RedPen implements Number {
    public RedPen(String color){
        this.color = color;
    }
    private String color;
    @Override
    public void draw() {
        System.out.println("I draw "+color+" color");
        
    }

}
