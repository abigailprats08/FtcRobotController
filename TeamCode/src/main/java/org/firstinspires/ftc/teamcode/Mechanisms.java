package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class Mechanisms {

    private DcMotor rightDriveMotor, leftDriveMotor, intakeMotor;
    private CRServo leftIntakeServo, rightIntakeServo;

    public void init(HardwareMap hwMap) {
        rightDriveMotor = hwMap.get(DcMotor.class, "right_drive_motor");
        leftDriveMotor = hwMap.get(DcMotor.class, "left_drive_motor");
        intakeMotor = hwMap.get(DcMotor.class, "intake");
        leftIntakeServo = hwMap.get(CRServo.class, "left_intake_servo");
        rightIntakeServo = hwMap.get(CRServo.class, "right_intake_servo");

        leftDriveMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDriveMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftDriveMotor.setDirection(DcMotor.Direction.REVERSE);
        rightDriveMotor.setDirection(DcMotor.Direction.FORWARD);
        rightIntakeServo.setDirection(DcMotorSimple.Direction.REVERSE);

        leftDriveMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDriveMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftIntakeServo.setPower(0);
        rightIntakeServo.setPower(0);

    }

    public void intake(double intakePower) {
        intakeMotor.setPower(intakePower);
        leftIntakeServo.setPower(intakePower);
        rightIntakeServo.setPower(intakePower);

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
