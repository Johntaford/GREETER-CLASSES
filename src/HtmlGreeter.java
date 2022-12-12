
public class HtmlGreeter extends Greeter{

	String tagName;
	
	public HtmlGreeter (String greeting) {
		super(greeting);
		this.tagName = "h1";
	}
	
	public HtmlGreeter (String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + super.greet(name) + "</" + tagName + ">";
	}
		
		
		
	

}
