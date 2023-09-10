package Interface;


public class Bird implements Flyable {

    @Override
    public void startToFly() {
        // TODO Auto-generated method stub
        System.out.println("Bird is spreading its wings and taking off.");
    }

    @Override
    public void flying() {
        // TODO Auto-generated method stub
        System.out.println("Bird is soaring through the sky.");
    }

    @Override
    public void accelerating() {
        // TODO Auto-generated method stub
        System.out.println("Bird is flapping its wings faster and gaining speed.");
    }

    @Override
    public void stopToFly() {
        // TODO Auto-generated method stub
        System.out.println("Bird is landing and stopping to fly.");
    }

}
