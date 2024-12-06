package frc.robot.commands.mechanisms;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ElevatorSubsystem;

import java.util.function.DoubleSupplier;

public class ControlElevatorCommand extends Command {
    private final ElevatorSubsystem elevator;
    private final DoubleSupplier joystickInput;

    public ControlElevatorCommand(ElevatorSubsystem elevator, DoubleSupplier joystickInput) {
        this.elevator = elevator;
        this.joystickInput = joystickInput;
        addRequirements(elevator);
    }

    @Override
    public void execute() {
        double speed = joystickInput.getAsDouble();
        elevator.setElevatorSpeed(speed);
    }

    @Override
    public void end(boolean interrupted) {
        elevator.stopElevator();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}