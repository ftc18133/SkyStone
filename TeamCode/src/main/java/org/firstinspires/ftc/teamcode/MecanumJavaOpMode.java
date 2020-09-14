package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * See https://docs.revrobotics.com/15mm/ftc-starter-kit-mecanum-drivetrain/mecanum-wheel-setup-and-behavior
 */

@TeleOp
public class MecanumJavaOpMode extends LinearOpMode {
    private DcMotor motorL1;
    private DcMotor motorL2;
    private DcMotor motorR1;
    private DcMotor motorR2;

    @Override
    public void runOpMode() {
        motorL1 = hardwareMap.get(DcMotor.class, "motorL1");
        motorL2 = hardwareMap.get(DcMotor.class, "motorL2");
        motorR1 = hardwareMap.get(DcMotor.class, "motorR1");
        motorR2 = hardwareMap.get(DcMotor.class, "motorR2");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)

        double tgtPower = 0;

        while (opModeIsActive()) {
            tgtPower = -this.gamepad1.right_stick_y;

            // go forward (all forward)
            if (this.gamepad1.dpad_up) {
                motorL1.setPower(tgtPower);
                motorL2.setPower(tgtPower);
                motorR1.setPower(tgtPower);
                motorR2.setPower(tgtPower);
            } else if (this.gamepad1.dpad_down) {
                motorL1.setPower(-tgtPower);
                motorL2.setPower(-tgtPower);
                motorR1.setPower(-tgtPower);
                motorR2.setPower(-tgtPower);
            } else if (this.gamepad1.dpad_left) {
                motorL1.setPower(-tgtPower);
                motorL2.setPower(tgtPower);
                motorR1.setPower(tgtPower);
                motorR2.setPower(-tgtPower);
            } else if (this.gamepad1.dpad_right) {
                motorL1.setPower(tgtPower);
                motorL2.setPower(-tgtPower);
                motorR1.setPower(-tgtPower);
                motorR2.setPower(tgtPower);
            }

            telemetry.addData("Status", "Running");

            telemetry.addData("Target Power", tgtPower);
            telemetry.addData("Motor Power L1", motorL1.getPower());
            telemetry.addData("Motor Power L2", motorL2.getPower());
            telemetry.addData("Motor Power R1", motorR1.getPower());
            telemetry.addData("Motor Power R2", motorR2.getPower());

            telemetry.update();
        }
    }
}
