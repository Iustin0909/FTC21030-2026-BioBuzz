package org.firstinspires.ftc.teamcode._05_Telemetry;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._02_Actions.HookActions;

public class HookTelemetry {
    private final Telemetry telemetry;
    private final HookActions hook;

    public HookTelemetry(Telemetry telemetry, HookActions hook) {
        this.telemetry = telemetry;
        this.hook = hook;
    }

    public void update() {
        telemetry.addData("Hook Position:", hook.getHookPosition());
    }
}
