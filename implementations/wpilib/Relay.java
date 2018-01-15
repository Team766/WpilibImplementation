package implementations.wpilib;

import interfaces.RelayOutput;
import lib.LogFactory;
import lib.Logger;

public class Relay extends edu.wpi.first.wpilibj.Relay implements RelayOutput {
	public Relay(int channel) {
		super(channel);
	}

	@Override
	public void set(interfaces.RelayOutput.Value value) {
		edu.wpi.first.wpilibj.Relay.Value wpi_value = null;
		switch (value) {
		case kOff:
			wpi_value = edu.wpi.first.wpilibj.Relay.Value.kOff;
			break;
		case kOn:
			wpi_value = edu.wpi.first.wpilibj.Relay.Value.kOn;
			break;
		case kForward:
			wpi_value = edu.wpi.first.wpilibj.Relay.Value.kForward;
			break;
		case kReverse:
			wpi_value = edu.wpi.first.wpilibj.Relay.Value.kReverse;
			break;
		}
		if (wpi_value == null) {
			LogFactory.getInstance("WpilibImplementation").log(
					Logger.Level.ERROR,
					"Relay value is not translatable: " + value);
			wpi_value = edu.wpi.first.wpilibj.Relay.Value.kOff;
		}
		super.set(wpi_value);
	}
}
