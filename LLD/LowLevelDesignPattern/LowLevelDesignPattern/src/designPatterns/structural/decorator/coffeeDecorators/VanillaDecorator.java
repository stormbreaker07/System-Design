package designPatterns.structural.decorator.coffeeDecorators;

import designPatterns.structural.decorator.baseCoffee.BaseCoffee;

public class VanillaDecorator extends CoffeeDecorator{

    public VanillaDecorator(BaseCoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String coffeeDescription() {
        return super.coffeeDescription() + " and Vanilla is added in coffee";
    }

    public int getCoffeePrice() {
        return super.getCoffeePrice() + 1;
    }

    public String getBeansUsed() {
        return super.getBeansUsed();
    }
}
