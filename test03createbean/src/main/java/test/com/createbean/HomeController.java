package test.com.createbean;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// 생성한 빈을 찾아서 가져옴
	@Autowired
	private ArrayList<String> list;
	
	@Autowired
	private ArrayList<String> list2;
	
	@Autowired
	private TestBean tb;
	
	@Autowired
	private TestBean2 tb2;
	
	@Autowired
	private TestBean3 tb3;
	
	@Autowired
	private TestBean4 tb4;
	
	@Autowired
	private TestBean5 tb5;
	
	@Autowired
	private TestBean6 tb6;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("list", list);
		model.addAttribute("tb", tb);
		model.addAttribute("tb2", tb2);
		model.addAttribute("tb3", tb3);
		model.addAttribute("tb4", tb4);
		model.addAttribute("tb5", tb5);
		model.addAttribute("tb6", tb6);
		
		return "home";
	}
	
}
