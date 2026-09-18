package org.firstinspires.ftc.teamcode._06_OpMode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode._03_Robot.Robot;

@Autonomous(name="autonomie goala", group="Linear OpMode")
public class program extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        Robot robot = new Robot(this);

        robot.start();

        waitForStart();

        if (opModeIsActive()) {
            telemetry.addData("Status:", "Start");
            telemetry.update();
            sleep(10000);
            telemetry.addData("Status:", "Stop");
            telemetry.update();
        }
    }
}
