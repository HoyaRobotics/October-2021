// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//Mr. McTavish, Oct 26 - created the class.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveBase2 extends SubsystemBase {
  //Variables
  private final WPI_TalonSRX leftLeader = new WPI_TalonSRX(Constants.FRONT_LEFT_DRIVE);
  private final WPI_TalonSRX rightLeader = new WPI_TalonSRX(Constants.FRONT_RIGHT_DRIVE);
  private final DifferentialDrive drive = new DifferentialDrive(leftLeader, rightLeader);
  /** Creates a new DriveBase2. */
  public DriveBase2() {
    leftLeader.configFactoryDefault();
    rightLeader.configFactoryDefault();

    SupplyCurrentLimitConfiguration supplyLimit = new SupplyCurrentLimitConfiguration(true, 30, 35, 1.0);
    leftLeader.configSupplyCurrentLimit(supplyLimit);
    rightLeader.configSupplyCurrentLimit(supplyLimit);


  }//end DriveBase2 constructor

  public void arcadeDrive(double throttle, double rotation){
    rotation *=-1;
    drive.arcadeDrive(throttle, rotation);
  }//end arcadeDrive
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }//end periodic
}//end class
