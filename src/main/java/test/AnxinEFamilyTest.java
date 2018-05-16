package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.AnlianTravelPage;
import page.AnxinEFamilyPage;

public class AnxinEFamilyTest {
	AnxinEFamilyPage anxinEFamilyPage;
	public static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(AnxinEFamilyTest.class);
	
	@BeforeClass
    public void beforeClass(){  	
		anxinEFamilyPage=InitTest.settingUtil.getPage(AnxinEFamilyPage.class);
    	driver = anxinEFamilyPage.getEngine().getDriver();
    	logger.info("-----AnxinEFamily  init-----");
    }
	
	@Parameters({"nameSelf","idSelf","telSelf","emailSelf","nameSecond","idSecond","nameThird","idThird"})
	@Test
	public void basicFamily(String nameSelf,String idSelf,String telSelf,String emailSelf,String nameSecond,String idSecond,String nameThird,String idThird){
		logger.info("-----AnxinEFamily  begin-----");
		//刷新浏览器
		driver.navigate().refresh();
		ThreadUtil.silentSleep(5000);
		//立即投保
		anxinEFamilyPage.getInsureBtn().click();
		//以上全无
		ThreadUtil.silentSleep(3000);
		anxinEFamilyPage.getAllNotBtn().click();
		
		logger.info("-----进入投保信息页-----");
		ThreadUtil.silentSleep(3000);
		driver.navigate().refresh();
		ThreadUtil.silentSleep(3000);
		//投保人信息
		anxinEFamilyPage.getNameSelf().getValueEditor().setValue(anxinEFamilyPage.getNameSelf(),nameSelf);
		anxinEFamilyPage.getIdSelf().getValueEditor().setValue(anxinEFamilyPage.getIdSelf(),idSelf);
		anxinEFamilyPage.getTelSelf().getValueEditor().setValue(anxinEFamilyPage.getTelSelf(),telSelf);
		anxinEFamilyPage.getEmailSelf().getValueEditor().setValue(anxinEFamilyPage.getEmailSelf(),emailSelf);
		ThreadUtil.silentSleep(3000);
		anxinEFamilyPage.getShebaoBtn().click();
		//被保人2信息
		anxinEFamilyPage.getShebaoBtnSecond().click();
		anxinEFamilyPage.getNameSecond().getValueEditor().setValue(anxinEFamilyPage.getNameSecond(),nameSecond);
		anxinEFamilyPage.getIdSecond().getValueEditor().setValue(anxinEFamilyPage.getIdSecond(),idSecond);
		ThreadUtil.silentSleep(3000);
		//被保人3信息
		anxinEFamilyPage.getShebaoBtnThird().click();
		anxinEFamilyPage.getNameThird().getValueEditor().setValue(anxinEFamilyPage.getNameThird(),nameThird);
		anxinEFamilyPage.getIdThird().getValueEditor().setValue(anxinEFamilyPage.getIdThird(),idThird);
		anxinEFamilyPage.getGouxuan().click();
		anxinEFamilyPage.getLijiBtn().click();
		ThreadUtil.silentSleep(3000);
		
	}
}
