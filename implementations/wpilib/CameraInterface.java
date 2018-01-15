package implementations.wpilib;

import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.CameraServer;
import interfaces.VidSourceInterface;
import org.opencv.core.Mat;

public class CameraInterface implements interfaces.CameraInterface {

	private CvSource vidSource;

	@Override
	public void startAutomaticCapture(VidSourceInterface camera) {
		for (VideoSource source : VideoSource.enumerateSources()) {
			if (source.getName() == camera.getName()) {
				CameraServer.getInstance().startAutomaticCapture(source);
				return;
			}
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
