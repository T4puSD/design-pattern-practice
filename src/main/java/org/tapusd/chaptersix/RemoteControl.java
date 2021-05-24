package org.tapusd.chaptersix;

import org.tapusd.chaptersix.command.Command;
import org.tapusd.chaptersix.command.NoCommand;

public class RemoteControl {
    private static final int SLOT_SIZE = 7;
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[SLOT_SIZE];
        offCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
       onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n ---------------- Remote Control ------------------\n");
        for (int i = 0; i < SLOT_SIZE; i++) {
           sb.append("[slot-").append(i).append("] ").append(onCommands[i].getClass().getSimpleName())
                   .append("     ").append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        return sb.toString();
    }
}
