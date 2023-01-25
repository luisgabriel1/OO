package Udemy;

public class CarTest1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        System.out.println(c1.itsOn());

        c1.turnOn();
        System.out.println(c1.itsOn());

        System.out.println(c1.motor.giros());

        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        c1.speedUp();

        System.out.println(c1.motor.giros());


        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();

        // Faltou Encapsulamento !!!
        // c1.motor.factorInject = -30;

        System.out.println(c1.motor.giros());

    }
}
