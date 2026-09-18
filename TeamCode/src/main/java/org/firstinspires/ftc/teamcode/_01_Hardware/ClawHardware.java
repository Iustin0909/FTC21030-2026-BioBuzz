package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode._00_Parameters.ClawParams;

public class ClawHardware {
    protected final Servo clawServo;

    public ClawHardware(HardwareMap hardwareMap) {
        clawServo = hardwareMap.get(Servo.class, ClawParams.SERVO_NAME);
    }
}
