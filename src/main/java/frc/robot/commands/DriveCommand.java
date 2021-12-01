package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.TeleopDrive;

public class DriveCommand extends CommandBase{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.Singularfield"})
    private final TeleopDrive m_subsystem;
    private XboxController controller = new XboxController(0);
    
    public DriveCommand(TeleopDrive teleopDrive) {
        m_subsystem = teleopDrive;
        addRequirements(teleopDrive);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        m_subsystem.drive(-controller.getY(Hand.kLeft), controller.getX(Hand.kRight));
        
    }

    @Override
    public void end(boolean interrupted) {}


    @Override
    public boolean isFinished() {
        return false;

    }

    
}