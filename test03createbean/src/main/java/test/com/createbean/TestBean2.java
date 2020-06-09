package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean2 {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBean.class);
	
	private String id;
	private String pwd;
	
	public TestBean2() {
		logger.info("TestBean2() .... !! "); 
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "TestBean2 [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
