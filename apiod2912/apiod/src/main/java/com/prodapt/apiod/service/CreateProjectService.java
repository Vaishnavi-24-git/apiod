package com.prodapt.apiod.service;
import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CreateProjectService {

	@Value("${application.base.projectpath}")
	private String projectpath;

	public Boolean createProject(String userName,String project,String yamlPath) throws Exception  {

		try {
			File createDirectory  = new File(projectpath + File.separator +userName+ File.separator +project);
			createDirectory.mkdirs();
//			ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","null >newfile.txt");
			ProcessBuilder pb = new ProcessBuilder("bash","-c","null >newfile.txt");

			pb=pb.directory(new File(projectpath + userName + File.separator + project +File.separator));
			pb.start();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		
	}
}
