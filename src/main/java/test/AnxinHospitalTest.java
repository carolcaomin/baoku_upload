package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.AnxinHospitalPage;

public class AnxinHospitalTest {
	AnxinHospitalPage anxinHospitalPage;
	public static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(AnxinHospitalTest.class);
	
	@BeforeClass
    public void beforeClass(){  	
		anxinHospitalPage=InitTest.settingUtil.getPage(AnxinHospitalPage.class);
    	driver = anxinHospitalPage.getEngine().getDriver();
    	logger.info("-----AnxinHospital  init-----");
    }
	
	@Parameters({"height","weight","nameHolder","idHolder","telHolder","emailHolder"})
	@Test
	public void basicHospital(String height,String weight,String nameHolder,String idHolder,String telHolder,String emailHolder){
		logger.info("-----basicHospital  begin-----");
		//刷新浏览器
		driver.navigate().refresh();
		ThreadUtil.silentSleep(5000);
		//立即投保
		anxinHospitalPage.getInsureHBtn().click();
		ThreadUtil.silentSleep(3000);
		//以上全无 
		anxinHospitalPage.getAllNotBtn().click();
		ThreadUtil.silentSleep(3000);
		logger.info("-----basicHospital  height and weight-----");
		anxinHospitalPage.getHeight().getValueEditor().setValue(anxinHospitalPage.getHeight(),height);
		anxinHospitalPage.getWeight().getValueEditor().setValue(anxinHospitalPage.getWeight(),weight);
		anxinHospitalPage.getNextBtn().click();
		ThreadUtil.silentSleep(5000);
		//刷新浏览器
		//driver.navigate().refresh();
		//ThreadUtil.silentSleep(4000);
		anxinHospitalPage.getNameHolder().getValueEditor().setValue(anxinHospitalPage.getNameHolder(),nameHolder);
		anxinHospitalPage.getIdHolder().getValueEditor().setValue(anxinHospitalPage.getIdHolder(),idHolder);
		anxinHospitalPage.getTelHolder().getValueEditor().setValue(anxinHospitalPage.getTelHolder(),telHolder);
		anxinHospitalPage.getEmailHolder().getValueEditor().setValue(anxinHospitalPage.getEmailHolder(),emailHolder);
		
		anxinHospitalPage.getShebaoBtn().click();
		anxinHospitalPage.getGouxuanBtn().click();
		
		//立即投保
		ThreadUtil.silentSleep(3000);
		anxinHospitalPage.getLijiBtn().click();
		ThreadUtil.silentSleep(3000);
	}
}
