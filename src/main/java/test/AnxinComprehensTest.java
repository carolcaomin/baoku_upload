package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.glodon.autotest.web.framework.util.ThreadUtil;

import junit.framework.Assert;
import page.AnxinComprehPage;

public class AnxinComprehensTest {
	AnxinComprehPage anxinComprehPage;
	public static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(AnxinComprehensTest.class);
	
	@BeforeClass
    public void beforeClass(){  	
		anxinComprehPage=InitTest.settingUtil.getPage(AnxinComprehPage.class);
    	driver = anxinComprehPage.getEngine().getDriver();
    	logger.info("-----AnxinComprehens  init-----");
    }
	
	@Parameters({"nameCHolder","idCHolder","telCHolder","emailCHolder"})
	@Test
	public void basicComprehens(String nameCHolder,String idCHolder,String telCHolder,String emailCHolder){
		logger.info("-----basicComprehens  begin-----");
		//刷新浏览器
		driver.navigate().refresh();
		ThreadUtil.silentSleep(5000);
		//立即投保
		anxinComprehPage.getInsureCBtn().click();
		ThreadUtil.silentSleep(3000);
		//以上全无 
		anxinComprehPage.getAllNotCBtn().click();
		
		ThreadUtil.silentSleep(3000);
		anxinComprehPage.getNameCHolder().getValueEditor().setValue(anxinComprehPage.getNameCHolder(),nameCHolder);
		anxinComprehPage.getIdCHolder().getValueEditor().setValue(anxinComprehPage.getIdCHolder(),idCHolder);
		anxinComprehPage.getTelCHolder().getValueEditor().setValue(anxinComprehPage.getTelCHolder(),telCHolder);
		anxinComprehPage.getEmailCHolder().getValueEditor().setValue(anxinComprehPage.getEmailCHolder(), emailCHolder);
		
		anxinComprehPage.getShebaoCBtn().click();
		anxinComprehPage.getGouxuanCBtn().click();
		
		//立即投保
		ThreadUtil.silentSleep(3000);
		anxinComprehPage.getLijiCBtn().click();
		ThreadUtil.silentSleep(3000);
		
		//添加断言   获取打开页面标题,验证title正确 ,订单详情
    	String title=driver.getTitle();
    	logger.info("打开的页面标题为："+title);    	
    	Assert.assertEquals("订单详情",driver.getTitle());
	}
}
