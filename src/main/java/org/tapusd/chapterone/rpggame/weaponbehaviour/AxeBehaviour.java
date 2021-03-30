package org.tapusd.chapterone.rpggame.weaponbehaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void fight() {
        System.out.println(getClass().getName() + " Fighting with Axe!");
    }
}
