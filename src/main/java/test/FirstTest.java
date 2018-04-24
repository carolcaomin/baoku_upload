package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Driver;
import java.sql.DriverAction;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ActionChainExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.glodon.autotest.web.framework.util.ThreadUtil;
import com.google.common.collect.ImmutableBiMap.Builder;

import page.FirstPage;
/*
 * 登录保库达人
 */
public class FirstTest {
	static FirstPage firstPage;
	static WebDriver driver;
	static WebDriverWait wait;
	private static final Logger logger = LoggerFactory.getLogger(InitTest.class);
	
	@Parameters({"systemUrl","telNum","VerificationCode"})
	@Test
	public void firstOperate(String systemUrl,String telNum,String VerificationCode) {
		firstPage=InitTest.settingUtil.getPage(FirstPage.class);
		driver = firstPage.getEngine().getDriver();
				
		Properties prop = new Properties();  
		  try {
			prop.load(new FileInputStream("./src/main/resources/properties/engine.properties"));
		  } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		  } catch (IOException e1) {
			e1.printStackTrace();
		  }
		 
		  firstPage=InitTest.settingUtil.getPage(FirstPage.class);
		  try {
			firstPage.putData("param.url",new String(prop.getProperty(systemUrl).getBytes("ISO-8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		  
		  // 打开登录页面
		  firstPage.open();
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  
		  //切换成F12		  
		  //WebElement btn = driver.findElement(By.id("app"));
		  //btn.sendKeys(Keys.F12);
		  //WebElement btn=driver.findElement(By.xpath("//span[text()='首页']"));
		  //btn.click();
		  
		  //点击首页
		  //firstPage.getFirstButton().click();
		  //输入手机号
		  firstPage.getTelNum().getValueEditor().setValue(firstPage.getTelNum(),telNum);
		  //输入验证码
		  firstPage.getVerificationCode().getValueEditor().setValue(firstPage.getVerificationCode(),VerificationCode);
		  //登录
		  firstPage.getLoginBtn().click();
		  ThreadUtil.silentSleep(3000);
		  logger.info("-------firstOperate succesful!");
		  //刷新浏览器
		  //driver.navigate().refresh();
		  
		  //等待登录页面加载完成
		  //wait = new WebDriverWait(firstPage.getEngine().getDriver(),60);
		 // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))); 
	}
		
}

