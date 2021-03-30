package org.tapusd.chapterone.rpggame.weaponbehaviour;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void fight() {
        System.out.println(getClass().getName() + " Fighting with Sword!");
    }
}
