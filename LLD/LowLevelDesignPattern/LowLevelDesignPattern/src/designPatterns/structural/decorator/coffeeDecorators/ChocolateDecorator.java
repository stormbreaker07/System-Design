package designPatterns.structural.decorator.coffeeDecorators;

import designPatterns.structural.decorator.baseCoffee.BaseCoffee;

public class ChocolateDecorator extends CoffeeDecorator{

    public ChocolateDecorator(BaseCoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String coffeeDescription() {
        return super.coffeeDescription() + " and Chocolate is added in coffee";
    }

    public int getCoffeePrice() {
        return super.getCoffeePrice() + 2;
    }

    public String getBeansUsed() {
        return super.getBeansUsed();
    }
}
