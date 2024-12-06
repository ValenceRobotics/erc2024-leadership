package frc.robot.commands.mechanisms;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.EndEffectorSubsystem;


public class ControlEndEffectorCommand extends Command {
    private final EndEffectorSubsystem endEffector;
    private final double input;

    public ControlEndEffectorCommand(EndEffectorSubsystem endEffector, double input) {
        this.endEffector = endEffector;
        this.input = input;
        addRequirements(endEffector);
    }

    @Override
    public void execute() {
        double speed = input;
        endEffector.setEndEffectorSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        endEffector.stopEndEffector();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}