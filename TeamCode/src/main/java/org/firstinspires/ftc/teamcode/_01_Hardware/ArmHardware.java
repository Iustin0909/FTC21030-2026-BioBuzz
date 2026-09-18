package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.ArmParams;

public class ArmHardware {
    protected final DcMotorEx leftMotor;
    protected final DcMotorEx rightMotor;

    public ArmHardware(HardwareMap hardwareMap) {
        leftMotor = hardwareMap.get(DcMotorEx.class, ArmParams.PROFILE.MOTOR_NAMES.LEFT);
        rightMotor = hardwareMap.get(DcMotorEx.class, ArmParams.PROFILE.MOTOR_NAMES.RIGHT);

        leftMotor.setDirection(ArmParams.PROFILE.MOTOR_DIRECTIONS.LEFT);
        rightMotor.setDirection(ArmParams.PROFILE.MOTOR_DIRECTIONS.RIGHT);

        //rightMotor.setMode(ArmParams.PROFILE.RESET_RUN_MODE);

        leftMotor.setMode(ArmParams.PROFILE.RUN_MODE_LEFT);
        rightMotor.setMode(ArmParams.PROFILE.RUN_MODE_RIGHT);

        DcMotorEx[] motors = {leftMotor, rightMotor};

        for (DcMotorEx motor : motors) {
            motor.setPower(0);
            motor.setZeroPowerBehavior(ArmParams.PROFILE.ZERO_POWER_BEHAVIOR);
        }
    }
}
