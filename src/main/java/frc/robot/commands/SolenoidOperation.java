package frc.robot.commands;

import frc.robot.subsystems.PneumaticTest;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 *
 */
public class SolenoidOperation extends CommandBase {
	
    private final PneumaticTest pneumaticTest;
    private final Compressor compressor;
    private final int operateAction;
	
    /**
    * Creates a new ExampleCommand.
    *
    * @param subsystem The subsystem used by this command.
    */
    public SolenoidOperation(PneumaticTest subsystem, int action) {
        pneumaticTest = subsystem;
        operateAction = action;
        compressor = new Compressor(49);
        compressor.close();    
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        switch (operateAction) {
            case 0:
                pneumaticTest.forward();
                break;
            case 1:
                pneumaticTest.reverse();
                break;
            case 2:
                pneumaticTest.off();
                break;
        }
    }
}