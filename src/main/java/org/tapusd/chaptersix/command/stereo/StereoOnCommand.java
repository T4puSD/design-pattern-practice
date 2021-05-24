package org.tapusd.chaptersix.command.stereo;

import org.tapusd.chaptersix.Stereo;
import org.tapusd.chaptersix.command.Command;

public class StereoOnCommand implements Command {
    private final Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
