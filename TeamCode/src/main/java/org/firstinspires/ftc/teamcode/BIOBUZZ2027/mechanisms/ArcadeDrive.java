package org.firstinspires.ftc.teamcode.BIOBUZZ2027.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class ArcadeDrive {

    private DcMotor rightDriveMotor, leftDriveMotor;

    public void init(HardwareMap hwMap) {
        rightDriveMotor = hwMap.get(DcMotor.class, "right_drive_motor");
        leftDriveMotor = hwMap.get(DcMotor.class, "left_drive_motor");

        leftDriveMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDriveMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftDriveMotor.setDirection(DcMotor.Direction.REVERSE);
        rightDriveMotor.setDirection(DcMotor.Direction.FORWARD);

        leftDriveMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDriveMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void drive(double throttle, double spin) {
        double leftPower = throttle + spin;
        double rightPower = throttle - spin;
        leftPower = Range.clip(throttle + spin, -1.0, 1.0);
        rightPower = Range.clip(throttle - spin, -1.0, 1.0);

        leftDriveMotor.setPower(leftPower);
        rightDriveMotor.setPower(rightPower);

    }
}
