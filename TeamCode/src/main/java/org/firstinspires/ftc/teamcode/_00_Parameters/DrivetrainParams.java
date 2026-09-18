package org.firstinspires.ftc.teamcode._00_Parameters;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class DrivetrainParams {
    public static class PROFILE {
        public static class MOTOR_NAMES {
            public static final String FRONT_LEFT = "frontLeftMotor";
            public static final String FRONT_RIGHT = "frontRightMotor";
            public static final String BACK_LEFT = "backLeftMotor";
            public static final String BACK_RIGHT = "backRightMotor";
        }
        public static class MOTOR_DIRECTIONS {
            public static final DcMotorEx.Direction FRONT_LEFT = DcMotorEx.Direction.FORWARD;
            public static final DcMotorEx.Direction FRONT_RIGHT = DcMotorEx.Direction.REVERSE;
            public static final DcMotorEx.Direction BACK_LEFT = DcMotorEx.Direction.FORWARD;
            public static final DcMotorEx.Direction BACK_RIGHT = DcMotorEx.Direction.REVERSE;
        }
        public static final DcMotorEx.RunMode RUN_MODE = DcMotorEx.RunMode.RUN_WITHOUT_ENCODER;
        public static final DcMotorEx.ZeroPowerBehavior ZERO_POWER_BEHAVIOR = DcMotorEx.ZeroPowerBehavior.BRAKE;
    }
    public static class SPEED {
        public static final double SLOW = 0.25;
        public static final double NORMAL = 0.50;
        public static final double FAST = 0.75;
    }
}
