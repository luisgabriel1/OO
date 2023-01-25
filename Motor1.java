package Udemy;

public class Motor1 {
    double factorInject = 1;
    boolean powerOn = false;

    int giros(){
        if(!powerOn){
            return 0;
        }
        else {
            return (int) Math.round(factorInject * 3000);
        }

    }

}
