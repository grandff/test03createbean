package test.com.createbean;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// CGLib : 코드 생성 라이브러리가 필요함
// dependency 추가하기(cglib로 검색하면 나옴)


// configuration annotation 추가
@Configuration
public class TestConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(TestConfiguration.class);
	
	// 1. 개발자가 제어하기 힘든 라이브러리를 주로 빈에 등록할때 사용함
	@Bean
	public ArrayList<String> list(){
		logger.info("list() create bean on ! ");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("kim1");
		aList.add("kim2");
		aList.add("kim3");
		
		return aList;
	}
	
	// 구분하기 위해 name 속성 부여
	@Bean(name = "list2")
	public ArrayList<String> list2(){
		logger.info("list2() create bean on ! ");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("kim4");
		aList.add("kim5");
		aList.add("kim6");
		
		return aList;
	}
	
	@Bean
	public Product product() {
		// 세가지 방식으로 리턴
		
		// return new Product();
		// return new Product(new ArrayList<String>());
		return new Product(list2());
	}
	
	@Bean
	public TestBean testBean() {
		// 두가지 방식으로 리턴(TestBean의 생성자 형식에 맞게 리턴해주면 됨)
		
		// return new TestBean();
		return new TestBean(11, 22, 33);
	}
}
