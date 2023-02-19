package Sem_1;

import java.util.ArrayList;
import java.util.List;

public class WendingMachine {

    public Double getMoney() {
        return money;
    }

    private Double money = 0.0;
    private List<Product> products = new ArrayList<>();

    public WendingMachine addProduct(Product product) {
        this.products.add(product);
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product findProduct(String name) {
        for (Product prod : getProducts()) {
            if (prod.getName().equals(name)) {
                return prod;
            }
        }
        return null;
    }

    public Product buy(String name, Double price) {
        Product something = findProduct(name);
        if (something == null) return null;
        if (price.equals(something.getPrice())) {
            products.remove(something);
            money += price;
            return something;
        }
        System.out.println("Цена не соответствует! Возврат монет.");
        return null;
    }

    @Override
    public String toString() {
        StringBuilder wdProducts = new StringBuilder();

        for (Product prod : this.getProducts()) {
            wdProducts.append(prod.toString());
            wdProducts.append("\n");
        }
        wdProducts.append(money);
        return wdProducts.toString();
    }
}
