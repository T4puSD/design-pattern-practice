package org.tapusd.chapterthree.starbucks;

import org.tapusd.chapterthree.starbucks.beverage.Beverage;
import org.tapusd.chapterthree.starbucks.beverage.DarkRoast;
import org.tapusd.chapterthree.starbucks.beverage.Espresso;
import org.tapusd.chapterthree.starbucks.beverage.HouseBlend;
import org.tapusd.chapterthree.starbucks.condiments.Mocha;
import org.tapusd.chapterthree.starbucks.condiments.Soy;
import org.tapusd.chapterthree.starbucks.condiments.Whip;

public class Main {
    public static void main(String[] args) {
//        Espresso espresso = new Espresso();
//        System.out.println(espresso.getDescription() + "-> " + espresso.getCost());

        // Price of whipped mocha dark roast beverage.
        final Beverage whippedMochaDarkRoast = new Whip(new Mocha(new DarkRoast()));
        System.out.println(whippedMochaDarkRoast.getDescription() + "-> " + whippedMochaDarkRoast .getCost());

        // Price of double mocha soy latte with whip
        final Beverage doubleMochaSoyLatteWithWhip = new Whip(new Mocha(new Mocha(new Soy(new HouseBlend()))));
        System.out.println(doubleMochaSoyLatteWithWhip.getDescription() + "-> " +  doubleMochaSoyLatteWithWhip.getCost());

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.getCost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.getCost());

        // price with tallbeveratesoy
        final DarkRoast darkRoast = new DarkRoast();
        darkRoast.setSize(Size.MEDIUM);
        final Beverage soyLatte = new Soy(darkRoast);
        System.out.println(soyLatte.getDescription() + "-> " +  soyLatte.getCost());


        System.out.println(new Soy(new DarkRoast()).getCost());
    }
}
