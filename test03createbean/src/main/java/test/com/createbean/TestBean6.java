package test.com.createbean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean6 {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBean6.class);	
	
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private String[] strs;
	
	public TestBean6() {
		logger.info("TestBean6() .... !! "); 
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	@Override
	public String toString() {
		return "TestBean6 [list=" + list + ", set=" + set + ", map=" + map + ", strs=" + Arrays.toString(strs) + "]";
	}
}
