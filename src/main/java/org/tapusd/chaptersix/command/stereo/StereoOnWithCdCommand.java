package org.tapusd.chaptersix.command.stereo;

import org.tapusd.chaptersix.Stereo;
import org.tapusd.chaptersix.command.Command;

public class StereoOnWithCdCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.off();
    }
}
