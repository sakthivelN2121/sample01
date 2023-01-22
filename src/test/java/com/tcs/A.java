package com.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A  {
	
	 @Test(groups="E2E")
	  public void test1() {
	
		 System.out.println("E2E");

	}
	 @Test(groups="sanity")
	   private void test2() {
		 
		 System.out.println("Sanity");

	}
	 @Test(groups="smoke")
	   private void test3() {
		
		 System.out.println("Smoke");

	}
	 @Test(groups="Reg")
	   private void test4() {
		
		 System.out.println("Reg");
	}
	   
	 
	   

		}
		
		
	


