package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPratice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
        double motorSpeed = gamepad1.left_stick_y;

        if (!aButton) {
            motorSpeed *= 0.5;


        }

        telemetry.addData("Left Stick Value", motorSpeed);

    }
}
