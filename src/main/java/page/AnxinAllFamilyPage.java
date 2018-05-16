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
public class AnxinAllFamilyPage extends Page {
	@Autowired
	private Text idAttachHolder;
	@Autowired
	private Text emailMainHolder;
	@Autowired
	private Text nameAttachHolder;
	@Autowired
	private Button gouxuanAFBtn;
	@Autowired
	private Button relationshipHolder;
	@Autowired
	private Text nameMainHolder;
	@Autowired
	private Button insureAFBtn;
	@Autowired
	private Text telMainHolder;
	@Autowired
	private Button lijiAFBtn;
	@Autowired
	private Text idMainHolder;
	/**
	* getter and setter methods zone
	*/
	public Text getIdAttachHolder()
	{
		return idAttachHolder;
	}
	public void setIdAttachHolder(Text idAttachHolder)
	{
		this.idAttachHolder = idAttachHolder;
	}
	public Text getEmailMainHolder()
	{
		return emailMainHolder;
	}
	public void setEmailMainHolder(Text emailMainHolder)
	{
		this.emailMainHolder = emailMainHolder;
	}
	public Text getNameAttachHolder()
	{
		return nameAttachHolder;
	}
	public void setNameAttachHolder(Text nameAttachHolder)
	{
		this.nameAttachHolder = nameAttachHolder;
	}
	public Button getGouxuanAFBtn()
	{
		return gouxuanAFBtn;
	}
	public void setGouxuanAFBtn(Button gouxuanAFBtn)
	{
		this.gouxuanAFBtn = gouxuanAFBtn;
	}
	public Button getRelationshipHolder()
	{
		return relationshipHolder;
	}
	public void setRelationshipHolder(Button relationshipHolder)
	{
		this.relationshipHolder = relationshipHolder;
	}
	public Text getNameMainHolder()
	{
		return nameMainHolder;
	}
	public void setNameMainHolder(Text nameMainHolder)
	{
		this.nameMainHolder = nameMainHolder;
	}
	public Button getInsureAFBtn()
	{
		return insureAFBtn;
	}
	public void setInsureAFBtn(Button insureAFBtn)
	{
		this.insureAFBtn = insureAFBtn;
	}
	public Text getTelMainHolder()
	{
		return telMainHolder;
	}
	public void setTelMainHolder(Text telMainHolder)
	{
		this.telMainHolder = telMainHolder;
	}
	public Button getLijiAFBtn()
	{
		return lijiAFBtn;
	}
	public void setLijiAFBtn(Button lijiAFBtn)
	{
		this.lijiAFBtn = lijiAFBtn;
	}
	public Text getIdMainHolder()
	{
		return idMainHolder;
	}
	public void setIdMainHolder(Text idMainHolder)
	{
		this.idMainHolder = idMainHolder;
	}
}
