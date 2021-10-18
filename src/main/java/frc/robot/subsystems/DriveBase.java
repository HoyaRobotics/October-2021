// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveBase extends SubsystemBase {
  /** Creates a new DriveBase. */

  private final Talon leftLeader = new Talon(Constants.FRONT_LEFT_DRIVE);
  private final Talon rightLeader = new Talon(Constants.FRONT_RIGHT_DRIVE);

  private final DifferentialDrive drive = new DifferentialDrive(leftLeader, rightLeader);
  public DriveBase() {
    leftLeader.configFactoryDefault();
    rightLeader.configFactoryDefault();

    SupplyCurrentLimitConfiguration supplyLimit = new SupplyCurrentLimitConfiguration(true, 30, 35, 1.0);
    leftLeader.configSupplyCurrentLimit (supplyLimit);
    rightLeader.configSupplyCurrentLimit (supplyLimit);

    leftLeader.setNeutralMode(NeutralMode.Coast);
    rightLeader.setNeutralMode(NeutralMode.Coast);
  }
  public void arcadeDrive (double throttle, double rotation){
    rotation *= -1;

    drive.arcadeDrive(throttle, rotation);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
