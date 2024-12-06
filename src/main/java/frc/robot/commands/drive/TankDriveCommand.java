package frc.robot.commands.drive;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DrivetrainSubsystem;
import java.util.function.DoubleSupplier;

public class TankDriveCommand extends Command {
    private final DrivetrainSubsystem drivetrain;
    private final DoubleSupplier leftSpeed;
    private final DoubleSupplier rightSpeed;

    public TankDriveCommand(DrivetrainSubsystem drivetrain, DoubleSupplier leftSpeed, DoubleSupplier rightSpeed) {
        this.drivetrain = drivetrain;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        drivetrain.tankDrive(leftSpeed.getAsDouble(), rightSpeed.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();
    }
}