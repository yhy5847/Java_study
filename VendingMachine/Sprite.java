package VendingMachine;

public class Sprite extends Drink {

    Sprite(String name, int price, String taste, boolean softDrink) {
        this.name = name;
        this.price = price;
        this.taste = taste;
        this.softDrink = softDrink;
    }
}