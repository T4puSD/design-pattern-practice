package org.tapusd.chapterone.rpggame.weaponbehaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void fight() {
        System.out.println(getClass().getName() + " Fighting with Bow and Arrow!");
    }
}
