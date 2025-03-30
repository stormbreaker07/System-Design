package designPatterns.structural.decorator.coffeeDecorators;

import designPatterns.structural.decorator.baseCoffee.BaseCoffee;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(BaseCoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String coffeeDescription() {
        return super.coffeeDescription() + " and sugar is added in coffee for FREE❤️❤️❤️";
    }

    public int getCoffeePrice() {
        return super.getCoffeePrice();
    }

    public String getBeansUsed() {
        return super.getBeansUsed();
    }
}
