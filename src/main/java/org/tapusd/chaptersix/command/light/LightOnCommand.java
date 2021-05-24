package org.tapusd.chaptersix.command.light;

import org.tapusd.chaptersix.Light;
import org.tapusd.chaptersix.command.Command;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}