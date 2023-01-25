package Udemy;

import java.util.ArrayList;
import java.util.List;

public class ChallengePurchase {

    final List <ChallengeItem> Items = new ArrayList<>();

    void addItem (ChallengeProduct p, int mount){
        this.Items.add(new ChallengeItem(p, mount));
    }

    void addItem (String name, double price, int mount){
        var product = new ChallengeProduct(name, price) ;
        this.Items.add(new ChallengeItem(product, mount));
    }

    double getTotal (){
        double total = 0;
        for(ChallengeItem item: Items){
            total += item.mount * item.product.price;
        }

        return total;
    }
}
