package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ArcadeDriveTeleOp extends OpMode {
    Mechanisms mechanisms = new Mechanisms();

    double throttle, spin, intakePower;
    // variable called intakePower is for the intake input on driver 1 controller

    @Override
    public void init() {
        mechanisms.init(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        //arcade drive controls
        throttle = -gamepad1.left_stick_y;
        spin = gamepad1.right_stick_x;

        mechanisms.drive(throttle, spin);

        //intake controls
        intakePower = gamepad1.right_trigger - gamepad1.left_trigger;

        mechanisms.intake(intakePower);

    }

}
