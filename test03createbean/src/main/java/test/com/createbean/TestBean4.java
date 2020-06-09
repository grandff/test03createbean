package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean4 {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBean4.class);
	
	private String id;
	private String pwd;
	
	public TestBean4() {
		logger.info("TestBean4() .... !! "); 
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
		return "TestBean4 [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
