
public class Game {
    @SuppressWarnings("Annotator")
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "康师傅";
        p.age = 18;
        p.gender = 'M';
        p.dog = new Dog();
        p.dog.type = "澳大利亚";
        p.dog.nickname = "小白";
        p.fedd();

    }
}
