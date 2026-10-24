package org.firstinspires.ftc.teamcode.BIOBUZZ2027.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;
    private CRServo rightIntakeServo, leftIntakeServo;

    public void init(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotor.class, "intake");
        rightIntakeServo = hwMap.get(CRServo.class, "right_intake_servo");
        leftIntakeServo = hwMap.get(CRServo.class, "left_intake_servo");

        rightIntakeServo.setDirection(DcMotorSimple.Direction.REVERSE);

        leftIntakeServo.setPower(0);
        rightIntakeServo.setPower(0);

        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void intake(double driverInput) {
        double intakePower = driverInput;

        intakeMotor.setPower(intakePower);
        rightIntakeServo.setPower(intakePower);
        leftIntakeServo.setPower(intakePower);

    }

}
