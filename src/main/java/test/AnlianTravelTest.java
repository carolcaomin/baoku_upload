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

import junit.framework.Assert;
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
    	logger.info("-----travalMethod  init-----");
    }
 
    @Parameters("travelType")
    @Test
    public void travelMethod(String travelType){
    	logger.info("-----travalMethod-----");   	
    	driver.navigate().refresh();		
    	ThreadUtil.silentSleep(5000);  
    	//添加断言   获取打开页面标题    
    	//正确的用户名、密码，登录成功，验证title正确
    	String title=driver.getTitle();
    	logger.info("打开的页面标题为："+title);
    	assert title.equals("境内旅行保障计划");
    	
    	//立即投保
    	anlianTravelPage.getInsuredBtn().click();
		logger.info("-----立即投保-----");
		ThreadUtil.silentSleep(3000);
		
	    if(travelType.equals("惠游版")){
	    	anlianTravelPage.getInsureBtn2().click();
	    		    		
	    }else if(travelType.equals("畅游版")){
	    	anlianTravelPage.getChangTravelBtn().click();
	    	anlianTravelPage.getInsureBtn2().click();
	    }else if(travelType.equals("嗨游版")){
	    	anlianTravelPage.getHaiBtn().click();
	    	anlianTravelPage.getInsureBtn2().click();
	    } 
	    
	    ThreadUtil.silentSleep(3000);
	    //添加断言
    	String  actual=driver.getPageSource();
    	boolean condition=actual.contains(travelType);
    	logger.info("页面跳转到"+travelType+"结果为："+condition);
    	assert condition;
    }
    
    @Parameters({"nameHolder","idHolder","telHolder","emailHolder"})
    @Test
    public void basic(String nameHolder,String idHolder,String telHolder,String emailHolder){
    	logger.info("-----basicInfo  successful-----");
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
    	
    	//添加断言   获取打开页面标题,验证title正确 ,订单详情
    	String title=driver.getTitle();
    	logger.info("打开的页面标题为："+title);    	
    	Assert.assertEquals("订单详情",driver.getTitle());
    }
    
}
