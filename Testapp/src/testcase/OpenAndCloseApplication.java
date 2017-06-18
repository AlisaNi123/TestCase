package testcase;
import java.util.*;
import java.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
public class OpenAndCloseApplication {

	public static void main(String[] args) throws MalformedURLException {
		
		
		// 设置自动化相关参数
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformName", "Android");
        //设置Androind版本
        capabilities.setCapability("platformVersion", "4.4");
        //设置apk的路径
        String apkpath="C://XiaoQi_Android_Fir_Online_release_1.0.0.apk";
        capabilities.setCapability("app",apkpath);
        //设置主包名和主类名
        capabilities.setCapability("appPackage","com.qiwo.sz.robot");
        capabilities.setCapability("appActivity",".activity.WelcomeActivity");
        System.out.println("app安装成功");        
        // 根据 Desired Capabilities 打开应用
        AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);       
        System.out.println("app打开成功");

        
        // 什么都不做，程序暂停5秒    
       try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
        //登录账户
       
      /*
        driver.findElementById("com.newbeeair.cleanser:id/member_login_user_name_edit").sendKeys("18514428818");
        driver.findElementById("com.newbeeair.cleanser:id/member_login_password_edit").sendKeys("123456");
        driver.findElementById("com.newbeeair.cleanser:id/member_login_btn").click();
      */  
       
        driver.quit();
        System.out.println("退出app程序成功");
        
        
	}

}
