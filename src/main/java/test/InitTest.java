package test;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.xml.sax.SAXException;
import com.glodon.autotest.web.framework.settings.SettingUtil;
/*
 * 初始化操作 
 */
public class InitTest {
  public static SettingUtil settingUtil;
  private static final Logger logger = LoggerFactory.getLogger(InitTest.class);
 
  @Parameters({"xmlFile"})
  @BeforeTest
  public static void init(String xmlFile) throws IOException, DocumentException, SAXException {
	  settingUtil=new SettingUtil();
	  settingUtil.readFromClassPath(xmlFile);
	  logger.info("xmlFile="+xmlFile);
	  settingUtil.initData();
	  logger.info("-------init succesful!-----");
  }
  
  
  public void close() throws IOException{
	  logger.info("init close");
	  settingUtil.close();
  }
}
