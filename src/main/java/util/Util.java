package util;

import com.glodon.autotest.web.framework.code.DefaultXmlCodeGenerator;
import com.glodon.autotest.web.framework.code.DefaultXmlDataSourceGenerator;
import com.glodon.autotest.web.framework.code.Generator;

public class Util {
	public static void main(String[] args) {
		Generator generator=new DefaultXmlCodeGenerator();
		generator.generate("findelement/common/anxinAllFamily.xml","src\\main\\java");
		
        //Generator generator1=new DefaultXmlDataSourceGenerator();
		//generator1.generate("findelement/common/purPlan.xml", "src\\main\\resources\\data");

	}
}
