package page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.glodon.autotest.web.framework.core.ui.Button;
import com.glodon.autotest.web.framework.core.ui.Text;
import com.glodon.autotest.web.framework.core.ui.Selector;
import com.glodon.autotest.web.framework.core.ui.FileUpload;
import com.glodon.autotest.web.framework.core.ui.CheckBoxGroup;
import com.glodon.autotest.web.framework.page.Page;

/**
 * @author glodon
 * 
 */
@Component
public class FirstPage extends Page {
	@Autowired
	private Text VerificationCode;
	@Autowired
	private Button loginBtn;
	@Autowired
	private Text telNum;
	@Autowired
	private Button firstButton;
	/**
	* getter and setter methods zone
	*/
	public Text getVerificationCode()
	{
		return VerificationCode;
	}
	public void setVerificationCode(Text VerificationCode)
	{
		this.VerificationCode = VerificationCode;
	}
	public Button getLoginBtn()
	{
		return loginBtn;
	}
	public void setLoginBtn(Button loginBtn)
	{
		this.loginBtn = loginBtn;
	}
	public Text getTelNum()
	{
		return telNum;
	}
	public void setTelNum(Text telNum)
	{
		this.telNum = telNum;
	}
	public Button getFirstButton()
	{
		return firstButton;
	}
	public void setFirstButton(Button firstButton)
	{
		this.firstButton = firstButton;
	}
}
