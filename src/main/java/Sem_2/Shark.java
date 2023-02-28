package Sem_2;

public class Shark extends Fish implements SwimmingSpeed {

    public Shark(String nickname) {
        super(nickname);
    }


    @Override
    public int speedOfSwim() {
        return 12;
    }

    public String toString() {
        return "I'm shark. " + super.toString() + ". My speed is " + speedOfSwim();
    }

    @Override
    public String say() {
        return "poo";
    }
}

