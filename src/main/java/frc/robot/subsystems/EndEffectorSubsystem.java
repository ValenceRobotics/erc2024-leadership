package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkFlex;

public class EndEffectorSubsystem extends SubsystemBase {
    private final PWMSparkFlex endEffectorMotor = new PWMSparkFlex(0); // Assuming PWM port 0

    public EndEffectorSubsystem() {
        endEffectorMotor.setInverted(false); // Adjust if necessary
    }

    public void setEndEffectorSpeed(double speed) {
        endEffectorMotor.set(speed);
    }

    public void stopEndEffector() {
        endEffectorMotor.stopMotor();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}