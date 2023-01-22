package com.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class B {
	
	
	
	 @Test
	  public void test1() {
	
		 System.out.println("test1");

	}
	 @Test
	   private void test2() {
		 
		 System.out.println("test2");

	}
	 @Test
	   private void test3() {
		
		 
		 Assert.assertTrue(false);
	}
	 @Test
	   private void test4() {
		
		 System.out.println("test4");
	}
	
	
	
	
	
	
	
	
	
	/*@Parameters({"userName","passWord","hLocation","hotel","rType","noRooms",
		          "adult","child","fName","laName","addr","cNum","cType","expMo",
		          "expYe","cvvNum"})

	 @Test
	    public void test1(String s,String s1,String s2,int s3,int s4,int s5,int s6,int s7,String fn,String ln,
	    		          String ad,String cn,int ct,int em,int ey,String cvv) {
	    	
	    	System.out.println(s);
	    	System.out.println(s1);
	    	
	    	WebDriverManager.firefoxdriver().setup();
	    	WebDriver driver = new FirefoxDriver();
	    	driver.get("http://adactinhotelapp.com/");
	    	
	    	WebElement txtUser = driver.findElement(By.id("username"));
	    	txtUser.sendKeys(s);
	    	
	    	WebElement txtPass = driver.findElement(By.id("password"));
	        txtPass.sendKeys(s1);
	        
	        WebElement login = driver.findElement(By.id("login"));
	        login.click();
	        
	        WebElement hLoc = driver.findElement(By.id("location"));
	        Select slc = new Select(hLoc);
	        slc.selectByVisibleText(s2);
	        
	        WebElement hotel = driver.findElement(By.id("hotels"));
	        Select slc1 = new Select(hotel);
	        slc1.selectByIndex(s3);
	       
	        WebElement rType = driver.findElement(By.id("room_type"));
	        Select slc3 = new Select(rType);
	        slc3.selectByIndex(s4);
	        
	        WebElement nos = driver.findElement(By.id("room_nos"));
	        Select slc4 = new Select(nos);
	        slc4.selectByIndex(s5);
	        
	        WebElement adult = driver.findElement(By.id("adult_room"));
	        Select scl5 = new Select(adult);
	        scl5.selectByIndex(s6);
	        
	        WebElement child = driver.findElement(By.id("child_room"));
	        Select slc6 = new Select(child);
	        slc6.selectByIndex(s7);
	        
	        WebElement fBtn = driver.findElement(By.xpath("//input[@class='reg_button'][1]"));
	        fBtn.click();
	        
	        WebElement rdBtn = driver.findElement(By.id("radiobutton_0"));
	        rdBtn.click();
	        
	        WebElement cont = driver.findElement(By.id("continue"));
	        cont.click();
	        
	        WebElement fName = driver.findElement(By.id("first_name"));
	        fName.sendKeys(fn);
	        
	        WebElement lName = driver.findElement(By.id("last_name"));
	        lName.sendKeys(ln);
	        
	        WebElement add = driver.findElement(By.id("address"));
	        add.sendKeys(ad);
	        
	         WebElement cNum = driver.findElement(By.id("cc_num"));
	        cNum.sendKeys(cn);
	        
	        WebElement cTyp = driver.findElement(By.id("cc_type"));
	        Select sl1 = new Select(cTyp);
	        sl1.selectByIndex(ct);
	        
	        WebElement expm = driver.findElement(By.id("cc_exp_month"));
	        Select sl2 = new Select(expm);
	        sl2.selectByIndex(em);
	        
	        WebElement expy = driver.findElement(By.id("cc_exp_year"));
	        Select sl3 = new Select(expy);
	        sl3.selectByIndex(ey);
	        
	        WebElement cvv1 = driver.findElement(By.id("cc_cvv"));
	        cvv1.sendKeys(cvv);
	        
	        WebElement bkBtn = driver.findElement(By.id("book_now"));
	        bkBtn.click();*/
	        
	        
		}
	    
	   
	    

