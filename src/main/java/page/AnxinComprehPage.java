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
public class AnxinComprehPage extends Page {
	@Autowired
	private Text idCHolder;
	@Autowired
	private Button lijiCBtn;
	@Autowired
	private Text emailCHolder;
	@Autowired
	private Text telCHolder;
	@Autowired
	private Button allNotCBtn;
	@Autowired
	private Text nameCHolder;
	@Autowired
	private Button gouxuanCBtn;
	@Autowired
	private Button insureCBtn;
	@Autowired
	private Button shebaoCBtn;
	/**
	* getter and setter methods zone
	*/
	public Text getIdCHolder()
	{
		return idCHolder;
	}
	public void setIdCHolder(Text idCHolder)
	{
		this.idCHolder = idCHolder;
	}
	public Button getLijiCBtn()
	{
		return lijiCBtn;
	}
	public void setLijiCBtn(Button lijiCBtn)
	{
		this.lijiCBtn = lijiCBtn;
	}
	public Text getEmailCHolder()
	{
		return emailCHolder;
	}
	public void setEmailCHolder(Text emailCHolder)
	{
		this.emailCHolder = emailCHolder;
	}
	public Text getTelCHolder()
	{
		return telCHolder;
	}
	public void setTelCHolder(Text telCHolder)
	{
		this.telCHolder = telCHolder;
	}
	public Button getAllNotCBtn()
	{
		return allNotCBtn;
	}
	public void setAllNotCBtn(Button allNotCBtn)
	{
		this.allNotCBtn = allNotCBtn;
	}
	public Text getNameCHolder()
	{
		return nameCHolder;
	}
	public void setNameCHolder(Text nameCHolder)
	{
		this.nameCHolder = nameCHolder;
	}
	public Button getGouxuanCBtn()
	{
		return gouxuanCBtn;
	}
	public void setGouxuanCBtn(Button gouxuanCBtn)
	{
		this.gouxuanCBtn = gouxuanCBtn;
	}
	public Button getInsureCBtn()
	{
		return insureCBtn;
	}
	public void setInsureCBtn(Button insureCBtn)
	{
		this.insureCBtn = insureCBtn;
	}
	public Button getShebaoCBtn()
	{
		return shebaoCBtn;
	}
	public void setShebaoCBtn(Button shebaoCBtn)
	{
		this.shebaoCBtn = shebaoCBtn;
	}
}
