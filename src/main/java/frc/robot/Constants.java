// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//Evin Park - October 8, 2021
//Ian McTavish
//Sophia Webster- October 8, 2021

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
    //https://github.com/HoyaRobotics/InfiniteRecharge2020/blob/master/src/main/java/frc/robot/Constants.java
    //Evin - add the driver controls
    //Ethan - add the USB ids
    //Sophia - CANbus ids - for drive motors


// CANbus ids
public static final int FRONT_LEFT_DRIVE = 0;
public static final int FRONT_RIGHT_DRIVE = 1; 
public static final int REAR_LEFT_DRIVE = 2; 
public static final int REAR_RIGHT_DRIVE = 3;
public static final int TURRET_ROTATOR = 4;
public static final int INTAKE_INTERNAL_ROLLER_MASTER = 5;
public static final int INTAKE_INTERNAL_ROLLER_SLAVE = 6;
public static final int INTAKE_EXTERNAL_ROLLER = 7;
public static final int SHOOTER_LEFT = 8;
public static final int SHOOTER_RIGHT = 9; 
public static final int CLIMBER_VERTICAL_1 = 10; 
public static final int CLIMBER_VERTICAL_2 = 11; 
public static final int CLIMBER_HORIZONTAL = 12; 

}
