package org.firstinspires.ftc.teamcode._05_Telemetry;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._02_Actions.ClawActions;

public class ClawTelemetry {
    private final Telemetry telemetry;
    private final ClawActions claw;

    public ClawTelemetry(Telemetry telemetry, ClawActions claw) {
        this.telemetry = telemetry;
        this.claw = claw;
    }
    public void update() {
        telemetry.addData("Claw Position: ", claw.getPosition());
    }
}
