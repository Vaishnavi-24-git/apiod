package com.prodapt.apiod.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;

@Service
public class GenerateJenkinsService {

	
	public Boolean jenkinsFileGeneration(String jenkinsTemplate,String projectpath,String userName,String project) {
		try {		
			Path jenkinsFile =Paths.get(jenkinsTemplate);
			Path Project = Paths.get(projectpath+File.separator +userName+ File.separator +project+ File.separator+ "Jenkinsfile");

			Files.copy(jenkinsFile, Project, StandardCopyOption.REPLACE_EXISTING);
			return true;
		}catch (Exception e) {
			return false;
		}
		

	}

}
