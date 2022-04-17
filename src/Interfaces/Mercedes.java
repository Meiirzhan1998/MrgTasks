package Interfaces;

public class Mercedes implements IDriver {
    String model = "Mercedes";
    double volume = 2.8;
    int createdDate = 2004;
    int numberOfDoors = 4;

    public void drive() {
        System.out.println("\nВодитель водит " + model + ", объём: " + volume + ", год выпуска: " + createdDate + ", кол-во дверей: " + numberOfDoors);
    }
}
