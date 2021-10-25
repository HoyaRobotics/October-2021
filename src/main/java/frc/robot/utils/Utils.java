package frc.robot.utils;

public class Utils {
    public static double limit(double value){
        if(value <= -1.0)
            return -1.0;
        else if(value >= 1.0)
            return 1.0;
        else
            return value;
    }


    public static double applyDeadband (double value, double deadband){
        if(Math.abs(value) < deadband)
            return 0.0;
        else
            return value;
    }
}
