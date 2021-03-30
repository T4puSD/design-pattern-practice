package org.tapusd.chapterone.rpggame.characters;

import org.tapusd.chapterone.rpggame.weaponbehaviour.BowAndArrowBehaviour;

public class Troll extends Character {

    public Troll() {
        this.weaponBehaviour = new BowAndArrowBehaviour();
    }
}
