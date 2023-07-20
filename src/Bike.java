public class Bike extends  Trunsport{


    public Bike(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void speedUp() {
        System.out.println("bike drive with : "+ getSpeed());

    }


}
