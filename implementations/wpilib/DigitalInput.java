package implementations.wpilib;

import interfaces.DigitalInputReader;

public class DigitalInput extends edu.wpi.first.wpilibj.DigitalInput implements DigitalInputReader {
	public DigitalInput(int channel) {
		super(channel);
	}
}
