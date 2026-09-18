package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ArmParams;
import org.firstinspires.ftc.teamcode._01_Hardware.ArmHardware;

public class ArmActions extends ArmHardware {
    public ArmActions(HardwareMap hardwareMap) {
        super(hardwareMap);
    }

    public void stop() {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }

    public double getArmPosition() {
        return rightMotor.getCurrentPosition();
    }

    public void initialize() {
        stop();
    }

    public void move(double power) {
        double currentPosition = getArmPosition();

        boolean cantMoveUpwards = power > 0 && currentPosition >= ArmParams.POSITIONS.MAX;
        boolean cantMoveDownwards = power < 0 && currentPosition <= ArmParams.POSITIONS.MIN;
        if (cantMoveDownwards || cantMoveUpwards) {
            power = 0;
        }

        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }
}
