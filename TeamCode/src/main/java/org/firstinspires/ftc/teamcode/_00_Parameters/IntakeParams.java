package org.firstinspires.ftc.teamcode._00_Parameters;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class IntakeParams {
    public static class PROFILE {
        public static class MOTOR_NAMES {
            public static final String INTAKE = "intakeMotor";
        }


        public static class MOTOR_DIRECTIONS {
            public static final DcMotorEx.Direction INTAKE = DcMotorEx.Direction.FORWARD;
        }

        public static final DcMotor.RunMode RESET_RUN_MODE = DcMotor.RunMode.STOP_AND_RESET_ENCODER;
        public static final DcMotor.RunMode RUN_MODE = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
        public static final DcMotor.ZeroPowerBehavior ZERO_POWER_BEHAVIOR = DcMotor.ZeroPowerBehavior.BRAKE;
    }


public static class SPEED{
    public static final double SLOW = 0.75;
    public static final double NORMAL = 0.90;
    public static final double FULL = 1;

}
}