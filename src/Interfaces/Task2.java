package Interfaces;

public class Task2 {
    public static void main(String[] args) {
        IDriver idriver1 = new BMW();
        IDriver idriver2 = new Mercedes();
        IDriver idriver3 = new Toyota();
        idriver1.drive();
        idriver2.drive();
        idriver3.drive();
    }
}




