package implementations.wpilib;

import interfaces.SolenoidController;

public class Solenoid extends edu.wpi.first.wpilibj.Solenoid implements SolenoidController {
	public Solenoid(int channel) {
		super(channel);
	}
}
