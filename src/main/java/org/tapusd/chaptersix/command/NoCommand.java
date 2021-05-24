package org.tapusd.chaptersix.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command is set in this button");
    }

    @Override
    public void undo() {
        System.out.println("No command is set in this button");
    }
}
