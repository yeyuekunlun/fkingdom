package spring.chapter3.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
@ActiveProfiles("dev")
public class Chapter3Test {
	
	@Autowired
	Person per;
	@Test
	public void test3(){
		per.say();
	}
}
