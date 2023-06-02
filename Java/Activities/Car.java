package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car()
    {
        this.doors=4;
        this.tyres=4;

    }
    public void displayCharacteristics()
    {
        System.out.println("Colour of the car: "+ color);
        System.out.println("Transmission of the car: "+ transmission);
        System.out.println("Year car was made in: "+ make);
        System.out.println("No of tyres in car: "+ tyres);
        System.out.println("No of door in car: "+ doors);
    }

    public void accelarate()
    {
        System.out.println("Car is moving forward");
    }

    public void brake()
    {
        System.out.println("Car has stopped");
    }

}
