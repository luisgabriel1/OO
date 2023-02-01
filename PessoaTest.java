public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(30);

        p1.changeAge(-30);

        System.out.println(p1.readingAge());
    }
}
