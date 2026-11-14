package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.XboxController;

public class Robot {
    SparkMax rightMotor = new SparkMax(1, MotorType.kBrushless);

    private DifferentialDrive motor = new DifferentialDrive(leftMotor,rightMotor);

    private XboxController controller = new XboxController(2);

    public Robot(){
        rightMotor.setInverted(true);
        Config motor = new Config();
}
}