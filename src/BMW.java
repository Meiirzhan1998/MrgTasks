public class BMW extends Car implements IDriver {

    public BMW(String model, double volume, int createdDate, int numberOfDoors) {
        super(model, volume, createdDate, numberOfDoors);
    }

    public void getInfoCar() {
        System.out.print(model + "\nОбъём двигателя: " + volume + ";\nГод выпуска: " + createdDate + ";\nЧисло дверей: " + numberOfDoors+"\n \n");
    }

    @Override
    public void drive() {
        System.out.print("Водитель водит: ");
        getInfoCar();
    }
}
