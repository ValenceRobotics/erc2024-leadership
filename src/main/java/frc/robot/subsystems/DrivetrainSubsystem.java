package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class DrivetrainSubsystem extends SubsystemBase {
    private final PWMSparkMax leftMotor = new PWMSparkMax(0);
    private final PWMSparkMax rightMotor = new PWMSparkMax(2);


    private final DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

    public DrivetrainSubsystem() {
        rightMotor.setInverted(true);
    }

    public void arcadeDrive(double fwd, double rot) {
        drive.arcadeDrive(fwd, rot);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop() {
        drive.stopMotor();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}