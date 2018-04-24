package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.glodon.autotest.web.framework.util.ThreadUtil;

import page.AnlianTravelPage;

/*
 * 安联旅意险
 */
public class AnlianTravelTest{
	AnlianTravelPage anlianTravelPage;  
	WebDriver driver;
    WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(AnlianTravelTest.class);
    
    @BeforeClass
    public void beforeClass(){  	
    	anlianTravelPage=InitTest.settingUtil.getPage(AnlianTravelPage.class);
    	driver = anlianTravelPage.getEngine().getDriver();
    }
    
    @Parameters("travelType")
    @Test
    public void travelMethod(String travelType){
    	logger.info("-----travalMethod-----");
    	//点击安联旅意险登录图片
    	anlianTravelPage.getLoginPicture().click();
    	ThreadUtil.silentSleep(2000);
    	//滚动条：向下移动
    	//((JavascriptExecutor)driver).executeScript("window.scrollBy (0,900)");
		//ThreadUtil.silentSleep(2000);

    	//立即投保
    	anlianTravelPage.getInsuredBtn().click();
		logger.info("-----立即投保-----");
		ThreadUtil.silentSleep(3000);
		
		if(travelType.equals("惠游版")){
    		anlianTravelPage.getInsuredBtn().click();
		}else if(travelType.equals("畅游版")){
			anlianTravelPage.getChangTravelBtn().click();
			ThreadUtil.silentSleep(2000);
        	anlianTravelPage.getInsuredBtn().click();
    	}else if(travelType.equals("嗨游版")){
    		anlianTravelPage.getHaiBtn().click();
    		ThreadUtil.silentSleep(2000);
        	anlianTravelPage.getInsuredBtn().click();
    	}
    	ThreadUtil.silentSleep(2000);
    }
    
    @Parameters({"nameHolder","idHolder","telHolder","emailHolder"})
    @Test
    public void basicOpe(String nameHolder,String idHolder,String telHolder,String emailHolder){
    	//起保日期
    	anlianTravelPage.getBeginDate().click();
    	ThreadUtil.silentSleep(2000);
    	logger.info("-----起保日期-----");
    	anlianTravelPage.getOkBtn().click();
    	ThreadUtil.silentSleep(3000);
    	
    	anlianTravelPage.getNameHolder().getValueEditor().setValue(anlianTravelPage.getNameHolder(),nameHolder);
    	anlianTravelPage.getIdHolder().getValueEditor().setValue(anlianTravelPage.getIdHolder(),idHolder);
    	anlianTravelPage.getTelHolder().getValueEditor().setValue(anlianTravelPage.getTelHolder(),telHolder);
    	anlianTravelPage.getEmailHolder().getValueEditor().setValue(anlianTravelPage.getEmailHolder(),emailHolder);
    	anlianTravelPage.getMyselfBtn().click();
    	anlianTravelPage.getCheck().click();
    	ThreadUtil.silentSleep(2000);
    	anlianTravelPage.getSureBtn().click();
    	ThreadUtil.silentSleep(2000);
    }
}
