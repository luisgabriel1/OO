package Udemy;

import java.util.ArrayList;
import java.util.List;

public class ChallengeClient {

    final String name;

    ChallengeClient (String name){
        this.name = name;
    }

    List <ChallengePurchase> buys = new ArrayList<>();

    double getValueTotal (){
        double total = 0;
        for(ChallengePurchase buy : buys){
            total += buy.getTotal();
        }

        return total;
    }
}
