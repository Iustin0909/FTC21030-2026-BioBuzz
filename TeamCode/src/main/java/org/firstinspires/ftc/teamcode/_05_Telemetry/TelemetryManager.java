package org.firstinspires.ftc.teamcode._05_Telemetry;

import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode._03_Robot.Robot;

public class TelemetryManager {
    private final Robot robot;
    private final Telemetry telemetry;
    private ElapsedTime runtime = new ElapsedTime();

    private DrivetrainTelemetry drivetrainTelemetry;
    private ArmTelemetry armTelemetry;
    private ExtensionTelemetry extensionTelemetry;
    private ClawTelemetry clawTelemetry;
    private HookTelemetry hookTelemetry;

    public TelemetryManager(Robot robot, Telemetry telemetry) {
        this.robot = robot;
        this.telemetry = telemetry;
    }

    public void initialize() {
        drivetrainTelemetry = new DrivetrainTelemetry(telemetry, robot.drivetrain);
        armTelemetry = new ArmTelemetry(telemetry, robot.arm);
        extensionTelemetry = new ExtensionTelemetry(telemetry, robot.extension);
        clawTelemetry = new ClawTelemetry(telemetry, robot.claw);
        hookTelemetry = new HookTelemetry(telemetry, robot.hook);
        resetRuntime();
    }

    public void update() {
        telemetry.addLine("Robot code for team 21030");
        drivetrainTelemetry.update();
        armTelemetry.update();
        extensionTelemetry.update();
        clawTelemetry.update();
        hookTelemetry.update();
        telemetry.addData("Runtime: ", "%.2f", runtime.seconds());
        telemetry.update();
    }

    public void resetRuntime() {
        runtime.reset();
    }
}
