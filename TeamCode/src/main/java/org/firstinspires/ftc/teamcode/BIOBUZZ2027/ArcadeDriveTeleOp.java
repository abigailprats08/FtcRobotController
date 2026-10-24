package org.firstinspires.ftc.teamcode.BIOBUZZ2027;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.BIOBUZZ2027.mechanisms.ArcadeDrive;
import org.firstinspires.ftc.teamcode.BIOBUZZ2027.mechanisms.Intake;

public class ArcadeDriveTeleOp extends OpMode {
    ArcadeDrive arcadeDrive = new ArcadeDrive();
    Intake intake = new Intake();

    double throttle, spin, driverInput;
    // variable called driverInput is for the intake input on driver 1 controller

    @Override
    public void init() {
        arcadeDrive.init(hardwareMap);
        intake.init(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        //arcade drive controls
        throttle = -gamepad1.left_stick_y;
        spin = gamepad1.right_stick_x;

        arcadeDrive.drive(throttle, spin);

        //intake controls
        driverInput = gamepad1.right_trigger - gamepad1.left_trigger;

        intake.intake(driverInput);

    }

}
