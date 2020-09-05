package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

import java.util.Iterator;

@TeleOp
public class MyTouchOpMode extends LinearOpMode {
    private TouchSensor touchSensor;

    @Override
    public void runOpMode() {
        touchSensor = hardwareMap.get(TouchSensor.class, "testTouch");
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            //is button pressed?
            if (touchSensor.isPressed()) {
                //button is pressed
                telemetry.addData("Button", "PRESSED");
            } else {
                //button is not pressed
                telemetry.addData("Button", "NOT PRESSED");
            }

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
