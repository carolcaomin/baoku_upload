package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.FirstPage;

public class FirstTest {
	public static FirstPage firstPage;
	public static WebDriver driver;
	public static WebDriverWait wait;
	private static final Logger logger = LoggerFactory.getLogger(InitTest.class);
	
	@Parameters({"systemUrl","telNum","VerificationCode"})
	@Test
	public void login(String systemUrl,String telNum,String VerificationCode){
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("./src/main/resources/properties/engine.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		firstPage=InitTest.settingUtil.getPage(FirstPage.class);
		//firstPage.putData("param.url", prop.getProperty(systemUrl));
		try {
			firstPage.putData("param.url",new String(prop.getProperty(systemUrl).getBytes("ISO-8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		ThreadUtil.silentSleep(3000);
		
		//打开登录页面
		firstPage.open();
		//等待登录页面加载完成
		wait = new WebDriverWait(firstPage.getEngine().getDriver(),60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("getVerifyCode")));
		ThreadUtil.silentSleep(3000);
		
		firstPage.getTelNum().getValueEditor().setValue(firstPage.getTelNum(),telNum);
		firstPage.getVerificationCode().getValueEditor().setValue(firstPage.getVerificationCode(),VerificationCode);
		firstPage.getLoginBtn().click();
		ThreadUtil.silentSleep(5000);
	}

}
