package FactoryObserverPattern;
import java.util.*;
// Класс, представляющий корзину с выбранными товарами (субъект)
class ShoppingCart {
    private final List<OnlineProduct> items = new ArrayList<>();
    private final List<ProductObserver> observers = new ArrayList<>();

    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    public void addItem(OnlineProduct product) {
        items.add(product);
        notifyObservers(product);
    }
    
    public void removeItem(OnlineProduct product) {
        items.remove(product);
        notifyObservers(product);
    }
    
    public double calculateTotal() {
        double total = 0;
        for (OnlineProduct item : items) {
            total += item.getPrice();
        }
        return total;
    }

    private void notifyObservers(OnlineProduct product) {
        for (ProductObserver observer : observers) {
            observer.update(product);
        }
    }

    public Iterable<? extends OnlineProduct> getItems() {
        return items;
    }
}
