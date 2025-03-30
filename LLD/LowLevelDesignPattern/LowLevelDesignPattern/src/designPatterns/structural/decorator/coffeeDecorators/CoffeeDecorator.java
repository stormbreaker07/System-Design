package designPatterns.structural.decorator.coffeeDecorators;

import designPatterns.structural.decorator.baseCoffee.BaseCoffee;

public class CoffeeDecorator extends BaseCoffee {

    private final BaseCoffee decoratedCoffee;

    public CoffeeDecorator(BaseCoffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public String coffeeDescription() {
        return decoratedCoffee.coffeeDescription();
    }

    public int getCoffeePrice() {
        return decoratedCoffee.getCoffeePrice();
    }

    public String getBeansUsed() {
        return decoratedCoffee.getBeansUsed();
    }
}
