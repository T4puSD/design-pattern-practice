package org.tapusd.chapterone.rpggame.characters;

import org.tapusd.chapterone.rpggame.weaponbehaviour.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weaponBehaviour;

    public void performFight() {
        weaponBehaviour.fight();
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
