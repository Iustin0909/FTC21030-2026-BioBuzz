package org.firstinspires.ftc.teamcode._02_Actions;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._01_Hardware.DrivetrainHardware;

public class DrivetrainActions extends DrivetrainHardware {
    public DrivetrainActions(HardwareMap hardwareMap) {
        super(hardwareMap);
    }
    public void stop() {
        // Stop the motors
        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backLeftMotor.setPower(0);
        backRightMotor.setPower(0);
    }
    public double getMotorsPower() {
        double power = frontLeftMotor.getPower();
        power += frontRightMotor.getPower();
        power += backLeftMotor.getPower();
        power += backRightMotor.getPower();
        return power / 4.0;
    }
    public void initialize() {
        stop();
    }
    public void drive(double strafe, double forward, double rotation, double speed_modifier) {
        // Calculate the motor powers
        double frontLeftPower = forward + strafe + rotation;
        double frontRightPower = forward - strafe - rotation;
        double backLeftPower = forward - strafe + rotation;
        double backRightPower = forward + strafe - rotation;

        // Normalize the motor powers
        double maxPower = Math.max(1.0, Math.abs(frontLeftPower));
        maxPower = Math.max(maxPower, Math.abs(frontRightPower));
        maxPower = Math.max(maxPower, Math.abs(backLeftPower));
        maxPower = Math.max(maxPower, Math.abs(backRightPower));

        // Set the motor powers
        frontLeftMotor.setPower((frontLeftPower / maxPower) * speed_modifier);
        frontRightMotor.setPower((frontRightPower / maxPower) * speed_modifier);
        backLeftMotor.setPower((backLeftPower / maxPower) * speed_modifier);
        backRightMotor.setPower((backRightPower / maxPower) * speed_modifier);
    }
}
