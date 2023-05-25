package factory;

public class BikeFactory {
    public Bike getBike (String type){
        if (type.equals("Child")){
            return new ChildBike(2, 3);
        }else if (type.equals("Adult")){
            return new AdultBike(10,2,5);
        }else{
            return null;
        }
    }
}
