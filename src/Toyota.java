public class Toyota extends Car implements IDriver {
    String sToyota = "Надежный";

    public Toyota(String model, double volume, int createdDate, int numberOfDoors) {
        super(model, volume, createdDate, numberOfDoors);
    }

    public void getInfoCar() {
        System.out.println("\nМодель авто: " + model + " - " + sToyota + "\nОбъём двигателя: " + volume + ";\nГод выпуска: " + createdDate + ";\nЧисло дверей: " + numberOfDoors);
    }

    @Override
    public void drive() {
        System.out.println("Водитель водит: "+model);
    }
}
