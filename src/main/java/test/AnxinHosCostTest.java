package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.AnxinHosCostPage;


public class AnxinHosCostTest {
	AnxinHosCostPage anxinHosCostPage;
	public static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(AnxinHosCostTest.class);
	
	@BeforeClass
    public void beforeClass(){  	
		anxinHosCostPage=InitTest.settingUtil.getPage(AnxinHosCostPage.class);
    	driver = anxinHosCostPage.getEngine().getDriver();
    	logger.info("-----AnxinHospital  init-----");
    }
	
	@Parameters({"nameHCHolder","idHCHolder","telHCHolder","emailHCHolder"})
	@Test
	public void basicHosCost(String nameHCHolder,String idHCHolder,String telHCHolder,String emailHCHolder){
		logger.info("-----basicHosCost  begin-----");
		//刷新浏览器
		driver.navigate().refresh();
		ThreadUtil.silentSleep(5000);
		//立即投保
		anxinHosCostPage.getInsureHCBtn().click();
		ThreadUtil.silentSleep(3000);
		//以上全无 
		anxinHosCostPage.getAllNotHCBtn().click();
		ThreadUtil.silentSleep(3000);
		
		anxinHosCostPage.getNameHCHolder().getValueEditor().setValue(anxinHosCostPage.getNameHCHolder(),nameHCHolder);
		anxinHosCostPage.getIdHCHolder().getValueEditor().setValue(anxinHosCostPage.getIdHCHolder(),idHCHolder);
		anxinHosCostPage.getTelHCHolder().getValueEditor().setValue(anxinHosCostPage.getTelHCHolder(),telHCHolder);
		anxinHosCostPage.getEmailHCHolder().getValueEditor().setValue(anxinHosCostPage.getEmailHCHolder(),emailHCHolder);
		
		anxinHosCostPage.getShebaoHCBtn().click();
		anxinHosCostPage.getGouxuanHCBtn().click();
		
		//立即投保
		ThreadUtil.silentSleep(3000);
		anxinHosCostPage.getLijiHCBtn().click();
		ThreadUtil.silentSleep(3000);
	}
}
