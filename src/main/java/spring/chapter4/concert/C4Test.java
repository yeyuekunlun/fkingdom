package spring.chapter4.concert;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class C4Test {

	@Autowired
	Performance performance;
	@Autowired
	Appointment appointment;
	
	@Test
	public void test() {
		performance.perform();
		appointment.doAppointment();
		Encoreable e = (Encoreable)performance;
		e.performEncore();
	}

}
