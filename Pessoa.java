public class Pessoa {
    private int age;

    public Pessoa (int age){
        this.age = age;
    }
    public int readingAge(){
        return  age;
    }

    public void changeAge (int newAge){
        this.age = newAge;
    }
}
