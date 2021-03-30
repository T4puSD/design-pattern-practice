package org.tapusd.chapterone.rpggame.characters;

import org.tapusd.chapterone.rpggame.weaponbehaviour.AxeBehaviour;

public class Knight extends Character{

    public Knight() {
        this.weaponBehaviour = new AxeBehaviour();
    }
}
