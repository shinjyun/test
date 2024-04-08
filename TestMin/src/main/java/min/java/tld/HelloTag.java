package min.java.tld;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() {
		try {
			pageContext.getOut().println("커스텀 태그 생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return super.SKIP_BODY;
	}
}
