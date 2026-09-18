package org.firstinspires.ftc.teamcode._04_Drivers;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode._03_Robot.Robot;

public class AndyDriver implements DriverInterface{
    private final Robot robot;
    private final Gamepad gamepad;

    public AndyDriver(Robot robot, Gamepad gamepad) {
        this.robot = robot;
        this.gamepad = gamepad;
    }


    @Override
    public void control() {
    if(gamepad.left_stick_x )
    }
}
