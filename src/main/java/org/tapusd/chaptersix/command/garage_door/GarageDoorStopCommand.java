package org.tapusd.chaptersix.command.garage_door;

import org.tapusd.chaptersix.GarageDoor;
import org.tapusd.chaptersix.command.Command;

public class GarageDoorStopCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void undo() {
    }
}
