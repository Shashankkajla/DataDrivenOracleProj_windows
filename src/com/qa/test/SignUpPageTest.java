package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.env.TestData;
import com.qa.testutil.Xls_Reader;

public class SignUpPageTest {
	
	WebDriver driver;
	Xls_Reader reader = new Xls_Reader("D:\\FrameWorks\\DataDriven\\src\\com\\qa\\testdata\\OracleTestData.xlsx");
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\browserexe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(TestData.url);
		
	}
	
	@Test
	public void signUpTest(){
		
		
		 /** This is just to read the data from excel file now we will learn how to parameterized your test cases, it not a good approach 
		 * 
		 * String emailadd = reader.getCellData("OracleReg", "emailaddress", 2);
		System.out.println(emailadd);
		String pwd = reader.getCellData("OracleReg", "password", 2);
		System.out.println(pwd);
        String repwd = reader.getCellData("OracleReg", "retypepassword", 2);		
        System.out.println(repwd);
        String country = reader.getCellData("OracleReg", "country", 2);		
        System.out.println(country);
        String fname = reader.getCellData("OracleReg", "name", 2);		
        System.out.println(fname);
        String lastName = reader.getCellData("OracleReg", "lastName", 2);		
        System.out.println(lastName);
        String jobTitle = reader.getCellData("OracleReg", "jobTitle", 2);		
        System.out.println(jobTitle);
        String workPhone = reader.getCellData("OracleReg", "workPhone", 2);		
        System.out.println(workPhone);
        String compName = reader.getCellData("OracleReg", "compName", 2);		
        System.out.println(compName);
        String add1 = reader.getCellData("OracleReg", "add1", 2);		
        System.out.println(add1);
        String add2 = reader.getCellData("OracleReg", "add2", 2);		
        System.out.println(add2);
        String state = reader.getCellData("OracleReg", "state", 2);		
        System.out.println(state);
        String postalcode = reader.getCellData("OracleReg", "postalcode", 2);		
        System.out.println(postalcode);
        
         --> // Return Type of getCellData(SheetName, ConlName, RowNum) 
         method is string so storing it in string class
    
        
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailadd);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='retypePassword']")).sendKeys("repwd");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select.selectByVisibleText(country);
	
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys(jobTitle);
		driver.findElement(By.xpath("//input[@name='workPhone']")).sendKeys(workPhone);
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys(compName);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(add1);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(add2);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("");
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		select1.selectByVisibleText(state);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
		driver.findElement(By.xpath("//tbody/tr[29]/td[2]/div[1]/a[1]")).click();
      
*/
		
// 2. Now i Have to register with multiple users So what we have to do now, Accg. to previous approach we have to create again and again
// So better to use Data provider or Forloop approach to fetch data.
		
 //We know 6 rows are there but actual data starting from row no. 2	
		
		int total_rowCount = reader.getRowCount("OracleReg"); //Sheetname
		System.out.println(total_rowCount);
		
		
		// 2 Session : Call add column method before the for loop 
		 reader.addColumn("OracleReg", "Status");
		
		
		for(int rowNum =2; rowNum<=total_rowCount; rowNum++)
		{
			String emailadd = reader.getCellData("OracleReg", "emailaddress", rowNum);
			System.out.println(emailadd);
			String pwd = reader.getCellData("OracleReg", "password", rowNum);
			System.out.println(pwd);
	        String repwd = reader.getCellData("OracleReg", "retypepassword", rowNum);		
	        System.out.println(repwd);
	        String country = reader.getCellData("OracleReg", "country", rowNum);		
	        System.out.println(country);
	        String fname = reader.getCellData("OracleReg", "name", rowNum);		
	        System.out.println(fname);
	        String lastName = reader.getCellData("OracleReg", "lastName", rowNum);		
	        System.out.println(lastName);
	        String jobTitle = reader.getCellData("OracleReg", "jobTitle", rowNum);		
	        System.out.println(jobTitle);
	        String workPhone = reader.getCellData("OracleReg", "workPhone", rowNum);		
	        System.out.println(workPhone);
	        String compName = reader.getCellData("OracleReg", "compName", rowNum);		
	        System.out.println(compName);
	        String add1 = reader.getCellData("OracleReg", "add1", rowNum);		
	        System.out.println(add1);
	        String add2 = reader.getCellData("OracleReg", "add2", rowNum);		
	        System.out.println(add2);
	        String state = reader.getCellData("OracleReg", "state", rowNum);		
	        System.out.println(state);
	        String postalcode = reader.getCellData("OracleReg", "postalcode", rowNum);		
	        System.out.println(postalcode);
	        
	        driver.findElement(By.xpath("//input[@name='email']")).clear();
	        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailadd);
	        
			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);

			driver.findElement(By.xpath("//input[@name='retypePassword']")).clear();
			driver.findElement(By.xpath("//input[@name='retypePassword']")).sendKeys("repwd");
			
			
			Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			select.selectByVisibleText(country);
		
			driver.findElement(By.xpath("//input[@name='firstName']")).clear();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
			
			driver.findElement(By.xpath("//input[@name='lastName']")).clear();
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
			
			driver.findElement(By.xpath("//input[@name='jobTitle']")).clear();
			driver.findElement(By.xpath("//input[@name='jobTitle']")).sendKeys(jobTitle);
			
			driver.findElement(By.xpath("//input[@name='workPhone']")).clear();
			driver.findElement(By.xpath("//input[@name='workPhone']")).sendKeys(workPhone);
			
			driver.findElement(By.xpath("//input[@name='companyName']")).clear();
			driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys(compName);
			
			driver.findElement(By.xpath("//input[@name='address1']")).clear();
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(add1);
			
			driver.findElement(By.xpath("//input[@name='address2']")).clear();
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(add2);
			
			Select select1 = new Select(driver.findElement(By.xpath("//select[@name='state']")));
			select1.selectByVisibleText(state);
			
			driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
			driver.findElement(By.xpath("//tbody/tr[29]/td[2]/div[1]/a[1]")).click();
			
			
// 1.Problm is there is that it will launching 5 browsers bcz there are 5 set of data tomorow lets see there are 100 set of data it will launch 
// 100 browsers So need to optimize code So write code above for loop instead of wrinting inside for loop
// 2. Now the problm is value 5 values is given to a field in 1 shot by 1 by 1, So to over come 
// we need to clear the field value. using clear() & then enter.			
// Note clear() method is only applicable for text fields no need to perform it on dropdown			
			
			
	//2 Session :
			reader.setCellData("OracleReg", "Status", rowNum, "Pass"); // write data into cell 
			
			
		}
		
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
