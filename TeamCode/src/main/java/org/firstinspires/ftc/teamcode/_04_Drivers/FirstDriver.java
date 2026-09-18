package org.firstinspires.ftc.teamcode._04_Drivers;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode._00_Parameters.ArmParams;
import org.firstinspires.ftc.teamcode._00_Parameters.DrivetrainParams;
import org.firstinspires.ftc.teamcode._00_Parameters.ExtensionParams;
import org.firstinspires.ftc.teamcode._03_Robot.Robot;

public class FirstDriver implements DriverInterface{
    private final Robot robot;
    private final Gamepad gamepad;

    public FirstDriver(Robot robot, Gamepad gamepad) {
        this.robot = robot;
        this.gamepad = gamepad;
    }

    @Override
    public void control() {
        if (gamepad.left_trigger > 0.2) {
            robot.drivetrain.drive(gamepad.left_stick_x, -gamepad.left_stick_y, gamepad.right_stick_x, DrivetrainParams.SPEED.SLOW);
        } else if (gamepad.right_trigger > 0.2) {
            robot.drivetrain.drive(gamepad.left_stick_x, -gamepad.left_stick_y, gamepad.right_stick_x, DrivetrainParams.SPEED.FAST);
        } else {
            robot.drivetrain.drive(gamepad.left_stick_x, -gamepad.left_stick_y, gamepad.right_stick_x, DrivetrainParams.SPEED.NORMAL);
        }

        if (gamepad.dpad_up) {
            robot.arm.move(ArmParams.SPEED.NORMAL);
        } else if (gamepad.dpad_down) {
            robot.arm.move(-ArmParams.SPEED.NORMAL);
        } else {
            robot.arm.stop();
        }

        double extensionPosition = robot.extension.getPosition();
        if (gamepad.dpad_left) {
            robot.extension.move(extensionPosition + ExtensionParams.INCREMENT);
        } else if (gamepad.dpad_right) {
            robot.extension.move(extensionPosition - ExtensionParams.INCREMENT);
        }

        if (gamepad.cross) {
            robot.extension.home();
        } else if (gamepad.triangle) {
            robot.extension.extend();
        }

        if (gamepad.left_bumper) {
            robot.claw.close();
        } else if (gamepad.right_bumper) {
            robot.claw.open();
        }
    }
}
