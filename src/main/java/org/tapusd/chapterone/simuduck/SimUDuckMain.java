package org.tapusd.chapterone.simuduck;

import org.tapusd.chapterone.simuduck.ducks.DecoyDuck;
import org.tapusd.chapterone.simuduck.ducks.Duck;
import org.tapusd.chapterone.simuduck.ducks.ModelDuck;
import org.tapusd.chapterone.simuduck.flybehaviour.FlyRocketPowered;

public class SimUDuckMain {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.swim();
        duck.performQuack();
        duck.performFly();
        duck.display();
        System.out.println();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.display();
    }
}
