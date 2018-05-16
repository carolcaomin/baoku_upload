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
public class AnxinEFamilyPage extends Page {
	@Autowired
	private Text telSelf;
	@Autowired
	private Text nameSelf;
	@Autowired
	private Button gouxuan;
	@Autowired
	private Text idSecond;
	@Autowired
	private Button shebaoBtnSecond;
	@Autowired
	private Text emailSelf;
	@Autowired
	private Text nameSecond;
	@Autowired
	private Button shebaoBtn;
	@Autowired
	private Button shebaoBtnThird;
	@Autowired
	private Text idThird;
	@Autowired
	private Text idSelf;
	@Autowired
	private Button allNotBtn;
	@Autowired
	private Button lijiBtn;
	@Autowired
	private Text nameThird;
	@Autowired
	private Button insureBtn;
	/**
	* getter and setter methods zone
	*/
	public Text getTelSelf()
	{
		return telSelf;
	}
	public void setTelSelf(Text telSelf)
	{
		this.telSelf = telSelf;
	}
	public Text getNameSelf()
	{
		return nameSelf;
	}
	public void setNameSelf(Text nameSelf)
	{
		this.nameSelf = nameSelf;
	}
	public Button getGouxuan()
	{
		return gouxuan;
	}
	public void setGouxuan(Button gouxuan)
	{
		this.gouxuan = gouxuan;
	}
	public Text getIdSecond()
	{
		return idSecond;
	}
	public void setIdSecond(Text idSecond)
	{
		this.idSecond = idSecond;
	}
	public Button getShebaoBtnSecond()
	{
		return shebaoBtnSecond;
	}
	public void setShebaoBtnSecond(Button shebaoBtnSecond)
	{
		this.shebaoBtnSecond = shebaoBtnSecond;
	}
	public Text getEmailSelf()
	{
		return emailSelf;
	}
	public void setEmailSelf(Text emailSelf)
	{
		this.emailSelf = emailSelf;
	}
	public Text getNameSecond()
	{
		return nameSecond;
	}
	public void setNameSecond(Text nameSecond)
	{
		this.nameSecond = nameSecond;
	}
	public Button getShebaoBtn()
	{
		return shebaoBtn;
	}
	public void setShebaoBtn(Button shebaoBtn)
	{
		this.shebaoBtn = shebaoBtn;
	}
	public Button getShebaoBtnThird()
	{
		return shebaoBtnThird;
	}
	public void setShebaoBtnThird(Button shebaoBtnThird)
	{
		this.shebaoBtnThird = shebaoBtnThird;
	}
	public Text getIdThird()
	{
		return idThird;
	}
	public void setIdThird(Text idThird)
	{
		this.idThird = idThird;
	}
	public Text getIdSelf()
	{
		return idSelf;
	}
	public void setIdSelf(Text idSelf)
	{
		this.idSelf = idSelf;
	}
	public Button getAllNotBtn()
	{
		return allNotBtn;
	}
	public void setAllNotBtn(Button allNotBtn)
	{
		this.allNotBtn = allNotBtn;
	}
	public Button getLijiBtn()
	{
		return lijiBtn;
	}
	public void setLijiBtn(Button lijiBtn)
	{
		this.lijiBtn = lijiBtn;
	}
	public Text getNameThird()
	{
		return nameThird;
	}
	public void setNameThird(Text nameThird)
	{
		this.nameThird = nameThird;
	}
	public Button getInsureBtn()
	{
		return insureBtn;
	}
	public void setInsureBtn(Button insureBtn)
	{
		this.insureBtn = insureBtn;
	}
}
