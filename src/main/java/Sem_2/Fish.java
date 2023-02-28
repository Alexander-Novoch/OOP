package Sem_2;

public abstract class Fish extends Animal {
    public Fish(String nickname) {
        super(nickname);
    }

    public String feed() {
        return "fish food";
    }
}
