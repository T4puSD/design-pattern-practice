package org.tapusd.chaptersix;

import org.tapusd.chaptersix.command.garage_door.GarageDoorDownCommand;
import org.tapusd.chaptersix.command.garage_door.GarageDoorUpCommand;
import org.tapusd.chaptersix.command.light.LightOffCommand;
import org.tapusd.chaptersix.command.light.LightOnCommand;
import org.tapusd.chaptersix.command.stereo.StereoOffCommand;
import org.tapusd.chaptersix.command.stereo.StereoOnWithCdCommand;

public class Main {
    public static void main(String[] args) {
        // Without Undo
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCdCommand = new StereoOnWithCdCommand(livingRoomStereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(livingRoomStereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(3, stereoOnWithCdCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);


        // With Undo
        System.out.println("\n\n\n");
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
    }
}
