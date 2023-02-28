package Sem_2;

public class GoldFish extends Fish implements SwimmingSpeed {
    @Override
    public String say() {
        return "poo";
    }

    @Override
    public int speedOfSwim() {
        return 2;
    }

    public GoldFish(String nickname) {
        super(nickname);
    }

    public String toString() {
        return "I'm goldfish. " + super.toString() + ". My speed is " + speedOfSwim();
    }
}
