package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM_Report {
	
	public static void reportGen(String jsonpath) {
		
		
		File f = new File("C:\\Users\\Aravinth MS\\Desktop\\Testing- Selnium\\New folder\\Cucumber12\\target\\CucumberReports");
		
		Configuration con = new Configuration(f, "CucumberPro");
		
		con.addClassifications("Window", "11");
		con.addClassifications("Sprint", "32.33.2");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser version", "103.298.34");
		
		List<String> list = new ArrayList<>();
		
		list.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(list, con);
		r.generateReports();
		
	}

}
