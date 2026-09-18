package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ExtensionParams;
import org.firstinspires.ftc.teamcode._01_Hardware.ExtensionHardware;

public class ExtensionActions extends ExtensionHardware {
    public ExtensionActions(HardwareMap hardwareMap) {
        super(hardwareMap);
    }
    public void initialize() {
        home();
    }
    public void home() {
        extensionServo.setPosition(ExtensionParams.POSITIONS.HOME);
    }
    public void move(double position) {
        extensionServo.setPosition(position);
    }
    public void extend() {
        extensionServo.setPosition(ExtensionParams.POSITIONS.EXTEND);
    }
    public double getPosition() {
        return extensionServo.getPosition();
    }
}
