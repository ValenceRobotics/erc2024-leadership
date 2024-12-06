package frc.robot.commands.mechanisms;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ArmSubsystem;
import java.util.function.DoubleSupplier;

public class ControlArmCommand extends Command {
    private final ArmSubsystem arm;
    private final DoubleSupplier joystickInput;

    public ControlArmCommand(ArmSubsystem arm, DoubleSupplier joystickInput) {
        this.arm = arm;
        this.joystickInput = joystickInput;
        addRequirements(arm);
    }

    @Override
    public void execute() {
        double speed = joystickInput.getAsDouble();
        arm.setArmSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        arm.stopArm();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}