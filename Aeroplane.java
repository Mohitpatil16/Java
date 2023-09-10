package Interface;

public class Aeroplane implements Flyable {

    @Override
    public void startToFly() {
        // TODO Auto-generated method stub
        System.out.println("Aeroplane is taking off.");
    }

    @Override
    public void flying() {
        // TODO Auto-generated method stub
        System.out.println("Aeroplane is flying.");
    }

    @Override
    public void accelerating() {
        // TODO Auto-generated method stub
        System.out.println("Aeroplane is increasing its speed.");
    }

    @Override
    public void stopToFly() {
        // TODO Auto-generated method stub
        System.out.println("Aeroplane is descending and stopping to fly.");
    }

}
