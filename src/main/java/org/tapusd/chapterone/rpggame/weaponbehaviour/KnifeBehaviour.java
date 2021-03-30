package org.tapusd.chapterone.rpggame.weaponbehaviour;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void fight() {
        System.out.println(getClass().getName() + " Fighting with knife!");
    }
}
