package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticTest extends SubsystemBase {

    DoubleSolenoid pistonArm;

    /**
     * Creates a new PneumaticTest Subsystem.
     */
    public PneumaticTest() {
        pistonArm = new DoubleSolenoid(49, 0, 1);
  }

    public void forward(){
        pistonArm.set(Value.kForward);
    }

    public void reverse(){
        pistonArm.set(Value.kReverse);
    }

    public void off(){
        pistonArm.set(Value.kOff);
    }
}