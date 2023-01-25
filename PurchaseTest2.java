package Udemy;

public class PurchaseTest2 {
    public static void main(String[] args) {
        Purchase2 p1 = new Purchase2();
        p1.client = "Luis";
        p1.addItem(new Item2("Pen", 20, 7.45));
        p1.addItem(new Item2("Eraser", 12, 3.89));
        p1.addItem(new Item2("Pen", 3, 18.79));
        System.out.println(p1.items.size());
        System.out.println(p1.finalPrice());
    }
}
