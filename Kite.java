package Interface;

public class Kite implements Flyable {

    @Override
    public void startToFly() {
        // TODO Auto-generated method stub
        System.out.println("Kite is starting to fly.");
    }

    @Override
    public void flying() {
        // TODO Auto-generated method stub
        System.out.println("Kite is flying.");

    }

    @Override
    public void accelerating() {
        // TODO Auto-generated method stub
        System.out.println("Kite is catching the wind and gaining speed.");

    }

    @Override
    public void stopToFly() {
        // TODO Auto-generated method stub
        System.out.println("Kite is landing and stopping to fly.");

    }

}
