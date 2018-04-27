package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.FirstPage;

public class FirstTest {
	public static FirstPage firstPage;
	
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
		firstPage.putData("param.url", prop.getProperty(systemUrl));
		
		firstPage.open();
		firstPage.getTelNum().getValueEditor().setValue(firstPage.getTelNum(),telNum);
		firstPage.getVerificationCode().getValueEditor().setValue(firstPage.getVerificationCode(),VerificationCode);
		firstPage.getLoginBtn().click();
		
	
	}

}
