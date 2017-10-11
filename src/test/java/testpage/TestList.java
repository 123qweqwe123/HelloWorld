package testpage;


import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdcor.pip.web.spem.service.TestService;

public class TestList {

	@Test
	public void test() {
	
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext2.xml");
		@SuppressWarnings({ "unchecked", "unused" })
		TestService list = (TestService) app.getBean("TestService");
		List<com.bdcor.pip.web.spem.domain.Test> list2 = list.getlist();
		System.out.println(list2.size());
	}

}
