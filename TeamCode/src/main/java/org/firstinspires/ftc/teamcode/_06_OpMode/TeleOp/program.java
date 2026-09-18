package org.firstinspires.ftc.teamcode._06_OpMode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode._03_Robot.Robot;
import org.firstinspires.ftc.teamcode._04_Drivers.DriverInterface;
import org.firstinspires.ftc.teamcode._04_Drivers.FirstDriver;
import org.firstinspires.ftc.teamcode._04_Drivers.SecondDriver;
import org.firstinspires.ftc.teamcode._05_Telemetry.TelemetryManager;

@TeleOp(name="program", group="Linear OpMode")
public class program extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot(this);
        DriverInterface firstDriver = new FirstDriver(robot, this.gamepad1);
        DriverInterface secondDriver = new SecondDriver(robot, this.gamepad2);

        TelemetryManager telemetryManager = new TelemetryManager(robot, this.telemetry);

        robot.start();
        telemetryManager.initialize();

        waitForStart();

        while (opModeIsActive()) {
            firstDriver.control();
            secondDriver.control();
            telemetryManager.update();
        }
    }
}
