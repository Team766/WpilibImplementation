package implementations.wpilib;

import interfaces.AnalogInputReader;

public class AnalogInput extends edu.wpi.first.wpilibj.AnalogInput implements AnalogInputReader {
	public AnalogInput(int channel) {
		super(channel);
	}
}
