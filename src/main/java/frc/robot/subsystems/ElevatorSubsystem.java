package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkFlex;

public class ElevatorSubsystem extends SubsystemBase {
    private final PWMSparkFlex elevatorMotor = new PWMSparkFlex(0); // Assuming PWM port 0

    public ElevatorSubsystem() {
        elevatorMotor.setInverted(false); // Adjust if necessary
    }

    public void setElevatorSpeed(double speed) {
        elevatorMotor.set(speed);
    }

    public void stopElevator() {
        elevatorMotor.stopMotor();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}