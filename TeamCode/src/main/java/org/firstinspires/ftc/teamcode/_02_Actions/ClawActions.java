package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ClawParams;
import org.firstinspires.ftc.teamcode._01_Hardware.ClawHardware;

public class ClawActions extends ClawHardware {
    public ClawActions(HardwareMap hardwareMap) {
        super(hardwareMap);
    }
    public void close() {
        clawServo.setPosition(ClawParams.POSITIONS.CLOSE);
    }
    public void open() {
        clawServo.setPosition(ClawParams.POSITIONS.OPEN);
    }
    public void initialize() {
        close();
    }

    public double getPosition() {
        return clawServo.getPosition();
    }
}
