package org.tapusd.chaptersix.command.garage_door;

import org.tapusd.chaptersix.GarageDoor;
import org.tapusd.chaptersix.command.Command;

public class GarageDoorLightOnCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
