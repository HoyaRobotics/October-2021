// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveBase;
import frc.robot.utils.Utils;


public class DriveWithJoystick extends CommandBase {
  /** Creates a new DriveWithJoystick. */

  private final DriveBase driveBase;
  private final DoubleSupplier throttle;
  private final DoubleSupplier rotation;
  public DriveWithJoystick(DriveBase driveBase, DoubleSupplier throttle, DoubleSupplier rotation) {
    this.driveBase = driveBase;
    this.throttle = throttle;
    this.rotation = rotation;

    addRequirements(driveBase);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveBase.arcadeDrive(
      Utils.applyDeadband(throttle.getAsDouble()*-1, Constants.CONTROL_DEADBAND),
      Utils.applyDeadband(rotation.getAsDouble()*-1, Constants.CONTROL_DEADBAND)
        );
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBase.arcadeDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
