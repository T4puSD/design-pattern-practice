package org.tapusd.chaptersix.command.garage_door;

import org.tapusd.chaptersix.GarageDoor;
import org.tapusd.chaptersix.command.Command;

public class GarageDoorUpCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
