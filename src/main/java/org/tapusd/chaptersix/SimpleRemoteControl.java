package org.tapusd.chaptersix;

import org.tapusd.chaptersix.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    void buttonWasPressed() {
        slot.execute();
    }
}
