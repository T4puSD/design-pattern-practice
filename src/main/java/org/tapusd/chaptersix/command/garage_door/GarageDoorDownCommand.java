package org.tapusd.chaptersix.command.garage_door;

import org.tapusd.chaptersix.GarageDoor;
import org.tapusd.chaptersix.command.Command;

public class GarageDoorDownCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
