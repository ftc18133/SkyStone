package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp
public class CombinedJavaOpMode extends LinearOpMode {

    // define Color Distance sensor var
    // define Motor var
    // define Servo var
    // define Touch sensor var

    @Override
    public void runOpMode() {

        // setup color distance sensor
        // setup motor
        // setup servo
        // setup touch sensor

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // respond to color distance sensor
            // respond to touch sensor
            // respond to gamepad for motor
            // respond to gamepad for servo

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
