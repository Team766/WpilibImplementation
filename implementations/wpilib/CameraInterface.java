package implementations.wpilib;

import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.CameraServer;
import interfaces.VidSourceInterface;
import lib.LogFactory;
import lib.Logger;
import lib.Logger.Level;

import org.opencv.core.Mat;

public class CameraInterface implements interfaces.CameraInterface {

	private CvSource vidSource;

	@Override
	public void startAutomaticCapture() {
		try{
			CameraServer.getInstance().startAutomaticCapture(VideoSource.enumerateSources()[0]);
		} catch(Exception e){
			LogFactory.getInstance("Camera").log(Level.ERROR, e.toString());
		}
	}

	@Override
	public void getFrame(Mat img) {
		CameraServer.getInstance().getVideo().grabFrame(img);
	}

	@Override
	public void putFrame(Mat img){
		if(vidSource == null){
			vidSource = CameraServer.getInstance().putVideo("VisionTracking", img.width(), img.height());
		}

		vidSource.putFrame(img);
	}
}
