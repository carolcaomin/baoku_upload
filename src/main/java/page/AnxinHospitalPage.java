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
public class AnxinHospitalPage extends Page {
	@Autowired
	private Text idHolder;
	@Autowired
	private Text telHolder;
	@Autowired
	private Button allNotBtn;
	@Autowired
	private Button lijiBtn;
	@Autowired
	private Text weight;
	@Autowired
	private Text nameHolder;
	@Autowired
	private Button gouxuanBtn;
	@Autowired
	private Text emailHolder;
	@Autowired
	private Button insureHBtn;
	@Autowired
	private Button nextBtn;
	@Autowired
	private Button shebaoBtn;
	@Autowired
	private Text height;
	/**
	* getter and setter methods zone
	*/
	public Text getIdHolder()
	{
		return idHolder;
	}
	public void setIdHolder(Text idHolder)
	{
		this.idHolder = idHolder;
	}
	public Text getTelHolder()
	{
		return telHolder;
	}
	public void setTelHolder(Text telHolder)
	{
		this.telHolder = telHolder;
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
	public Text getWeight()
	{
		return weight;
	}
	public void setWeight(Text weight)
	{
		this.weight = weight;
	}
	public Text getNameHolder()
	{
		return nameHolder;
	}
	public void setNameHolder(Text nameHolder)
	{
		this.nameHolder = nameHolder;
	}
	public Button getGouxuanBtn()
	{
		return gouxuanBtn;
	}
	public void setGouxuanBtn(Button gouxuanBtn)
	{
		this.gouxuanBtn = gouxuanBtn;
	}
	public Text getEmailHolder()
	{
		return emailHolder;
	}
	public void setEmailHolder(Text emailHolder)
	{
		this.emailHolder = emailHolder;
	}
	public Button getInsureHBtn()
	{
		return insureHBtn;
	}
	public void setInsureHBtn(Button insureHBtn)
	{
		this.insureHBtn = insureHBtn;
	}
	public Button getNextBtn()
	{
		return nextBtn;
	}
	public void setNextBtn(Button nextBtn)
	{
		this.nextBtn = nextBtn;
	}
	public Button getShebaoBtn()
	{
		return shebaoBtn;
	}
	public void setShebaoBtn(Button shebaoBtn)
	{
		this.shebaoBtn = shebaoBtn;
	}
	public Text getHeight()
	{
		return height;
	}
	public void setHeight(Text height)
	{
		this.height = height;
	}
}
