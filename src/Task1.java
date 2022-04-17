public class Task1{
    public static void main(String[] args) {
        IDriver driver1 = new BMW("BMW", 3.2, 2005, 2);
        driver1.drive();
        IDriver driver2  = new Toyota("Toyota", 2.4, 2002, 4);
        driver2.drive();
        IDriver driver3  = new Mercedes("Mercedes", 2.8, 2001, 4);
        driver3.drive();
    }
}




