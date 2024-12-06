package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkFlex;

public class ArmSubsystem extends SubsystemBase {
    private final PWMSparkFlex armMotor = new PWMSparkFlex(0); // Assuming PWM port 0

    public ArmSubsystem() {
        armMotor.setInverted(false); // Adjust if necessary
    }

    public void setArmSpeed(double speed) {
        armMotor.set(speed);
    }

    public void stopArm() {
        armMotor.stopMotor();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}