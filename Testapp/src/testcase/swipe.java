package testcase;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class swipe {
	
       
        	       	
        	/**
             * This Method for swipe up
             * @param driver
             * @param during
             */
            public void swipeToUp(AndroidDriver driver, int during) {
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
                // wait for page loading
            }

            /**
             * This Method for swipe down
             * @param driver
             * @param during
             */
            public void swipeToDown(AndroidDriver driver, int during) {
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
                // wait for page loading
            }

            /**
             * This Method for swipe Left
             * @param driver
             * @param during
             */
            public void swipeToLeft(AndroidDriver driver, int during) {
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
                // wait for page loading
            }

            /**
             * This Method for swipe Right
             * @param driver
             * @param during
             */
            public void swipeToRight(AndroidDriver driver, int during) {
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
                // wait for page loading
            }
            }


