public class Car {
    String model;
    double volume;
    int createdDate;
    int numberOfDoors;

    public Car(String model,
               double volume,
               int createdDate,
               int numberOfDoors) {
        this.model = model;
        this.volume = volume;
        this.createdDate = createdDate;
        this.numberOfDoors = numberOfDoors;
    }

    public void getInfoCar() {
        System.out.println("Модель авто: " + model + "; \nОбъём двигателя: " + volume + "; \nГод выпуска: " + createdDate + "; \nЧисло дверей: " + numberOfDoors);
    }
}
