package implementations.wpilib;

import interfaces.EncoderReader;

public class Encoder extends edu.wpi.first.wpilibj.Encoder implements EncoderReader {
	public Encoder(int channelA, int channelB) {
		super(channelA, channelB);
	}
}
