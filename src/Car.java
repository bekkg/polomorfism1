public class Car extends  Trunsport{


    public Car(String name, String color, int speed) {
        super(name, color, speed);
    }

    @Override
    public void speedUp() {
        System.out.println("car drive with : "+ getSpeed());
    }


}
