package test_case;
import java.io.File;
import java.sql.DriverManager;

import org.openqa.selenium.ie.*;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
public class web {
	
 public static void main(String[] args){
	//打开火狐浏览器
	 
	 FirefoxProfile profile = new FirefoxProfile();
	 
	  WebDriver firefox=new FirefoxDriver(profile);
	 Navigation fireNav=firefox.navigate();
	
	 //打开百度
	 fireNav.to("http://www.baidu.com");
	 
	//打开百度地图
	 firefox.findElement(By.name("tj_trmap")).click();
	 
	 /*
	 firefox.manage().window().maximize();
	 fireNav.to("http://www.baidu.com");
	 
	 fireNav.to("http://www.sogou.com");
	 
	 fireNav.back();
	 */
	 
	 try{
		 Thread.sleep(2000);
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
	 
	 //清除输入框
	 firefox.findElement(By.id("sole-input")).clear();
	 //在输入框输入“tiananmen”
	 firefox.findElement(By.id("sole-input")).sendKeys("tiananmen");
	 //点击搜索
	 firefox.findElement(By.xpath("/html/body/div[1]/div[2]/div/button")).click();
	 
	 try{
		 Thread.sleep(2000);
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
	 
	 //选择位置“天安门”,并去这
	 firefox.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li")).findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]/li/div/ul/li[1]")).click();
	 firefox.findElement(By.xpath("/html/body/div[1]/div[2]/ul[3]/li/div/div[1]/div/div/div[2]/div[1]/span[2]")).click();
	 
	 //输入起始位置
	 firefox.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/input")).clear();
	 firefox.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/input")).sendKeys("鸟巢");
	 firefox.findElement(By.id("search-button")).click();
	 
	 try{
		 Thread.sleep(5000);
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
	  
	 
	 System.out.println(firefox.getTitle());
	 System.out.println(firefox.getCurrentUrl());
	 //fireNav.refresh();
	 
	 try{
		 Thread.sleep(2000);
	 }catch(InterruptedException e){
		 e.printStackTrace();
	 }
	 //fireNav.forward();
	 firefox.close();
 }
}
 
