package org.firstinspires.ftc.teamcode._05_Telemetry;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._02_Actions.DrivetrainActions;

public class DrivetrainTelemetry {
    private final Telemetry telemetry;
    private final DrivetrainActions drivetrain;

    public DrivetrainTelemetry(Telemetry telemetry, DrivetrainActions drivetrain) {
        this.telemetry = telemetry;
        this.drivetrain = drivetrain;
    }

    public void update() {
        telemetry.addData("Motors Power: ", drivetrain.getMotorsPower());
    }
}
