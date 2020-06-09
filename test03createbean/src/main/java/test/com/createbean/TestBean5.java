package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean5 {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBean5.class);	
	
	private TestBean4 tb4;
	
	
	public TestBean5() {
		logger.info("TestBean5() .... !! "); 
	}
	
	public TestBean5(TestBean4 tb4) {
		logger.info("TestBean5(TestBean4 tb4) .... !! ");
		this.tb4 = tb4;
	}

	@Override
	public String toString() {
		return "TestBean5 [tb4=" + tb4 + "]";
	}	
	
	
}
