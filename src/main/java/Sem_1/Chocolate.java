package Sem_1;

public class Chocolate extends Product {
    private Integer cocoaPercentage = 0;

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Integer cocoaPercentage) {
        this(name, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public String toString() {
        return String.format("%s cocoaPercentage =  %d ", super.toString(), cocoaPercentage);
    }
}
