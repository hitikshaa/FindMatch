package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Match1 {

	
	
	@Test
	//for title
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/");
	    String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "React App";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    Thread.sleep(2000);
		
	    driver.quit();
	  

	}
	
	@Test
	//Login
	public void test2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	   String em=email.getText();
	   System.out.println(em);
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	   String p=password.getText();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   Assert.assertTrue(em.isEmpty());
	   Assert.assertTrue(p.isEmpty());
	   driver.quit();
		}

    @Test
    //SignUp
    public void test3() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000/register");
    driver.manage().window().maximize();
    
    WebElement first_name = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/div[1]/div/div/input"));
    first_name.sendKeys("danial");
    String fname = first_name.getText();
    
    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/div[4]/div/div/input"));
    email.sendKeys("danial@gmail.com");
   String em=email.getText();
   System.out.println(em);
   
   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/div[5]/div/div/input"));
   password.sendKeys("hello123");
   String p=password.getText();
   
   WebElement city = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/div[6]/div/div/input"));
   city.sendKeys("Montreal");
   String city11 = city.getText();
   
   WebElement province = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/div[7]/div/div/input"));
   province.sendKeys("Quebec");
   String province11 = province.getText();
   
   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/button")).click();;
   Thread.sleep(2000);
   
   
   Assert.assertTrue(fname.isEmpty());
   Assert.assertTrue(em.isEmpty());
   Assert.assertTrue(p.isEmpty());
   Assert.assertTrue(city11.isEmpty());
   Assert.assertTrue(province11.isEmpty());
	
   
    driver.quit();
  	
    }
    @Test
    //match profile for specific user 
    public void test4() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
    
    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
    email.sendKeys("test1@example.com");
    String em=email.getText();
    System.out.println(em);
   
    WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
    password.sendKeys("test123");
    String p=password.getText();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[3]/div/div/div")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]")).click();
    String A_name=driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[2]/h1")).getText();
    String E_name = "Jane Doe";
    Assert.assertEquals(A_name, E_name);
    Thread.sleep(3000);
    driver.quit();
    
    
    
    }
    @Test
    //for Login button
    public void test5() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000/");
    driver.manage().window().maximize();
   
    boolean login= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).isDisplayed();
    Assert.assertTrue(login);
    Thread.sleep(500);
    driver.quit();
  
  }
    @Test
    //for signup button on login page
    public void test20() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
    boolean sign_btn= driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/p/a")).isDisplayed();
    Assert.assertTrue(sign_btn);
    Thread.sleep(500);
    driver.quit();

    }
    @Test
    //for findmatch button on login page
    public void test21() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
    boolean sign_btn= driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/p/a")).isDisplayed();
    Assert.assertTrue(sign_btn);
    Thread.sleep(500);
    driver.quit();

    }
  @Test
  //for create account button on home page
  public void test6() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://localhost:3000/");
  driver.manage().window().maximize();
 
  boolean create_acc= driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/button")).isDisplayed();
  Assert.assertTrue(create_acc);
  Thread.sleep(500);
  driver.quit();
 
  }
  
  @Test
  //for header findmatch button on home page
  public void test7() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://localhost:3000/");
  driver.manage().window().maximize();
 
  boolean header_btn= driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div/div[1]/a")).isDisplayed();
  Assert.assertTrue(header_btn);
  Thread.sleep(500);
  driver.quit();

  }
  @Test
	//register button
	public void test8() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/register");
	    driver.manage().window().maximize();

	    boolean register_btn=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/form/div/div[1]/button")).isDisplayed();;
	    Assert.assertTrue(register_btn);
	    Thread.sleep(2000);
	   
	   
	   driver.quit();
		}
  @Test
//Login with invalid password
public void test9() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:3000/login");
    driver.manage().window().maximize();
    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
    email.sendKeys("v@gmail.com");
   String em=email.getText();
   System.out.println(em);
   
   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
   password.sendKeys("test12");
   String p=password.getText();
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
   Thread.sleep(2000);
   driver.findElement(By.xpath("html/body/div/div[2]/div/div/button")).click();
   Assert.assertTrue(em.isEmpty());
   Assert.assertTrue(p.isEmpty());
   driver.quit();
  }
  @Test
  //message button

  public void test10() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
	    
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	    WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	    password.sendKeys("test123");
	     driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();		  
	    Thread.sleep(2000);
	    boolean msg_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[2]")).isDisplayed();
	    Thread.sleep(2000);
        Assert.assertTrue(msg_btn);
	    Thread.sleep(2000);
	   
	   
	  driver.quit();
	  
  }
  @Test
  //match button

  public void test11() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
	    
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	    WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	    password.sendKeys("test123");
	     driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();		  
	    Thread.sleep(2000);
	    boolean match_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[1]")).isDisplayed();
	    Thread.sleep(2000);
        Assert.assertTrue(match_btn);
	    Thread.sleep(2000);
	   
	   
	  driver.quit();
	  
  }
  @Test
  //back button 
  public void test12() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://localhost:3000");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  
  WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
  email.sendKeys("test1@example.com");
  String em=email.getText();
  System.out.println(em);
 
  WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
  password.sendKeys("test123");
  String p=password.getText();
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[3]/div/div/div")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]")).click();
  Thread.sleep(2000);
  boolean back_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/button")).isDisplayed();
  Thread.sleep(2000);
  Assert.assertTrue(back_btn);
  Thread.sleep(2000);
 
 
  driver.quit();
  
  }
 
	//Logout button
    @Test
	public void test13() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   
	   boolean logout_btn=  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).isDisplayed();
	   Thread.sleep(2000);
	   Assert.assertTrue(logout_btn);
	   Thread.sleep(2000);
	   driver.quit();
}
   
  //User name button
    @Test
	public void test14() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   
	   boolean user_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).isDisplayed();
	   Thread.sleep(2000);
	   Assert.assertTrue(user_btn);
	   Thread.sleep(2000);
	   driver.quit();
}
    
    
    //save button 
    @Test
	public void test15() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).click();
	   Thread.sleep(2000);
	   boolean save_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/button")).isDisplayed();
	   Thread.sleep(2000);
	   Assert.assertTrue(save_btn);
	   Thread.sleep(2000);
	   driver.quit();
}
    
  //Review button
    @Test
	public void test16() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   
	   boolean Review_btn=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/div[4]/span[4]")).isDisplayed();
	   Thread.sleep(2000);
	   Assert.assertTrue(Review_btn);
	   Thread.sleep(2000);
	   driver.quit();
}
    //Review data
    @Test
	public void test19() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("v@gmail.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/div[4]/span[4]")).click();
	   Thread.sleep(2000);
	   WebElement review =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div[1]/div/div/div/textarea[1]"));
	   review.click();
	   review.sendKeys("I am so grateful to this website ");
	   Thread.sleep(2000);
	   String rv=review.getText();
	   Thread.sleep(2000);
	   WebElement radio =  driver.findElement(By.cssSelector("#mui-24"));          
			   
	   Thread.sleep(2000);
	   Assert.assertTrue(rv.isEmpty());
	   driver.quit();
}
    //Messsage
    @Test
	public void test22() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[3]/ul/div[1]/div/div[2]/span")).click();
	   WebElement msg =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/form/div/div/input"));
	   msg.click();
	   
	   msg.sendKeys("How are you? ");
	   Thread.sleep(2000);
	   driver.manage().window().minimize();
	   Thread.sleep(3000);
//	   WebElement textbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/form/div/button"));
//	   textbox.sendKeys(Keys.ENTER);
     // driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/form/div/button")).click();
	   String ms=msg.getText();
	   Thread.sleep(2000);
	   Assert.assertTrue(ms.isEmpty());
	   driver.quit();
}
  //Messsage to specific user
    @Test
	public void test23() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[3]/ul/div[1]/div/div[2]/span")).click();
	   String A_name=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/ul/div[1]/div/div[2]/span")).getText();
	    String E_name = "Jane Doe";
	    Assert.assertEquals(A_name, E_name);
	    Thread.sleep(3000);
	 

	   driver.quit();
} 
    
    //profile update 
    @Test
	public void test24() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).click();
	   Thread.sleep(2000);
	   
	   WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[5]/div/div/input"));
	   Actions action = new Actions(driver);
	   action.click(element).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element.sendKeys("Montreal");

	   Thread.sleep(2000); 
	   WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[6]/div/div/input"));
	   Actions action1 = new Actions(driver);
	   action1.click(element1).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element1.sendKeys("Quebec");

	   Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/button")).click();
	   
	   Thread.sleep(2000);
	   driver.quit();
}
    //Bio update
    @Test
  	public void test25() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/login");
  	    driver.manage().window().maximize();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
  	    email.sendKeys("test1@example.com");
  	 
  	   
  	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
  	   password.sendKeys("test123");
  	  
  	   Thread.sleep(2000);
  	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
  	   Thread.sleep(2000);
  	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).click();
  	   Thread.sleep(2000);
  	   
  	   WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[2]/div/div/div/textarea[1]"));
  	   String bio=element1.getText();
  	   
  	   Actions action1 = new Actions(driver);
  	   action1.click(element1).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
  	   Thread.sleep(2000);
  	   element1.sendKeys("Young and Energetic Person");

  	   Thread.sleep(2000);
  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/button")).click();
  	    Assert.assertFalse(bio.isEmpty());
  	   Thread.sleep(2000);
  	   driver.quit();
  }
//liked profiles
 
    @Test
	public void test26() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[3]/div/div/div")).click();
       String A_url=driver.getCurrentUrl();
       String E_url="http://localhost:3000/feed/liked_profiles";
       Thread.sleep(2000);
       Assert.assertEquals(A_url,E_url);
       Thread.sleep(2000);
	   driver.quit();
}
    //admin login
    @Test
	
	public void test27() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	   String em=email.getText();
	   System.out.println(em);
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	   String p=password.getText();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();;
	   Thread.sleep(2000);
	   Assert.assertTrue(em.isEmpty());
	   Assert.assertTrue(p.isEmpty());
	   driver.quit();
		}
  //manage user page
    
    @Test
	public void test28() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/div[1]/div/span")).click();
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]")).click();
       WebElement name1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[1]/div/div/input"));
       String A_name=name1.getText();
      String E_name="Chris Liams";
       String E_url="http://localhost:3000/admin";
       Thread.sleep(2000);
     //  Assert.assertEquals(A_name,E_name);
       Thread.sleep(2000);
	   driver.quit();
}
  //manage user review
    
    @Test
	public void test29() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/div[2]/div/span")).click();
       WebElement reviw=driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/div/div[1]/div/div/div/textarea[1]"));
       String rv=reviw.getText();
       Thread.sleep(2000);
       Assert.assertFalse(rv.isEmpty());

       Thread.sleep(2000);
	   driver.quit();
}
  //admin name
    
    @Test
	public void test30() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	
      
       WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p"));
       String A_name=name.getText();
       String E_name="Admin User";
       Thread.sleep(2000);
       Assert.assertEquals(A_name,E_name);

       Thread.sleep(2000);
	   driver.quit();
}
 //user name
    
    @Test
	public void test31() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button"));
	   login.sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	
      
       WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p"));
       String A_name=name.getText();
       String E_name="Chris Liams";
       Thread.sleep(2000);
       Assert.assertEquals(A_name,E_name);

       Thread.sleep(2000);
	   driver.quit();
}
  //admin profile update 
    @Test
	public void test32() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).click();
	   Thread.sleep(2000);
	   
	   WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[5]/div/div/input"));
	   Actions action = new Actions(driver);
	   action.click(element).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element.sendKeys("Montreal");

	   Thread.sleep(2000); 
	   WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[6]/div/div/input"));
	   Actions action1 = new Actions(driver);
	   action1.click(element1).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element1.sendKeys("Quebec");

	   Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/button")).click();
	   
	   Thread.sleep(2000);
	   driver.quit();
}
    //user profile update 
    @Test
	public void test33() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/ul/div[1]/div/span")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]")).click();
	   Thread.sleep(2000);
	   WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[5]/div/div/input"));
	   Actions action = new Actions(driver);
	   action.click(element).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element.sendKeys("Montreal");

	   Thread.sleep(2000); 
	   WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/div[6]/div/div/input"));
	   Actions action1 = new Actions(driver);
	   action1.click(element1).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	   Thread.sleep(2000);
	   element1.sendKeys("Quebec");

	   Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div/div/form/div/div[1]/button")).click();
	   
	   Thread.sleep(2000);
	   driver.quit();
}
      //admin profile url
    @Test
	public void test34() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/login");
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	  WebElement url= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p"));
	   Thread.sleep(2000);
	   url.click();
	   Thread.sleep(2000);
	   String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/admin/profile";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
	   Thread.sleep(2000);
	   driver.quit();
}
    @Test
	//for homepage url
	public void test35() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:3000/");
	    String A_url=driver.getCurrentUrl();
		   String E_url="http://localhost:3000/";
		   Thread.sleep(2000);
		   Assert.assertEquals(A_url,E_url); 
	    Thread.sleep(2000);
		
	    driver.quit();
	  

	}
    @Test
  	//for register page url
  	public void test36() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/button")).click();
  	    
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/register";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for login page url
  	public void test37() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/login";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for match page url
  	public void test39() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/feed";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for user page for admin url
  	public void test38() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/admin";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for message page url
  	public void test40() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[2]")).click();
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/feed/messages";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for message to particular user  page url
  	public void test41() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/button[2]")).click();
  	    Thread.sleep(2000);
  	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[3]/ul/div[1]/div/div[2]/span")).click();
	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/feed/messages/4";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for user profie  page url
  	public void test42() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/a/p")).click();
  	    Thread.sleep(2000);
  	  
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/feed/profile";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for review  page url
  	public void test43() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("test1@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("test123");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/div[4]/span[4]")).click();
  	    Thread.sleep(2000);
  	  
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/review";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
    @Test
  	//for user page for admin url
  	public void test44() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\driver\\chromedriver.exe");
  	    WebDriver driver = new ChromeDriver();
  	    driver.get("http://localhost:3000/");
  	    driver.manage().window().maximize();

  	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/button/span[1]")).click();
  	    WebElement email = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[1]/div/div/input"));
	    email.sendKeys("admin@example.com");
	 
	   
	   WebElement password=  driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/div[2]/div/div/input"));
	   password.sendKeys("123456");
	  
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/form/div/button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/div/div[1]")).click();
  	    Thread.sleep(2000);
  	  String A_url=driver.getCurrentUrl();
	   String E_url="http://localhost:3000/admin";
	   Thread.sleep(2000);
	   Assert.assertEquals(A_url,E_url); 
   Thread.sleep(2000);
  	   
  	   driver.quit();
  		}
	
}
