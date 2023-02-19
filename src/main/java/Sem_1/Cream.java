package Sem_1;

public class Cream extends Product {
    private Integer fatContent = 0;

    public Cream(String name, Double price, Integer fatContent) {
        super(name, price);
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format("%s fatContent =  %d ", super.toString(), fatContent);
    }
}
