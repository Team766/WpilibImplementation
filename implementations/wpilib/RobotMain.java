package implementations.wpilib;

import edu.wpi.first.wpilibj.IterativeRobot;
import interfaces.MyRobot;
import interfaces.RobotProvider;

public class RobotMain extends IterativeRobot implements MyRobot {
	private MyRobot robot;

	public RobotMain() {
		RobotProvider.instance = new WPIRobotProvider();
		this.robot = new com.team766.robot.Robot();
	}

	@Override
	public void robotInit() {
		robot.robotInit();
	}

	@Override
	public void disabledInit() {
		robot.disabledInit();
	}

	@Override
	public void autonomousInit() {
		robot.autonomousInit();
	}

	@Override
	public void teleopInit() {
		robot.teleopInit();
	}

	@Override
	public void testInit() {
		robot.teleopInit();
	}

	@Override
	public void disabledPeriodic() {
		robot.disabledPeriodic();
	}

	@Override
	public void autonomousPeriodic() {
		robot.autonomousPeriodic();
	}

	@Override
	public void teleopPeriodic() {
		robot.teleopPeriodic();
	}

	@Override
	public void testPeriodic() {
		robot.teleopPeriodic();
	}
}