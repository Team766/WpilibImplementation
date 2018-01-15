package implementations.wpilib;

import interfaces.GyroReader;

public class AnalogGyro extends edu.wpi.first.wpilibj.AnalogGyro implements GyroReader {
	public AnalogGyro(int channel) {
		super(channel);
	}
}
