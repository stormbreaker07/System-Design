package designPatterns.structural.decorator.baseCoffee;

public class BaseCoffee implements CoffeeInterface{

    private final int price;
    private final String beansUsed;

    public BaseCoffee() {
        this.price = 5;
        this.beansUsed = "Arabica";
    }

    public BaseCoffee(int price, String beansUsed) {
        this.price = price;
        this.beansUsed = beansUsed;
    }

    @Override
    public String coffeeDescription() {
        return "Base Coffee using " + beansUsed + " beans";
    }

    @Override
    public int getCoffeePrice() {
        return price;
    }

    @Override
    public String getBeansUsed() {
        return beansUsed;
    }
}
