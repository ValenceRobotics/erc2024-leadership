package frc.robot.commands.drive;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DrivetrainSubsystem;
import java.util.function.DoubleSupplier;

public class ArcadeDriveCommand extends Command {
    private final DrivetrainSubsystem drivetrain;
    private final DoubleSupplier forwardSpeed;
    private final DoubleSupplier rotationSpeed;

    public ArcadeDriveCommand(DrivetrainSubsystem drivetrain, DoubleSupplier forwardSpeed, DoubleSupplier rotationSpeed) {
        this.drivetrain = drivetrain;
        this.forwardSpeed = forwardSpeed;
        this.rotationSpeed = rotationSpeed;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        drivetrain.arcadeDrive(forwardSpeed.getAsDouble(), rotationSpeed.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();
    }
}