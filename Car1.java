package Udemy;

public class Car1 {
    Motor1 motor = new Motor1();

    void speedUp () {
        if(motor.factorInject < 2.6){
            motor.factorInject += 0.4;
        }

    }

    void brake (){
        if(motor.factorInject > 0.5){
            motor.factorInject -= 0.4;
        }

    }

    void turnOn (){
        motor.powerOn = true;
    }

    void turnOf (){
        motor.powerOn = false;
    }

    boolean itsOn(){
        return motor.powerOn;
    }
}
