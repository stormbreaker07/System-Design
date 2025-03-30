package designPatterns.structural.decorator.coffeeDecorators;

import designPatterns.structural.decorator.baseCoffee.BaseCoffee;

public class HazlenutDecorator extends CoffeeDecorator{

    public HazlenutDecorator(BaseCoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public String coffeeDescription() {
        return super.coffeeDescription() + " and HazleNut is added in coffee";
    }

    public int getCoffeePrice() {
        return super.getCoffeePrice() + 1;
    }

    public String getBeansUsed() {
        return super.getBeansUsed();
    }
}
