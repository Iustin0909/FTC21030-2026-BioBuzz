package org.firstinspires.ftc.teamcode._00_Parameters;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class ArmParams {
    public static class PROFILE {
        public static class MOTOR_NAMES {
            public static final String LEFT = "leftArmMotor";
            public static final String RIGHT = "rightArmMotor";
        }
        public static class MOTOR_DIRECTIONS {
            public static final DcMotorEx.Direction LEFT = DcMotorEx.Direction.FORWARD;
            public static final DcMotorEx.Direction RIGHT = DcMotorEx.Direction.REVERSE;
        }

        public static final DcMotorEx.RunMode RESET_RUN_MODE = DcMotorEx.RunMode.STOP_AND_RESET_ENCODER;
        public static final DcMotorEx.RunMode RUN_MODE_LEFT = DcMotorEx.RunMode.RUN_WITHOUT_ENCODER;
        public static final DcMotorEx.RunMode RUN_MODE_RIGHT = DcMotorEx.RunMode.RUN_USING_ENCODER;
        public static final DcMotorEx.ZeroPowerBehavior ZERO_POWER_BEHAVIOR = DcMotorEx.ZeroPowerBehavior.BRAKE;
    }
    public static class POSITIONS {
        public static final int MIN = 0;
        public static final int MAX = 2300;
    }
    public static class SPEED {
        public static final double SLOW = 0.25;
        public static final double NORMAL = 0.50;
        public static final double FAST = 0.75;
    }
}
