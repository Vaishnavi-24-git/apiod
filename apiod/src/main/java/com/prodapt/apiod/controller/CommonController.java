package com.prodapt.apiod.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class CommonController {

	@GetMapping("/getMessage")
	public final String getMessage() throws IOException {
     String values="Hi..Welcome";
 		return values;
	}
	
	@GetMapping("/")
	public String getDetails() throws IOException {
//		ProcessBuilder processBuilder = new ProcessBuilder("java", "-version");
//
//		processBuilder.redirectErrorStream(true);
//		File log = folder.newFile("java-version.log");
//		processBuilder.redirectOutput(log);
//
//		Process process = processBuilder.start();
//		Process process = new ProcessBuilder("java", "-version").start();
		ProcessBuilder processBuilder = new ProcessBuilder("java", "-version");
		Process process = processBuilder.start();

		return "success";
	}
	
	
	
}
