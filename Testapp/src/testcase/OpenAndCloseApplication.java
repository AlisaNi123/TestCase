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
		
		
		// �����Զ�����ز���
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformName", "Android");
        //����Androind�汾
        capabilities.setCapability("platformVersion", "4.4");
        //����apk��·��
        String apkpath="C://XiaoQi_Android_Fir_Online_release_1.0.0.apk";
        capabilities.setCapability("app",apkpath);
        //������������������
        capabilities.setCapability("appPackage","com.qiwo.sz.robot");
        capabilities.setCapability("appActivity",".activity.WelcomeActivity");
        System.out.println("app��װ�ɹ�");        
        // ���� Desired Capabilities ��Ӧ��
        AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);       
        System.out.println("app�򿪳ɹ�");

        
        // ʲô��������������ͣ5��    
       try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
        //��¼�˻�
       
      /*
        driver.findElementById("com.newbeeair.cleanser:id/member_login_user_name_edit").sendKeys("18514428818");
        driver.findElementById("com.newbeeair.cleanser:id/member_login_password_edit").sendKeys("123456");
        driver.findElementById("com.newbeeair.cleanser:id/member_login_btn").click();
      */  
       
        driver.quit();
        System.out.println("�˳�app����ɹ�");
        
        
	}

}
