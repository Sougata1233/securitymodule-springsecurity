package com.sls.security.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sls.security.services.serviceImpl.WebCamService;

@RestController
@RequestMapping("webcam")
public class WebCamController {
	
	@Autowired
	WebCamService webcamService;
	
	@GetMapping("/")
	public boolean getWebCamDetection() {
		return webcamService.detectWebCam();
	}
	
	@GetMapping("/capture")
	public void captureImage() {
		webcamService.captureImage();
	}
	
	@PostMapping("/saveimage")
	public void saveImage() throws IOException {
		webcamService.takePic();
	}

}
