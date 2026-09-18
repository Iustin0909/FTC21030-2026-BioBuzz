package org.firstinspires.ftc.teamcode._04_Drivers;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode._00_Parameters.ArmParams;
import org.firstinspires.ftc.teamcode._00_Parameters.ExtensionParams;
import org.firstinspires.ftc.teamcode._00_Parameters.HookParams;
import org.firstinspires.ftc.teamcode._03_Robot.Robot;

public class SecondDriver implements DriverInterface {
    private final Robot robot;
    private final Gamepad gamepad;

    public SecondDriver(Robot robot, Gamepad gamepad) {
        this.robot = robot;
        this.gamepad = gamepad;
    }

    @Override
    public void control() {
        if (gamepad.dpad_up) {
            robot.hook.move(HookParams.SPEED.FAST);
        } else if (gamepad.dpad_down) {
            robot.hook.move(-HookParams.SPEED.SLOW);
        } else {
            robot.hook.stop();
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
