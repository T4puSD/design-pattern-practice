package org.tapusd.chaptersix.command.light;

import org.tapusd.chaptersix.Light;
import org.tapusd.chaptersix.command.Command;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
