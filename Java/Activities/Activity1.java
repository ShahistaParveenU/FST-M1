package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car mycar= new Car();
        mycar.color="Black";
        mycar.make=2014;
        mycar.transmission="Manual";
        mycar.displayCharacteristics();
        mycar.accelarate();
        mycar.brake();
    }
}
