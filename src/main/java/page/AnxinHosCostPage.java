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
public class AnxinHosCostPage extends Page {
	@Autowired
	private Button shebaoHCBtn;
	@Autowired
	private Text nameHCHolder;
	@Autowired
	private Button gouxuanHCBtn;
	@Autowired
	private Button lijiHCBtn;
	@Autowired
	private Button allNotHCBtn;
	@Autowired
	private Text telHCHolder;
	@Autowired
	private Button insureHCBtn;
	@Autowired
	private Text idHCHolder;
	@Autowired
	private Text emailHCHolder;
	/**
	* getter and setter methods zone
	*/
	public Button getShebaoHCBtn()
	{
		return shebaoHCBtn;
	}
	public void setShebaoHCBtn(Button shebaoHCBtn)
	{
		this.shebaoHCBtn = shebaoHCBtn;
	}
	public Text getNameHCHolder()
	{
		return nameHCHolder;
	}
	public void setNameHCHolder(Text nameHCHolder)
	{
		this.nameHCHolder = nameHCHolder;
	}
	public Button getGouxuanHCBtn()
	{
		return gouxuanHCBtn;
	}
	public void setGouxuanHCBtn(Button gouxuanHCBtn)
	{
		this.gouxuanHCBtn = gouxuanHCBtn;
	}
	public Button getLijiHCBtn()
	{
		return lijiHCBtn;
	}
	public void setLijiHCBtn(Button lijiHCBtn)
	{
		this.lijiHCBtn = lijiHCBtn;
	}
	public Button getAllNotHCBtn()
	{
		return allNotHCBtn;
	}
	public void setAllNotHCBtn(Button allNotHCBtn)
	{
		this.allNotHCBtn = allNotHCBtn;
	}
	public Text getTelHCHolder()
	{
		return telHCHolder;
	}
	public void setTelHCHolder(Text telHCHolder)
	{
		this.telHCHolder = telHCHolder;
	}
	public Button getInsureHCBtn()
	{
		return insureHCBtn;
	}
	public void setInsureHCBtn(Button insureHCBtn)
	{
		this.insureHCBtn = insureHCBtn;
	}
	public Text getIdHCHolder()
	{
		return idHCHolder;
	}
	public void setIdHCHolder(Text idHCHolder)
	{
		this.idHCHolder = idHCHolder;
	}
	public Text getEmailHCHolder()
	{
		return emailHCHolder;
	}
	public void setEmailHCHolder(Text emailHCHolder)
	{
		this.emailHCHolder = emailHCHolder;
	}
}
