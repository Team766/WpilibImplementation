package implementations.wpilib;

import edu.wpi.first.wpilibj.SPI;
import interfaces.GyroReader;

public class ADXRS450_Gyro extends edu.wpi.first.wpilibj.ADXRS450_Gyro implements GyroReader {
	public ADXRS450_Gyro(SPI.Port port) {
		super(port);
	}
}
