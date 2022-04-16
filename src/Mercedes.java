public class Mercedes extends Car {
    String sMers = "Комфортный";

    public Mercedes(String model, double volume, int createdDate, int numberOfDoors) {
        super(model, volume, createdDate, numberOfDoors);
    }

    public void getInfoCar() {
        System.out.println("\nМодель авто: " + model + " - " + sMers + "\nОбъём двигателя: " + volume + ";\nГод выпуска: " + createdDate + ";\nЧисло дверей: " + numberOfDoors);
    }

}
