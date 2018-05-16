package test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.AnxinAllFamilyPage;


public class AnxinAllFamilyTest {
	AnxinAllFamilyPage anxinAllFamilyPage;
	public static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(AnxinAllFamilyTest.class);
	
	@BeforeClass
    public void beforeClass(){  	
		anxinAllFamilyPage=InitTest.settingUtil.getPage(AnxinAllFamilyPage.class);
    	driver = anxinAllFamilyPage.getEngine().getDriver();
    	logger.info("-----AnxinAllFamilyTest  init-----");
    }
	
	@Parameters({"nameMainHolder","idMainHolder","telMainHolder","emailMainHolder","nameAttachHolder","idAttachHolder"})
	@Test
	public void basicAllFamily(String nameMainHolder,String idMainHolder,String telMainHolder,String emailMainHolder,String nameAttachHolder,String idAttachHolder){
		logger.info("-----basicAllFamily  begin-----");
		//刷新浏览器
		driver.navigate().refresh();
		ThreadUtil.silentSleep(5000);
		//立即投保
		anxinAllFamilyPage.getInsureAFBtn().click();
		ThreadUtil.silentSleep(3000);
	
		anxinAllFamilyPage.getNameMainHolder().getValueEditor().setValue(anxinAllFamilyPage.getNameMainHolder(),nameMainHolder);
		anxinAllFamilyPage.getIdMainHolder().getValueEditor().setValue(anxinAllFamilyPage.getIdMainHolder(),idMainHolder);
		anxinAllFamilyPage.getTelMainHolder().getValueEditor().setValue(anxinAllFamilyPage.getTelMainHolder(),telMainHolder);
		anxinAllFamilyPage.getEmailMainHolder().getValueEditor().setValue(anxinAllFamilyPage.getEmailMainHolder(),emailMainHolder);
		
		anxinAllFamilyPage.getRelationshipHolder().click();
		anxinAllFamilyPage.getNameAttachHolder().getValueEditor().setValue(anxinAllFamilyPage.getNameAttachHolder(),nameAttachHolder);
		anxinAllFamilyPage.getIdAttachHolder().getValueEditor().setValue(anxinAllFamilyPage.getIdAttachHolder(),idAttachHolder);
		
		anxinAllFamilyPage.getGouxuanAFBtn().click();		
		//立即投保
		ThreadUtil.silentSleep(3000);
		anxinAllFamilyPage.getLijiAFBtn().click();
		ThreadUtil.silentSleep(3000);
	}
}
