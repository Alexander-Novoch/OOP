package Sem_1;

public class CursedProducts extends Product {
    private Integer longivity;

    public CursedProducts(String name, Double price, Integer longivity) {
        super(name, price);
        this.longivity = longivity;
    }

    @Override
    public String toString() {
        return String.format("%s longivity =  %d ", super.toString(), longivity);
    }
}
