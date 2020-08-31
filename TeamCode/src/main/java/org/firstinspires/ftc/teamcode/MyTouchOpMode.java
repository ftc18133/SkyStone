package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp
public class MyTouchOpMode extends LinearOpMode {
private DigitalChannel digitalTouch;

    @Override
    public void runOpMode()
    {
       digitalTouch  = hardwareMap.get(DigitalChannel.class, "digitalTouch");
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            //is button pressed?
            if (digitalTouch.getState()==false){
                //button is pressed
                telemetry.addData("Button", "PRESSED");
            }else{
                //button is not pressed
                telemetry.addData("Button", "NOT PRESSED");
            }

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
