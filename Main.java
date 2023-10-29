package FactoryObserverPattern;
public class Main {
    public static void main(String[] args) {
        OnlineProductFactory productFactory = new OnlineProductFactory();
        ShoppingCart cart = new ShoppingCart();

        var shoppingCartObserver = new ProductObserver() {
            @Override
            public void update(OnlineProduct product) {
                System.out.println("Added to cart: " + product.getName() + " - $" + product.getPrice());
            }
        };

        cart.addObserver(shoppingCartObserver);

        OnlineProduct product1 = productFactory.createProduct("Jersey  -  ForMen", 30.0);
        OnlineProduct product2 = productFactory.createProduct("dresses -  ForWomen", 25.0);
        OnlineProduct product3 = productFactory.createProduct("doll    -  ForGirl", 15.0);
        OnlineProduct product4 = productFactory.createProduct("ball    -  ForBoy", 24.0);

        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        cart.addItem(product4);

        double total = cart.calculateTotal();

        System.out.println("Selected Items:");
        for (OnlineProduct item : cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("Total: $" + total);

        // Здесь можно добавить код для обработки оплаты, например, симулировать оплату карточкой или наличными.
    }
}


