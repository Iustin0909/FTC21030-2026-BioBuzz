package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode._00_Parameters.ExtensionParams;

public class ExtensionHardware {
    protected final Servo extensionServo;

    public ExtensionHardware(HardwareMap hardwareMap) {
        extensionServo = hardwareMap.get(Servo.class, ExtensionParams.SERVO_NAME);
    }
}
