package org.firstinspires.ftc.teamcode._05_Telemetry;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._02_Actions.ExtensionActions;

public class ExtensionTelemetry {
    private final Telemetry telemetry;
    private final ExtensionActions extension;

    public ExtensionTelemetry(Telemetry telemetry, ExtensionActions extension) {
        this.telemetry = telemetry;
        this.extension = extension;
    }
    public void update() {
        telemetry.addData("Extension Position: ", extension.getPosition());
    }
}
