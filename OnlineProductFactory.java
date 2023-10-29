package FactoryObserverPattern;

class OnlineProductFactory {
    public OnlineProduct createProduct(String name, double price) {
        return new ConcreteProduct(name, price);
    }
}
