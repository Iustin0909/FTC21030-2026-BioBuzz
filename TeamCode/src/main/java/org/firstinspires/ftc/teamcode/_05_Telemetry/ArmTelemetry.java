package org.firstinspires.ftc.teamcode._05_Telemetry;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._02_Actions.ArmActions;
import org.firstinspires.ftc.teamcode._02_Actions.DrivetrainActions;

public class ArmTelemetry {
    private final Telemetry telemetry;
    private final ArmActions arm;

    public ArmTelemetry(Telemetry telemetry, ArmActions arm) {
        this.telemetry = telemetry;
        this.arm = arm;
    }

    public void update() {
        telemetry.addData("Arm Position:", arm.getArmPosition());
    }
}
