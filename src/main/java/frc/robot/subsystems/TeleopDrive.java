package frc.robot.subsystems;
// ooga boogq
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TeleopDrive extends SubsystemBase{
    private final WPI_TalonSRX leftMaster = new WPI_TalonSRX(3);
    private final WPI_VictorSPX leftSlaveOne = new WPI_VictorSPX(4);
    private final WPI_VictorSPX leftSlaveTwo = new WPI_VictorSPX(5);
    private final WPI_TalonSRX rightMaster = new WPI_TalonSRX(0);
    private final WPI_VictorSPX rightSlaveOne = new WPI_VictorSPX(1);
    private final WPI_VictorSPX rightSlaveTwo = new WPI_VictorSPX(2);
    DifferentialDrive drive;
    
    public TeleopDrive() {
        leftMaster.configFactoryDefault();
        leftSlaveOne.configFactoryDefault();
        leftSlaveTwo.configFactoryDefault();
        rightMaster.configFactoryDefault();
        rightSlaveOne.configFactoryDefault();
        rightSlaveTwo.configFactoryDefault();

        leftSlaveTwo.follow(leftMaster);
        leftSlaveOne.follow(leftMaster);
        rightSlaveTwo.follow(rightMaster);
        rightSlaveOne.follow(rightMaster);
        drive = new DifferentialDrive(leftMaster, rightMaster);
    }

	public void drive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation, true);
        
    }
    
}
