package org.tapusd.chapterone.rpggame;

import org.tapusd.chapterone.rpggame.characters.Character;
import org.tapusd.chapterone.rpggame.characters.Queen;
import org.tapusd.chapterone.rpggame.weaponbehaviour.SwordBehaviour;

public class RpgGameMain {
    public static void main(String[] args) {
        Character character = new Queen();
        character.performFight();
        character.setWeaponBehaviour(new SwordBehaviour());
        character.performFight();

    }
}
