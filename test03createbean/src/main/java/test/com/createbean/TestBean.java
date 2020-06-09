package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBean.class);
	
	private int kor;
	private int eng;
	private int math;
	
	public TestBean() {
		logger.info("TestBean() .... "); 
	}
	
	public TestBean(int kor, int eng, int math) {
		logger.info("TestBean(int kor, int eng, int math) .... ");
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "TestBean [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
