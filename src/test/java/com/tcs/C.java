package com.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.Test;

public class C {
	
	@DataProvider(name="result")
	
	public static Object[][] test12() {
		
	return new Object[][] {{"arul","arul@123"},
		              {"sakthi","sakthi@123"}};
					}

}
//this is dataprovider code syntax