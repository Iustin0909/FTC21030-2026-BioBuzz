package org.firstinspires.ftc.teamcode._01_Hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode._00_Parameters.HookParams;

public class HookHardware {
    protected final DcMotorEx hookMotor;

    public HookHardware(HardwareMap hardwareMap) {
        hookMotor = hardwareMap.get(DcMotorEx.class, HookParams.PROFILE.MOTOR_NAMES.HOOK);

        hookMotor.setDirection(HookParams.PROFILE.MOTOR_DIRECTIONS.HOOK);

        //hookMotor.setMode(HookParams.PROFILE.RESET_RUN_MODE);

        hookMotor.setMode(HookParams.PROFILE.RUN_MODE);

        hookMotor.setZeroPowerBehavior(HookParams.PROFILE.ZERO_POWER_BEHAVIOR);

        hookMotor.setPower(0);
    }
}
