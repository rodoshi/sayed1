package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		 driver.navigate().to("http://www.bluefly.com");
		//	driver.get("http://www.bluefly.com");
		
		 driver.close();

	}

}
