package Udemy;

public class ChallengeTest {
    public static void main(String[] args) {

        ChallengePurchase buy1 = new ChallengePurchase();
        buy1.addItem("Pen", 9.67, 100);
        buy1.addItem(new ChallengeProduct("Notebook", 1897.88), 2);

        ChallengePurchase buy2 = new ChallengePurchase();
        buy2.addItem("Book", 10, 10);
        buy2.addItem(new ChallengeProduct("Printer", 998.90), 1);

        ChallengeClient client = new ChallengeClient("Luis Gabriel Oliveira");
        client.buys.add(buy1);
        client.buys.add(buy2);

        System.out.println(client.getValueTotal());
    }
}
