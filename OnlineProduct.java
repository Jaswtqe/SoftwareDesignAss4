package FactoryObserverPattern;

abstract class OnlineProduct {
    private String name;
    private double price;

    public OnlineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
