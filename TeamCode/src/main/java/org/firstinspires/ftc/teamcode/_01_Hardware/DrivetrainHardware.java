package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.DrivetrainParams;

public class DrivetrainHardware {
    protected final DcMotorEx frontLeftMotor;
    protected final DcMotorEx frontRightMotor;
    protected final DcMotorEx backLeftMotor;
    protected final DcMotorEx backRightMotor;

    public DrivetrainHardware(HardwareMap hardwareMap) {
        // Get the motors from hardware map
        frontLeftMotor = hardwareMap.get(DcMotorEx.class, DrivetrainParams.PROFILE.MOTOR_NAMES.FRONT_LEFT);
        frontRightMotor = hardwareMap.get(DcMotorEx.class, DrivetrainParams.PROFILE.MOTOR_NAMES.FRONT_RIGHT);
        backLeftMotor = hardwareMap.get(DcMotorEx.class, DrivetrainParams.PROFILE.MOTOR_NAMES.BACK_LEFT);
        backRightMotor = hardwareMap.get(DcMotorEx.class, DrivetrainParams.PROFILE.MOTOR_NAMES.BACK_RIGHT);

        // Set motor directions
        frontLeftMotor.setDirection(DrivetrainParams.PROFILE.MOTOR_DIRECTIONS.FRONT_LEFT);
        frontRightMotor.setDirection(DrivetrainParams.PROFILE.MOTOR_DIRECTIONS.FRONT_RIGHT);
        backLeftMotor.setDirection(DrivetrainParams.PROFILE.MOTOR_DIRECTIONS.BACK_LEFT);
        backRightMotor.setDirection(DrivetrainParams.PROFILE.MOTOR_DIRECTIONS.BACK_RIGHT);

        // Make a motor array
        DcMotorEx[] motors = {frontLeftMotor, frontRightMotor, backLeftMotor, backRightMotor};

        // Configure the motors
        for (DcMotorEx motor : motors) {
            motor.setPower(0);
            motor.setMode(DrivetrainParams.PROFILE.RUN_MODE);
            motor.setZeroPowerBehavior(DrivetrainParams.PROFILE.ZERO_POWER_BEHAVIOR);
        }
    }
}
