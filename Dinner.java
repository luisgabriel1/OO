public class Dinner {
    public static void main(String[] args) {
        People guest = new People(99.65);


        Rice ingredient1 = new Rice(0.2);
        Bean ingredient2 = new Bean(0.1);

        System.out.println(guest.getWeight());

        guest.eating(ingredient1);
        guest.eating(ingredient2);

        System.out.println(guest.getWeight());

        IceCream dessert = new IceCream(0.4);
        guest.eating(dessert);

        System.out.println(guest.getWeight());
    }
}
