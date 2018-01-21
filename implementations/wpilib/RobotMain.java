package implementations.wpilib;

import edu.wpi.first.wpilibj.IterativeRobot;
import interfaces.ConfigFileReader;
import interfaces.MyRobot;
import interfaces.RobotProvider;

public class RobotMain extends IterativeRobot implements MyRobot {
	private MyRobot robot;

	public RobotMain() {
		try{
			ConfigFileReader.fileName = "/home/lvuser/robotConfig.txt";
			RobotProvider.instance = new WPIRobotProvider();
			this.robot = new com.team766.robot.Robot();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void robotInit() {
		try{
			robot.robotInit();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void disabledInit() {
		try{
			robot.disabledInit();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void autonomousInit() {
		try{
			robot.autonomousInit();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void teleopInit() {
		try{
			robot.teleopInit();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void testInit() {
		try{
			robot.teleopInit();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void disabledPeriodic() {
		try{
			robot.disabledPeriodic();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void autonomousPeriodic() {
		try{
			robot.autonomousPeriodic();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void teleopPeriodic() {
		try{
			robot.teleopPeriodic();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void testPeriodic() {
		try{
			robot.teleopPeriodic();
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}
}