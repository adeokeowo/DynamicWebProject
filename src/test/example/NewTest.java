package test.example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	

public class NewTest {		
 private WebDriver driver;		
 @Test				
 public void testEasy() {	
  driver.get("http://localhost:8080/DynamicWebProject/");  
  String title = driver.getTitle();				 
  AssertJUnit.assertTrue(title.contains("Dynamic web project")); 		
 }
 
 @BeforeTest
 public void beforeTest() {	
  driver = new FirefoxDriver();  
 }
 
 @AfterTest
 public void afterTest() {
  driver.quit();			
 }
 
}	
