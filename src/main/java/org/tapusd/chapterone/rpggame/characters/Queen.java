package org.tapusd.chapterone.rpggame.characters;

import org.tapusd.chapterone.rpggame.weaponbehaviour.KnifeBehaviour;

public class Queen extends Character {

    public Queen() {
        this.weaponBehaviour = new KnifeBehaviour();
    }
}
