package Interfaces;

public class Toyota implements IDriver {
    String model = "Toyota";
    double volume = 2.4;
    int createdDate = 2003;
    int numberOfDoors = 4;

    public void drive() {
        System.out.println("\nВодитель водит " + model + ", объём: " + volume + ", год выпуска: " + createdDate + ", кол-во дверей: " + numberOfDoors);
    }
}
