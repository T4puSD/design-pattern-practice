package org.tapusd.chapterone.rpggame.characters;

import org.tapusd.chapterone.rpggame.weaponbehaviour.SwordBehaviour;

public class King extends Character {

    public King() {
        this.weaponBehaviour = new SwordBehaviour();
    }
}
