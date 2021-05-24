package org.tapusd.chaptersix.command.stereo;

import org.tapusd.chaptersix.Stereo;
import org.tapusd.chaptersix.command.Command;

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
