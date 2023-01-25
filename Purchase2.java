package Udemy;

import java.util.ArrayList;

public class Purchase2 {
    String client;
    ArrayList <Item2> items= new ArrayList<>();

    void addItem (Item2 item) {
        items.add(item);
        item.buy = this;

    }

    double finalPrice () {
        double total = 0;

        for(Item2 item: items){
            total += item.mount * item.price;
        }
        return total;
    }
}
