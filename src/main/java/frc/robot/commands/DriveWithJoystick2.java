// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveBase2;
import frc.robot.utils.Utils;

public class DriveWithJoystick2 extends CommandBase {
  /** Creates a new DriveWithJoystick2. */
  private final DriveBase2 driveBase2;
  private DoubleSupplier throttle;
  private DoubleSupplier rotation;

  public DriveWithJoystick2(DriveBase2 driveBase2, DoubleSupplier throttle, DoubleSupplier rotation) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.driveBase2 = driveBase2;
    this.throttle = throttle;
    this.rotation = rotation;

    addRequirements(driveBase2);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBase2.arcadeDrive(Utils.applyDeadband(throttle.getAsDouble()*-1, Constants.CONTROL_DEADBAND), 
    Utils.applyDeadband(rotation.getAsDouble()*-1, Constants.CONTROL_DEADBAND));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    driveBase2.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
