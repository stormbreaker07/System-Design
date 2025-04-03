import designPatterns.creational.builder.BuildBigHouse;
import designPatterns.creational.builder.director.Director;
import designPatterns.creational.builder.house.BigHouse;
import designPatterns.creational.builder.houseParts.gate.BigMetalGate;
import designPatterns.creational.builder.houseParts.gate.Gate;
import designPatterns.creational.prototype.cloning.CloneThisClass;
import designPatterns.creational.prototype.cloning.ShallowCloneClass;
import designPatterns.structural.decorator.baseCoffee.BaseCoffee;
import designPatterns.structural.decorator.coffeeDecorators.HazlenutDecorator;
import designPatterns.structural.decorator.coffeeDecorators.MilkDecorator;
import designPatterns.structural.decorator.coffeeDecorators.SugarDecorator;
import designPatterns.structural.decorator.coffeeDecorators.VanillaDecorator;
import designPatterns.structural.proxy.caching.entity.UserInfo;
import designPatterns.structural.proxy.caching.service.ProxyUserService;
import popularLowLevelSystemDesign.snakeLadderDesign.dice.Dice;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //making big house
//        Director director = new Director();
//        BuildBigHouse buildBigHouse = new BuildBigHouse();
//        director.constructBigHouse(buildBigHouse);
//
//        BigHouse house = buildBigHouse.getResultHouse();
//        System.out.println(house);

//        CloneThisClass c1 = new CloneThisClass();
//        c1.printData();
//
//        CloneThisClass c3 = (CloneThisClass) c1.deepClone();
//        c3.printData();
//
//        if(c1.getData() == c3.getData()) System.out.println("object c1 and c3 are shallow copy");
//        else System.out.println("Yes object c1 and c3 are deep copied");
//
//        ShallowCloneClass s1 = new ShallowCloneClass();
//        s1.printData();
//
//        ShallowCloneClass s2 = s1.clone();
//        s2.printData();
//
//        if(s1.getData() == s2.getData()) System.out.println("object s1 and s2 are shallow copy");
//        else System.out.println("Yes object s1 and s2 are deep copied");



        //proxy pattern checking
//        ProxyUserService service = new ProxyUserService();
//        UserInfo user = service.getUser(1);
//        UserInfo user2 = service.getUser(1);
//        UserInfo user3 = service.getUser(3);
//        UserInfo user4 = service.getUser(3);


//        THIS IS FOR DECORATOR
//        BaseCoffee coffee = new BaseCoffee(6, "pure arabica");
//        System.out.println(coffee.coffeeDescription());
//        System.out.println(coffee.getCoffeePrice());
//
//        //add milk
//        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.coffeeDescription());
//        System.out.println(coffee.getCoffeePrice());
//
//        //add hazlenut
//        coffee = new HazlenutDecorator(coffee);
//        System.out.println(coffee.coffeeDescription());
//        System.out.println(coffee.getCoffeePrice());
//
//        //add vanilla
//        coffee = new VanillaDecorator(coffee);
//        System.out.println(coffee.coffeeDescription());
//        System.out.println(coffee.getCoffeePrice());
//
//        //add sugar
//        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.coffeeDescription());
//        System.out.println(coffee.getCoffeePrice());

        List<Integer> lt = Dice.rollDice();
        lt.forEach(System.out::println);
    }
}