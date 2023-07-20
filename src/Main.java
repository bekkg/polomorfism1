public class Main {
    public static void main(String[] args) {

        Car car = new Car("bmw", "red", 100);
        Bike bike = new Bike("stella" , "white" , 10);
        Trunsport [] trunsports ={ car, bike};
        for (Trunsport trunsport : trunsports){
            trunsport.speedUp();
        }

    }
}