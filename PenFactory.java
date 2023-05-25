package factory;

public class PenFactory {
    public Number getPen (String color){
        if (color.equals("B")){
            return new BlackPen("Black");
        }else if (color.equals("R")){
            return new BlackPen("Red");
        }else{
            return null;
        }
    }
}
