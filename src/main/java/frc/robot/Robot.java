package frc.robot;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot{
  private final PWMSparkMax rightMotor = new PWMSparkMax(0);
  private final PWMSparkMax leftMotor = new PWMSparkMax(1);

  private final DifferentialDrive drive = new DifferentialDrive(leftMotor,rightMotor);

  private final XboxController controller = new XboxController(2);

  public Robot(){
    SparkMaxConfig rightMconfig;
    rightMotor.setInverted(true);
    rightMotor.configure(rightMconfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);//burdaki hatayı çözemedim

  }

  @Override
  public void teleopPeriodic(){
   double leftspeed = -controller.getRawAxis(1);
   double rightspeed = -controller.getRawAxis(5);
   leftMotor.set(leftspeed);
   rightMotor.set(rightspeed);
  }
}
