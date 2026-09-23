package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {

        int teamNumber = 25863;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Xenoatmospheric Sky Cows";
        int motorAngle = 45;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
