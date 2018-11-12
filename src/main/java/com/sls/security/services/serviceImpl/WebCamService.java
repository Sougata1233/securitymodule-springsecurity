package com.sls.security.services.serviceImpl;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import com.github.sarxos.webcam.WebcamUtils;
import com.github.sarxos.webcam.util.ImageUtils;

@Service
public class WebCamService {
	
	public boolean detectWebCam() {
		boolean flag = false;
		
		Webcam webcam = Webcam.getDefault();
		if(webcam!=null) {
			flag = true;
		}else {
			flag = false;
		}
		System.out.println(webcam);
		return flag;
	}
	
	public void captureImage() {
		Webcam webcam = Webcam.getDefault();
		webcam.open(true);
		WebcamUtils.capture(webcam, "test", ImageUtils.FORMAT_JPG);
		
		byte[] bytes = WebcamUtils.getImageBytes(webcam, ImageUtils.FORMAT_JPG);
		ByteBuffer buffer = WebcamUtils.getImageByteBuffer(webcam, ImageUtils.FORMAT_JPG);
	}
	
	public void saveImage() throws IOException {
			// get default webcam and open it
				Webcam webcam = Webcam.getDefault();
				webcam.open();

				// get image
				BufferedImage image = webcam.getImage();

				// save image to PNG file
				ImageIO.write(image, "PNG", new File("test.png"));
	}
	
	public static void snapImg() throws IOException
	{
		try 
		{
			Webcam wc = Webcam.getDefault();
			wc.open();
			File tgt = new File ("C:/ClassPolicy/cam.png");
			if (tgt.exists()) {
				tgt.delete();
			}
			ImageIO.write(wc.getImage(), "JPG", tgt);
			System.out.println("[CamBot] Successfully snapped a shot!");
		} 
		catch (Exception e)
		{
			System.out.println("[CamBot] Encountered an exception: ");
			 e.printStackTrace();
		}
	}
	
	public void takePic() {
		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();

		Dimension[] nonStandardResolutions = new Dimension[] { WebcamResolution.PAL.getSize(),
				WebcamResolution.VGA.getSize(), new Dimension(2000, 1000), new Dimension(1000, 500), };
		webcam.setCustomViewSizes(nonStandardResolutions);
		webcam.setViewSize(WebcamResolution.VGA.getSize());
		webcam.open();

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
		try {
			ImageIO.write(image, "PNG", new File("src/capture/test.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webcam.close();
	}
	
	public void simpleCapture() throws IOException{
		Webcam webcam = Webcam.getDefault();
		webcam.open();
		ImageIO.write(webcam.getImage(), "JPG", new File("./Test.jpg"));
	}

}
