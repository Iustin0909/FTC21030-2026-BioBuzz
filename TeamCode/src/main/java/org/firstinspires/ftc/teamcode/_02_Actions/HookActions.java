package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.HookParams;
import org.firstinspires.ftc.teamcode._01_Hardware.HookHardware;

public class HookActions extends HookHardware {
    public HookActions(HardwareMap hardwareMap) {
        super(hardwareMap);
    }

    public void initialize() {
        stop();
    }

    public void move(double power) {
        double currentPosition = getHookPosition();

        if (power > 0 && currentPosition >= HookParams.POSITIONS.MAX) {
            power = 0;
        } else if (power < 0 && currentPosition <= HookParams.POSITIONS.MIN) {
            power = 0;
        }

        hookMotor.setPower(power);
    }

    public void stop() {
        hookMotor.setPower(0);
    }

    public double getHookPosition() {
        return -hookMotor.getCurrentPosition();
    }
}
