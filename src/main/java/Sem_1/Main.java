package Sem_1;

public class Main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();
        store.addProduct(new Product("Lays", 123.45)).
                addProduct(new Product("Fanta", 98.76)).
                addProduct(new Product("Fan", 43.21)).
                addProduct(new Cream("LightCream", 35.12, 15)).
                addProduct(new Cream("Cream", 43.15, 30)).
                addProduct(new Beer("alcoholFree", 67.89)).
                addProduct(new Beer("notbeer", 67.89, 99)).
                addProduct(new CursedProducts("Milk", 56.65, 7)).
                addProduct(new Chocolate("whiteChocolate", 55.13)).
                addProduct(new Chocolate("bitterChocolate", 77.91, 73));

        System.out.println(store);

        System.out.println("searching for lays");
        System.out.println(store.findProduct("Lays"));

        System.out.println("we are buy lays:");
        store.buy("Lays", 123.45);
        System.out.println(store);

        System.out.println("we are buy fan`s:");
        store.buy("Fan", 43.21);
        System.out.println(store);

        System.out.println("we are buy a`s:");
        store.buy("Fan", 4.1);
        System.out.println(store);

        System.out.println("we are buy chocolate:");
        store.buy("bitterChocolate", 77.91);
        System.out.println(store);

        System.out.println("we are buy LightCream:");
        store.buy("LightCream", 35.12);
        System.out.println(store);

    }
}
