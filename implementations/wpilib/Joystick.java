package implementations.wpilib;

import interfaces.JoystickReader;

public class Joystick extends edu.wpi.first.wpilibj.Joystick implements JoystickReader {
	public Joystick(int port) {
		super(port);
	}
}
