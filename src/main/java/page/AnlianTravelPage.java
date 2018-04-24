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
public class AnlianTravelPage extends Page {
	@Autowired
	private Text telHolder;
	@Autowired
	private Text nameHolder;
	@Autowired
	private Button check;
	@Autowired
	private Button okBtn;
	@Autowired
	private Button sureBtn;
	@Autowired
	private Button beginDate;
	@Autowired
	private Text idHolder;
	@Autowired
	private Button haiBtn;
	@Autowired
	private Button loginPicture;
	@Autowired
	private Button changTravelBtn;
	@Autowired
	private Button myselfBtn;
	@Autowired
	private Text emailHolder;
	@Autowired
	private Button insuredBtn;
	/**
	* getter and setter methods zone
	*/
	public Text getTelHolder()
	{
		return telHolder;
	}
	public void setTelHolder(Text telHolder)
	{
		this.telHolder = telHolder;
	}
	public Text getNameHolder()
	{
		return nameHolder;
	}
	public void setNameHolder(Text nameHolder)
	{
		this.nameHolder = nameHolder;
	}
	public Button getCheck()
	{
		return check;
	}
	public void setCheck(Button check)
	{
		this.check = check;
	}
	public Button getOkBtn()
	{
		return okBtn;
	}
	public void setOkBtn(Button okBtn)
	{
		this.okBtn = okBtn;
	}
	public Button getSureBtn()
	{
		return sureBtn;
	}
	public void setSureBtn(Button sureBtn)
	{
		this.sureBtn = sureBtn;
	}
	public Button getBeginDate()
	{
		return beginDate;
	}
	public void setBeginDate(Button beginDate)
	{
		this.beginDate = beginDate;
	}
	public Text getIdHolder()
	{
		return idHolder;
	}
	public void setIdHolder(Text idHolder)
	{
		this.idHolder = idHolder;
	}
	public Button getHaiBtn()
	{
		return haiBtn;
	}
	public void setHaiBtn(Button haiBtn)
	{
		this.haiBtn = haiBtn;
	}
	public Button getLoginPicture()
	{
		return loginPicture;
	}
	public void setLoginPicture(Button loginPicture)
	{
		this.loginPicture = loginPicture;
	}
	public Button getChangTravelBtn()
	{
		return changTravelBtn;
	}
	public void setChangTravelBtn(Button changTravelBtn)
	{
		this.changTravelBtn = changTravelBtn;
	}
	public Button getMyselfBtn()
	{
		return myselfBtn;
	}
	public void setMyselfBtn(Button myselfBtn)
	{
		this.myselfBtn = myselfBtn;
	}
	public Text getEmailHolder()
	{
		return emailHolder;
	}
	public void setEmailHolder(Text emailHolder)
	{
		this.emailHolder = emailHolder;
	}
	public Button getInsuredBtn()
	{
		return insuredBtn;
	}
	public void setInsuredBtn(Button insuredBtn)
	{
		this.insuredBtn = insuredBtn;
	}
}
