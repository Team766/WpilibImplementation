package implementations.wpilib;

import edu.wpi.first.wpilibj.VictorSP;
import interfaces.SpeedController;

public class Victor extends VictorSP implements SpeedController {
	public Victor(int channel) {
		super(channel);
	}
}
