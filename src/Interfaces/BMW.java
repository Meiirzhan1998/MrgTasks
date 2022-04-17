package Interfaces;

public class BMW implements IDriver {
    String model = "BMW";
    double volume = 3.2;
    int createdDate = 2005;
    int numberOfDoors = 2;

    public void drive() {
        System.out.println("\nВодитель водит " + model + ", объём: " + volume + ", год выпуска: " + createdDate + ", кол-во дверей: " + numberOfDoors);
    }
}
