package test_case;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 //import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class srceenshot {
	public static void snapshot(TakesScreenshot drivername, String filename)
	   {
	      
     //截图方法需要两个参数，一个是drivename，另一个是filename		
	    File scrFile = drivername.getScreenshotAs(OutputType.FILE);
	    		     	          
     // Now you can do whatever you need to do with it, for example copy somewhere 
     //将截图放到某个目录下的位置
	    		try {
	            System.out.println("save snapshot path is:c:/"+filename);
	            FileUtils.copyFile(scrFile, new File("c:\\"+filename));
	        } catch (IOException e) {
	          // TODO Auto-generated catch block
	             System.out.println("Can't save screenshot");
	             e.printStackTrace();
	         } 
	          finally
	          {
	            System.out.println("screen shot finished");
	        }
	   }
	  
	     public static void main (String [] args) throws InterruptedException
	     {
	          
	      
	        // String URL="http://www.baidu.com";
	    	 //打开火狐浏览器
	       
	         WebDriver driver=new FirefoxDriver();
	    	 Navigation fireNav=driver.navigate();
	    	 fireNav.to("http://www.baidu.com");
	    	
	    	 //max size the browser 
	        driver.manage().window().maximize(); 
	   
	          Thread.sleep(2000);
	          snapshot((TakesScreenshot)driver,"open_baidu.png");
	         //WebElement reg=driver.findElement(By.name("tj_reg"));
	          //reg.click();
	         //    WebElement keyWord = driver.findElement(By.id("kw1"));
	         
	          //find the element input “hello word”
	         WebElement keyWord = driver.findElement(By.id("kw"));
	          keyWord.clear();
	          //send key words 
	         keyWord.sendKeys("hello world");
	        // 等待3s
	         Thread.sleep(3000);
	        //截图且命名未 “input_keyWord.png”
	          snapshot((TakesScreenshot)driver,"input_keyWord.png");
	          
	 
	       
	           WebElement submit = driver.findElement(By.id("su"));
	          
	          System.out.println(submit.getLocation());
	          submit.click();
	          
	            //System.out.println(driver.getWindowHandle());
	         Thread.sleep(5000);
	          
	         // System.out.println(driver.getPageSource());
	         
	         String pageSource=driver.getPageSource();
	        //  System.out.println(pageSource);
	         //WebElement link =driver.findElement(By.xpath(SELENIUM_LINK));
	          WebElement link =driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));     //*[@id="1"]/h3/a 搜索的第一条信息xpath
	          link.click();
	      Thread.sleep(5000); 
	          driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
	    
	        //get page title 
	        System.out.println(driver.getTitle());
	          Thread.sleep(5000);
	        // navigation.back();
	           snapshot((TakesScreenshot)driver,"open_bake.png");
	         System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
	        
	          driver.quit();
	          
	        
	     }	
	
}
